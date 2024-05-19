package week2;

// Ex1: Complete the first code snippet listed on page 335 of our textbook

public class Ch3Ex1 {
    public static void main(String[] args) {
        // Check if we have arguments
        if ( args.length > 0 ) {
            String s = args[0];
            int dot = s.indexOf(".");
            String base = s.substring(0, dot);
            String extension = s.substring(dot + 1);
            System.out.println("base: " + base );
            System.out.println("extension: " + extension);
        } else {
            System.out.println("Usage: java Ch3Ex1 <file>");
        }
    }
}
