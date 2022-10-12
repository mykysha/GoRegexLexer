import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReader {
    public static Lexer processFile(String path) {
        Lexer lexer = null;

        try {
            Stream<String> lines = LineSplitter.splitToLines(Files.lines(Path.of(path)));
            lexer = new Lexer(lines);

            lexer.splitToTokens();
            lexer.printTokens();
        } catch (IOException e) {
            System.err.println("Failed to open " + path);
        }

        return lexer;
    }
}
