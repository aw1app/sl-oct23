package com.sl;
import java.io.IOException;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@jakarta.servlet.annotation.WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Connect to MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("mydatabase");
            MongoCollection<Document> usersCollection = database.getCollection("users");

            // Create a new user document
            Document userDocument = new Document("username", username)
                                        .append("email", email)
                                        .append("password", password);

            // Insert the user document into the MongoDB collection
            usersCollection.insertOne(userDocument);

            // Redirect to a success page
            response.sendRedirect("registration-success.jsp");
        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
            response.sendRedirect("registration-error.jsp");
        }
    }
}
	