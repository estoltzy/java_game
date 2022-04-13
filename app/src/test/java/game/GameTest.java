package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {
  // @Test public void testGetsWordToGuess() {
  //   Game game = new Game();
  //   assertEquals(game.getWordToGuess(), "M_____");
  // }

  @Test public void testGetsInitialRemainingAttempts() {
    Game game = new Game();
    assertEquals(game, Integer.valueOf(10));
  }

  @Test public void testGetRandomWordFromDictionary() {
    String word = Game.getRandomWordFromDictionary();
    boolean foundIt = false;
    for (String dictWord : Game.DICTIONARY)
    {
      if (word.equals(dictWord))
    {
      foundIt = true;
    }
    }
    assertTrue(foundIt);
  }
}