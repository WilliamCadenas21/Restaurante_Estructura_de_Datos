package Vista;

import Controlador.Lista;
import static Vista.VistaMenu.resultadoPedidos;
import javax.swing.table.DefaultTableModel;

public class vistaCocina extends javax.swing.JFrame {

    /*
    
    La tabla de pedidos dependera de lo que se realize en Menu
     */
    Lista contenedorAuxiliar = new Lista();

    public vistaCocina() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Comida_Combobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCocina = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();

        Comida_Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Cocina"); // NOI18N
        setResizable(false);

        tablaCocina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Listo", "Tiempo Inicial "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCocina);
        if (tablaCocina.getColumnModel().getColumnCount() > 0) {
            tablaCocina.getColumnModel().getColumn(0).setResizable(false);
            tablaCocina.getColumnModel().getColumn(1).setResizable(false);
            tablaCocina.getColumnModel().getColumn(2).setResizable(false);
        }

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Aceptar)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        resultadoDePedidos();
        Factura();
    }//GEN-LAST:event_AceptarActionPerformed

    void Factura() {
        DefaultTableModel tablaFactura = (DefaultTableModel) VistaMenu.tablaFactura.getModel();

        for (int i = 0; i < this.contenedorAuxiliar.getTamaño(); i++) {
            tablaFactura.addRow(new Object[]{ this.contenedorAuxiliar.getPosicion(i).getInfo()});//Esto me funciona para poder mostrar el nombre de la mesa a la cual ya se le ha terminado de preparar el pedido, para que asi la factura se genere mostrandose cuando el usuario necesite.
        }
    }

    void resultadoDePedidos() {

        DefaultTableModel tablaResultadoPedidoCocina = (DefaultTableModel) tablaCocina.getModel();
        
        this.contenedorAuxiliar = new Lista();//Borra toda la informacion de la lista, para que asi no me guarde informacion correspodiente de los procesos anteriores.
        int prueba = 0;
        for (int i = 0; i < tablaResultadoPedidoCocina.getRowCount(); i++) {

            if (tablaResultadoPedidoCocina.getValueAt(i, 1).toString().equals("true")) {

                try {//Se utiliza un try-catch para evitar se salga por consola el error producido cuando el usurio presiona cancelar o cierra el showImputDialog.

                    Object t = javax.swing.JOptionPane.showConfirmDialog(this, "Esta seguro?");

                    if (t.toString().equals("0")) {//Si la opcion seleccionada es "SI".
                        
                        this.contenedorAuxiliar.Agregar(tablaResultadoPedidoCocina.getValueAt(i, 0));//Me permite recolectar las filas de las cuales se ha seleccionado para poder mostrar que el plato ya esta listo.
                        tablaResultadoPedidoCocina.removeRow(i);
                        prueba++;
                    }

                } catch (Exception e) {

                }
            }
        }

        DefaultTableModel tablaResultadoPedidos = (DefaultTableModel) resultadoPedidos.getModel();

        for (int i = 0; i < this.contenedorAuxiliar.getTamaño(); i++) {

            for (int j = 0; j < tablaResultadoPedidos.getRowCount(); j++) {
                                    
                if (this.contenedorAuxiliar.getPosicion(i).getInfo().toString().equals(tablaResultadoPedidos.getValueAt(j, 0).toString())) {//Para encontrar la mesa que se ha seleccionado en cocina y poder cambiarle el valor de "Preparando" a "Listo"
                    //Obtengo la posicion y la informacion, para luego convertirla a String y poder compararla despues//                                         
                    tablaResultadoPedidos.setValueAt("Listo", j, 2);
                }
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaCocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    public static javax.swing.JComboBox<String> Comida_Combobox;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaCocina;
    // End of variables declaration//GEN-END:variables
}
