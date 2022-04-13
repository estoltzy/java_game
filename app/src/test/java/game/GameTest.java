package game;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test public void testGetsWordToGuessWithRandomWord() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    Game game = new Game(mockedChooser);
    assertEquals(game.getWordToGuess(), "D________");
  }

  @Test public void testGetsInitialRemainingAttempts() {
    WordChooser choice = new WordChooser();
    Game game = new Game(choice);
    assertEquals(game, Integer.valueOf(10));
  }

  @Test public void testGuessesLetter() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser);
    assertEquals(game.guessLetter('K'), true);
  }

  @Test public void testGuessLetterRight() {
    WordChooser mockedChooser = mock(WordChooser.class);
    when(mockedChooser.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedChooser);
    assertEquals(game.guessLetter('T'), false);
  }
}