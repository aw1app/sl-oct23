<%@ page import="com.mongodb.*,com.mongodb.client.*,com.sl.User, org.bson.Document, java.util.*, org.bson.codecs.configuration.*,org.bson.codecs.pojo.*"
	contentType="text/html;charset=UTF-8" language="java"%>
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
			PojoCodecProvider codecProvider = PojoCodecProvider.builder().automatic(true).build();
            MongoClientSettings settings = MongoClientSettings.builder()
                    .codecRegistry(CodecRegistries.fromRegistries(
                            MongoClientSettings.getDefaultCodecRegistry(),
                            CodecRegistries.fromProviders(codecProvider)))
                    .build();
            
			MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
			MongoDatabase database = MongoClients.create(settings).getDatabase("mydatabase");
			MongoCollection<User> usersCollection = database.getCollection("users", User.class);

			// Query users collection
			 List<User> users = usersCollection.find().into(new ArrayList<User>());

			// Iterate over query results and display users
			for (User user : users) {
		%>
		<tr>
			<td><%=user.getUsername()%></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getAge()%></td>
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
