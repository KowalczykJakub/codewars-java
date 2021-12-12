public class DnaStrand {
    public static String makeComplement(String dna) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {

            if (dna.charAt(i) == 'A')
                sb.append('T');
            else if (dna.charAt(i) == 'T')
                sb.append('A');
            else if (dna.charAt(i) == 'C')
                sb.append('G');
            else if (dna.charAt(i) == 'G')
                sb.append('C');
        }

        return sb.toString();
    }
}
