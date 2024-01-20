import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		// demoGET();
		demoPost();
	}	
	
	public static void demoPost() throws IOException, InterruptedException {

		HttpClient client = HttpClient.newBuilder()
							.version(Version.HTTP_2)
							.connectTimeout(Duration.ofSeconds(55))
							.build();

		String url1 = "https://jsonplaceholder.typicode.com/posts";
		String postData = "{\"title\":\"Test Post\",\"body\":\"This is a test post\",\"userId\":1}";

		HttpRequest request = HttpRequest.newBuilder()
				.header("Content-Type", "application/json")
				 .POST(HttpRequest.BodyPublishers.ofString(postData))
				 .uri(URI.create(url1))
				.build();		 
		

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());
	}
	
	public static void demoGET() throws IOException, InterruptedException {

		HttpClient client = HttpClient.newBuilder()
							.version(Version.HTTP_2)
							.connectTimeout(Duration.ofSeconds(55))
							.build();

		String url1 = "https://raw.githubusercontent.com/aw1app/sl-oct23/main/PHASE2/MultiThreadingDemo/src/com/ecommerce/Doctor.java";

		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create(url1))
				.build();
	

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

	}

}
