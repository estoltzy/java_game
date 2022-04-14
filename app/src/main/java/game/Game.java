package game;

import java.util.ArrayList;

import java.util.Scanner;

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
      if (i != 0 && !guessedLetters.contains(c)) {
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

  public void play() {
    Scanner input = new Scanner(System.in);
    String wordToGuess = getWordToGuess();
    System.out.println(String.format("Welcome! Today the word to guess is: \n %s", wordToGuess));
    while (attemptsRemaining > 0 && wordToGuess.indexOf('_') != -1) {
      System.out.println(String.format("Enter one letter to guess (%d attempts remaining)", getRemainingAttempts()));
      char firstChar = input.next().charAt(0);
      if (guessLetter(firstChar) == true) {
        System.out.println("Right!");
        wordToGuess = getWordToGuess();
      } else {
        System.out.println("Wrong...");
      }
      System.out.println(wordToGuess);
    }
    input.close();
  }

  public static void main(String[] args) {
    WordChooser choice = new WordChooser();
    Game game = new Game(choice);
    String guess = game.getWordToGuess();
    System.out.println(guess);
  }
}
