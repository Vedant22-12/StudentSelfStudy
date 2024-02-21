/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Components;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jayesh
 */
public class AdminHome extends javax.swing.JFrame {
    public static int open=0;
    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1360, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(255, 0, 0));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add new question.png"))); // NOI18N
        jMenu1.setText("Add New Question");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update Question.png"))); // NOI18N
        jMenu9.setText("Update Question");
        jMenu9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all questions.png"))); // NOI18N
        jMenu10.setText("All Question");
        jMenu10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu10.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete Question.png"))); // NOI18N
        jMenu11.setText("Delete Question");
        jMenu11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu11.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all student result.png"))); // NOI18N
        jMenu12.setText("All Student Results");
        jMenu12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu12.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logout.png"))); // NOI18N
        jMenu13.setText("Logout");
        jMenu13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jMenu14.setText("Exit");
        jMenu14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenu14.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new AdminLogin().setVisible(true);
        }
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"Do you really want to Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){  
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AddNewQuestion().setVisible(true);
            open=1;
        } else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open!!");
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        if(open==0){
            new UpdateQuestion().setVisible(true);
            open=1;
        } else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open!!");
        }
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AllQuestion().setVisible(true);
            open=1;
        } else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open!!");
        }
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        // TODO add your handling code here:
        if(open==0){
            new DeleteQuestion().setVisible(true);
            open=1;
        } else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open!!");
        }
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        // TODO add your handling code here:
        if(open==0){
            new AllStudentResult().setVisible(true);
            open=1;
        } else{
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open!!");
        }
    }//GEN-LAST:event_jMenu12MouseClicked

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
