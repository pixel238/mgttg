import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputParserTest {
    @Test
    void canParseWordToRomanNumeralStatement() {
        WordToRomanParser wordToRomanParser = new WordToRomanParser();
        assertArrayEquals(new String[]{"glob", "I"},
                wordToRomanParser.parser("glob is I"));
        assertArrayEquals(new String[]{"prok", "V"},
                wordToRomanParser.parser("prok is V"));
        assertArrayEquals(new String[]{"pish", "X"},
                wordToRomanParser.parser("pish is X"));
        assertArrayEquals(new String[]{"tegi", "L"},
                wordToRomanParser.parser("tegi is L"));
    }

    @Test
    void canParseWordToRomanNumeralStatement2() {
        WordAndCreditParser wordAndCreditParser = new WordAndCreditParser();
        assertArrayEquals(new String[]{"glob", "prok", "Gold", "57800", "Credits"},
                wordAndCreditParser.parser("glob prok Gold is 57800 Credits"));
        assertArrayEquals(new String[]{"glob", "glob", "Silver", "34", "Credits"},
                wordAndCreditParser.parser("glob glob Silver is 34 Credits"));
        assertArrayEquals(new String[]{"pish", "pish", "Iron", "3910", "Credits"},
                wordAndCreditParser.parser("pish pish Iron is 3910 Credits"));
    }

    @Test
    void canParseWordToRomanNumeralStatement3() {
        QuestionParser questionParser = new QuestionParser();
        assertArrayEquals(new String[]{"pish", "tegi", "glob", "glob"},
                questionParser.parser("how much is pish tegi glob glob ?"));
    }
}
