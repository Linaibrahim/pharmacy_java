package pharmacy2;

import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MedicineDetails.java
 *
 * Created on Oct 11, 2013, 9:23:31 AM
 */

/**
 *
 * @author Sunitha
 */
public class MedicineIntro2 extends javax.swing.JFrame {

    /** Creates new form MedicineDetails */
    public MedicineIntro2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Forte", 3, 36)); // NOI18N
        jLabel4.setText("New Admin");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setFocusable(false);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 900));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setMaximumRowCount(6);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 180, 240, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Select Medicine");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("Search Details");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton2.setText("Add New Medicine");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Forte", 3, 48)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy2/capsule-icon.png"))); // NOI18N
        jLabel5.setText("Medicines");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 490, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton5.setText("Menu");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jTextField3.setFocusable(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 420, 30));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton7.setText("Exit");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  try{
      Class.forName("java.sql.DriverManager" );
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
    //  System.out.println("Type:3 ..");
      Statement stmt=con.createStatement();
        String name1=(String)jComboBox1.getSelectedItem();
        //System.out.println("Type:3 .. "+name1);
       String query1="select barcode from medicines where Name='"+name1+"';";
       System.out.println(query1);
       ResultSet rs=stmt.executeQuery(query1);
       while(rs.next()){
      BasisClass.med_code= rs.getString("barcode");
      }
     //  System.out.println(BasisClass.med_code);
     //BasisClass.med_code= rs.getString("barcode");
     //BasisClass.med_code= rs.getString("barcode");
    // System.out.println("Type: 4.. "+rs.getString("barcode"));
        }
       catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
  }
      //  BasisClass.med_code=jComboBox1.getSelectedIndex();
new MedicinesDetails2().setVisible(true);
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
 System.out.println("Type: 1.....");
        jComboBox1.removeAllItems();
System.out.println("Type: 1..");
        try{
      Class.forName("java.sql.DriverManager" );
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      System.out.println("Type: 2..");
      Statement stmt=con.createStatement();
     // String query="select Medicine from medicin;";
      String query="select name from medicines;"; 
      ResultSet rs=stmt.executeQuery(query);
      while(rs.next()){
      jComboBox1.addItem(rs.getString(1));
      }
        }
       catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     }
       
BasisClass.itemcount=jComboBox1.getItemCount();   
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
 new NewMedicine2().setVisible(true);
 dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new menu_page2().setVisible(true);     // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new menu_page2().setVisible(true);     // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jTextField3.setText("Click to Search Details");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
jTextField3.setText("Click to add Medicines");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
jTextField3.setText("Click to go to Menu");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
jTextField3.setText("Click to Exit");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
  jTextField3.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
 jTextField3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
 jTextField3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
 jTextField3.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicineIntro2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
