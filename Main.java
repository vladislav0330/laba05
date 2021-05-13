public class Main {
    public static void main(String[] args) {
        String offer = "Сережа целый день играл в майнкрафт.";
        int k = 5;
        char symbol = '#';
        System.out.printf("Дано: %s%sРезультат: %s", offer, System.lineSeparator(), Main(offer, k, symbol));
    }
 
    public static String Main(String offer, int index, char symbol) {
        StringBuilder sb = new StringBuilder();
        if (offer != null && offer.length() > 0 && index > 0) {
            for (String word : offer.split(" ")) {
                if (word.length() >= index) {
                    sb.append(word.substring(0, index - 1)).append(symbol).append(word.substring(index, word.length()));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

