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
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlayerName p = new PlayerName();
         String plyr_name = p.getPlayerName();
       
        Deck d =new Deck();
        
        d.print();
        
        //Setting visibility of Game GUI
        GameStartPageGUI obj = new GameStartPageGUI();
        obj.setVisible(true);
        
        //GmaeGUI g =new GmaeGUI(plyr_name);
        //g.setVisible(true);
    }
    
}
