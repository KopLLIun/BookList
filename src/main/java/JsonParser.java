import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.stream.Collectors;

public class JsonParser {

    public static void parseBookJson() {
        Library library = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            library = mapper.readValue(new File("Book.json"), Library.class);
        } catch (IOException | NullPointerException e) {
            e.printStackTrace();
        }
        library.getBookList().stream().collect(
                Collectors.groupingBy(Book -> Book.getAuthor())).forEach((key, value) -> {
            System.out.println("Books of " + key + ":");
            value.forEach(x -> System.out.println(" - " + x.getTitle()));
            System.out.println();
        });
    }
}
