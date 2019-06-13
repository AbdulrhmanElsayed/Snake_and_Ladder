/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.TurnPage;


/**
 *
 * @author Alaa
 */
public class Turn extends javax.swing.JFrame {

    /**
     * Creates new form Turn
     * @param name
     */
    public static String Name;
    public Turn(String name) {
        initComponents();
        NameL.setText(name);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dice = new javax.swing.JLabel();
        TurnLabel = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(537, 171));
        setSize(new java.awt.Dimension(537, 171));
        getContentPane().setLayout(null);

        Dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/TurnPage/Rolling dice.gif"))); // NOI18N
        getContentPane().add(Dice);
        Dice.setBounds(10, 20, 130, 120);

        TurnLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/TurnPage/turn (2).gif"))); // NOI18N
        getContentPane().add(TurnLabel);
        TurnLabel.setBounds(380, 50, 110, 80);

        NameL.setFont(new java.awt.Font("Brush Script MT", 2, 48)); // NOI18N
        NameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(NameL);
        NameL.setBounds(160, 70, 200, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/TurnPage/Background.gif"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 540, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Turn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Turn(Name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Dice;
    private javax.swing.JLabel NameL;
    private javax.swing.JLabel TurnLabel;
    // End of variables declaration//GEN-END:variables
}
