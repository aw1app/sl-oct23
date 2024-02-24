<%@ page import="com.mongodb.client.MongoClients, com.mongodb.client.MongoCollection, com.mongodb.client.MongoDatabase, org.bson.Document, com.mongodb.client.FindIterable" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Users</title>
</head>
<body>
    <h2>List Users</h2>
    <table border="1">
        <tr>
            <th>Username</th>
            <th>Email</th>
            <th>Age</th>
        </tr>
        <% 
            // Connect to MongoDB
            try {
                var mongoClient = MongoClients.create("mongodb://localhost:27017");
                MongoDatabase database = mongoClient.getDatabase("mydatabase");
                MongoCollection<Document> usersCollection = database.getCollection("users");

                // Query users collection
                FindIterable<Document> users = usersCollection.find();

                // Iterate over query results and display users
                for (Document user : users) {
        %>
            <tr>
                <td><%= user.getString("username") %></td>
                <td><%= user.getString("email") %></td>
                <td><%= user.getInteger("age") %></td>
            </tr>
        <%
                }
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
</body>
</html>
