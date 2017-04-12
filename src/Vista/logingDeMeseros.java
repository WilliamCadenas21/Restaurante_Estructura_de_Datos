package Vista;

import Modelo.Mesero;
import javax.swing.JOptionPane;

public class logingDeMeseros extends javax.swing.JFrame {
    /*
     Estructura Archivo_empleados
    
     Name    |   Phone   |   Address   |   Age   |   Cargo   |   Password    |
     */

    boolean comprobacion;

    public logingDeMeseros() {
        initComponents();

        passwordText.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Gerente = new javax.swing.JFrame();
        userText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Acept_Button_For_login = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Meseros");
        setResizable(false);

        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
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
                            .addComponent(userText)
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
                .addComponent(Acept_Button_For_login)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Acept_Button_For_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acept_Button_For_loginActionPerformed

        if (userText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese su usuario antes de proceder.");
        } else {

            Mesero mesero = (Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(Mesero.indiceLista).getInfo();
            if (this.comprobacion == true) {//Me permite la comprobacion de que si un usuario existe y si la contraseña es correcta.

                if (mesero.getContraseña().equals(passwordText.getText())) {

                    VistaMenu vistaMenu = new VistaMenu();
                    vistaMenu.setTitle(mesero.getNombre());
                    vistaMenu.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario inexistente.");
            }
        }
    }//GEN-LAST:event_Acept_Button_For_loginActionPerformed


    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyPressed

        this.comprobacion = Modelo.Mesero.comprobacion(userText.getText() + evt.getKeyChar(), 0);

        if (this.comprobacion == true) {

            passwordText.setEditable(true);
        }

    }//GEN-LAST:event_userTextKeyPressed

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
    }//GEN-LAST:event_userTextActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
