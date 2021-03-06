/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdb;

import java.awt.Color;

/**
 *
 * @author Thanh Phuc Huynh
 */
public class Add_book extends javax.swing.JFrame {
    public String name;
    connector cn = new connector();
    category[] tl = cn.getCategory();
    /**
     * Creates new form Add_book
     */
    public Add_book(String name) {
        this.name = name;
        initComponents();
        
        int i=0;
        while(i!=(tl.length)){
            typeTL.addItem(tl[i].getName());
            i++;
        }
    }
    public void add(){
        String ID="",name_form="",author_form="",tl_form="",id_tl=null;
        int sl,price_form;
        ID = id.getText().toString();
        name_form = namebook.getText().toString();
        author_form = author.getText().toString();
        tl_form = typeTL.getSelectedItem().toString();
        id_tl = getIDTL(tl_form);
        try {
            sl = Integer.parseInt(this.sl.getText());
            price_form = Integer.parseInt(this.price.getText());
            if(ID!=""&&name_form!=""&&author_form!=""&&id_tl!=null){
                cn.addBook(ID, name_form, author_form, id_tl, sl, price_form);
                 notification.setText("complete");
            notification.setForeground(Color.green);
            }else{
                 notification.setText("error ");
                 notification.setForeground(Color.red);
            }
        } catch (Exception e) {
            System.out.println("ex"+e);
            notification.setText("error ");
        }
        
        
    }
    public String getIDTL(String tl_string){
        String id=null;
        int i=0;
        while(i!=(tl.length)){
            if(tl[i].getName().equals(tl_string)){
                return tl[i].getID();
            }
            i++;
        }
        return id;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        notification = new javax.swing.JLabel();
        typeTL = new javax.swing.JComboBox<>();
        id = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        namebook = new javax.swing.JTextField();
        sl = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notification.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notification.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 200, 20));

        getContentPane().add(typeTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 170, 30));

        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 170, 30));

        price.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 170, 30));

        author.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        author.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 170, 30));

        namebook.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        namebook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(namebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 170, 30));

        sl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(sl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 170, 30));

        btn_add.setText("ADD");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_addMouseEntered(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 540, 90, 50));

        btn_exit.setText("Exit");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 90, 50));

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 210, 350));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add_form_final.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1100, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        
        this.setVisible(false);
       new GUI(this.name,1).setVisible(true);
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        // TODO add your handling code here:
        add();
//        notification.setText("complete");
//        notification.setForeground(Color.green);
        
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addMouseEntered

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
            java.util.logging.Logger.getLogger(Add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Add_book("gj").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_exit;
    private javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namebook;
    private javax.swing.JLabel notification;
    private javax.swing.JTextField price;
    private javax.swing.JTextField sl;
    private javax.swing.JComboBox<String> typeTL;
    // End of variables declaration//GEN-END:variables
}
