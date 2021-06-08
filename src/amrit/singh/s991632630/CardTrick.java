package amrit.singh.s991632630;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Amrit Singh
 * @date June 5,2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        random.setSeed(0);
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(random.nextInt(13) + 1);
           
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c);
        }
        

        //insert code to ask the user for Card value and suit, create their card
        System.out.print("Enter card value: ");
        int val = sc.nextInt();
        System.out.print("Enter suit: ");
        String suit = sc.nextLine();
       
        Card card = new Card();
        card.setValue(val);
        card.setSuit(suit);
        
        // and search magicHand here
        Card card2 = new Card();
        card2.setValue(12);
        card2.setSuit("Hearts");
        boolean found = false;
        System.out.println("Searching for: " +card2);
        for(int i = 0; i<magicHand.length; i++){
            if((magicHand[i].getValue()==card2.getValue()) && magicHand[i].getSuit().equalsIgnoreCase(card2.getSuit()))
            {
                //Then report the result here
                System.out.println("card is found at index" + (i+1));
                found=true;
            }
            else{
                System.out.println("card is not found in magix hands");
            }
        }
        
    }

}
