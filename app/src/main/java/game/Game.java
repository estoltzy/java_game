package game;

import java.util.ArrayList;

public class Game {

  private String word;
  private int attemptsRemaining = 10;
  private ArrayList<Character> guessedLetters = new ArrayList<Character>(); 

  Game(WordChooser chooser) {
    word = chooser.getRandomWordFromDictionary();
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

  public Boolean guessLetter(Character letter) {
    if (word.indexOf(letter) != -1) {
      guessedLetters.add(letter);
      return true;
    } else {
      attemptsRemaining--;
      return false;
    }
  }

  public static void main(String[] args) {
    WordChooser choice = new WordChooser();
    Game game = new Game(choice);
    String guess = game.getWordToGuess();
    System.out.println(guess);
  }
}
