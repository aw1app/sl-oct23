import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		HttpClient client = HttpClient.newBuilder().version(Version.HTTP_2).connectTimeout(Duration.ofSeconds(55))
				.build();

		String url1 = "https://crunchify.com/wp-content/java/crunchify-java-httpclient-tutorial.html";

		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url1))
				.setHeader("User-Agent", "Crunchify Java Synchronous HTTPClient Example...").build();

		/*
		 * HttpRequest request =
		 * HttpRequest.newBuilder(URI.create("http://abc.com/post"))
		 * .header("Content-Type", "application/json")
		 * .POST(HttpRequest.BodyPublishers.ofString("{\n" + "  \"json\":null,\n" +
		 * "  \"origin\":\"112.196.145.x\",\n" + "  \"url\":\"http://abc.com/patch\"\n"
		 * + "}")) .build();
		 */

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

	}

}
