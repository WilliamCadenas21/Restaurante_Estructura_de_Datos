package Vista;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.*;
import Controlador.Lista;

public class Loging_de_Meseros extends javax.swing.JFrame {

    File Archivo_Meseros = Vista.Vista_Agregar_Empleados.Archivo_Meseros;
    /*
    
     Estructura Archivo_empleados
    
     Name    |   Phone   |   Address   |   Age   |   Cargo   |   Password    |
    
     */

    public Loging_de_Meseros() {
        initComponents();

        Password_Text.setEditable(false);

    }

    /*void Separacion_y_organizacion_del_contenido_del_Fichero_Empleados(String Texto, int i, int j, int fin) {//PRIMER PARAMETRO: VECTOR EN LA POSICION I; SEGUNDO PARAMETRO: PUNTERO QUE GUIARA Y SEPARARA EL CONTENIDO DEL VECTOR EN LA POSICION I PARA SU RESPECTIVA COMPARACIÓN; TERCER PARAMETRO: POSICION EN EL VECTOR AUXILIAR; CUARTO PARAMETRO: VARIABLE QUE INDICA EL LIMITE DE HASTA DONDE ES QUE DEBE LLEGAR PARA SEPARAR CADA PALABRA;  

        if (i < Texto.length()) {

            if (Texto.substring(i, i + 1).equals("|")) {

                Vector_auxiliar[j] = Texto.substring(0, fin + 1);

                Separacion_y_organizacion_del_contenido_del_Fichero_Empleados(Texto.substring(i + 1), 0, j + 1, 0);

            } else {

                Separacion_y_organizacion_del_contenido_del_Fichero_Empleados(Texto, i + 1, j, i);

            }

        }

    }*/

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meseros");

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

            System.out.println("u: " + Modelo.Mesero.Encontro_Usuario);
            
            Modelo.Mesero m = (Modelo.Mesero) Controlador.Restaurante.Lista_de_Empleados.getPosicion(Modelo.Mesero.Indice_Lista).ObtenerInfo();
            
            if (Modelo.Mesero.Encontro_Usuario == true && m.getContraseña().equals(Password_Text.getText())) {//Me permite la comprobacion de que si un usuario existe y si la contraseña es correcta.

                Vista_Menu Frame_Menu = new Vista_Menu();

                Frame_Menu.setVisible(true);
                
            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Usuario inexistente");

            }

        }

    }//GEN-LAST:event_Acept_Button_For_loginActionPerformed

    
    
    private void User_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_User_TextKeyPressed

        Modelo.Mesero.Comprobacion(User_Text.getText() + evt.getKeyChar(), 0);

        if (true == Modelo.Mesero.Encontro_Usuario) {

            System.out.println("Encontro el usuario");

        }

    }//GEN-LAST:event_User_TextKeyPressed

    private void User_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_TextActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loging_de_Meseros().setVisible(true);
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
