/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import jdk.nashorn.internal.ir.ForNode;

/**
 *
 * @author lpr100
 */
public class Deck 
{
       // public ArrayList<Card> deck_of_cards = new ArrayList<Card>();
        public LinkedList<Card> deck_of_cards = new LinkedList<Card>();
        //Collection<Object>
        //Collection<Card> c1 = new Collection<Card>() {};
        int numberOfCards;
        
        public Deck()
        {
            int num_suits = 4;
            int num_card = 13;
             numberOfCards = 0;
             
            for (int i = 0; i <4 ; i++) 
            {
                for (int j = 0; j < 13; j++) 
                {
                    Card c = new Card(i, 4);//Change here to j
                    deck_of_cards.add(c);
                     numberOfCards++;
                }
            }
        }//End Constructor
        
        
        public void print()
        {
            for (int i = 0; i < 52; i++) {
                
                System.out.println(deck_of_cards.get(i));
                        
                
            }
        }
        
        
        //Shuffle 
        public void Shuffle(){
           Collections.shuffle(deck_of_cards);
            
        }
        
        
        public int getNumberOfCards()
          {
              return numberOfCards;

          }

        //Draw one card at a time fromt the Deck
        public Card draw()
          {
              return deck_of_cards.pop();

          }
        
}//End Class 

