package Vista;

import Controlador.Pedido;
import static Vista.VistaMenu.listaPedidos;
import javax.swing.JOptionPane;

public class vistaMenuGerente extends javax.swing.JFrame {

    public vistaMenuGerente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Change_Password_Button = new javax.swing.JButton();
        Food_Button = new javax.swing.JButton();
        Employ_Button = new javax.swing.JButton();
        Add_Employ_Button = new javax.swing.JButton();
        Add_Food_Button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Change_Password_Button.setText("Cambiar contraseña");
        Change_Password_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Change_Password_ButtonActionPerformed(evt);
            }
        });

        Food_Button.setText("Comida");
        Food_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Food_ButtonActionPerformed(evt);
            }
        });

        Employ_Button.setText("Empleados");
        Employ_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Employ_ButtonActionPerformed(evt);
            }
        });

        Add_Employ_Button.setText("Agregar Empleado");
        Add_Employ_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Employ_ButtonActionPerformed(evt);
            }
        });

        Add_Food_Button.setText("Agregar Plato o Bebida");
        Add_Food_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Food_ButtonActionPerformed(evt);
            }
        });

        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resumen de las Mesas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Total de ventas del día");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Add_Food_Button)
                            .addComponent(Employ_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_Employ_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Change_Password_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))))
                    .addComponent(Food_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Employ_Button)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employ_Button)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Food_Button)
                    .addComponent(Change_Password_Button))
                .addGap(18, 18, 18)
                .addComponent(Food_Button)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Change_Password_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Change_Password_ButtonActionPerformed

        // Debo poner la opcion de la opcion de cambiar la contraseña
    }//GEN-LAST:event_Change_Password_ButtonActionPerformed

    private void Food_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Food_ButtonActionPerformed

        // Debo crear un frame que contenga las comidas que tiene el restaurante a su disposicion. Talvez las podria poner en una tabla
    }//GEN-LAST:event_Food_ButtonActionPerformed

    private void Employ_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Employ_ButtonActionPerformed

        // Debo colocar un frame que contenga los nombres y cedulas de todos los empleados. Talvez los podria poner en una tabla
    }//GEN-LAST:event_Employ_ButtonActionPerformed

    private void Add_Employ_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Employ_ButtonActionPerformed

        Vista.vistaAgregarEmpleados Empleados = new Vista.vistaAgregarEmpleados();

        Empleados.setVisible(true);
    }//GEN-LAST:event_Add_Employ_ButtonActionPerformed

    private void Add_Food_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Food_ButtonActionPerformed

        Vista.vistaAgregarComida Comida = new Vista.vistaAgregarComida();

        Comida.setVisible(true);
    }//GEN-LAST:event_Add_Food_ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new LogingDeGerente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new InfoDeMesas().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int totalDelDia = 0;

        for (int i = 0; i < listaPedidos.getTamaño(); i++) {
            totalDelDia = totalDelDia + ((Pedido) listaPedidos.getPosicion(i).getInfo()).getPrecio();
            System.out.println(((Pedido) listaPedidos.getPosicion(i).getInfo()).getPrecio());
        }
        
        JOptionPane.showMessageDialog(this,"el total de dinero facturado en el dia es:$"+totalDelDia);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Employ_Button;
    private javax.swing.JButton Add_Food_Button;
    private javax.swing.JButton Change_Password_Button;
    private javax.swing.JButton Employ_Button;
    private javax.swing.JButton Food_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
