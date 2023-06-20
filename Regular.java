import java.util.regex.*;

public class Regular {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        // Regular expression pattern
        String pattern = ".*brown.*";

        // Use Pattern and Matcher to verify the regular expression
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        // Perform the match and print the result
        boolean isMatch = matcher.matches();
        System.out.println("Text matches the pattern: " + isMatch);
    }
}
