package game;

import java.util.Random;

public class WordChooser {
  
  public static final String[] DICTIONARY= {
    "MAKERS",
    "CANDIES",
    "DEVELOPER",
    "LONDON",
  };

  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    Integer randomWord = rand.nextInt(DICTIONARY.length);
    return randomWord.toString();
  }
}
