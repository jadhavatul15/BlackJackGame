 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author lpr100
 */
public class GmaeGUI extends javax.swing.JFrame {

    /**
     * Creates new form GmaeGUI
     */
    Deck d = new Deck();
    Hand player_Hand = new Hand();
    Hand dealer_Hand = new Hand();
    ArrayList<Integer> imagevalue_1 = new ArrayList<Integer>(); //For Splitting
    ArrayList<Integer> imagevalue_2 = new ArrayList<Integer>(); //For Splitting
    public static int bet=0;
    //int bank = 5000;
    int points = 0;
    public static int player_total = 0;
    public static int dealer_total = 0;
    public static int player_total_SplitHand = 0;
    
    public static int player_Hand_Value=0,dealer_Hand_Value = 0;
    public static String name_plyr;
    
    public static int player_hand_count = 0;
    public static int dealer_hand_count = 0;
    public static String player_img_name;
    
    public static boolean split_action;
    //public static int bet=0;
    
   
    public GmaeGUI() {
        initComponents();
        player_total = 0;
        dealer_total = 0;
          //Set the points on the Text box
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
       
    }
    
    //Constructor
    public GmaeGUI(String plyr_name) {
        initComponents();
        
        player_total = 0;
        dealer_total = 0;
        
        player_hand_count = 0;
        dealer_hand_count = 0;
        
        name_plyr = plyr_name;
        System.out.println("Nammeee:"+name_plyr);
        jLabel6.setText("Player: "+name_plyr);
        
         d.Shuffle();
      
        player_Hand.addCard(d.draw());
         System.out.println("Linked List array :"+player_Hand.hand);
        //calculate the total of all the drawn cards
        player_total = player_total + getHandVlaue(player_Hand);
        
        //player_total = player_total + player_Hand.getHandValue();
        System.out.println("Player TOtal:"+player_total);
        
       // jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/"+player_Hand.lastCard().stringSuit()+"/"+playerHand.lastCard().stringValue()+".png")));
        //"/images/"+c1.getImage())
        imagevalue_1.add(getHandVlaue(player_Hand));//Add image name to player hand
        
         jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
         
        //Dealer Cards---
         //draw a dealer card from set of all cards
        dealer_Hand.addCard(d.draw());
        //calculate the total of all the drawn cards
        dealer_total = dealer_total + getHandVlaue(dealer_Hand);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+dealer_Hand.lastCard().getImage())));
      
        //Setting the Bet Value i.e get the bet vlaue of user
        BettingPageGUI bet_obj = new BettingPageGUI();
        bet = bet_obj.bet_intVal;
        System.out.println("Your Bet:"+bet);
        jLabel16.setText("Your Bet: $ "+bet);
        
          //Set the points on the Text box
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
       
        
    }//End Parameterised Constructor

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0)));
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 40));
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 70, 100));
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 70, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 70, 110));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText("   DEALER :");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        jLayeredPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 80, 40));
        jLayeredPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 80, 110));
        jLayeredPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 80, 110));
        jLayeredPane1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 80, 110));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("HIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b1fv.png"))); // NOI18N
        jLabel8.setText("jLabel3");
        jLayeredPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 70, 110));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("STAND");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 560, 90, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText(" Points :");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));
        jLayeredPane1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 170, 30));
        jLayeredPane1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 80, 110));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setText("Points :");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jLayeredPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));
        jLayeredPane1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 80, 100));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText(" Your Bet:");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jLayeredPane1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 190, 30));
        jLayeredPane1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 80, 110));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("INSTRUCTIONS");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 130, 30));

        jLabel18.setText("jLabel18");
        jLayeredPane1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 70, 100));

        jLabel19.setText("jLabel19");
        jLayeredPane1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 70, 110));

        jLabel20.setText("jLabel20");
        jLayeredPane1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 80, 110));

        jLabel21.setText("jLabel21");
        jLayeredPane1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 70, 100));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLayeredPane1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 250, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("SPLIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 100, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 0));
        jLayeredPane1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 180, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("DOUBLE DOWN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 130, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 51));
        jLayeredPane1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 400, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("SURRENDER");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BlackjackGUI.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1490, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This is HIT button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Here we Check always first the condition of Winning 
        player_hand_count+=1;//
        
        //Check always at start:--> playertotal > 21 then player looses
        if(player_total > 21){
           LoserPageGUI loserGUI = new LoserPageGUI(bet,this);
           loserGUI.setVisible(true);
           dispose();                   
         }
        if(dealer_total > 21)
        {
            //WINPageGUI win_gui = new WINPageGUI();
            WINPageGUI win_gui = new WINPageGUI(bet,this);
            win_gui.setVisible(true);
            dispose();            
        }
        
        //Here if player hand count is 1-->>so place the card on Jlabel4 i.e. 2nd card
        System.out.println("player hand count::"+player_Hand.count+":::"+player_hand_count);
        if(player_hand_count == 1)
        {
            //draw a player card from set of all cards
        player_Hand.addCard(d.draw());
        //calculate the total of all the drawn cards
        player_total = player_total + getHandVlaue(player_Hand);
        imagevalue_2.add(getHandVlaue(player_Hand));//Add image name to player hand
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
       
        }
       
        //Here we check if first two cards are same
        boolean allequal = imagevalue_1.get(0).equals(imagevalue_2.get(0));
        System.err.println("1st array element:"+imagevalue_1.toString());
        System.err.println("2nd array element:"+imagevalue_2.toString());
        System.err.println("All equal:"+allequal);
        
        //Here we enter the cndition on SPLIT action when allwqual is true
        if(allequal)
        {
            jLabel22.setText("YOU CAN SPLIT THE CARDS IN TWO ");
//            player_hand_count-=1;
            
         System.err.println("Split action:"+split_action);
            if(split_action)
            {
                  
                //Here if player hand count is 2-->>so place the card on Jlabel11 i.e. 3rd card
                 if(player_hand_count == 2)
                 {
                player_Hand.addCard(d.draw());
                player_total_SplitHand = player_total_SplitHand +getHandVlaue(player_Hand);//calculate the total
                jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
                jLabel23.setText("SecondHand-pts:"+player_total_SplitHand);
                 }
               
               //Here if player hand count is 3-->>so place the card on Jlabel14 i.e. 4th card
                 if(player_hand_count == 3)
                 {
                player_Hand.addCard(d.draw());
                player_total_SplitHand = player_total_SplitHand +getHandVlaue(player_Hand);//calculate the total
                jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
                jLabel23.setText("Points_hand-2:"+player_total_SplitHand);
                 }
       
            }//End if--> split action
        }//End if--> all equals
            
        ////////////////
        
        
        
        
        //Here if player hand count is 2-->>so place the card on Jlabel11 i.e. 3rd card
         if(player_hand_count == 2)
         {
             player_Hand.addCard(d.draw());
        player_total = player_total + getHandVlaue(player_Hand);//calculate the total
//        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
        //jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
         
         if(split_action )
          {
              jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
              
          }
         else{
              jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
         }
       }
        
       
       //Here if player hand count is 3-->>so place the card on Jlabel14 i.e. 4th card
         if(player_hand_count == 3)
         {
             player_Hand.addCard(d.draw());
        player_total = player_total + getHandVlaue(player_Hand);//calculate the total
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
           
      
         }
       
     int numOfCards_playerhand = player_Hand.getNumberOfCards();
     System.out.println("Num of Cards Player Hand:"+numOfCards_playerhand);
     
      int numOfCards_dealerHand = dealer_Hand.getNumberOfCards();
     System.out.println("Num of Cards Dealer Hand:"+numOfCards_dealerHand);
     
     //Check for every hit
     if(player_total > 21){
           //LoserPageGUI loserGUI = new LoserPageGUI();
           LoserPageGUI loserGUI = new LoserPageGUI(bet,this);
           loserGUI.setVisible(true);
           dispose();                   
         }
        if(dealer_total > 21)
        {
            WINPageGUI win_gui = new WINPageGUI(bet,this);
            win_gui.setVisible(true);
            dispose();            
        }
     
     
       //Set the points on the Text box
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
       
     
    }//GEN-LAST:event_jButton1ActionPerformed
    //Method accepting input as Hand and returning the value
     public int getHandVlaue(Hand hand_in)
    {
        Hand h = hand_in;
        int value =  hand_in.getHandValue();
        
        if(value > 10){
            value = 10;
        }
        else {
            return value;
        }
        return value;
        
    }//End Method gethandValue

//This is STAND button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    // TODO add your handling code here:
        dealer_hand_count +=1;
        
        //Dealer Cards---
      if(dealer_hand_count == 1)
      {        
        dealer_Hand.addCard(d.draw());
        dealer_total = dealer_total + getHandVlaue(dealer_Hand);//calculate the total
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+dealer_Hand.lastCard().getImage())));
      }
      
      if(dealer_hand_count == 2)
      {        
        dealer_Hand.addCard(d.draw());
        dealer_total = dealer_total + getHandVlaue(dealer_Hand);//calculate the total
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+dealer_Hand.lastCard().getImage())));
      }

       if(dealer_hand_count == 3)
      {        
        dealer_Hand.addCard(d.draw());
        dealer_total = dealer_total + getHandVlaue(dealer_Hand);//calculate the total
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+dealer_Hand.lastCard().getImage())));
      }
      
    //Conditions for Winning and Losing
    //Check always at start:--> playertotal > 21 then player looses
       if(player_total > 21){
          // LoserPageGUI loserGUI = new LoserPageGUI();
          LoserPageGUI loserGUI = new LoserPageGUI(bet,this);
           loserGUI.setVisible(true);
           dispose();
                   
         }
        
       else if(dealer_total > player_total && dealer_total <= 21){
          //LoserPageGUI loserGUI = new LoserPageGUI();
          LoserPageGUI loserGUI = new LoserPageGUI(bet,this);
          loserGUI.setVisible(true);
         // dispose();
           
        }
       else if(dealer_total > 21 && player_total > 21){
         WInnerAndLoserPageGUI WINLoose_gui = new WInnerAndLoserPageGUI();
         WINLoose_gui.setVisible(true);
        // dispose();
        }    
      else if(dealer_total > 21 && player_total <= 21){
        // WINPageGUI WIN_gui = new WINPageGUI();
         WINPageGUI WIN_gui = new WINPageGUI(bet,this);
         WIN_gui.setVisible(true);
         //dispose();
        }   
      else if(player_total > dealer_total)
      {
          //WINPageGUI win_gui = new WINPageGUI();
          WINPageGUI win_gui = new WINPageGUI(bet,this);
          win_gui.setVisible(true);
          //dispose();
      }
      else if(dealer_total > player_total)
      {
         // LoserPageGUI lose_gui = new LoserPageGUI();
          LoserPageGUI lose_gui = new LoserPageGUI(bet,this);
          lose_gui.setVisible(true);
          //dispose();
      }
      else if(player_total == dealer_total)
      {
          WInnerAndLoserPageGUI win_lose = new WInnerAndLoserPageGUI(this);
          win_lose.setVisible(true);
          //dispose();
      }
       
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //Instructions Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Instructions obj = new Instructions();
        obj.setVisible(true);
       
    }//GEN-LAST:event_jButton3ActionPerformed
//Split Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+player_Hand.lastCard().getImage())));
        player_total = player_total - getHandVlaue(player_Hand);
         split_action =true;
        // player_hand_count-=1;
         player_total_SplitHand = player_total_SplitHand +getHandVlaue(player_Hand);
         bet = bet*2;
         jLabel16.setText("Your New Bet:"+bet);
         player_Hand.remove_Last_Card();
//        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+"b1fv.png")));
        //jLabel5 = new javax.swing.JLabel();
         jLabel5.setIcon(null);
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
        player_hand_count = 1;
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    //Double Down
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jLabel24.setText("Double Down Doubles your original bet and You can Hit once:");
         
        bet = bet*2;
        jLabel16.setText("Your Bet: $ "+bet);
       
        jLabel12.setText("Points :"+player_total);
        jLabel13.setText("Points :"+dealer_total);
    }//GEN-LAST:event_jButton5ActionPerformed

    //Surrender Button
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Surrender_GUI surnder_gui = new Surrender_GUI(bet,this);
        surnder_gui.setVisible(true);
        //dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GmaeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GmaeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GmaeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GmaeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GmaeGUI(name_plyr).setVisible(true);
            }
        });
    }//End main
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}