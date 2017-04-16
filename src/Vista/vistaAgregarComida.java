package Vista;

import Modelo.Postre;
import Modelo.Bebida;
import Modelo.PlatoPrincipal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import Controlador.Lista;
import Controlador.Restaurante;
import static Controlador.Restaurante.listaDePlatos;
import static Controlador.Restaurante.listaDePostres;
import static Controlador.Restaurante.listaDeBebidas;

public class vistaAgregarComida extends javax.swing.JFrame {

    File archivoPlatosPrincipales = new File("Platos principales.txt");
    File archivoPostres = new File("Postres.txt");
    File archivoBebidas = new File("Bebidas.txt");

    public vistaAgregarComida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Food_Price1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        addImagenButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        foodTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        foodTextPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        foodTextFat = new javax.swing.JTextField();
        aceptButton = new javax.swing.JButton();
        foodTypeCombobox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        timerMinutos = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        timerSegundos = new javax.swing.JSpinner();

        jLabel4.setText("Precio:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setOpaque(true);

        addImagenButton.setText("Agregar foto");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel5.setText("Carbohidratos:");

        aceptButton.setText("Aceptar");
        aceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptButtonActionPerformed(evt);
            }
        });

        foodTypeCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plato principal", "Postre", "Bebida" }));

        jLabel6.setText("Tipo de comida:");

        jLabel7.setText("Minutos:");

        jLabel8.setText("Segundos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(foodTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(foodTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foodTextFat, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(foodTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(timerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(timerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(addImagenButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(aceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addImagenButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foodTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodTextFat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timerMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timerSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodTypeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aceptButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptButtonActionPerformed

        try {

            FileWriter escritor = new FileWriter(archivoPlatosPrincipales, true);
            BufferedWriter escritorX = new BufferedWriter(escritor);

            String nombre = foodTextName.getText();
            int precio = Integer.parseInt(foodTextPrice.getText());
            int carbohidratos = Integer.parseInt(foodTextFat.getText());
            String tiempo = (String.valueOf(timerMinutos) + ":" + String.valueOf(timerSegundos));

            switch (foodTypeCombobox.getSelectedIndex()) {

                case 0:

                    listaDePlatos.Agregar(new PlatoPrincipal(nombre, precio, carbohidratos, tiempo, new Lista()));

                    PlatoPrincipal p = (PlatoPrincipal) listaDePlatos.getPosicion(listaDePlatos.getTamaño() - 1).getInfo();

                    escritorX.newLine();
                    escritorX.write(p.getNombre() + "|");
                    escritorX.write(String.valueOf(p.getPrecio()) + "|");
                    escritorX.write(String.valueOf(p.getCarbohidratos()) + "|");

                    escritorX.close();

                    break;

                case 1:

                    listaDePostres.Agregar(new Postre(nombre, precio, carbohidratos, tiempo, new Lista()));

                    escritor = new FileWriter(archivoPostres, true);
                    escritorX = new BufferedWriter(escritor);

                    Postre po = (Postre) listaDePostres.getPosicion(listaDePostres.getTamaño() - 1).getInfo();

                    escritorX.newLine();
                    escritorX.write(po.getNombre() + "|");
                    escritorX.write(String.valueOf(po.getPrecio()) + "|");
                    escritorX.write(String.valueOf(po.getCarbohidratos()) + "|");

                    escritorX.close();
                    break;

                case 2:

                    listaDeBebidas.Agregar(new Bebida(nombre, precio, carbohidratos));

                    escritor = new FileWriter(archivoBebidas, true);
                    escritorX = new BufferedWriter(escritor);

                    Bebida b = (Bebida) listaDeBebidas.getPosicion(listaDeBebidas.getTamaño() - 1).getInfo();

                    escritorX.newLine();
                    escritorX.write(b.getNombre() + "|");
                    escritorX.write(String.valueOf(b.getPrecio()) + "|");
                    escritorX.write(String.valueOf(b.getCarbohidratos()) + "|");

                    escritorX.close();

                    break;
            }

            escritor = new FileWriter(new File("Primer_ingreso.txt"), true);
            escritorX = new BufferedWriter(escritor);
            escritorX.newLine();
            escritorX.write("Ya ingreso un plato");//Cambio lo que se encuentra en el archivo primer ingreso.
            escritorX.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_aceptButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAgregarComida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Food_Price1;
    private javax.swing.JButton aceptButton;
    private javax.swing.JButton addImagenButton;
    private javax.swing.JTextField foodTextFat;
    private javax.swing.JTextField foodTextName;
    private javax.swing.JTextField foodTextPrice;
    private javax.swing.JComboBox foodTypeCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSpinner timerMinutos;
    private javax.swing.JSpinner timerSegundos;
    // End of variables declaration//GEN-END:variables
}
