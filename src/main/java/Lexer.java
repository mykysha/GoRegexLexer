import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lexer {
    private final Stream<String> lines;

    private final List<Token> tokens = new ArrayList<>();

    private boolean isComment = false;

    public Lexer(Stream<String> lines) {
        this.lines = lines;
    }

    public void printTokens() {
        for (Token t : tokens) {
            if (t.getType() == TokenTypes.Comment) {
                continue;
            }

            System.out.println(t);
        }
    }

    private void processLine(String s) {
        Token t;

        while (s.length() > 0) {
            int i = 0;

            while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
                i++;
            }

            s = s.substring(i);
            t = TokenTypes.matchString(s);

            if (t == null) {
                return;
            }

            if (t.type == TokenTypes.Comment) {
                tokens.add(new Token(t.type, s));

                return;
            }

            tokens.add(t);

            s = s.substring(t.value.length());
        }
    }

    public void splitToTokens() {
        lines.forEach(this::processLine);
    }
}
