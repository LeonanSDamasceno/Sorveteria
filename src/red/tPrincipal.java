/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package red;

/**
 *
 * @author damas
 */
public class tPrincipal extends javax.swing.JFrame {
    
    tCompras enviaC;
    /**
     * Creates new form tPrincipal
     */
    
    public tPrincipal() {
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

        jPanel3 = new javax.swing.JPanel();
        lblDelivery = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblEsqueceu = new javax.swing.JLabel();
        ChbLdm = new javax.swing.JCheckBox();
        btnE1 = new javax.swing.JButton();
        lblOu = new javax.swing.JLabel();
        btnC1 = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        lblHelados = new javax.swing.JLabel();
        lblF1 = new javax.swing.JLabel();
        lblF2 = new javax.swing.JLabel();
        lblCute = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblDelivery.setFont(new java.awt.Font("Book Antiqua", 3, 36)); // NOI18N
        lblDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDelivery.setText("Delivery");

        User.setBackground(new java.awt.Color(242, 196, 208));
        User.setFont(new java.awt.Font("Linux Libertine G", 3, 14)); // NOI18N
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/sorvetepc.png"))); // NOI18N

        lblNome.setFont(new java.awt.Font("Linux Libertine G", 3, 16)); // NOI18N
        lblNome.setText("Nome de usuário ou endereço de e-mail:");

        lblSenha.setFont(new java.awt.Font("Linux Libertine G", 3, 16)); // NOI18N
        lblSenha.setText("Senha:");

        lblEsqueceu.setBackground(new java.awt.Color(0, 0, 255));
        lblEsqueceu.setFont(new java.awt.Font("Linux Libertine G", 3, 16)); // NOI18N
        lblEsqueceu.setText("Esqueceu sua senha?");
        lblEsqueceu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ChbLdm.setBackground(new java.awt.Color(255, 255, 255));
        ChbLdm.setFont(new java.awt.Font("Linux Libertine G", 3, 16)); // NOI18N
        ChbLdm.setText("Lembrar de mim");
        ChbLdm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChbLdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChbLdmActionPerformed(evt);
            }
        });

        btnE1.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        btnE1.setText("Entrar");
        btnE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });

        lblOu.setBackground(new java.awt.Color(255, 204, 204));
        lblOu.setFont(new java.awt.Font("Linux Libertine G", 3, 16)); // NOI18N
        lblOu.setForeground(new java.awt.Color(242, 133, 153));
        lblOu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOu.setText("  ------------------ou-------------------");

        btnC1.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        btnC1.setText("Cadastrar");
        btnC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(242, 196, 208));
        Password.setFont(new java.awt.Font("Linux Libertine G", 3, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblDelivery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblOu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ChbLdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEsqueceu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48))
                            .addComponent(User, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(jLabel13)))
                .addGap(59, 59, 59))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEsqueceu, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ChbLdm, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnE1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblOu, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnC1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        jPanel4.setBackground(new java.awt.Color(242, 133, 153));

        lblHelados.setFont(new java.awt.Font("Book Antiqua", 2, 36)); // NOI18N
        lblHelados.setForeground(new java.awt.Color(242, 196, 208));
        lblHelados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHelados.setText("Helados Ice Cream");

        lblF1.setFont(new java.awt.Font("Book Antiqua", 2, 36)); // NOI18N
        lblF1.setForeground(new java.awt.Color(242, 196, 208));
        lblF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF1.setText("Helados para aquecer tu");

        lblF2.setFont(new java.awt.Font("Book Antiqua", 2, 36)); // NOI18N
        lblF2.setForeground(new java.awt.Color(242, 196, 208));
        lblF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF2.setText("Corazón~");

        lblCute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/cute_cream.jpg"))); // NOI18N

        Nome.setBackground(new java.awt.Color(242, 133, 153));

        CPF.setBackground(new java.awt.Color(242, 133, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHelados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
            .addComponent(lblF2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCute, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblHelados, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblCute, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        tCadastro cad = new tCadastro();
        cad.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        if (User.getText().equals("Lanon") && Password.getText().equals("6669")) {
            tProdutos y = new tProdutos();
            y.setVisible(true);
            dispose();
        }
            else if (User.getText().equals("Gabriel") && Password.getText().equals("Biel333")) {
                tProdutos y = new tProdutos();
                y.setVisible(true);
                dispose();
            }
            else if (User.getText().equals("Letixa") && Password.getText().equals("Le777")) {
                tProdutos y = new tProdutos();
                y.setVisible(true);
                dispose();
            }
            else if (User.getText().equals("Isabella") && Password.getText().equals("Isa123")) {
                tProdutos y = new tProdutos();
                y.setVisible(true);
                dispose();
            }
        else{
            if(enviaC == null){
                enviaC = new tCompras();
                enviaC.setVisible(true);
                enviaC.email(User.getText());
                enviaC.name(Nome.getText());
                enviaC.cpf(CPF.getText());
            }else{
                enviaC.setVisible(true);
                enviaC.setState(tCompras.NORMAL);
                enviaC.email(User.getText());
                enviaC.name(Nome.getText());
                enviaC.cpf(CPF.getText());
            }
        dispose();
        }
    }//GEN-LAST:event_btnE1ActionPerformed

    private void ChbLdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChbLdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChbLdmActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

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
            java.util.logging.Logger.getLogger(tPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JCheckBox ChbLdm;
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField User;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnE1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCute;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblEsqueceu;
    private javax.swing.JLabel lblF1;
    private javax.swing.JLabel lblF2;
    private javax.swing.JLabel lblHelados;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOu;
    private javax.swing.JLabel lblSenha;
    // End of variables declaration//GEN-END:variables
    public void Email(String email){
        User.setText(email);
    }
    public void Senha (String senha){
        Password.setText(senha);
    }
    public void Nome (String nome){
        Nome.setText(nome);
    }
    public void cpf (String cpf){
        CPF.setText(cpf);
    }
}

