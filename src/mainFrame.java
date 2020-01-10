/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;

/**
 *
 * @author dymoo6791
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    int card1, card2, card3, total2Cards, total3Cards;
    Random rand = new Random();
    String[] cards
            = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A",
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

    public mainFrame() {

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hitBtn = new javax.swing.JButton();
        stand2CardsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userCardLbl1 = new javax.swing.JLabel();
        userCardLbl2 = new javax.swing.JLabel();
        userCardLbl3 = new javax.swing.JLabel();
        StartBtn = new javax.swing.JButton();
        stand3CardsBtn = new javax.swing.JButton();
        userCardLbl4 = new javax.swing.JLabel();
        userCardLbl5 = new javax.swing.JLabel();
        TotalLbl = new javax.swing.JLabel();
        userCardLbl6 = new javax.swing.JLabel();
        userCardLbl7 = new javax.swing.JLabel();
        userCardLbl8 = new javax.swing.JLabel();
        userCardLbl9 = new javax.swing.JLabel();
        userCardLbl10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hitBtn.setText("Hit");
        hitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(hitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 102, 36));

        stand2CardsBtn.setText("Stand 1");
        stand2CardsBtn.setMaximumSize(new java.awt.Dimension(45, 23));
        stand2CardsBtn.setMinimumSize(new java.awt.Dimension(45, 23));
        stand2CardsBtn.setPreferredSize(new java.awt.Dimension(45, 23));
        stand2CardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stand2CardsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(stand2CardsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 102, 36));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Hand");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, 190, 20));

        userCardLbl1.setBackground(new java.awt.Color(255, 255, 255));
        userCardLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl1.setText("?");
        userCardLbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 60, 80));

        userCardLbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl2.setText("?");
        userCardLbl2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 80));

        userCardLbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl3.setText("?");
        userCardLbl3.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, 80));

        StartBtn.setText("Deal");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });
        jPanel1.add(StartBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 253, 100, 40));

        stand3CardsBtn.setText("Stand");
        stand3CardsBtn.setMaximumSize(new java.awt.Dimension(45, 23));
        stand3CardsBtn.setMinimumSize(new java.awt.Dimension(45, 23));
        stand3CardsBtn.setPreferredSize(new java.awt.Dimension(45, 23));
        stand3CardsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stand3CardsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(stand3CardsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 102, 36));

        userCardLbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl4.setText("?");
        userCardLbl4.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 60, 80));

        userCardLbl5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl5.setText("?");
        userCardLbl5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 60, 80));

        TotalLbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TotalLbl.setText("Total:");
        jPanel1.add(TotalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 230, -1));

        userCardLbl6.setBackground(new java.awt.Color(255, 255, 255));
        userCardLbl6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl6.setText("?");
        userCardLbl6.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 60, 80));

        userCardLbl7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl7.setText("?");
        userCardLbl7.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 60, 80));

        userCardLbl8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl8.setText("?");
        userCardLbl8.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 60, 80));

        userCardLbl9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl9.setText("?");
        userCardLbl9.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 60, 80));

        userCardLbl10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userCardLbl10.setText("?");
        userCardLbl10.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jPanel1.add(userCardLbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 60, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitBtnActionPerformed
        String Card1 = userCardLbl1.getText();
        String Card2 = userCardLbl2.getText();

        userCardLbl3.setText(Card1);
        userCardLbl4.setText(Card2);
        userHit();
        stand3CardsBtn.setVisible(true);
        stand2CardsBtn.setVisible(false);
        userCardLbl3.setVisible(true);
        userCardLbl4.setVisible(true);
        userCardLbl5.setVisible(true);
        userCardLbl1.setVisible(false);
        userCardLbl2.setVisible(false);
    }//GEN-LAST:event_hitBtnActionPerformed

    private void stand2CardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stand2CardsBtnActionPerformed
        String userCard1 = userCardLbl1.getText();
        String userCard2 = userCardLbl2.getText();
        TotalLbl.setText(total2Cards(userCard1, userCard2));


    }//GEN-LAST:event_stand2CardsBtnActionPerformed

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        userCards();
        StartBtn.setVisible(false);
        stand3CardsBtn.setVisible(false);
        userCardLbl3.setVisible(false);
        userCardLbl4.setVisible(false);
        userCardLbl5.setVisible(false);
    }//GEN-LAST:event_StartBtnActionPerformed

    private void stand3CardsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stand3CardsBtnActionPerformed
        String userCard1 = userCardLbl3.getText();
        String userCard2 = userCardLbl4.getText();
        String userCard3 = userCardLbl5.getText();
        TotalLbl.setText(total3Cards(userCard1, userCard2, userCard3));
    }//GEN-LAST:event_stand3CardsBtnActionPerformed

    public void userCards() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);
            String temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
            userCardLbl1.setText(cards[0]);
        }
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);
            String temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
            userCardLbl2.setText(cards[0]);
        }
    }
    
    
    public void userHit() {
        for (int i = 0; i < cards.length; i++) {
            int randomIndexToSwap = rand.nextInt(cards.length);
            String temp = cards[randomIndexToSwap];
            cards[randomIndexToSwap] = cards[i];
            cards[i] = temp;
            userCardLbl5.setText(cards[0]);
        }
    }

    public String total2Cards(String v1, String v2) {
        switch (v1) {
            case "K":
            case "Q":
            case "J": {
                String convert = "10";
                card1 = Integer.parseInt(convert);
                break;
            }
            case "A": {
                String convert = "11";
                card1 = Integer.parseInt(convert);
                break;
            }
            default:
                card1 = Integer.parseInt(v1);
                break;
        }
        ////////////////////////////////////////////
        switch (v2) {
            case "K":
            case "Q":
            case "J": {
                String convert = "10";
                card2 = Integer.parseInt(convert);
                break;
            }
            case "A": {
                String convert = "11";
                card2 = Integer.parseInt(convert);
                break;
            }
            default:
                card2 = Integer.parseInt(v2);
                break;
        }

        total2Cards = card1 + card2;
        String reverse = Integer.toString(total2Cards);
        return reverse;

    }

    public String total3Cards(String v1, String v2, String v3) {
        switch (v1) {
            case "K":
            case "Q":
            case "J": {
                String convert = "10";
                card1 = Integer.parseInt(convert);
                break;
            }
            case "A": {
                String convert = "11";
                card1 = Integer.parseInt(convert);
                break;
            }
            default:
                card1 = Integer.parseInt(v1);
                break;
        }
        ////////////////////////////////////////////
        switch (v2) {
            case "K":
            case "Q":
            case "J": {
                String convert = "10";
                card2 = Integer.parseInt(convert);
                break;
            }
            case "A": {
                String convert = "11";
                card2 = Integer.parseInt(convert);
                break;
            }
            default:
                card2 = Integer.parseInt(v2);
                break;
        }
////////////////////////////////////////////
        switch (v3) {
            case "K":
            case "Q":
            case "J": {
                String convert = "10";
                card3 = Integer.parseInt(convert);
                break;
            }
            case "A": {
                String convert = "11";
                card3 = Integer.parseInt(convert);
                break;
            }
            default:
                card3 = Integer.parseInt(v3);
                break;
        }
        total3Cards = card1 + card2 + card3;
        String totalToString = Integer.toString(total3Cards);
        return totalToString;
    }

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartBtn;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JButton hitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton stand2CardsBtn;
    private javax.swing.JButton stand3CardsBtn;
    private javax.swing.JLabel userCardLbl1;
    private javax.swing.JLabel userCardLbl10;
    private javax.swing.JLabel userCardLbl2;
    private javax.swing.JLabel userCardLbl3;
    private javax.swing.JLabel userCardLbl4;
    private javax.swing.JLabel userCardLbl5;
    private javax.swing.JLabel userCardLbl6;
    private javax.swing.JLabel userCardLbl7;
    private javax.swing.JLabel userCardLbl8;
    private javax.swing.JLabel userCardLbl9;
    // End of variables declaration//GEN-END:variables
}
