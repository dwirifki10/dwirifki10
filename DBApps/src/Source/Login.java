/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class Login extends javax.swing.JFrame {
    int mousexdrag;
    int mouseydrag;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIcon();
        conn = Connections.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        SPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        UserIcon = new javax.swing.JLabel();
        TextUsername = new javax.swing.JLabel();
        UserIcon1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Button = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Bantuan = new javax.swing.JLabel();
        Mistakes = new javax.swing.JLabel();
        CBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Halaman Login");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SPanel.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_news_135px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("School Management Information");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create your information with us");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Version 1.0 BETA");

        javax.swing.GroupLayout SPanelLayout = new javax.swing.GroupLayout(SPanel);
        SPanel.setLayout(SPanelLayout);
        SPanelLayout.setHorizontalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        SPanelLayout.setVerticalGroup(
            SPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        Panel.add(SPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -9, 310, 470));

        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_close_window_30px_9.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.setPreferredSize(new java.awt.Dimension(34, 50));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });
        Panel.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 1, -1, 30));

        Username.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        Panel.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 147, 230, 30));

        UserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_key_30px.png"))); // NOI18N
        UserIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserIconMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UserIconMouseReleased(evt);
            }
        });
        Panel.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 205, 34, -1));

        TextUsername.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        TextUsername.setText("Masukan Username atau NISN");
        Panel.add(TextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 160, 30));

        UserIcon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_contacts_30px.png"))); // NOI18N
        Panel.add(UserIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 147, 40, 30));

        Password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        Panel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 209, 230, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel4.setText("Masukan Password");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 190, 115, 20));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign In");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 49, 247, -1));

        Button.setBackground(new java.awt.Color(0, 102, 204));
        Button.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        Button.setForeground(new java.awt.Color(255, 255, 255));
        Button.setText("MASUK");
        Button.setBorder(null);
        Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonMouseClicked(evt);
            }
        });
        Button.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonKeyPressed(evt);
            }
        });
        Panel.add(Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 300, 270, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 115, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 120, 10));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("OR");
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, 26));

        Bantuan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Bantuan.setForeground(new java.awt.Color(0, 0, 204));
        Bantuan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bantuan.setText("Formulir Bantuan Lupa Password ");
        Bantuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bantuan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BantuanMouseClicked(evt);
            }
        });
        Panel.add(Bantuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 269, 30));

        Mistakes.setForeground(new java.awt.Color(255, 0, 0));
        Mistakes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Panel.add(Mistakes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 260, 20));

        CBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECTED", "ADMIN", "GURU", "SISWA" }));
        Panel.add(CBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 254, 230, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Images/icons8_search_30px.png"))); // NOI18N
        Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 30, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(617, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - mousexdrag,y - mouseydrag);
        System.out.println(x + "," + y );
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        mousexdrag = evt.getX();
        mouseydrag = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/close_window_30px.png"));
        Exit.setIcon(A);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_close_window_30px_9.png"));
        Exit.setIcon(A);
    }//GEN-LAST:event_ExitMouseExited

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            MenuAdmin A = new MenuAdmin();
            
        }
    }//GEN-LAST:event_ButtonKeyPressed

    private void BantuanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BantuanMouseClicked
        // TODO add your handling code here:
        ForgetPassword A = new ForgetPassword();
        A.show();
        show(false);
    }//GEN-LAST:event_BantuanMouseClicked

    private void ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMouseClicked
        // TODO add your handling code here:
        String username, password, selection;
        String level = null;
        String log_id = null;
        username = Username.getText().toLowerCase();
        password = Password.getText();
        selection = CBox.getSelectedItem().toString().toLowerCase();
        
        if(username.equals("") || password.equals("") || selection.equals("selected")){
            Mistakes A = new Mistakes();
            Mistakes.setText(null);
            A.show();
        }else if(selection.equals("siswa")){
           Mistakes.setText("Item terpilih sedang dalam perkembangan");
        }else{
            try{
                conn = Connections.getConnection();
                pst = conn.prepareStatement("SELECT * FROM sign_in WHERE username = ? and password = ? and type = ?");
                pst.setString(1, username);
                pst.setString(2, password);
                pst.setString(3, selection);
                rs = pst.executeQuery();
                
                if(rs.next()){
                    String B;
                    B = rs.getString("type");
                    level = rs.getString("NISN");
                    log_id = rs.getString("username");
                    
                    
                    if(selection.equalsIgnoreCase("admin") && B.equalsIgnoreCase("admin") && password.equals(rs.getString("password"))){
                        session.set_Level(level);
                        session.set_Log_id(log_id);
                        MenuAdmin MA = new MenuAdmin(level);
                        MA.show();
                        show(false);
                    }else if(selection.equalsIgnoreCase("guru") && B.equalsIgnoreCase("guru") && password.equals(rs.getString("password"))){
                        session.set_Level(level);
                        session.set_Log_id(log_id);
                        MenuTeacher MT = new MenuTeacher(level);                        
                        MT.show();
                        show(false);
                    }else if(selection.equalsIgnoreCase("siswa") && B.equalsIgnoreCase("siswa") && password.equals(rs.getString("password"))){
                        Mistakes M = new Mistakes();
                        M.show();
                   
                    }else{
                        new Error().show();
                    }
                }else{
                    new Errors().show();
                }
                
               
            }catch(SQLException e){
                System.out.println(e.getMessage());
                new Error().show();
            }
        }
    }//GEN-LAST:event_ButtonMouseClicked

    private void UserIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIconMousePressed
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_padlock_25px_1.png"));
        UserIcon.setIcon(A);
        
        Password.setEchoChar((char)0);
    }//GEN-LAST:event_UserIconMousePressed

    private void UserIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIconMouseReleased
        // TODO add your handling code here:
        ImageIcon A = new ImageIcon(getClass().getResource("Images/icons8_key_30px.png"));
        UserIcon.setIcon(A);
        
        Password.setEchoChar('•');
    }//GEN-LAST:event_UserIconMouseReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bantuan;
    private javax.swing.JButton Button;
    private javax.swing.JComboBox<String> CBox;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Mistakes;
    private javax.swing.JPanel Panel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel SPanel;
    private javax.swing.JLabel TextUsername;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel UserIcon1;
    private javax.swing.JTextField Username;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

    public void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images/icons8_news_10px.png")));
    }

}
