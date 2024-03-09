package com.example;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello Mongo!");
		// Connect to MongoDB
		try {

			MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
			MongoDatabase database = mongoClient.getDatabase("mydatabase");
			MongoCollection<Document> usersCollection = database.getCollection("users");

			// listAllDocumentsDemo(usersCollection);

			int age = 24;
			//listAllDocumentsHavingAge(usersCollection, age);

			String name = "USER";
			//listAllDocumentsHavingAgeGreaterAndNameStartsWith(usersCollection, age, name);

			// insertOneDocumentDemo(usersCollection, "USER102","USER102@gmail.com",28);

			// Update the document whose username attribute is "USER102", change its email to "USER10002@gmail.com"
			// updateOneDocumentDemo(usersCollection, "USER102", "email", "USER10002@gmail.com");

			 deleteOneDocumentDemo(usersCollection, "USER102");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Challenge: How will you find all users having age > 30 and name is Alice
	private static void listAllDocumentsHavingAgeGreaterAndNameStartsWith(MongoCollection<Document> usersCollection,
			int age, String name) {

		List<Document> usersHavingAgeGt30NameEq = usersCollection
				.find(Filters.and(Filters.gt("age", age), Filters.regex("username", "^"+name, "i"))).into(new ArrayList<>());;
		
		System.out.printf("** Users Documents Having age > %s amd name starts with %s **\n", age, name);
		for (Document user : usersHavingAgeGt30NameEq) {
			System.out.println("** User **");
			System.out.println("Age: " + user.getInteger("age"));
			System.out.println("Username:  " + user.getString("username"));
			System.out.println("Email :  " + user.getString("email"));
			System.out.println("Name :  " + user.getString("name"));
			System.out.println("");
		}

	}

	private static void listAllDocumentsHavingAge(MongoCollection<Document> usersCollection, int age) {

		FindIterable<Document> usersHavingAge30 = usersCollection.find(Filters.eq("age", 30));

		System.out.println("** Users Documents Having age 30**");
		for (Document user : usersHavingAge30) {
			System.out.println("** User **");
			System.out.println("Age: " + user.getInteger("age"));
			System.out.println("Username:  " + user.getString("username"));
			System.out.println("Email :  " + user.getString("email"));
			System.out.println("Name :  " + user.getString("name"));
			System.out.println("");
		}

	}

	public static void deleteOneDocumentDemo(MongoCollection<Document> collection, String username) {

		collection.deleteOne(Filters.eq("username", username));

	}

	public static void updateOneDocumentDemo(MongoCollection<Document> collection, String username, String email,
			String new_email_value) {
		
		// The attr that we want change, create a document
		Document attributeChangeDoc =  new Document(email, new_email_value);

		// Wrap the above the document in a new document and add the $set instruction 
		Document doc = new Document("$set", attributeChangeDoc);

		// Finally effect the update!
		collection.updateOne(Filters.eq("username", username), doc);

	}

	public static void insertOneDocumentDemo(MongoCollection<Document> collection, String username, String email,
			int age) {

		Document user = new Document();

		user.append("email", email).append("username", username).append("age", age);

		collection.insertOne(user);
	}

	public static void listAllDocumentsDemo(MongoCollection<Document> collection) {
		FindIterable<Document> users = collection.find();

		for (Document user : users) {
			System.out.println("** User **");
			System.out.println("Age: " + user.getInteger("age"));
			System.out.println("Username:  " + user.getString("username"));
			System.out.println("Email :  " + user.getString("email"));
			System.out.println("Name :  " + user.getString("name"));
			System.out.println("");
		}

	}

}
