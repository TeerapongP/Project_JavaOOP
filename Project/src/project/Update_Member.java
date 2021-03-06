/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.HeadlessException;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Nonrapak
 */
public class Update_Member extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Update_Member() {
        initComponents();
        showTableData();
    }

    
    
    public void showTableData()
    {
        String header[] = new String[]{"รหัสสมาชิก", "ชื่อสมาชิก","นามสกุล", "รหัสบัตรประชาชน", "วันเดือนปีเกิด", "เพศ", "ที่อยู่","เบอร์โทรศัพท์","วันที่สมัคสมาชิก"};
        DefaultTableModel dtm = new DefaultTableModel();
        jTable1.setModel(dtm);
        dtm.setColumnCount(9);
        dtm.setRowCount(1);
        dtm.setColumnIdentifiers(header);
        
        Connection conn = null;
        try {
            String base_URL = "jdbc:mysql://";
            String server = "localhost";
            String db = "sukuna_book_store";
            String u = "root";
            String p = "12345678";
            String con_string = base_URL + server + "/" + db;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(con_string, u, p);
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
            String sql = "SELECT * FROM managemember ORDER BY member_code";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();// rs เก็บผลลัพธ์ของการค้นหาที่ return มาจาก MySQL
           
            
            int n = 0;
            while(rs.next()){
                					
                dtm.setValueAt( rs.getString("member_code"), n, 0);
                dtm.setValueAt( rs.getString("member_name"), n, 1);
                dtm.setValueAt( rs.getString("member_lastname"), n, 2);
                dtm.setValueAt( rs.getString("person_code"), n, 3);
                dtm.setValueAt( rs.getString("date"), n, 4);               
                dtm.setValueAt( rs.getString("gender"), n, 5);
                dtm.setValueAt( rs.getString("address"), n, 6); 
                dtm.setValueAt( rs.getString("call_number"), n, 7); 
                dtm.setValueAt( rs.getString("member_register"), n, 8); 
                n++;//เพิ่มค่าตัวนับแถว
                dtm.setRowCount(n+1);//เพิ่มจำนวนแถวของ Jtable
            }
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        member_register_jtext7 = new javax.swing.JTextField();
        member_number_jtext6 = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        birth_day = new javax.swing.JTextField();
        persion_code = new javax.swing.JTextField();
        member_lastname_jtext1 = new javax.swing.JTextField();
        member_name_jtext1 = new javax.swing.JTextField();
        member_code_jtext = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        update_member = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        SeachBar = new javax.swing.JTextField();
        SearchItem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        member_register_jtext7.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(member_register_jtext7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, 260, 30));

        member_number_jtext6.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(member_number_jtext6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 510, 260, 30));

        Address.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 460, 260, 30));

        gender.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, 260, 30));

        birth_day.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(birth_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 260, 30));

        persion_code.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(persion_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 270, 260, 30));

        member_lastname_jtext1.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(member_lastname_jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 260, 30));

        member_name_jtext1.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(member_name_jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 140, 260, 30));

        member_code_jtext.setEditable(false);
        member_code_jtext.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(member_code_jtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 90, 260, 30));

        jLabel18.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 255, 255));
        jLabel18.setText("วันที่สมัคสมาชิก:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 150, 30));

        jLabel17.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 255, 255));
        jLabel17.setText("เบอร์โทร:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 90, 30));

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 255, 255));
        jLabel16.setText("เพศ :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 60, 30));

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 255, 255));
        jLabel15.setText("ชื่อสมาชิก :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 100, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("ที่อยู่ :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 460, 60, 30));

        jLabel13.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("วันเดือนปีเกิด :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 130, 30));

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 255));
        jLabel12.setText("รหัสบัตรประชาชน :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 170, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("นามสกุล :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 90, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("รหัสสมาชิก :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 110, 30));

        update_member.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        update_member.setForeground(new java.awt.Color(0, 0, 204));
        update_member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-account-member-user-profile-512.png"))); // NOI18N
        update_member.setText("เเก้ไขสมาชิก");
        update_member.setBorder(null);
        update_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_memberActionPerformed(evt);
            }
        });
        getContentPane().add(update_member, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 150, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 760, 540));

        Back.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(0, 0, 204));
        Back.setText("Back");
        Back.setBorder(null);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 660, 130, 60));

        SeachBar.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        getContentPane().add(SeachBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 430, 30));

        SearchItem.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        SearchItem.setForeground(new java.awt.Color(0, 0, 204));
        SearchItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        SearchItem.setText("ค้นหา");
        SearchItem.setBorder(null);
        SearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchItemActionPerformed(evt);
            }
        });
        getContentPane().add(SearchItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 130, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("ค้นหาชื่อสมาชิก :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pocket_monsters_2019_anime_logo_translation_by_sliter_ddomqsd-fullview.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 50));

        jLabel1.setFont(new java.awt.Font("Mali", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Bg (2).jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void update_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_memberActionPerformed
   Connection conn = null;
         try {  
            String base_URL = "jdbc:mysql://";
            String server = "localhost";
            String db = "sukuna_book_store";
            String u = "root";
            String p = "12345678";
            String con_string = base_URL + server + "/" + db;
            Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(con_string,u,p);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         
         String sql = "UPDATE managemember set  member_name  = ?, member_lastname = ?, person_code = ?, date = ?, gender = ?, address = ?, call_number = ?,  member_register = ?  WHERE member_code = ? "  ;
         
           try {
            PreparedStatement stmt = conn.prepareStatement(sql); //6
            stmt.setString(9, member_code_jtext.getText());
            stmt.setString(1, member_name_jtext1.getText());
            stmt.setString(2, member_lastname_jtext1.getText());
            stmt.setString(3, persion_code.getText());
            stmt.setString(4, birth_day.getText());
            stmt.setString(5, gender.getText());
            stmt.setString(6, Address.getText());
            stmt.setString(7, member_number_jtext6.getText());
            stmt.setString(8, member_register_jtext7.getText());
             stmt.executeUpdate(); 
             JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลสำเร็จ");
             }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,  e.getMessage());
        }        // TODO add your handling code here:
        showTableData();
     
    }//GEN-LAST:event_update_memberActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        close();
        this.toBack();
        ManageMembership mb = new ManageMembership();
        mb.setVisible(true);
        mb.toFront();
    }//GEN-LAST:event_BackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        member_code_jtext.setText(model.getValueAt(selectedRowIndex, 0).toString());
        member_name_jtext1.setText(model.getValueAt(selectedRowIndex, 1).toString());
        member_lastname_jtext1.setText(model.getValueAt(selectedRowIndex, 2).toString());
        persion_code.setText(model.getValueAt(selectedRowIndex, 3).toString());
        birth_day.setText(model.getValueAt(selectedRowIndex, 4).toString());
        gender.setText(model.getValueAt(selectedRowIndex, 5).toString());
        Address.setText(model.getValueAt(selectedRowIndex, 6).toString());
        member_number_jtext6.setText(model.getValueAt(selectedRowIndex, 7).toString());
        member_register_jtext7.setText(model.getValueAt(selectedRowIndex, 8).toString());
      
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void SearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchItemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SearchItemActionPerformed

    public void close()
    {
        WindowEvent closeWindows = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindows);
    }
    
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
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JButton Back;
    private javax.swing.JTextField SeachBar;
    private javax.swing.JButton SearchItem;
    private javax.swing.JTextField birth_day;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField member_code_jtext;
    private javax.swing.JTextField member_lastname_jtext1;
    private javax.swing.JTextField member_name_jtext1;
    private javax.swing.JTextField member_number_jtext6;
    private javax.swing.JTextField member_register_jtext7;
    private javax.swing.JTextField persion_code;
    private javax.swing.JButton update_member;
    // End of variables declaration//GEN-END:variables

    private static class PrepareStatement {

      
    }
}
