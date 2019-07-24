import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionParser {
    public String[] parser(String input) {
        String[] words = input.split(" ");
        List<String> wordsList = new ArrayList<String>(Arrays.asList(words));
        wordsList.remove("how");
        wordsList.remove("much");
        //wordsList.remove("many");
        wordsList.remove("is");
        wordsList.remove("?");
        //wordsList.remove("Credits");
        words = wordsList.toArray(new String[0]);
        return words;
    }
}
