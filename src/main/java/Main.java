public class Main {
    public static void main(String[] args) {
        String path = "example.go";

        if (args.length == 0) {
            System.out.println("No path specified, using default path: " + path);
        } else {
            System.out.println("Using path: " + args[0]);

            path = args[0];
        }

        Lexer lexer = FileReader.processFile(path);

        if (lexer == null) {
            System.exit(1);
        }

        lexer.printTokens();
    }
}
