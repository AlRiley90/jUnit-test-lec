import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void stringVerification(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void compareArrays(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void equalArrays(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void trueOrFalse(){
        String language = "PHP";
//        language.contains("H");
//        language.contains("J");
        assertTrue("language contains the letter H", language.contains("H"));
        assertFalse("Language does not contain the letter J", language.contains("J"));
    }
}
