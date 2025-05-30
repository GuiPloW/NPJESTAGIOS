package view;

import controller.CLogin;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private ImageIcon eyeIconHidden;
    private ImageIcon eyeIconVisible;
    
    public Login() {
        initComponents();
        
        addPlaceholderStyle(txtMat);
        addPlaceholderStyle(txtSen);
        
        eyeIconHidden = new ImageIcon(getClass().getResource("/Image/icons8-cego-30 3.png"));
        eyeIconVisible = new ImageIcon(getClass().getResource("/Image/eye.png"));
        
        jButton2.setIcon(eyeIconHidden);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    public void addPlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.gray); // COR DA FONTE
    }
    
    public void removePlaceholderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN|Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black); // COR DA FONTE
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton2 = new javax.swing.JButton();
        FotoNome4 = new javax.swing.JLabel();
        FotoNome2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtSen = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cego-30 3.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 420, 50, 50));

        FotoNome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Password.png"))); // NOI18N
        getContentPane().add(FotoNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, -1, -1));

        FotoNome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fiber pin.png"))); // NOI18N
        getContentPane().add(FotoNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 183, 77));
        jLabel1.setText("Cadastre-se aqui.");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 660, -1, -1));

        txtMat.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtMat.setText("Matricula*");
        txtMat.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatFocusLost(evt);
            }
        });
        txtMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatActionPerformed(evt);
            }
        });
        getContentPane().add(txtMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 480, 50));

        jButton1.setBackground(new java.awt.Color(128, 6, 14));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 287, 65));

        txtSen.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtSen.setText("Senha*");
        txtSen.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtSen.setEchoChar('\u0000');
        txtSen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenFocusLost(evt);
            }
        });
        getContentPane().add(txtSen, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 480, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/telas/Login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, -1));

        setSize(new java.awt.Dimension(1455, 863));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
            // TODO add your handling code here:
            this.setVisible(false);
            Cadastro telaDeCadastro = new Cadastro();
            telaDeCadastro.setVisible(true); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        txtSen.setEchoChar((char) 0);
        jButton2.setIcon(eyeIconVisible);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        txtSen.setEchoChar('\u2022');
        jButton2.setIcon(eyeIconHidden);
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtMatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatFocusGained
        if (txtMat.getText().equals("Matricula*")) {
            txtMat.setText(null);
            txtMat.requestFocus();
            //REMOVE O ESTILO PLACEHOLDER
            removePlaceholderStyle(txtMat);
        }
    }//GEN-LAST:event_txtMatFocusGained

    private void txtMatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatFocusLost
        if(txtMat.getText().length()==0) {
            //ADICIONA O PLACEHOLDER ESTILO
            addPlaceholderStyle(txtMat);
            txtMat.setText("Matricula*");
        }
    }//GEN-LAST:event_txtMatFocusLost

    private void txtSenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenFocusGained
        if (txtSen.getText().equals("Senha*")) {
            txtSen.setText(null);
            txtSen.requestFocus();
            //COLOCA O ESTILO SENHA
            txtSen.setEchoChar('*');
            //remove placeholder style
            removePlaceholderStyle(txtSen);
            
        }
    }//GEN-LAST:event_txtSenFocusGained

    private void txtSenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenFocusLost
        if(txtSen.getText().length()==0) {
            //ADICIONA O PLACEHOLDER ESTILO
            addPlaceholderStyle(txtSen);
            txtSen.setText("Senha*");
        }
    }//GEN-LAST:event_txtSenFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String matricula = txtMat.getText();
        String senha = new String(txtSen.getPassword());

        CLogin loginController = new CLogin();
        if (loginController.verificarLogin(matricula, senha)) {
            // Login bem-sucedido
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
            // Abrir a tela Home
            Home telaHome = new Home(); // Crie uma classe TelaHome
            telaHome.setVisible(true);
            this.dispose(); // Fechar a tela de login
        } else {
            // Falha no login
            JOptionPane.showMessageDialog(this, "Matrícula ou senha incorretos.", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            // Limpar os campos de senha (opcional)
            txtSen.setText(null);
            txtSen.requestFocus();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

       
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FotoNome2;
    private javax.swing.JLabel FotoNome4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField txtMat;
    private javax.swing.JPasswordField txtSen;
    // End of variables declaration//GEN-END:variables
}
