    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author lpr100
 */
public class Card {
    
  private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "2", "3", "4", "5",
                                   "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    
//    private String[] cardValue = {"2", "2", "2", "2", "2",
//                                   "2", "2", "2", "2", "2", "JACK", "QUEEN", "KING"};


    public Card(int cSuit, int cValue)
    {
        this.suit = cSuit; 
        this.value = cValue;
    }

    public String getSuit()
    {
            return cardSuit[suit];
    }
    
    public int getVAlue(){
        
        return value+ 1 ;
    }
    
    public String toString(){
        
        return cardSuit[suit]+" "+cardValue[value];
    }
    
    //Return the name of the image
    public String getImage()
    {
        String  imgname = cardValue[value]+cardSuit[suit]+".png";
        System.out.println("********************");
        System.out.println("Image Name: "+imgname);
                
        return imgname;
        
    }
    
    
}//End Class