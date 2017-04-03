package Vista;

import javax.swing.table.DefaultTableModel;

public class Vista_Cocina extends javax.swing.JFrame {

    /*
    
    La tabla de pedidos dependera de lo que se realize en Menu
     */
    Object[] r = new Object[0];

    public Vista_Cocina() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Comida_Combobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Cocina = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();

        Comida_Combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Cocina"); // NOI18N
        setResizable(false);

        Tabla_Cocina.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_Cocina);
        if (Tabla_Cocina.getColumnModel().getColumnCount() > 0) {
            Tabla_Cocina.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Cocina.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Cocina.getColumnModel().getColumn(2).setResizable(false);
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

        Resultado_de_pedidos();
        Factura();
    }//GEN-LAST:event_AceptarActionPerformed

    void Factura() {
        DefaultTableModel Tabla_fact = (DefaultTableModel) VistaMenu.tablaFactura.getModel();

        for (int i = 0; i < r.length; i++) {
            Tabla_fact.addRow(new Object[]{r[i]});
            System.out.println("R: " + r[i]);
        }
    }

    void Resultado_de_pedidos() {

        DefaultTableModel Tabla_resultado = (DefaultTableModel) Tabla_Cocina.getModel();
        Controlador.Lista lista = new Controlador.Lista();

        for (int i = 0; i < Tabla_resultado.getRowCount(); i++) {

            System.out.println("Resultado: " + Tabla_resultado.getValueAt(i, 1));

            if (Tabla_resultado.getValueAt(i, 1).toString().equals("true")) {

                try {

                    Object t = javax.swing.JOptionPane.showConfirmDialog(this, "Esta seguro?");

                    if (t.toString().equals("0")) {
                        
                        lista.Agregar(Tabla_resultado.getValueAt(i, 0));
                        Tabla_resultado.removeRow(i);
                    }

                } catch (Exception e) {

                }
            }
        }

        r = new Object[lista.getTamaño()];

        for (int i = 0; i < lista.getTamaño(); i++) {

            r[i] = lista.getPosicion(i).ObtenerInfo();
        }

        DefaultTableModel Tabla_resultado_pedidos = (DefaultTableModel) VistaMenu.resultadoPedidos.getModel();

        for (int i = 0; i < r.length; i++) {

            for (int j = 0; j < Tabla_resultado_pedidos.getRowCount(); j++) {

                if (r[i].toString().equals(Tabla_resultado_pedidos.getValueAt(j, 0).toString())) {

                    Tabla_resultado_pedidos.setValueAt("Listo", j, 2);
                }
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Cocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    public static javax.swing.JComboBox<String> Comida_Combobox;
    public static javax.swing.JTable Tabla_Cocina;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
