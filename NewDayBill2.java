package pharmacy2;

import com.aspose.barcode.barcoderecognition.BarCodeReader;
import javax.swing.JOptionPane;
import java.sql.*;
import static pharmacy2.NewTransaction2.date;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewMedicine.java
 *
 * Created on Oct 11, 2013, 4:09:42 PM
 */

/**
 *
 * @author Sunitha
 */
public class NewDayBill2 extends javax.swing.JFrame {

    /** Creates new form NewMedicine */
    public NewDayBill2() {
        initComponents();
    }
public static double totalDayBill=0.0; 
public static String date ="0/0/0";
public static double subDay=0.0;  
/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

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

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("Type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));
        jLabel6.getAccessibleContext().setAccessibleName("type");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("Expiry Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Quantity Present");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Medicine Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Medicine Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 380, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 380, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 380, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 380, 30));

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 70, 30));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setText("Add To Bill");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "tablets", "Liquid", "Drops", "Inhalers", "Injections", "Ointment", "Cream", "Vaginal Suppositories", "Suppositories", "Cosmetics" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 380, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("/");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 10, 30));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 70, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("/");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, 10, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 70, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("(Year/Month/Day)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 210, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));

        jTextField8.setFocusable(false);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 490, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 550, -1, -1));

        jLabel10.setFont(new java.awt.Font("Forte", 3, 48)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy2/capsule-icon.png"))); // NOI18N
        jLabel10.setText("New Medicine Bill");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 660, 110));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton2.setText("Total Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 610, 110, 40));

        jLabel12.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel12.setText("Date:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        jTextField10.setFocusable(false);
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 120, 37, -1));

        jLabel13.setText("/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 120, 20, -1));

        jTextField11.setFocusable(false);
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 120, 39, -1));

        jLabel14.setFont(new java.awt.Font("Aharoni", 1, 24)); // NOI18N
        jLabel14.setText("(Year/Month/Day)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, -1, -1));

        jLabel15.setText("/");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 120, 20, -1));

        jTextField12.setFocusable(false);
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, 40, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton5.setText("clear");
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
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jTextField2.getText().equals("")||jTextField3.getText().equals("")||jTextField4.getText().equals("")||jTextField5.getText().equals(""))
       JOptionPane.showMessageDialog(null, "Enter all values before updating");
else{
        try{
         String med_code=jTextField1.getText();
         String meds=jTextField2.getText();
         int qnty=Integer.parseInt(jTextField3.getText());
         double price=Double.parseDouble(jTextField4.getText());
         totalDayBill=totalDayBill+(qnty*price);
         String date=jTextField5.getText()+"/"+jTextField6.getText()+"/"+jTextField7.getText();
         String type=(String)jComboBox1.getSelectedItem();
      Class.forName("java.sql.DriverManager" );
      Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      Statement stmt=con.createStatement();
      String query="insert into medicines values('"+med_code+"','"+meds+"','"+qnty+"','"+price+"','"+date+"','"+type+"');";
      stmt.executeUpdate(query);
//      JOptionPane.showMessageDialog(null,"Record Added");
      BasisClass.med_code=med_code;
        }
        catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     } 
        boolean flagNewDate=false;
try{
    /////save in data base the new bill
   Class.forName("java.sql.DriverManager" );
   Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
    Statement stmt=con.createStatement();
    String query1="select * from dayenterbill where days='"+date+"';";
      ResultSet rs1=stmt.executeQuery(query1);
      while(rs1.next()){
      subDay=rs1.getDouble("totalBill");
       flagNewDate=true;
      }
       if(flagNewDate==true){
      subDay=subDay+totalDayBill;
   //   System.out.println("save3 .. "+subDay);
      String sqlquery3="update dayenterbill set totalBill='"+subDay+"' where days='"+date+"'";
      stmt.executeUpdate(sqlquery3);
         JOptionPane.showMessageDialog(null,"update Bill Is okay."); 
       }
         //System.out.println("save4.. "+flagNewDate);
        // jTextField9.setText(""+subDay);
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     }
if(flagNewDate==false){
     try{
      String date=jTextField12.getText()+"/"+jTextField10.getText()+"/"+jTextField11.getText();
      String month=jTextField10.getText();
      Class.forName("java.sql.DriverManager" );
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      Statement stmt=con.createStatement();
       String sqlquery0="insert into dayenterbill values('"+date+"','"+month+"','"+totalDayBill+"')";
      //  System.out.println("save1 .. "+flagNewDate);
      stmt.executeUpdate(sqlquery0);
      // System.out.println("save1 .. "+sqlquery0);
         JOptionPane.showMessageDialog(null,"update Bill Is okay."); 
   //       jTextField9.setText(""+totalDayBill);
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     }
     // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
}
    }
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
  try{
      Class.forName("java.sql.DriverManager" );
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      Statement stmt=con.createStatement();
      String yearquery="select year(curdate()) as year;";
      ResultSet rs1=stmt.executeQuery(yearquery);
      if(rs1.next())
      jTextField12.setText(rs1.getString(1));
      String monthquery="select month(curdate()) as month;";
      ResultSet rs2=stmt.executeQuery(monthquery);
      if(rs2.next())
      jTextField10.setText(rs2.getString(1));
      String dayquery="select dayofmonth(curdate()) as day;";
      ResultSet rs3=stmt.executeQuery(dayquery);
      if(rs3.next())
      jTextField11.setText(rs3.getString(1));
      date=jTextField12.getText()+"/"+jTextField10.getText()+"/"+jTextField11.getText();
       }
       catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     }      
      
    }//GEN-LAST:event_formWindowGainedFocus

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new menu_page2().setVisible(true);     // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jTextField8.setText("Click to add Record");         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
jTextField8.setText("Click to go to Menu Page");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
jTextField8.setText("Click to Exit");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
 jTextField8.setText("");       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
jTextField8.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
jTextField8.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseExited
  
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
     //????????????????????????????????????????????????????????????  
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     boolean flagNewDate=false;
try{
      Class.forName("java.sql.DriverManager" );
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      Statement stmt=con.createStatement();
    //   System.out.println("save0 .. ");
      String query="select * from dayenterbill where days='"+date+"';";
      ResultSet rs=stmt.executeQuery(query);
      while(rs.next()){
  //        System.out.println("save12 .. "+rs.getDouble("totalDay"));
      subDay=rs.getDouble("totalBill");
       flagNewDate=true;
//       System.out.println("save22 .. "+rs.getDouble("totalDay"));
      }
       jTextField9.setText(""+subDay);
}
catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
     }
if(flagNewDate==false){
     //try{
      //String date=jTextField12.getText()+"/"+jTextField10.getText()+"/"+jTextField11.getText();
      //Class.forName("java.sql.DriverManager" );
      //Connection con=DriverManager.getConnection("jdbc:mysql://localhost/pharmacy2","root","");
      //Statement stmt=con.createStatement();
      // String sqlquery0="insert into dayenterbill values('"+date+"','"+totalDayBill+"')";
        //System.out.println("save1 .. "+flagNewDate);
      //stmt.executeUpdate(sqlquery0);
       //System.out.println("save1 .. "+sqlquery0);
        // JOptionPane.showMessageDialog(null,"update Bill Is okay."); 
          jTextField9.setText(""+0.0);
//}
//catch(Exception e){
//     JOptionPane.showMessageDialog(null,e.getMessage());
//     }
}    ////
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
jTextField1.setText("");
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextField6.setText("");
jTextField7.setText("");
jTextField9.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDayBill2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
