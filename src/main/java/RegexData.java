public class RegexData {
    public static final String KeywordRegEx = "(break|default|func|interface|select|" +
            "case|defer|go|map|struct|chan|else|goto|package|switch|const|fallthrough|" +
            "if|range|type|continue|for|import|return|var)";

    public static final String TypeRegEx = "(bool|" +
            "string|" +
            "int|int8|int16|int32|int64|" +
            "uint|uint8|uint16|uint32|uint64|uintptr|" +
            "byte|" +
            "rune|" +
            "float32|float64|" +
            "complex64|complex128|"+
            "error)";

    public static final String HexRegEx = "0x[0-9A-Fa-f]*";

    public static final String CommentRegEx = "(/\\*|//)";

    public static final String OperatorRegEx = "(\\+|\\&|\\+\\=|\\&\\=|\\&\\&|\\=\\=|\\!\\=|" +
                    "\\-|\\||\\-\\=|\\|\\=|\\|\\||\\<|\\<\\=|" +
                    "\\*|\\^|\\*\\=|\\^\\=|\\<\\-|\\>|\\>\\=|" +
                    "\\/|\\<\\<|\\/\\=|\\<\\<\\=|\\+\\+|\\=|\\:\\=|" +
                    "\\%|\\>\\>|\\%\\=|\\>\\>\\=|\\-\\-|\\!|\\.\\.\\.|" +
                    "\\&\\^|\\&\\^\\=|\\~)";

    public static final String PunctuationRegEx = "(\\[|]|\\(|\\)|\\{|\\}|\\;|\\.|\\,)";

    public static final String IdentifierRegEx = "[_A-Za-z][0-9A-Za-z_]*";

    public static final String IntegerRegEx = "([1-9][0-9]*|0)";

    public static final String FloatRegEx = "([1-9][0-9]*|0)\\.[0-9]*";

    public static final String CharRegEx = "'[^']+'";

    public static final String StringRegEx = "\"(?:\\\\\"|[^\"])*?\"";
}
