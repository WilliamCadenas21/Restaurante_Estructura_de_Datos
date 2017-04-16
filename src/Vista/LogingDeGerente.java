package Vista;

import Modelo.Gerente;
import java.awt.event.KeyEvent;

public class LogingDeGerente extends javax.swing.JFrame {

    /*
     Estructura Archivo_empleados
     Name    |   Phone   |   Address   |   Age   |   Cargo   |   Password    |
     */
    boolean comprobacion;
    public LogingDeGerente() {
        initComponents();
        passwordText.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Gerente = new javax.swing.JFrame();
        userText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        aceptButtonForLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();

        javax.swing.GroupLayout Menu_GerenteLayout = new javax.swing.GroupLayout(Menu_Gerente.getContentPane());
        Menu_Gerente.getContentPane().setLayout(Menu_GerenteLayout);
        Menu_GerenteLayout.setHorizontalGroup(
            Menu_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Menu_GerenteLayout.setVerticalGroup(
            Menu_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerente");
        setName("Login"); // NOI18N
        setResizable(false);

        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        aceptButtonForLogin.setText("Aceptar");
        aceptButtonForLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptButtonForLoginActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(aceptButtonForLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordText)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aceptButtonForLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptButtonForLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptButtonForLoginActionPerformed
        if (userText.getText().equals("")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese su usuario antes de proceder.");
        } else {

            try {

                Gerente gerente = (Gerente) Controlador.Restaurante.listaDeGerentes.getPosicion(Modelo.Gerente.indiceLista).getInfo();

                if (this.comprobacion == true) {//Me permite la comprobacion de que si un usuario existe y si la contraseña es correcta.

                    if (gerente.getContraseña().equals(passwordText.getText())) {

                        this.dispose();
                        new vistaMenuGerente().setVisible(true);                        
                    } else {

                        javax.swing.JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
                    }
                }
            } catch (NullPointerException e) {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Usuario inexistente");
            }
        }
    }//GEN-LAST:event_aceptButtonForLoginActionPerformed


    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyPressed

        this.comprobacion = Modelo.Gerente.Comprobacion(userText.getText() + evt.getKeyChar(), 0);

        if (true == this.comprobacion) {

            passwordText.setEditable(true);
        }
    }//GEN-LAST:event_userTextKeyPressed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                Gerente gerente = (Gerente) Controlador.Restaurante.listaDeGerentes.getPosicion(Modelo.Gerente.indiceLista).getInfo();

                if (this.comprobacion == true) {//Me permite la comprobacion de que si un usuario existe y si la contraseña es correcta.

                    if (gerente.getContraseña().equals(passwordText.getText())) {

                        this.dispose();
                        new vistaMenuGerente().setVisible(true);                        
                    } else {

                        javax.swing.JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
                    }
                }
            } catch (NullPointerException e) {
                
                javax.swing.JOptionPane.showMessageDialog(this, "Usuario inexistente");
            }
        }
    }//GEN-LAST:event_passwordTextKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogingDeGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JFrame Menu_Gerente;
    private javax.swing.JButton aceptButtonForLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
