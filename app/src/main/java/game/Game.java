package game;

public class Game {

  String word;

  Game(String inputWord) {
    word = inputWord;
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
  public static void main(String[] args) {
    Game game = new Game("MAKERS");
    String guess = game.getWordToGuess();
    System.out.println(guess);
  }
}
