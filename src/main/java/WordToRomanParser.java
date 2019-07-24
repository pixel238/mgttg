public class WordToRomanParser {

    WordToRomanParser() {
    }

    public String[] parser(String input) {
        String[] words = input.split(" ");
        return new String[]{words[0], words[2]};
    }
}
