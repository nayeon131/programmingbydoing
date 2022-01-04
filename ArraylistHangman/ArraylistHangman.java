import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;

@SuppressWarnings("unchecked")

public class ArraylistHangman
{


  public static void main (String[] args) throws FileNotFoundException
  {


    Scanner scanner = new Scanner (new File ("/Users/nayeon/Documents/GitHub/programmingbydoing/ArraylistHangman/Hangman.txt"));
    Scanner keyboard = new Scanner (System.in);

    List <String> words = new ArrayList<>();

    while (scanner.hasNext()){
      words.add (scanner.nextLine());
    }

    Random rand = new Random();

    String word = words.get(rand.nextInt(words.size()));

    List<Character> playerGuesses = new ArrayList<>();

    while(true)
    {

      printwordstate(word, playerGuesses);

      getplayer(keyboard, word, playerGuesses);


      if (printwordstate(word, playerGuesses))
      {
          System.out.println("You win!");
          break;
      }
       System.out.println ("Guess for the word: ");
       if (keyboard.nextLine().equals(word))
       {
         System.out.println("You win!");
         break;
       }
       else
       {
         System.out.println ("Try again");
       }
     }
   }

  private static boolean getplayer(Scanner keyboard, String word, List<Character> playerGuesses)
  {
      System.out.println ("Please enter a letter: ");
      String letterGuess = keyboard.nextLine();
      playerGuesses.add(letterGuess.charAt(0));

      return word.contains(letterGuess);
  }



  private static boolean printwordstate (String word, List<Character> playerGuesses)
  {
    int correctCount = 0;
      for (int i = 0; i < word.length(); i++) {
        if (playerGuesses.contains(word.charAt(i))){
          System.out.print(word.charAt(i));
          correctCount++;
        }
        else {
          System.out.print ("-");
        }
      }
      System.out.println();

      return (word.length() == correctCount);
    }
  }
