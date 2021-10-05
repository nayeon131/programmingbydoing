import java.util.Random ;
import java.util.Scanner;
public class Blackjack
{
  public static void main (String [] args)
  {
    Random r = new Random();
    Scanner keyboard = new Scanner(System.in);

    int Playercard1 = 2 + r.nextInt(10);
    int Playercard2 = 2 + r.nextInt(10);
    int Playertotal = Playercard1 + Playercard2 ;
    int PlayerNewcard = 2 + r.nextInt(10);
    String choice;

    int Dealercard1 = 2 + r.nextInt(10);
    int Dealercard2 = 2 + r.nextInt(10);
    int Dealercardtotal = Dealercard1 + Dealercard2 ;
    int DealerNewcard = 2 + r.nextInt(10);

    String Replay;


  //  do {


      System.out.println ("Welcome to Nayeon's Blackjack");
      System.out.println ("***********************************");

      System.out.println ("You get a " + Playercard1 + " and a " + Playercard2);
      System.out.println ("Your total is " + Playertotal );

      System.out.println ("The dealer has a " + Dealercard1 + " showing, and a hidden card." );
      System.out.println ( "His total is hidden, too.");

      do
      {

          System.out.println ("Would you like to hit or stay ? ");
          choice = keyboard.next();

          if (choice.equals("hit"))
          {

            System.out.println ("You drew a " +  PlayerNewcard );
            Playertotal += PlayerNewcard;
            System.out.println ("Your total is " + Playertotal );

          }
      }while (Playertotal < 21 &&  (! choice.equals("stay")));

      if ( Playertotal <= 21 )
      {
        System.out.println ("Okay, dealer's turn.") ;
        System.out.println ("His hidden card was a " + Dealercard1 );
        System.out.println ("His total is" + Dealercardtotal);

        do
        {
          if (Dealercardtotal < 17 )
          {
          choice = "hit";
          System.out.println ("Dealer chooses to hit");
          System.out.println ("He drews a " + DealerNewcard );
          Dealercardtotal += DealerNewcard ;
          System.out.println ("His total is " + Dealercardtotal );
          }
          else
          {
            choice = "stay";
            System.out.println ("Dealer stays");
          }
        }while (Dealercardtotal < 21 && (! choice.equals("stay")));
      }
        System.out.println ("Dealer total is " + Dealercardtotal);
        System.out.println ("Your total is " + Playertotal );

    if (Playertotal <= 21)
    {
      if (Dealercardtotal <= 21)
      {
        if (Playertotal > Dealercardtotal)
        {
          System.out.println ("YOU WIN!");
        }
        else if (Playertotal == Dealercardtotal)
        {
          System.out.println ("YOU DREW");
        }
        else
        {
          System.out.println ("YOU LOSE");
        }
      }
      else
      {
        System.out.println ("YOU WIN!");
      }
    }
    else
    {
      System.out.println ("YOU LOSE");
    }
    //Replay = keyboard.next();
//  }
  //while(! Replay.equals("n"));
  }

}
