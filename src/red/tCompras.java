/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package red;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author damas
 */
public class tCompras extends javax.swing.JFrame {

    /**
     * Creates new form tCompras
     */
    public tCompras() {
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

        N = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblN = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblEst = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        CEP = new javax.swing.JTextField();
        numC = new javax.swing.JTextField();
        Rua = new javax.swing.JTextField();
        Estado = new javax.swing.JTextField();
        Dados = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        Valor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblS = new javax.swing.JLabel();
        lblT = new javax.swing.JLabel();
        Sabores = new javax.swing.JComboBox<>();
        lblSe = new javax.swing.JLabel();
        lblicone2 = new javax.swing.JLabel();
        lblMdP = new javax.swing.JLabel();
        Compra = new javax.swing.JButton();
        Pay = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        lblList = new javax.swing.JScrollPane();
        Escolhidos = new javax.swing.JList<>();

        N.setText("Quantity");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo1.setFont(new java.awt.Font("Book Antiqua", 3, 16)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Preencha os campos a seguir para o envio dos produtos:");

        lblRua.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblRua.setText("Rua:");

        lblN.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblN.setText("Número da casa:");

        lblD.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblD.setText("Dados adicionais:");

        lblC.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblC.setText("Cidade:");

        lblEst.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblEst.setText("Estado:");

        lblCEP.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblCEP.setText("CEP:");

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/sorvetepc.png"))); // NOI18N

        Cidade.setBackground(new java.awt.Color(254, 235, 168));

        CEP.setBackground(new java.awt.Color(254, 235, 168));

        numC.setBackground(new java.awt.Color(254, 235, 168));

        Rua.setBackground(new java.awt.Color(254, 235, 168));
        Rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaActionPerformed(evt);
            }
        });

        Estado.setBackground(new java.awt.Color(254, 235, 168));
        Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoActionPerformed(evt);
            }
        });

        Dados.setBackground(new java.awt.Color(254, 235, 168));

        Email.setBackground(new java.awt.Color(254, 235, 168));

        Name.setBackground(new java.awt.Color(254, 235, 168));

        CPF.setBackground(new java.awt.Color(254, 235, 168));

        Valor.setBackground(new java.awt.Color(254, 235, 168));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(198, 198, 198))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(273, 273, 273))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))))
                            .addComponent(lblEst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(193, 193, 193)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cidade)
                        .addGap(1, 1, 1))
                    .addComponent(Estado)
                    .addComponent(CEP)
                    .addComponent(Rua)
                    .addComponent(numC)
                    .addComponent(Dados))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(lblEst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Estado)
                .addGap(8, 8, 8)
                .addComponent(lblC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(Rua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addComponent(numC)
                        .addGap(10, 10, 10)
                        .addComponent(lblD, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        jPanel2.setBackground(new java.awt.Color(254, 235, 168));

        lblS.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblS.setText("Selecione o(s) sabor(es) para seu pedido:");

        lblT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/Ice_cream truck.jpg"))); // NOI18N

        Sabores.setBackground(new java.awt.Color(254, 235, 168));
        Sabores.setEditable(true);
        Sabores.setFont(new java.awt.Font("Linux Libertine G", 2, 14)); // NOI18N
        Sabores.setForeground(new java.awt.Color(254, 235, 168));
        Sabores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001 Abacaxi e Buriti ", "002 Açaí", "003 Céu azul", "004 Menta e chocolate", "005 Morango", "006 Napolitano", "007 Ovomaltine", "008 Pistache" }));
        Sabores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaboresActionPerformed(evt);
            }
        });

        lblSe.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblSe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSe.setText("Sabores escolhidos:");

        lblicone2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblicone2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red/cosplayer.png"))); // NOI18N

        lblMdP.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        lblMdP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMdP.setText("Metódo de pagamento:");

        Compra.setFont(new java.awt.Font("Linux Libertine G", 3, 18)); // NOI18N
        Compra.setText("Confirmar compra");
        Compra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });

        Pay.setBackground(new java.awt.Color(254, 235, 168));
        Pay.setEditable(true);
        Pay.setFont(new java.awt.Font("Linux Libertine G", 2, 14)); // NOI18N
        Pay.setForeground(new java.awt.Color(254, 235, 168));
        Pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro (à vista na entrega)", "Cartão de débito", "Cartão de crédito", "Pagamento por Pix" }));
        Pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Linux Libertine G", 3, 12)); // NOI18N
        Add.setText("Adicionar");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Remove.setFont(new java.awt.Font("Linux Libertine G", 3, 12)); // NOI18N
        Remove.setText("Remover");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        Escolhidos.setFont(new java.awt.Font("Linux Libertine G", 2, 12)); // NOI18N
        lblList.setViewportView(Escolhidos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblSe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addComponent(Sabores, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblicone2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addGap(269, 269, 269))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMdP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(lblT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblList)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblicone2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sabores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSe, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblList, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(lblMdP, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pay)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultListModel List = new DefaultListModel();
    
    private void RuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaActionPerformed

    private void EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoActionPerformed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
        int qtd = Escolhidos.getModel().getSize();
        int valor = Integer.parseInt("11");
        Valor.setText("R$"+(qtd*valor));
        Object dados[] = {"Nome:",Name,"","CPF:",CPF, "", "Email:",Email,"","Estado:",Estado,"","Cidade",Cidade,"","CEP:",CEP,"","Rua:", Rua,"","Número da casa:", numC,"","Dados adicionais",Dados, "", "Sabores escolhidos:", Escolhidos,"","Metódo de Pagamento:",Pay,"", "Valor total:", Valor};
        int NF = JOptionPane.showConfirmDialog(null, dados, "NOTA FISCAL", JOptionPane.OK_CANCEL_OPTION);
        if (NF == 0){
            tAvaliação tV= new tAvaliação();     
            tV.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_CompraActionPerformed

    private void PayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PayActionPerformed

    private void SaboresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaboresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaboresActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        List.addElement(Sabores.getSelectedItem());
        Escolhidos.setModel(List);
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        int Remover = JOptionPane.showConfirmDialog(null,"Remover item do carrinho?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (Remover == 0){
            int THEHAND = Escolhidos.getSelectedIndex();
            List.remove(THEHAND);
        }
    }//GEN-LAST:event_RemoveActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed

    }//GEN-LAST:event_NActionPerformed

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
            java.util.logging.Logger.getLogger(tCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField Cidade;
    private javax.swing.JButton Compra;
    private javax.swing.JTextField Dados;
    private javax.swing.JTextField Email;
    private javax.swing.JList<String> Escolhidos;
    private javax.swing.JTextField Estado;
    private javax.swing.JButton N;
    private javax.swing.JTextField Name;
    private javax.swing.JComboBox<String> Pay;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField Rua;
    private javax.swing.JComboBox<String> Sabores;
    private javax.swing.JTextField Valor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblEst;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JScrollPane lblList;
    private javax.swing.JLabel lblMdP;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblSe;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblicone2;
    private javax.swing.JTextField numC;
    // End of variables declaration//GEN-END:variables
    public void name (String name){
        Name.setText(name);
    }
    public void email (String email){
        Email.setText(email);
    }
    public void cpf (String cpf){
        CPF.setText(cpf);
    }
}
