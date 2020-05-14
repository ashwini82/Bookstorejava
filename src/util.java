import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.io.IOException;

public class util {
    public static void loadStringsToArray(ArrayList<String> arrList) throws IOException {
        Path path = Paths.get("C:\\Users\\user\\Documents\\JAVA\\BookStore\\src\\Bookfile.txt");
        arrList.clear();

        // The stream file will also be closed here
        try (Stream<String> lines = Files.lines(path)) {
            Object[] arr = lines.toArray();

            for (Object t : arr) {
                arrList.add(t.toString());
            }
        }
    }

}
