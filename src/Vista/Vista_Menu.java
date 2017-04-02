package Vista;

import Controlador.Lista;
import Controlador.Pedido;
import Modelo.Bebidas;
import Modelo.Comida_auxiliar;
import Modelo.Plato_principal;
import Modelo.Postre;
import static Vista.Vista_Cocina.Tabla_Cocina;
import java.awt.Point;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;

public class Vista_Menu extends javax.swing.JFrame {

    int i = 0, j = 0, Numero_de_la_mesa_a_cambiar_el_pedido = 0, Precio = 0, Cantidad = 0;

    Lista Lista_comida_auxiliar = new Lista(), Lista_pedidos = new Lista();

    String Nombre_del_plato = "";
    public Vista_Menu() {
        initComponents();

        setLocationRelativeTo(null);

        System.out.println("Estoy en component");

        DefaultTableModel modelo_tabla_plato_principal = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        while (i < Controlador.Restaurante.Lista_de_Platos.getTamaño()) {

            Plato_principal p = (Plato_principal) Controlador.Restaurante.Lista_de_Platos.getPosicion(i).ObtenerInfo();
            modelo_tabla_plato_principal.addRow(new Object[]{p.getNombre(), p.getprecio(), p.getCarboidratos(), 0});
            i++;
        }

        Tiempo();

        while (i < Controlador.Restaurante.Lista_de_Postres.getTamaño()) {

            Postre p = (Postre) Controlador.Restaurante.Lista_de_Postres.getPosicion(i).ObtenerInfo();
            modelo_tabla_postres.addRow(new Object[]{p.getNombre(), p.getPrecio(), p.getCarboidratos(), 0});

            i++;
        }

        Tiempo();

        while (i < Controlador.Restaurante.Lista_de_Bebidas.getTamaño()) {

            Bebidas b = (Bebidas) Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i).ObtenerInfo();
            modelo_tabla_bebidas.addRow(new Object[]{b.getNombre(), b.getprecio(), b.getCarboidratos(), 0});

            i++;
        }
    }

    void Tiempo() {

        j = 0;
        i = 0;

        try {
            this.wait(5000);
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
        Lista_de_mesas = new javax.swing.JList<>();
        Cambiar_pedido = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        Resultado_pedidos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tabla_factura = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Tablet Mesero"); // NOI18N
        setResizable(false);

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

        Lista_de_mesas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15", "Mesa 16", "Mesa 17", "Mesa 18", "Mesa 19", "Mesa 20" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(Lista_de_mesas);

        Cambiar_pedido.setText("Cambiar pedido");
        Cambiar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cambiar_pedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cambiar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Aceptar, Cambiar_pedido});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Aceptar)
                            .addComponent(Cambiar_pedido)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5)))
                .addGap(66, 66, 66))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Aceptar, Cambiar_pedido});

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
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        AgregarPedido();

        DefaultTableModel tabla_resultados = (DefaultTableModel) Resultado_pedidos.getModel();

        tabla_resultados.addRow(new Object[]{Lista_de_mesas.getSelectedValue(), "0:30", "Esperando cambio"});

        Llenar_tabla_de_resultado_de_pedidos();
    }//GEN-LAST:event_AceptarActionPerformed

    void AgregarPedido() {

        DefaultTableModel modelo_platos = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        int Total = 0;

        for (int k = 0; k < modelo_tabla_postres.getRowCount(); k++) {
            
            if (Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3))) > 0) {

                Nombre_del_plato = String.valueOf(modelo_tabla_postres.getValueAt(k, 0));
                Precio = Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 1)) );
                Cantidad = Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3)) );
                
                Lista_comida_auxiliar.Agregar(new Comida_auxiliar("Postre", Nombre_del_plato, Precio, Cantidad) );//Primero llenó una lista de objetos con los platos pedidos
                Total = Total + Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 1)));//Precio total del pedido, sirve para realizar la factura                                                                                                        //tipo Lista_comida_auxiliar para asi poder llenar la lista de pedidos, que me servira
            }                                                                                                                                                                                                    //despues para la creacion de la factura y el cambio de pedido durante los primeros 5 minutos

        }

        for (int k = 0; k < modelo_platos.getRowCount(); k++) {
            if (Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3))) > 0) {

                Nombre_del_plato = String.valueOf(modelo_platos.getValueAt(k, 0));//Me obtiene el nombre del plato en cierta posicion en el lista de pedido
                Precio = Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 1)) );
                Cantidad = Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3)) );
                
                Lista_comida_auxiliar.Agregar(new Comida_auxiliar("Plato", Nombre_del_plato, Precio, Cantidad));
                Total = Total + Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 1)));//Precio total del pedido, sirve para realizar la factura
            }
        }

        for (int k = 0; k < modelo_tabla_bebidas.getRowCount(); k++) {

            if (Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3))) > 0) {

                Nombre_del_plato = String.valueOf(modelo_tabla_bebidas.getValueAt(k, 0));
                Precio = Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 1)) );
                Cantidad = Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3)) );
                
                Lista_comida_auxiliar.Agregar(new Comida_auxiliar("Bebida", Nombre_del_plato, Precio, Cantidad));
                Total = Total + Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 1))); //Precio total del pedido, sirve para realizar la factura
            }
        }

        Lista_pedidos.Agregar(new Pedido(Lista_de_mesas.getSelectedValue(), Lista_comida_auxiliar, Total));
    }

    private void Cambiar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cambiar_pedidoActionPerformed
        
        DefaultTableModel modelo_tabla_cocina = (DefaultTableModel) Tabla_Cocina.getModel();
        
        String hora_Inicial = "";
        
        String horaCapturada = Reloj.lblReloj.getText();
        
        Object[] v = new Object[Lista_pedidos.getTamaño()];

        for (int k = 0; k < Lista_pedidos.getTamaño(); k++) {//Este ciclo me funciona unicamente para poder llenar el vector que será utilizado en la ventana emergente, para seleccionar la mesa.

            Pedido p = (Pedido) Lista_pedidos.getPosicion(k).ObtenerInfo();
            v[k] = p.getMesa();//El vector se llena con todas las mesas que han realizado un pedido, para asi poder agregarlo a el mensaje emergente y seleccionar la mesa deseada.

        }

        Object j = javax.swing.JOptionPane.showInputDialog(this, i, "", i, null, v, i);//Me permite seleccionar la mesa a la cual se le vá a realizar el cambio de pedido.

        for (int k = 0; k < modelo_tabla_cocina.getRowCount(); k++) {
            
            if (j.equals(String.valueOf(modelo_tabla_cocina.getValueAt(k, 0)))) {
                
                hora_Inicial = (String) modelo_tabla_cocina.getValueAt(k, 3);
            }
        }
        
        boolean a = true;

        while (Numero_de_la_mesa_a_cambiar_el_pedido < Lista_pedidos.getTamaño() && a) {
            
            Pedido p = (Pedido) Lista_pedidos.getPosicion(Numero_de_la_mesa_a_cambiar_el_pedido).ObtenerInfo();

            System.out.println("J: " + j);
            System.out.println("P: " + p.getMesa());
            
            if (j.equals(p.getMesa())) {//Busco la mesa  que ha sido seleccionada para realizar el cambio de pedido de dicha mesa.
                a = false; // para salirse del mientrasQ
                if (calcularDiferenciaDeTiempos(hora_Inicial,horaCapturada)) {
                    Cambiar_pedido();
                }else{
                    System.out.println("no se puede cambiar PEDIDO !!!");
                }
            }
            Numero_de_la_mesa_a_cambiar_el_pedido++;
        }

    void Cambiar_pedido(String mesa) {

        DefaultTableModel modelo_tabla_cocina = (DefaultTableModel) Tabla_Cocina.getModel();
        DefaultTableModel modelo_tabla_resultado_pedidos = (DefaultTableModel) Resultado_pedidos.getModel();
        
        for (int k = 0; k < modelo_tabla_cocina.getRowCount(); k++) {
            if (mesa.equals( String.valueOf( modelo_tabla_cocina.getValueAt(k, 0) ) )) {
                modelo_tabla_resultado_pedidos.removeRow(k);
                modelo_tabla_cocina.removeRow(k);
            }
        }
        
        /*DefaultTableModel modelo_platos = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        Lista Lista_de_los_platos_del_pedido = ((Pedido) Lista_pedidos.getPosicion(Numero_de_la_mesa_a_cambiar_el_pedido).ObtenerInfo()).getListaComida();

        for (int k = 0; k < Lista_de_los_platos_del_pedido.getTamaño(); k++) {

            Comida_auxiliar comida = (Comida_auxiliar) Lista_de_los_platos_del_pedido.getPosicion(k).ObtenerInfo();

            if (comida.getTipo().equals("Plato")) {
                //Lleno la tabla correspondiente a platos principales, si se ha escogido algun plato.
                
                for (int l = 0; l < modelo_platos.getRowCount(); l++) {//Este ciclo se realiza para poder averiguar a que plato es el que se le va ha realizar el cambio en la cantidad, cuando fue realizado el pedido, para asi evitar ingrezar los valores de cantidad nuevamente.
                    
                    if (comida.getNombrePlato().equals(modelo_platos.getValueAt(l, 0))) {
                        
                        modelo_platos.setValueAt(comida.getCantidad(), l, 3);
                    }
                }
            } else if (comida.getTipo().equals("Postre")) {
                //Lleno la tabla correspondiente a postres, si se ha escogido algun postre.

            } else if (comida.getTipo().equals("Bebida")) {
                //Lleno la tabla correspondiente a bebidas, si se ha escogido alguna Bebida.

            }
        }*/
        
        
    }

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
            modelo_tabla_postres.setValueAt(0, k, 3);//Me reinicia el valor de la cantidad de alimentos seleccionados, para poder escojer nuevamente.
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
        
        String hora =  Reloj.lblReloj.getText();//Captura del tiempo actual en el que se ordena el pedido para cocina 
        
        try {

            System.out.println("V: " + Lista_de_mesas.getSelectedValue());

            if (!(Lista_de_mesas.getSelectedValue() == null)) {
                //Aqui se Llena la tabla cocina 
                modelo_pedidos.addRow(new Object[]{Lista_de_mesas.getSelectedValue(), Vector[0], false,hora});
            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }

    }

    private void Llenar_tabla_de_resultado_de_pedidos() {

        DefaultTableModel tabla_resultados = (DefaultTableModel) Resultado_pedidos.getModel();

        Llenar_tabla_de_cocina();

        tabla_resultados.setValueAt("Preparando", tabla_resultados.getRowCount() - 1, 2);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Menu().setVisible(true);
            }
        });
    }
    
    /**
     * funcion para calcular el tiempo que ha pasado
     * @param inicial timepo en el que se realizo el pedido
     * @param actual tiempo en el que se pidio cambiar el pedido
     * @return 
     */
    private boolean calcularDiferenciaDeTiempos(String inicial, String actual) {
        
        String ini = inicial.substring(0,inicial.length()-3);
        String fin = actual.substring(0,actual.length()-3);
        
        String[] vec0 = ini.split(":");
        String[] vec1 = fin.split(":");
        
        int inicial1 = Integer.parseInt(vec0[1])*60*1000 + Integer.parseInt(vec0[2])*1000;
        int final2 = Integer.parseInt(vec1[1])*60*1000 + Integer.parseInt(vec1[2])*1000;   
        
        if ( final2 - inicial1 <= 5000 ) {         
            return true;
        }else{
            return false;
        }         
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cambiar_pedido;
    private javax.swing.JList<String> Lista_de_mesas;
    public static javax.swing.JTable Resultado_pedidos;
    private javax.swing.JTable Tabla_Bebidas;
    private javax.swing.JTable Tabla_Plato_principal;
    private javax.swing.JTable Tabla_Postre;
    public static javax.swing.JTable Tabla_factura;
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
