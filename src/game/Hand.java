/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.LinkedList;

/**
 *
 * @author lokeshramdin
 */
public class Hand {
    
    LinkedList<Card> hand = new LinkedList<Card>();
    int handValue;
    int count;
    public  String imageName;
    
    public Hand()
    {
        hand = new LinkedList<>();
        this.handValue = 0;
        this.count = 0;  
        
        
    }//End Constructor
     
     public void addCard(Card c)
    {
        hand.add(c);
        handValue = c.getVAlue();
        imageName = c.getImage();
        count++;
        
    }
    
    public Card lastCard()
    {
        System.out.println("Last Card"+hand.getLast());
                
        return hand.getLast();
        
    }
    
    public int getHandValue()
    {
        return handValue;
    }
    
     public int getNumberOfCards()
    {
        return count;
        
    }
     
     public String getImageName()
    {
        return imageName;
        
    }
     
     public void remove_Last_Card()
     {
         hand.removeLast();
     }
     
}//End Class
