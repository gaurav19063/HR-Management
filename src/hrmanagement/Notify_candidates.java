package hrmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gaurav
 */
public class Notify_candidates extends javax.swing.JFrame {

    private    Connection con;
  private PreparedStatement insert,reterive;
  private ResultSet result,result2;
  private String name,username,comp,des,uname;
    
    /**
     * Creates new form Notify_candidates
     */
    public Notify_candidates() {
        initComponents();
        javax.swing.JLabel label[]={jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14,jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28,jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42,jLabel43,jLabel44,jLabel45,jLabel46,jLabel47,jLabel48,jLabel49,jLabel50,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56};

        setData(label);
    }
    
    
    
    
    public void notifying()
    {
        String query="update candrecords  set candrecords.status=values(?) where username in ( select username from examresult where marks >=3)";
        String query2="UPDATE candrecords c JOIN examresult e " +
"    ON c.username = e.username" +
"   SET c.status = \"Selected for Interview\" ";
        
        
        
        
        
         try
        {
            System.out.print("helloooooo");
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/hrmgtdb","root","");
//          reterive=con.prepareStatement(query);
//          result=reterive.executeQuery();
            System.out.print("helloss");
//          insert=con.prepareStatement("insert into examresult(username,marks)values(?,?)");
                
            insert=con.prepareStatement(query2);
//             insert=con.prepareStatement( );
//            insert.setString(1,"Selected for Interview");
//            insert.setInt(2,count);
//            insert.setString(3,vacant);
//            insert.setString(4,jobid);
              insert.executeUpdate();
          

//          name=result.getStrint()
  
        
        System.out.print("hello1");


      
                 
          }
           catch(Exception e)
        {
            System.out.print(e);
        }
        
    }
    
           public void setData(javax.swing.JLabel label[])
    {
      
//     String   names="'"+s+"'";
        String query="select * from candrecords as s where s.username in (select username from examresult where marks >=3) ";
        String query2="select * from candrecords";
//        SELECT * FROM score
//WHERE event_id =
//(SELECT event_id FROM grade_event
//   WHERE date = '2012-09-23' AND category = 'Q');
        
//String query="SELECT * FROM `hrlogin` WHERE `username`='gaurav'";
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          con =  DriverManager.getConnection("jdbc:mysql://localhost/hrmgtdb","root","");
          reterive=con.prepareStatement(query);
          result=reterive.executeQuery();
          reterive=con.prepareStatement(query2);
          result2=reterive.executeQuery();
//          name=result.getStrint()
//        String candName,email;
        
        System.out.print("hello");
//        
//          if(result.next())
//          {
//              for(int i=6;i<25;i++)
         int i=0;
         
              while(result.next()&&i<9)
              {
                  
                  System.out.print(result.getString("candName"));
                  label[i].setText(result.getString("candName"));
                  
//              System.out.print("hellll");
                label[i+10].setText(result.getString("experience"));
                label[i+20].setText(result.getString("qualification"));
                label[i+30].setText(result.getString("mail"));
                 label[i+40].setText(result.getString("contact"));
////                 result=result.next();
                    i++;
              
              }

      
                 
          }

          
          
          
          
          
          
//        }
        catch(Exception e)
        {
            System.out.print(e);
        }
          
    }
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Qualification");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Mobile No.");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Experience");

        jLabel7.setText("     ");

        jLabel8.setText("     ");

        jLabel9.setText("     ");

        jLabel10.setText("      ");

        jLabel11.setText("            ");

        jLabel12.setText("            ");

        jLabel13.setText("          ");

        jLabel14.setText("           ");

        jLabel15.setText("            ");

        jLabel16.setText("           ");

        jLabel17.setText("       ");

        jLabel18.setText("          ");

        jLabel19.setText("         ");

        jLabel20.setText("         ");

        jLabel21.setText("         ");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setText("Shortlisted Candidates");

        jLabel23.setText("       ");

        jLabel24.setText("           ");

        jLabel25.setText("            ");

        jLabel26.setText("         ");

        jLabel28.setText("     ");

        jLabel29.setText("    ");

        jLabel30.setText("    ");

        jLabel31.setText("       ");

        jLabel32.setText("         ");

        jLabel33.setText("           ");

        jLabel34.setText("            ");

        jLabel35.setText("            ");

        jLabel36.setText("            ");

        jLabel37.setText("          ");

        jLabel38.setText("           ");

        jLabel39.setText("         ");

        jLabel40.setText("           ");

        jLabel41.setText("          ");

        jLabel42.setText("            ");

        jLabel43.setText("           ");

        jLabel44.setText("        ");

        jLabel45.setText("          ");

        jLabel46.setText("            ");

        jLabel47.setText("        ");

        jLabel48.setText("           ");

        jLabel49.setText("         ");

        jLabel50.setText("           ");

        jLabel51.setText("           ");

        jLabel52.setText("          ");

        jLabel53.setText("          ");

        jLabel54.setText("            ");

        jLabel55.setText("          ");

        jLabel56.setText("              ");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Notify All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("            ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(135, 135, 135)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel30)
                                .addComponent(jLabel31)
                                .addComponent(jLabel33)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35)
                                .addComponent(jLabel28)
                                .addComponent(jLabel32)
                                .addComponent(jLabel27))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel39)
                                .addComponent(jLabel40)
                                .addComponent(jLabel41)
                                .addComponent(jLabel42)
                                .addComponent(jLabel43)
                                .addComponent(jLabel44)
                                .addComponent(jLabel45)
                                .addComponent(jLabel46)
                                .addComponent(jLabel38))
                            .addGap(181, 181, 181)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(462, 462, 462)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel48)
                    .addComponent(jLabel5)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(jLabel52)
                    .addComponent(jLabel56)
                    .addComponent(jLabel47))
                .addGap(119, 119, 119))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17)
                    .addComponent(jLabel47)
                    .addComponent(jLabel37)
                    .addComponent(jLabel27))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18)
                    .addComponent(jLabel48)
                    .addComponent(jLabel38)
                    .addComponent(jLabel28))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19)
                    .addComponent(jLabel49)
                    .addComponent(jLabel39)
                    .addComponent(jLabel29))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel20)
                    .addComponent(jLabel50)
                    .addComponent(jLabel40)
                    .addComponent(jLabel30))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel21)
                    .addComponent(jLabel51)
                    .addComponent(jLabel41)
                    .addComponent(jLabel31))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel52)
                    .addComponent(jLabel42)
                    .addComponent(jLabel32)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel53)
                    .addComponent(jLabel43)
                    .addComponent(jLabel33)
                    .addComponent(jLabel23))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel54)
                    .addComponent(jLabel44)
                    .addComponent(jLabel34)
                    .addComponent(jLabel24))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel55)
                    .addComponent(jLabel45)
                    .addComponent(jLabel35)
                    .addComponent(jLabel25))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel36)
                    .addComponent(jLabel46)
                    .addComponent(jLabel56)
                    .addComponent(jLabel26))
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        notifying();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Notify_candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notify_candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notify_candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notify_candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notify_candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
