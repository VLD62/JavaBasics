/**
 * Created by vld62 on 2/18/17.
 */
public class DeckOfCards {
    public static void main (String [] args){
        String [] Ranks = {"Ace", "2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        String [] Suits = {"Clubs","Diamonds","Hearts","Spades"};
        for (int i=0; i < Ranks.length; ++i)
        {
            for(int y=0; y < Suits.length;++y){
                System.out.println(Ranks[i] + " of " + Suits[y]);
            }
        }
                
    }

}
