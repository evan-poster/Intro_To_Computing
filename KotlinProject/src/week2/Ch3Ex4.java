package week2;

// Ex4: Review and correct the mistake in the fourth code snippet.

public class Ch3Ex4 {
    public static String translate(String dna) {
        // translate from DNA to mRNA (replace 'T' with 'U')
        dna = dna.toUpperCase();
        return dna.replaceAll("T", "U");
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println(translate("TGA"));   // UGA
        System.out.println(translate("TGT"));   // UGU
        System.out.println(translate("UUUU"));  // UUUU
    }
}
