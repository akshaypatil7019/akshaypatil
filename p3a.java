//3a. Develop a java program for performing various string operations with different string handling
//functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()




package stringoperations;

public class p3a {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1: " + s1.charAt(1));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("Equals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Program': " + text.indexOf("Program"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("Modified: " + modified);

        // 7. Whitespace Handling
        String spaced = "   Welcome   ";
        System.out.println("Before trim: '" + spaced + "'");
        System.out.println("After trim: '" + spaced.trim() + "'");

        // 8. String Concatenation
        String concat = s1 + " " + s2;
        System.out.println("Concatenation: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle").append(" End");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String name = "Akshay";
        int age = 21;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";

        if (email.contains("@") &&
            (email.endsWith(".com") || email.endsWith(".in")) &&
            !email.startsWith("@")) {

            System.out.println("Valid Email: " + email);
        } else {
            System.out.println("Invalid Email: " + email);
        }
    }
}