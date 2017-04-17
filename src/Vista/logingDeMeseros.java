package Vista;

import static Controlador.Restaurante.listaDeEmpleados;
import Modelo.Mesero;
import static Modelo.Mesero.indiceLista;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class logingDeMeseros extends javax.swing.JFrame {

    /*
     Estructura Archivo_empleados
    
     Name    |   Phone   |   Address   |   Age   |   Cargo   |   Password    |
     */
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        userText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userTextKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Usuario:");

        Acept_Button_For_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Acept_Button_For_login.setForeground(new java.awt.Color(0, 153, 255));
        Acept_Button_For_login.setText("Ingresar");
        Acept_Button_For_login.setToolTipText("Ingresar");
        Acept_Button_For_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acept_Button_For_loginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Contraseña:");

        passwordText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Ingreso de  Meseros");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Entypo_d83d(0)_128.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userText)
                            .addComponent(passwordText)
                            .addComponent(Acept_Button_For_login, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Acept_Button_For_login, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Acept_Button_For_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acept_Button_For_loginActionPerformed

        if (userText.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese su usuario antes de proceder.");
        } else {
            
            Mesero mesero = (Mesero) listaDeEmpleados.getPosicion(indiceLista).getInfo();
            if (Mesero.variableComprobacionUsuario.equals("true")) {//Me permite la comprobacionUsuario de que si un usuario existe y si la contraseña es correcta.

                if (mesero.getContraseña().equals(passwordText.getText())) {

                    VistaMenu vistaMenu = new VistaMenu();
                    vistaMenu.setTitle(mesero.getNombre());
                    vistaMenu.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario inexistente.");
            }
        }

        Mesero.variableComprobacionUsuario = "false";
    }//GEN-LAST:event_Acept_Button_For_loginActionPerformed

    private void userTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userTextKeyPressed

        Mesero.comprobacionUsuario(userText.getText() + evt.getKeyChar(), 0);
        if (Mesero.variableComprobacionUsuario.equals("true")) {

            passwordText.setEditable(true);
        }
    }//GEN-LAST:event_userTextKeyPressed

    private void passwordTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.Acept_Button_For_loginActionPerformed(null);
        }
    }//GEN-LAST:event_passwordTextKeyPressed

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
