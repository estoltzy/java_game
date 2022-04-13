package game;

import java.util.Random;

public class Game {

  String word;
  int attemptsRemaining = 10;

  public static final String[] DICTIONARY= {
    "MAKERS",
    "CANDIES",
    "DEVELOPER",
    "LONDON",
  };

  Game() {
    word = getRandomWordFromDictionary();
  }

  public String getWordToGuess() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if (i != 0) {
        sb.append("_");
      } else {
        sb.append(c);
      }         
    }
    String result = sb.toString();
    return result;
  }

  public int getRemainingAttempts() {
    return attemptsRemaining;
  }

  public static String getRandomWordFromDictionary() {
    Random rand = new Random();
    Integer randomWord = rand.nextInt(DICTIONARY.length);
    return randomWord.toString();
  }

  public static void main(String[] args) {
    Game game = new Game();
    String guess = game.getWordToGuess();
    System.out.println(guess);
  }
}
