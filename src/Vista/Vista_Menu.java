package Vista;

import Controlador.Lista;
import Modelo.Postre;
import static Vista.Vista_Cocina.Tabla_Cocina;
import java.awt.Point;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;

public class Vista_Menu extends javax.swing.JFrame {

    int i = 0, j = 0;

    public Vista_Menu() {
        initComponents();
        setLocationRelativeTo(null);

        System.out.println("Estoy en component");

        DefaultTableModel modelo_tabla_plato_principal = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        while (i < Controlador.Restaurante.Lista_de_Platos.getTamaño()) {

            //Modelo.Plato_principal p = (Modelo.Plato_principal) Controlador.Restaurante.Lista_de_Platos.getPosicion(i).ObtenerInfo();
            //System.out.println("T; " + p.getNombre());
            modelo_tabla_plato_principal.addRow(new Object[]{Controlador.Restaurante.Lista_de_Platos.getPosicion(i).ObtenerInfo(), Controlador.Restaurante.Lista_de_Platos.getPosicion(i + 1).ObtenerInfo(), Controlador.Restaurante.Lista_de_Platos.getPosicion(i + 2).ObtenerInfo(), 0});
            i = i + 3;
            j = 0;
        }

        Tiempo();
        
        while (i < Controlador.Restaurante.Lista_de_Postres.getTamaño()) {

            Postre p = (Postre) Controlador.Restaurante.Lista_de_Postres.getPosicion(i).ObtenerInfo();
            //modelo_tabla_postres.addRow(new Object[]{Controlador.Restaurante.Lista_de_Postres.getPosicion(i).ObtenerInfo(), Controlador.Restaurante.Lista_de_Postres.getPosicion(i + 1).ObtenerInfo(), Controlador.Restaurante.Lista_de_Postres.getPosicion(i + 2).ObtenerInfo(), 0});
            modelo_tabla_postres.addRow(new Object[]{p.getNombre(), p.getprecio(), p.getCarboidratos(), 0});

            i = i + 3;
            j = 0;
        }

        Tiempo();

        while (i < Controlador.Restaurante.Lista_de_Bebidas.getTamaño()) {

            //Modelo.Bebidas b = (Modelo.Bebidas) Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i).ObtenerInfo();
            modelo_tabla_bebidas.addRow(new Object[]{Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i).ObtenerInfo(), Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i + 1).ObtenerInfo(), Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i + 2).ObtenerInfo(), 0});

            i = i + 3;
        }
    }

    void Tiempo() {

        j = 0;
        i = 0;

        try {
            this.wait(500);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Plato_principal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Postre = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabla_Bebidas = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Mesas_Lista = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Resultado_pedidos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tabla_factura = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_Plato_principal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Carbohidratos", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Plato_principal);
        if (Tabla_Plato_principal.getColumnModel().getColumnCount() > 0) {
            Tabla_Plato_principal.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Plato_principal", jScrollPane1);

        Tabla_Postre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Carbohidratos", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla_Postre);
        if (Tabla_Postre.getColumnModel().getColumnCount() > 0) {
            Tabla_Postre.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Postre", jScrollPane2);

        Tabla_Bebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Carbohidratos", "Seleccionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Tabla_Bebidas);
        if (Tabla_Bebidas.getColumnModel().getColumnCount() > 0) {
            Tabla_Bebidas.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Bebida", jScrollPane3);

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel1.setText("Mesa:");

        Mesas_Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15", "Mesa 16", "Mesa 17", "Mesa 18", "Mesa 19", "Mesa 20" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(Mesas_Lista);

        jButton1.setText("Cambiar pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Aceptar, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Aceptar, jButton1});

        jTabbedPane2.getAccessibleContext().setAccessibleName("Pedido");

        jTabbedPane1.addTab("Pedidos", jPanel1);

        Resultado_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Tiempo", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Resultado_pedidos);
        if (Resultado_pedidos.getColumnModel().getColumnCount() > 0) {
            Resultado_pedidos.getColumnModel().getColumn(0).setResizable(false);
            Resultado_pedidos.getColumnModel().getColumn(1).setResizable(false);
            Resultado_pedidos.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Resultado de pedidos", jScrollPane6);

        Tabla_factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Tabla_factura);

        jTabbedPane1.addTab("Factura", jScrollPane7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        Llenar_tabla_de_cocina();
        Llenar_tabla_de_resultado_de_pedidos();

    }//GEN-LAST:event_AceptarActionPerformed

    void Llenar_tabla_de_cocina() {

        DefaultTableModel modelo_platos = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();
        DefaultTableModel modelo_pedidos = (DefaultTableModel) Tabla_Cocina.getModel();

        Lista Lista_Auxiliar = new Lista();//Funciona para poder agregar los nombres de los platos al combobox que se encuentran en la vista de cocina.

        for (int k = 0; k < modelo_tabla_postres.getRowCount(); k++) {
            if (Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_tabla_postres.getValueAt(k, 0));
            }
            modelo_tabla_postres.setValueAt(0, k, 3);
        }

        for (int k = 0; k < modelo_platos.getRowCount(); k++) {
            if (Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_platos.getValueAt(k, 0));
            }
            modelo_platos.setValueAt(0, k, 3);
        }

        for (int k = 0; k < modelo_tabla_bebidas.getRowCount(); k++) {
            if (Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_tabla_bebidas.getValueAt(k, 0));
            }
            modelo_tabla_bebidas.setValueAt(0, k, 3);
        }

        int Tamaño = Lista_Auxiliar.getTamaño();
        Object[] Vector = new String[Tamaño];

        for (int k = 0; k < Tamaño; k++) {
            Vector[k] = Lista_Auxiliar.getPosicion(k).ObtenerInfo();
        }

        JComboBox Combo = new JComboBox(Vector);
        TableColumn Columna_a_cambiar = Tabla_Cocina.getColumnModel().getColumn(1);
        TableCellEditor Editor_celda = new DefaultCellEditor(Combo);
        Columna_a_cambiar.setCellEditor(Editor_celda);

        try {

            System.out.println("V: " + Mesas_Lista.getSelectedValue());

            if (!(Mesas_Lista.getSelectedValue() == null)) {

                modelo_pedidos.addRow(new Object[]{Mesas_Lista.getSelectedValue(), Vector[0], false});
            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }

    }

    private void Llenar_tabla_de_resultado_de_pedidos() {

        DefaultTableModel tabla_resultados = (DefaultTableModel) Resultado_pedidos.getModel();

        tabla_resultados.addRow(new Object[]{Mesas_Lista.getSelectedValue(), "0:00", "Preparando"});
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JList<String> Mesas_Lista;
    public static javax.swing.JTable Resultado_pedidos;
    private javax.swing.JTable Tabla_Bebidas;
    private javax.swing.JTable Tabla_Plato_principal;
    private javax.swing.JTable Tabla_Postre;
    public static javax.swing.JTable Tabla_factura;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
