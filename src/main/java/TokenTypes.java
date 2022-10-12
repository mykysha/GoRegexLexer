import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum TokenTypes {
    Hex_Constant(RegexData.HexRegEx),
    Keyword(RegexData.KeywordRegEx),
    Type(RegexData.TypeRegEx),
    Identifier(RegexData.IdentifierRegEx),
    Char_Constant(RegexData.CharRegEx),
    Integer_Constant(RegexData.IntegerRegEx),
    Float_Constant(RegexData.FloatRegEx),
    String_Constant(RegexData.StringRegEx),
    Punctuation(RegexData.PunctuationRegEx),
    Operator(RegexData.OperatorRegEx),
    Comment(RegexData.CommentRegEx),
    Whitespace("\\b\\B"),
    NewLine("\\b\\B"),
    Unknown(".");

    private final Pattern pattern;

    TokenTypes(String s) {
        pattern = Pattern.compile(s);
    }

    public static Token matchString(String s) {
        List<Token> tokens = new ArrayList<>();

        for (TokenTypes t : TokenTypes.values()) {
            Matcher m = t.pattern.matcher(s);

            if (m.lookingAt()) {
                tokens.add(new Token(t, m.group(0)));
            }
        }

        return tokens.stream().max(Comparator.comparingInt(x -> x.value.length())).orElse(null);
    }
}
