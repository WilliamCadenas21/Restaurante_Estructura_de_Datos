package Vista;

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

        jButton2.setText("Mesas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Add_Food_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_Employ_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Employ_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Food_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Change_Password_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Add_Employ_Button)
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Add_Food_Button)
                .addGap(18, 18, 18)
                .addComponent(Employ_Button)
                .addGap(18, 18, 18)
                .addComponent(Food_Button)
                .addGap(18, 18, 18)
                .addComponent(Change_Password_Button)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    // End of variables declaration//GEN-END:variables
}
