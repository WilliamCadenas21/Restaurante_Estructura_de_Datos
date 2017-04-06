package Vista;

import java.io.*;
import Modelo.Mesero;

public class logingDeMeseros extends javax.swing.JFrame {

    File Archivo_Meseros = Vista.vistaAgregarEmpleados.Archivo_Meseros;
    /*
     Estructura Archivo_empleados
    
     Name    |   Phone   |   Address   |   Age   |   Cargo   |   Password    |
     */

    public logingDeMeseros() {
        initComponents();

        Password_Text.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Gerente = new javax.swing.JFrame();
        User_Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Acept_Button_For_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Password_Text = new javax.swing.JPasswordField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Meseros");
        setResizable(false);

        User_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_TextActionPerformed(evt);
            }
        });
        User_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                User_TextKeyPressed(evt);
            }
        });

        jLabel1.setText("Usuario:");

        Acept_Button_For_login.setText("Aceptar");
        Acept_Button_For_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acept_Button_For_loginActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(User_Text)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(Acept_Button_For_login, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Password_Text)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(User_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Acept_Button_For_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acept_Button_For_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acept_Button_For_loginActionPerformed

        if (User_Text.getText().equals("")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Ingrese su usuario antes de proceder.");
        } else {
            
            Mesero mesero = (Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(Mesero.indiceLista).getInfo();
            
            if (Mesero.encontroUsuario == true && mesero.getContraseña().equals(Password_Text.getText())) {//Me permite la comprobacion de que si un usuario existe y si la contraseña es correcta.

                new VistaMenu().setVisible(true);    
                
                new VistaMenu().setTitle(mesero.getNombre());
            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Usuario inexistente");
            }
        }
    }//GEN-LAST:event_Acept_Button_For_loginActionPerformed

    
    
    private void User_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_TextKeyPressed

        Modelo.Mesero.comprobacion(User_Text.getText() + evt.getKeyChar(), 0);

        if (true == Mesero.encontroUsuario) {

            Password_Text.setEditable(true);
        }

    }//GEN-LAST:event_User_TextKeyPressed

    private void User_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_TextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logingDeMeseros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acept_Button_For_login;
    public static javax.swing.JFrame Menu_Gerente;
    private javax.swing.JPasswordField Password_Text;
    private javax.swing.JTextField User_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
