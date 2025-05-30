package view;

import controller.CLogin;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Cadastro extends javax.swing.JFrame {
    
    private ImageIcon eyeIconHidden;
    private ImageIcon eyeIconVisible;
    
    public Cadastro() {
        initComponents();
        
        addPlaceholderStyle(txtUser);
        addPlaceholderStyle(txtMat);
        addPlaceholderStyle(txtEma);
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FotoNome1 = new javax.swing.JLabel();
        FotoNome = new javax.swing.JLabel();
        FotoNome2 = new javax.swing.JLabel();
        FotoNome3 = new javax.swing.JLabel();
        FotoNome4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtMat = new javax.swing.JTextField();
        txtEma = new javax.swing.JTextField();
        txtSen = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jTextFieldSemestre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 430, 50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 198, 111));
        jLabel1.setText("entre por aqui.");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 730, 170, 30));

        FotoNome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-usuário-48 1.png"))); // NOI18N
        getContentPane().add(FotoNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, -1));

        FotoNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-usuário-48 1.png"))); // NOI18N
        getContentPane().add(FotoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, -1));

        FotoNome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Fiber pin.png"))); // NOI18N
        getContentPane().add(FotoNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 300, -1, -1));

        FotoNome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mail.png"))); // NOI18N
        getContentPane().add(FotoNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        FotoNome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Password.png"))); // NOI18N
        getContentPane().add(FotoNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtUser.setText("Usuário*");
        txtUser.setToolTipText("");
        txtUser.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 480, 50));

        txtMat.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtMat.setText("Matricula*");
        txtMat.setToolTipText("");
        txtMat.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtMat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMatFocusLost(evt);
            }
        });
        getContentPane().add(txtMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 480, 50));

        txtEma.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtEma.setText("E-mail Institucional*");
        txtEma.setToolTipText("");
        txtEma.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtEma.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmaFocusLost(evt);
            }
        });
        txtEma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEma, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 360, 480, 50));

        txtSen.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtSen.setText("Senha*");
        txtSen.setToolTipText("");
        txtSen.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        txtSen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSen.setEchoChar('\u0000');
        txtSen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenFocusLost(evt);
            }
        });
        getContentPane().add(txtSen, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 480, 50));

        jButton1.setBackground(new java.awt.Color(128, 6, 14));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 287, 65));

        jTextFieldSemestre.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jTextFieldSemestre.setToolTipText("");
        jTextFieldSemestre.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1)));
        jTextFieldSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSemestreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldSemestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 500, 480, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cadastro.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1455, 868));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = txtUser.getText();
        String matricula = txtMat.getText();
        String email = txtEma.getText();
        String senha = new String(txtSen.getPassword()); // Obtenha a senha como char[] e depois String
        String semestre = jTextFieldSemestre.getText();

    //validando se todos os campos estao vazios   
    if (nome.isEmpty() || matricula.isEmpty() || email.isEmpty() || senha.isEmpty() || semestre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return; // Impede a continuação do cadastro
    }
    
    // Validação do formato do email
    if (!validarEmail(email)) {
        JOptionPane.showMessageDialog(this, "Formato de email inválido.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validação da senha
    if (!validarSenha(senha)) {
        JOptionPane.showMessageDialog(this, "A senha deve ter no mínimo \n 8 caracteres, \n Uma letra maiúscula, \n Um caractere especial.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Adicione outras validações aqui (formato de email, etc.)

    CLogin cadastro = new CLogin();
    try {
        cadastro.cadastrarNovoUsuario(nome, matricula, email, senha, semestre);
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        
        // Criar e exibir a tela de login
        ConfirmarEmail telaConfirmarEmail = new ConfirmarEmail();
        telaConfirmarEmail.setVisible(true);

        // Opcionalmente, fechar a tela de cadastro
        this.dispose();
        
    } catch (SQLException sql) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + sql.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSemestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSemestreActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
            Login telaDeLogin = new Login();
            telaDeLogin.setVisible(true); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Usuário*")) {
            txtUser.setText(null);
            txtUser.requestFocus();
            //REMOVE O ESTILO PLACEHOLDER
            removePlaceholderStyle(txtUser);
        }
    }//GEN-LAST:event_txtUserFocusGained

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

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if(txtUser.getText().length()==0) {
            //ADICIONA O PLACEHOLDER ESTILO
            addPlaceholderStyle(txtUser);
            txtUser.setText("Usuário*");
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtSenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenFocusLost
        if(txtSen.getText().length()==0) {
            //ADICIONA O PLACEHOLDER ESTILO
            addPlaceholderStyle(txtSen);
            txtSen.setText("Senha*");
        }
    }//GEN-LAST:event_txtSenFocusLost

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

    private void txtEmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmaFocusGained
        if (txtEma.getText().equals("E-mail Institucional*")) {
            txtEma.setText(null);
            txtEma.requestFocus();
            //REMOVE O ESTILO PLACEHOLDER
            removePlaceholderStyle(txtEma);
        }
    }//GEN-LAST:event_txtEmaFocusGained

    private void txtEmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmaFocusLost
        if(txtEma.getText().length()==0) {
            //ADICIONA O PLACEHOLDER ESTILO
            addPlaceholderStyle(txtEma);
            txtEma.setText("E-mail Institucional*");
        }
    }//GEN-LAST:event_txtEmaFocusLost

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
    
    // Método para validar o formato do email usando uma expressão regular simples
    private boolean validarEmail(String email) {
    return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
}

// Método para validar a senha
private boolean validarSenha(String senha) {
    if (senha.length() < 8) {
        return false;
    }
    boolean temMaiuscula = false;
    boolean temNumero = false;
    boolean temEspecial = false;
    String caracteresEspeciais = "!@#$%^&*()-+_=,<.>/?;:'\"[\\]{}\\|`~";

    for (char c : senha.toCharArray()) {
        if (Character.isUpperCase(c)) {
            temMaiuscula = true;
        } else if (Character.isDigit(c)) {
            temNumero = true;
        } else if (caracteresEspeciais.contains(String.valueOf(c))) {
            temEspecial = true;
        }
    }

    return temMaiuscula && temNumero && temEspecial;
    }

    public JTextField getjTextFieldSemestre() {
        return jTextFieldSemestre;
    }

    public void setjTextFieldSemestre(JTextField jTextFieldSemestre) {
        this.jTextFieldSemestre = jTextFieldSemestre;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return txtSen;
    }
    
    public void setjPasswordFieldSenha(JPasswordField jPasswordFieldSenha) {
        this.txtSen = jPasswordFieldSenha;
    }

    public JTextField getjTextFieldEmail() {
        return txtEma;
    }

    public void setjTextFieldEmail(JTextField jTextFieldEmail) {
        this.txtEma = jTextFieldEmail;
    }

    public JTextField getjTextFieldMatricula() {
        return txtMat;
    }

    public void setjTextFieldMatricula(JTextField jTextFieldMatricula) {
        this.txtMat = jTextFieldMatricula;
    }

    public JTextField getjTextFieldNome() {
        return txtUser;
    }

    public void setjTextFieldNome(JTextField jTextFieldNome) {
        this.txtUser = jTextFieldNome;
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
    private javax.swing.JLabel FotoNome;
    private javax.swing.JLabel FotoNome1;
    private javax.swing.JLabel FotoNome2;
    private javax.swing.JLabel FotoNome3;
    private javax.swing.JLabel FotoNome4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextFieldSemestre;
    private javax.swing.JTextField txtEma;
    private javax.swing.JTextField txtMat;
    private javax.swing.JPasswordField txtSen;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
