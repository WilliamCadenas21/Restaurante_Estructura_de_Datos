package Vista;

import Controlador.Coordinador;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Primer_ingreso_gerente extends javax.swing.JFrame {

    public static File Archivo_Gerente = new File("Archivo_Gerente.txt");
    private Coordinador miCoordinador;

    public Primer_ingreso_gerente() {
        initComponents();
        /*
            Esta clase me permite obtener la informacion del gerente,el cual administrará todo los procesos   
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_Text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Phone_Text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Password_Text = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Password_Text_Confirmation = new javax.swing.JPasswordField();
        Boton_Aceptar = new javax.swing.JButton();
        Age_Spinner = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        Address_Text = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        Name_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Name_TextKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Name_TextKeyReleased(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel3.setText("Telefono:");

        Phone_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Phone_TextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Nuevo Gerente");

        jLabel5.setText("Contraseña:");

        jLabel6.setText("Contraseña:");

        Boton_Aceptar.setText("Aceptar");
        Boton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AceptarActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad:");

        jLabel8.setText("Direccion:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_Text_Confirmation, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password_Text, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(Address_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Phone_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Age_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(Boton_Aceptar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(Age_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Phone_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Address_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_Text_Confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(Boton_Aceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AceptarActionPerformed

        if (Password_Text.getText().equals(Password_Text_Confirmation.getText())) {

            try {

                FileWriter Escritor = new FileWriter(Archivo_Gerente, true);
                BufferedWriter Escritor_X = new BufferedWriter(Escritor);

                Escritor_X.write(Name_Text.getText() + "|");
                Escritor_X.write(Age_Spinner.getValue() + "|");
                Escritor_X.write(Phone_Text.getText() + "|");
                Escritor_X.write(Address_Text.getText() + "|");
                Escritor_X.write(Password_Text.getText() + "|");

                Escritor_X.flush();
                Escritor_X.close();

            } catch (Exception e) {

                e.printStackTrace();
            }

            Vista.Vista_Menu_Gerente menu_gerente = new Vista.Vista_Menu_Gerente();
            this.dispose();
            menu_gerente.setVisible(true);

        } else {

            javax.swing.JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales, por favor verifique.");
        }
        this.setVisible(false);
    }//GEN-LAST:event_Boton_AceptarActionPerformed

    private void Phone_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Phone_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Phone_TextActionPerformed

    private void Name_TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_TextKeyPressed
        System.out.println(evt.getKeyCode());


    }//GEN-LAST:event_Name_TextKeyPressed

    private void Name_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Name_TextKeyReleased


    }//GEN-LAST:event_Name_TextKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primer_ingreso_gerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address_Text;
    private javax.swing.JSpinner Age_Spinner;
    private javax.swing.JButton Boton_Aceptar;
    private javax.swing.JTextField Name_Text;
    private javax.swing.JPasswordField Password_Text;
    private javax.swing.JPasswordField Password_Text_Confirmation;
    private javax.swing.JTextField Phone_Text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

}
