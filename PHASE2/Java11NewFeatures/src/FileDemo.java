import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDemo {

	public static void main(String[] args) {

		String countryFile = "F:\\Users\\home\\git\\sl-oct23\\PHASE2\\Java11NewFeatures\\countries.txt";
		Path path = Path.of(countryFile);

		try {
			String content = Files.readString(path);

			System.out.println(content);

		} catch (IOException e) {
			e.printStackTrace();
		}

		// Writing all content in one statement
		String someText = "Hello \n Today \n is \n Sunday";
		try {
			Files.writeString(Path.of("F:\\Users\\home\\git\\sl-oct23\\PHASE2\\Java11NewFeatures\\countries2.txt"),
					someText);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
