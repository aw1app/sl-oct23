<%@ page
	import="com.mongodb.*,com.mongodb.client.*,com.sl.User, org.bson.Document, java.util.*, org.bson.codecs.configuration.*,org.bson.codecs.pojo.*"
	contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>List Users</title>
</head>
<body>

	<%!private static void createUser(MongoCollection<User> collection, User user) {
		collection.insertOne(user);		
	}%>

	<%
	// Connect to MongoDB
	try {
		PojoCodecProvider codecProvider = PojoCodecProvider.builder().automatic(true).build();
		MongoClientSettings settings = MongoClientSettings.builder()
		.codecRegistry(CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
				CodecRegistries.fromProviders(codecProvider)))
		.build();

		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		MongoDatabase database = MongoClients.create(settings).getDatabase("mydatabase");
		MongoCollection<User> usersCollection = database.getCollection("users", User.class);

		User newUser = new User("Alice2", 32, "alice2@example.com");
		createUser(usersCollection, newUser);
		out.println("User created: " + newUser);

	} catch (Exception e) {
		out.println("Error: " + e.getMessage());
	}
	%>
</body>
</html>
