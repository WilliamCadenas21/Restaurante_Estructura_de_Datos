package Vista;

import Controlador.Lista;
import Controlador.Pedido;
import Modelo.Bebidas;
import Modelo.ComidaAuxiliar;
import Modelo.Plato_principal;
import Modelo.Postre;
import static Vista.Vista_Cocina.Tabla_Cocina;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaMenu extends javax.swing.JFrame {

    int i = 0, j = 0, numeroDeLaMesaACambiarElPedido = 0, precio = 0, cantidad = 0;

    boolean variableBooleanaGlobal = true;

    Lista listaComidaAuxiliar = new Lista(), listaPedidos = new Lista();

    Object[] v = new Object[0];

    String nombreDelPlato = "";

    Pedido pedido;

    public VistaMenu() {
        initComponents();

        setLocationRelativeTo(null);

        System.out.println("Estoy en component");

        DefaultTableModel modelo_tabla_plato_principal = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) tablaBebidas.getModel();

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

    void Tiempo() {//Me sirve para que la ejecucion entre ciclo y ciclo se frene, para asi poder evitar que el programa se coloque muy lento.

        j = 0;
        i = 0;

        try {
            this.wait(5000);
        } catch (Exception e) {
            System.out.println("Estoy en el frenado del programa.");
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
        tablaPlatoPrincipal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPostre = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaBebidas = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Lista_de_mesas = new javax.swing.JList<>();
        Cambiar_pedido = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        resultadoPedidos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Tablet Mesero"); // NOI18N
        setResizable(false);

        tablaPlatoPrincipal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaPlatoPrincipal);
        if (tablaPlatoPrincipal.getColumnModel().getColumnCount() > 0) {
            tablaPlatoPrincipal.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Plato_principal", jScrollPane1);

        tablaPostre.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaPostre);
        if (tablaPostre.getColumnModel().getColumnCount() > 0) {
            tablaPostre.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane2.addTab("Postre", jScrollPane2);

        tablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaBebidas);
        if (tablaBebidas.getColumnModel().getColumnCount() > 0) {
            tablaBebidas.getColumnModel().getColumn(3).setResizable(false);
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

        resultadoPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(resultadoPedidos);
        if (resultadoPedidos.getColumnModel().getColumnCount() > 0) {
            resultadoPedidos.getColumnModel().getColumn(0).setResizable(false);
            resultadoPedidos.getColumnModel().getColumn(1).setResizable(false);
            resultadoPedidos.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Resultado de pedidos", jScrollPane6);

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        tablaFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaFacturaKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(tablaFactura);

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

        DefaultTableModel tabla_resultados = (DefaultTableModel) resultadoPedidos.getModel();

        tabla_resultados.addRow(new Object[]{Lista_de_mesas.getSelectedValue(), "0:30", "Esperando cambio"});

        Llenar_tabla_de_resultado_de_pedidos();
    }//GEN-LAST:event_AceptarActionPerformed

    private void tablaFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaFacturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaFacturaKeyPressed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked

        DefaultTableModel modeloTablaFactura = (DefaultTableModel) tablaFactura.getModel();
        
        if (evt.getClickCount() == 2) {

            int tamañoDeLaLista = listaPedidos.getTamaño();

            pedido = (Pedido) listaPedidos.getPosicion(tamañoDeLaLista).ObtenerInfo();

            variableBooleanaGlobal = true;

            do {
                if (pedido.getMesa().equals("")) {
                    
                }
            } while (tamañoDeLaLista > 0 && variableBooleanaGlobal);
        }
    }//GEN-LAST:event_tablaFacturaMouseClicked

    void AgregarPedido() {

        DefaultTableModel modelo_platos = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) tablaBebidas.getModel();

        int Total = 0;

        for (int k = 0; k < modelo_tabla_postres.getRowCount(); k++) {

            if (Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3))) > 0) {

                nombreDelPlato = String.valueOf(modelo_tabla_postres.getValueAt(k, 0));
                precio = Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 1)));
                cantidad = Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3)));

                listaComidaAuxiliar.Agregar(new ComidaAuxiliar("Postre", nombreDelPlato, precio, cantidad));//Primero llenó una lista de objetos con los platos pedidos
                Total = Total + Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 1)));//Precio total del pedido, sirve para realizar la factura                                                                                                        //tipo Lista_comida_auxiliar para asi poder llenar la lista de pedidos, que me servira
            }                                                                                                                                                                                                    //despues para la creacion de la factura y el cambio de pedido durante los primeros 5 minutos

        }

        for (int k = 0; k < modelo_platos.getRowCount(); k++) {
            if (Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3))) > 0) {

                nombreDelPlato = String.valueOf(modelo_platos.getValueAt(k, 0));//Me obtiene el nombre del plato en cierta posicion en el lista de pedido
                precio = Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 1)));
                cantidad = Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3)));

                listaComidaAuxiliar.Agregar(new ComidaAuxiliar("Plato", nombreDelPlato, precio, cantidad));
                Total = Total + Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 1)));//Precio total del pedido, sirve para realizar la factura
            }
        }

        for (int k = 0; k < modelo_tabla_bebidas.getRowCount(); k++) {

            if (Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3))) > 0) {

                nombreDelPlato = String.valueOf(modelo_tabla_bebidas.getValueAt(k, 0));
                precio = Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 1)));
                cantidad = Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3)));

                listaComidaAuxiliar.Agregar(new ComidaAuxiliar("Bebida", nombreDelPlato, precio, cantidad));
                Total = Total + Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 1))); //Precio total del pedido, sirve para realizar la factura
            }
        }

        listaPedidos.Agregar(new Pedido(Lista_de_mesas.getSelectedValue(), listaComidaAuxiliar, Total));
    }

    private void Cambiar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {

        DefaultTableModel modelo_tabla_cocina = (DefaultTableModel) Tabla_Cocina.getModel();

        v = new Object[modelo_tabla_cocina.getRowCount()];

        for (int k = 0; k < modelo_tabla_cocina.getRowCount(); k++) {//Reinicio el vector, para que no se copien los pedidos que ya han sido realizados.
            v[k] = modelo_tabla_cocina.getValueAt(k, 0);
        }

        String horaInicial = "";//Esta variable me sirve para capturar la hora con la cual se ha realizado el pedido.

        Object j = "";//Esta variable me funciona para poder obtener la mesa que se ha seleccionado en la ventana emergente (JOptionPane.showInputDialog)

        String horaCapturada = Reloj.lblReloj.getText();

        try {

            j = JOptionPane.showInputDialog(this, "Pedidos:", "Seleccion de mesa", 1, null, v, 3);//Me permite seleccionar la mesa a la cual se le vá a realizar el cambio de pedido.

            for (int k = 0; k < modelo_tabla_cocina.getRowCount(); k++) {

                if (j.equals(String.valueOf(modelo_tabla_cocina.getValueAt(k, 0)))) {

                    horaInicial = (String) modelo_tabla_cocina.getValueAt(k, 2);
                }
            }

        } catch (Exception e) {
        }

        variableBooleanaGlobal = true;

        while (numeroDeLaMesaACambiarElPedido < listaPedidos.getTamaño() && variableBooleanaGlobal) {

            try {

                if (j.equals(pedido.getMesa()) && !(j == null)) {//Busco la mesa  que ha sido seleccionada para realizar el cambio de pedido de dicha mesa.
                    
                    variableBooleanaGlobal = false; // para salirse del mientrasQ
                    if (calcularDiferenciaDeTiempos(horaInicial, horaCapturada)) {
                        Cambiar_pedido(pedido.getMesa());

                    } else {

                        JOptionPane.showMessageDialog(this, "El tiempo necesario para cambiar el pedido de la " + pedido.getMesa() + " ya ha pasado, por lo que este proceso no se puede realizar.");
                    }
                }
            } catch (NullPointerException e) {
            }
            numeroDeLaMesaACambiarElPedido++;
        }

    }

    void Cambiar_pedido(String mesa) {

        DefaultTableModel modelo_tabla_cocina = (DefaultTableModel) Tabla_Cocina.getModel();
        DefaultTableModel modelo_tabla_resultado_pedidos = (DefaultTableModel) resultadoPedidos.getModel();

        for (int k = 0; k < modelo_tabla_cocina.getRowCount(); k++) {

            if (mesa.equals(String.valueOf(modelo_tabla_cocina.getValueAt(k, 0)))) {
                modelo_tabla_resultado_pedidos.removeRow(k);
                modelo_tabla_cocina.removeRow(k);
            }
        }

        /*DefaultTableModel modelo_platos = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        Lista Lista_de_los_platos_del_pedido = ((Pedido) listaPedidos.getPosicion(Numero_de_la_mesa_a_cambiar_el_pedido).ObtenerInfo()).getListaComida();

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

        DefaultTableModel modelo_platos = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) tablaBebidas.getModel();
        DefaultTableModel modelo_pedidos = (DefaultTableModel) Tabla_Cocina.getModel();

        /*
        Lista Lista_Auxiliar = new Lista();//Funciona para poder agregar los nombres de los platos al combobox que se encuentran en la vista de cocina.
         */
        for (int k = 0; k < modelo_tabla_postres.getRowCount(); k++) {
            /*if (Integer.parseInt(String.valueOf(modelo_tabla_postres.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_tabla_postres.getValueAt(k, 0));
            }*/
            modelo_tabla_postres.setValueAt(0, k, 3);//Me reinicia el valor de la cantidad de alimentos seleccionados, para poder escojer nuevamente.
        }

        for (int k = 0; k < modelo_platos.getRowCount(); k++) {
            /*if (Integer.parseInt(String.valueOf(modelo_platos.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_platos.getValueAt(k, 0));
            }*/
            modelo_platos.setValueAt(0, k, 3);
        }

        for (int k = 0; k < modelo_tabla_bebidas.getRowCount(); k++) {
            /*if (Integer.parseInt(String.valueOf(modelo_tabla_bebidas.getValueAt(k, 3))) > 0) {

                Lista_Auxiliar.Agregar(modelo_tabla_bebidas.getValueAt(k, 0));
            }*/
            modelo_tabla_bebidas.setValueAt(0, k, 3);
        }

        //int Tamaño = Lista_Auxiliar.getTamaño();
        //Object[] Vector = new String[Tamaño];

        /*for (int k = 0; k < Tamaño; k++) {
            Vector[k] = Lista_Auxiliar.getPosicion(k).ObtenerInfo();
        }

        JComboBox Combo = new JComboBox(Vector);
        TableColumn Columna_a_cambiar = Tabla_Cocina.getColumnModel().getColumn(1);
        TableCellEditor Editor_celda = new DefaultCellEditor(Combo);
        Columna_a_cambiar.setCellEditor(Editor_celda);
         */
        String hora = Reloj.lblReloj.getText();//Captura del tiempo actual en el que se ordena el pedido para cocina 

        try {

            System.out.println("V: " + Lista_de_mesas.getSelectedValue());

            if (!(Lista_de_mesas.getSelectedValue() == null)) {
                //Aqui se Llena la tabla cocina 
                modelo_pedidos.addRow(new Object[]{Lista_de_mesas.getSelectedValue(), false, hora});
            } else {

                JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }

    }

    private void Llenar_tabla_de_resultado_de_pedidos() {

        DefaultTableModel tabla_resultados = (DefaultTableModel) resultadoPedidos.getModel();

        Llenar_tabla_de_cocina();

        tabla_resultados.setValueAt("Preparando", tabla_resultados.getRowCount() - 1, 2);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    /**
     * funcion para calcular el tiempo que ha pasado
     *
     * @param inicial timepo en el que se realizo el pedido
     * @param actual tiempo en el que se pidio cambiar el pedido
     * @return
     */
    private boolean calcularDiferenciaDeTiempos(String inicial, String actual) {

        System.out.println("Inicial: " + inicial);
        System.out.println("Final: " + actual);
        System.out.println("Estoy en el cambio del pedido de una mesa.");

        String ini = inicial.substring(0, inicial.length() - 3);
        String fin = actual.substring(0, actual.length() - 3);

        String[] vec0 = ini.split(":");
        String[] vec1 = fin.split(":");

        int inicial1 = Integer.parseInt(vec0[1]) * 60 * 1000 + Integer.parseInt(vec0[2]) * 1000;
        int final2 = Integer.parseInt(vec1[1]) * 60 * 1000 + Integer.parseInt(vec1[2]) * 1000;
        System.out.println("total: " + (final2 - inicial1));
        if (final2 - inicial1 <= 10000) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cambiar_pedido;
    private javax.swing.JList<String> Lista_de_mesas;
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
    public static javax.swing.JTable resultadoPedidos;
    private javax.swing.JTable tablaBebidas;
    public static javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaPlatoPrincipal;
    private javax.swing.JTable tablaPostre;
    // End of variables declaration//GEN-END:variables

}
