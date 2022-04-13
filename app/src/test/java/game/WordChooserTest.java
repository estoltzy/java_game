package game;

// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordChooserTest {
  @Test public void testGetRandomWordFromDictionary() {
    WordChooser wc = new WordChooser();
    String word = wc.getRandomWordFromDictionary();
    boolean foundIt = false;
    for (String dictWord : WordChooser.DICTIONARY)
    {
      if (word.equals(dictWord))
    {
      foundIt = true;
    }
    }
    assertTrue(foundIt);
  }
}
