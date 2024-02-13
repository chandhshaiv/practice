package program;

import java.util.stream.*;

public class Double {

	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", "Portal");

		// Print the stream
		// using double colon operator
		stream.forEach(System.out::println);
	}
}
