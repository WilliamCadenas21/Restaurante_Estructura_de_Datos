package Vista;

import Controlador.Lista;
import Controlador.Pedido;
import static Controlador.Restaurante.listaDeBebidas;
import static Controlador.Restaurante.listaDePlatos;
import static Controlador.Restaurante.listaDePostres;
import Modelo.Bebida;
import Modelo.ComidaAuxiliar;
import Modelo.PlatoPrincipal;
import Modelo.Postre;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Vista.vistaCocina.tablaCocina;

public class VistaMenu extends javax.swing.JFrame {

    int i = 0, j = 0, numeroDeLaMesaACambiarElPedido = 0, precio = 0, cantidad = 0, total = 0;

    boolean variableBooleanaGlobal = true;

    Lista listaDePlatosDeUnPedido = new Lista(), listaPedidos = new Lista();

    String nombreDelPlato = "", factura = "", inicioFactura = "", finFactura = "", horaActual = "";//Las variables inicioFactura y finFactura me sirven para poder mostrar los datos en el area de texto.

    Pedido pedido;

    DefaultTableModel modeloTablaPlatoPrincipal, modeloTablaPostres, modeloTablaBebidas, tablaResultados;

    public VistaMenu() {
        initComponents();

        setLocationRelativeTo(null);

        mostrarFactura.setSize(500, 700);//Establesco el tamaño del frame emergente.

        modeloTablaPlatoPrincipal = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        modeloTablaPostres = (DefaultTableModel) tablaPostre.getModel();
        modeloTablaBebidas = (DefaultTableModel) tablaBebidas.getModel();

        mostrarPlatosEnTablas(modeloTablaPlatoPrincipal, "Plato", listaDePlatos);
        mostrarPlatosEnTablas(modeloTablaPostres, "Postre", listaDePostres);
        mostrarPlatosEnTablas(modeloTablaBebidas, "Bebida", listaDeBebidas);
    }

    void mostrarPlatosEnTablas(DefaultTableModel modelo, String TipoDeObjeto, Lista lista) {

        int i = 0;

        while (i < lista.getTamaño()) {

            switch (TipoDeObjeto) {
                case "Plato":

                    PlatoPrincipal algo0 = (PlatoPrincipal) lista.getPosicion(i).getInfo();

                    modelo.addRow(new Object[]{algo0.getNombre(), algo0.getPrecio(), algo0.getCarbohidratos(), 0});
                    break;
                case "Postre":

                    Postre algo1 = (Postre) lista.getPosicion(i).getInfo();

                    modelo.addRow(new Object[]{algo1.getNombre(), algo1.getPrecio(), algo1.getCarbohidratos(), 0});
                    break;
                case "Bebida":

                    Bebida algo2 = (Bebida) lista.getPosicion(i).getInfo();

                    modelo.addRow(new Object[]{algo2.getNombre(), algo2.getPrecio(), algo2.getCarbohidratos(), 0});
                    break;
            }

            i++;

        }
    }

    void Tiempo() {//Me sirve para que la ejecucion entre ciclo y ciclo se frene, para asi poder evitar que el programa se coloque muy lento.

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

        mostrarFactura = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        paraMostrarFactura = new javax.swing.JTextArea();
        botonPagar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
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
        mesasJList = new javax.swing.JList<>();
        cambiarPedido = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        resultadoPedidos = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaFactura = new javax.swing.JTable();

        mostrarFactura.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        paraMostrarFactura.setColumns(20);
        paraMostrarFactura.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        paraMostrarFactura.setRows(5);
        jScrollPane4.setViewportView(paraMostrarFactura);

        botonPagar.setText("Pagar");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarFacturaLayout = new javax.swing.GroupLayout(mostrarFactura.getContentPane());
        mostrarFactura.getContentPane().setLayout(mostrarFacturaLayout);
        mostrarFacturaLayout.setHorizontalGroup(
            mostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarFacturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        mostrarFacturaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonCancelar, botonPagar});

        mostrarFacturaLayout.setVerticalGroup(
            mostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(mostrarFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPagar)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        mostrarFacturaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonCancelar, botonPagar});

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

        mesasJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15", "Mesa 16", "Mesa 17", "Mesa 18", "Mesa 19", "Mesa 20" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(mesasJList);

        cambiarPedido.setText("Cambiar pedido");
        cambiarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPedidoActionPerformed(evt);
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
                        .addGap(32, 32, 32)
                        .addComponent(cambiarPedido)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Aceptar, cambiarPedido});

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
                            .addComponent(cambiarPedido)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5)))
                .addGap(66, 66, 66))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Aceptar, cambiarPedido});

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

        agregarFilaATablaResultadoDePedidos();

        llenarTablaDeCocina();
    }//GEN-LAST:event_AceptarActionPerformed

    private void tablaFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaFacturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaFacturaKeyPressed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked

        String mesa = String.valueOf(tablaFactura.getValueAt(tablaFactura.getSelectedRow(), 0));

        if (evt.getClickCount() == 2) {

            int posicionEnLaLista = listaPedidos.getTamaño() - 1;

            pedido = (Pedido) listaPedidos.getPosicion(posicionEnLaLista).getInfo();

            variableBooleanaGlobal = true;

            do {

                pedido = (Pedido) listaPedidos.getPosicion(posicionEnLaLista).getInfo();

                if (pedido.getMesa().equals(mesa)) {

                    listaDePlatosDeUnPedido = pedido.getListaComida();

                    ComidaAuxiliar comidaAuxiliar;

                    inicioFactura = "\t\t\t Restaurante La Prosperidad\n"
                            + "\t\t\t\tCalle Viva N° 123\n"
                            + Reloj.lblReloj.getText();

                    finFactura = "\n\n\t\t\tGracias por su visita\n"
                            + "\t\tPara mayor informacion: 3123456789";

                    for (int k = 0; k < listaDePlatosDeUnPedido.getTamaño(); k++) {

                        comidaAuxiliar = (ComidaAuxiliar) listaDePlatosDeUnPedido.getPosicion(k).getInfo();
                        factura = factura + "\n" + comidaAuxiliar.getCantidad() + "  " + comidaAuxiliar.getNombrePlato() + "..........$" + comidaAuxiliar.getPrecio();
                    }

                    factura = factura + "\n\n\t\t\t\tTotal: $" + pedido.getPrecio();

                    paraMostrarFactura.setText(inicioFactura + factura + finFactura);

                    mostrarFactura.setVisible(true);//Se abre el frame que muestra la factura. 

                    variableBooleanaGlobal = false;
                }

                factura = "";

                posicionEnLaLista--;

            } while (posicionEnLaLista >= 0 && variableBooleanaGlobal);
        }
    }//GEN-LAST:event_tablaFacturaMouseClicked

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed

        DefaultTableModel modeloTablaFactura = (DefaultTableModel) tablaFactura.getModel();
        tablaResultados = (DefaultTableModel) resultadoPedidos.getModel();

        mostrarFactura.dispose();

        int posicionMesaFactura = tablaFactura.getSelectedRow();
        String mesaFactura = String.valueOf(modeloTablaFactura.getValueAt(posicionMesaFactura, 0));

        eliminarFilaDeUnaTabla(tablaResultados, mesaFactura, posicionMesaFactura);
        eliminarFilaDeUnaTabla(modeloTablaFactura, mesaFactura, tablaFactura.getSelectedRow());
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        mostrarFactura.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void cambiarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPedidoActionPerformed

        DefaultTableModel modeloTablaCocina = (DefaultTableModel) tablaCocina.getModel();

        Object[] v = new Object[modeloTablaCocina.getRowCount()];
        for (int k = 0; k < modeloTablaCocina.getRowCount(); k++) {//Reinicio el vector, para que no se copien los pedidos que ya han sido realizados.
            v[k] = modeloTablaCocina.getValueAt(k, 0);
        }

        Object j = JOptionPane.showInputDialog(this, "Pedidos:", "Seleccion de mesa", 1, null, v, 3);//Me permite seleccionar la mesa a la cual se le vá a realizar el cambio de pedido.
        int numeroDeLaFilaAElminar = 0;
        String horaInicial = "";//Esta variable me sirve para capturar la hora con la cual se ha realizado el pedido.        
        for (int k = 0; k < modeloTablaCocina.getRowCount(); k++) {

            if (j.equals(String.valueOf(modeloTablaCocina.getValueAt(k, 0)))) {

                horaInicial = (String) modeloTablaCocina.getValueAt(k, 2);
                numeroDeLaFilaAElminar = k;
            }
        }

        variableBooleanaGlobal = true;
        horaActual = Reloj.lblReloj.getText();
        while (numeroDeLaMesaACambiarElPedido < listaPedidos.getTamaño() && variableBooleanaGlobal) {

            pedido = (Pedido) listaPedidos.getPosicion(numeroDeLaMesaACambiarElPedido).getInfo();

            try {

                if (j.equals(pedido.getMesa()) && !(j == null)) {//Busco la mesa  que ha sido seleccionada para realizar el cambio de pedido de dicha mesa.

                    variableBooleanaGlobal = false; // para salirse del mientrasQ
                    if (calcularDiferenciaDeTiempos(horaInicial, horaActual)) {

                        cambiarPedido(pedido.getMesa());
                        modeloTablaCocina.removeRow(numeroDeLaFilaAElminar);
                    } else {

                        JOptionPane.showMessageDialog(this, "El tiempo necesario para cambiar el pedido de la " + pedido.getMesa() + " ya ha pasado, por lo que este proceso no se puede realizar.");
                    }
                }
            } catch (NullPointerException e) {

            }
            numeroDeLaMesaACambiarElPedido++;
        }
    }//GEN-LAST:event_cambiarPedidoActionPerformed

    void AgregarPlatosAUnPedido(DefaultTableModel modelo, String tipo) {

        for (int k = 0; k < modelo.getRowCount(); k++) {

            if (Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3))) > 0) {

                nombreDelPlato = String.valueOf(modelo.getValueAt(k, 0));
                precio = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 1)));
                cantidad = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3)));

                listaDePlatosDeUnPedido.Agregar(new ComidaAuxiliar(tipo, nombreDelPlato, precio, cantidad));//Primero llenó una lista de objetos con los platos pedidos
                //Precio total del pedido, sirve para realizar la factura.
                //tipo Lista_comida_auxiliar para asi poder llenar la lista de pedidos, que me servira
                //despues para la creacion de la factura y el cambio de pedido durante los primeros 5 minutos.    
                total = total + Integer.parseInt(String.valueOf(modelo.getValueAt(k, 1)));
            }
        }
    }

    void AgregarPedido() {

        DefaultTableModel modeloPlatos = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modeloTablaPostres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modeloTablaBebidas = (DefaultTableModel) tablaBebidas.getModel();

        AgregarPlatosAUnPedido(modeloPlatos, "Plato");
        AgregarPlatosAUnPedido(modeloTablaPostres, "Postre");
        AgregarPlatosAUnPedido(modeloTablaBebidas, "Bebida");

        listaPedidos.Agregar(new Pedido(mesasJList.getSelectedValue(), listaDePlatosDeUnPedido, total));
        listaDePlatosDeUnPedido = new Lista();//Reinicio esta lista, porque de lo contrario me guadaria informacion de los platos antes pedidos.
    }

    void cambiarPedido(String mesa) {

        DefaultTableModel modeloTablaCocina = (DefaultTableModel) tablaCocina.getModel();
        DefaultTableModel modeloTablaResultadoPedidos = (DefaultTableModel) resultadoPedidos.getModel();

        eliminarFilaDeUnaTabla(modeloTablaResultadoPedidos, mesa, 0);
        eliminarFilaDeUnaTabla(modeloTablaCocina, mesa, 0);

        /*DefaultTableModel modelo_platos = (DefaultTableModel) Tabla_Plato_principal.getModel();
        DefaultTableModel modeloTablaPostres = (DefaultTableModel) Tabla_Postre.getModel();
        DefaultTableModel modeloTablaBebidas = (DefaultTableModel) Tabla_Bebidas.getModel();

        Lista Lista_de_los_platos_del_pedido = ((Pedido) listaPedidos.getPosicion(Numero_de_la_mesa_a_cambiar_el_pedido).getInfo()).getListaComida();

        for (int k = 0; k < Lista_de_los_platos_del_pedido.getTamaño(); k++) {

            Comida_auxiliar comida = (Comida_auxiliar) Lista_de_los_platos_del_pedido.getPosicion(k).getInfo();

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

    void llenarTablaDeCocina() {

        modeloTablaPlatoPrincipal = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        modeloTablaPostres = (DefaultTableModel) tablaPostre.getModel();
        modeloTablaBebidas = (DefaultTableModel) tablaBebidas.getModel();
        DefaultTableModel modelo_pedidos = (DefaultTableModel) tablaCocina.getModel();

        //int Tamaño = Lista_Auxiliar.getTamaño();
        //Object[] Vector = new String[Tamaño];

        /*for (int k = 0; k < Tamaño; k++) {
            Vector[k] = Lista_Auxiliar.getPosicion(k).getInfo();
        }

        /*JComboBox Combo = new JComboBox(Vector);
        TableColumn Columna_a_cambiar = Tabla_Cocina.getColumnModel().getColumn(1);
        TableCellEditor Editor_celda = new DefaultCellEditor(Combo);
        Columna_a_cambiar.setCellEditor(Editor_celda);
         */
        horaActual = Reloj.lblReloj.getText();//Captura del tiempo actual en el que se ordena el pedido para cocina 

        try {

            if (mesasJList.getSelectedValue() != null) {
                //Aqui se Llena la tabla cocina 
                modelo_pedidos.addRow(new Object[]{mesasJList.getSelectedValue(), false, horaActual});

                reinciarValoresDeLasTablas(modeloTablaPlatoPrincipal);//Lo coloco aqui para que solo se reinicien los valores de las tablas para cuando se cumplan todas las condiciones de realizar un pedido.
                reinciarValoresDeLasTablas(modeloTablaPostres);
                reinciarValoresDeLasTablas(modeloTablaBebidas);
            } else {

                JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }
    }

    void reinciarValoresDeLasTablas(DefaultTableModel modelo) {

        for (int k = 0; k < modelo.getRowCount(); k++) {

            //Aca debo colocar la creacion y llenado de la lista auxiliar, que me servira para poder colocar el JComboBox en la tabla cocina.
            modelo.setValueAt(0, k, 3);
        }
    }

    void agregarFilaATablaResultadoDePedidos() {

        tablaResultados = (DefaultTableModel) resultadoPedidos.getModel();

        tablaResultados.addRow(new Object[]{mesasJList.getSelectedValue(), "0:00", "Preparando"});
        tablaResultados.addRow(new Object[]{mesasJList.getSelectedValue(), "0:00", "Preparando"});
    }

    /**
     * funcion para calcular el tiempo que ha pasado
     *
     * @param inicial timepo en el que se realizo el pedido
     * @param actual tiempo en el que se pidio cambiar el pedido
     * @return
     */
    private boolean calcularDiferenciaDeTiempos(String inicial, String actual) {

        String ini = inicial.substring(0, inicial.length() - 3);
        String fin = actual.substring(0, actual.length() - 3);

        String[] vec0 = ini.split(":");
        String[] vec1 = fin.split(":");

        int inicial1 = Integer.parseInt(vec0[1]) * 60 * 1000 + Integer.parseInt(vec0[2]) * 1000;
        int final2 = Integer.parseInt(vec1[1]) * 60 * 1000 + Integer.parseInt(vec1[2]) * 1000;
        if (final2 - inicial1 <= 10000) {
            return true;
        } else {
            return false;
        }
    }

    void eliminarFilaDeUnaTabla(DefaultTableModel modelo, String datoACompar, int columna) {

        for (int k = 0; k < modelo.getRowCount(); k++) {

            if (modelo.getValueAt(k, columna).equals(datoACompar)) {

                modelo.removeRow(k);
            }
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton cambiarPedido;
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
    private javax.swing.JList<String> mesasJList;
    public static javax.swing.JFrame mostrarFactura;
    public static javax.swing.JTextArea paraMostrarFactura;
    public static javax.swing.JTable resultadoPedidos;
    private javax.swing.JTable tablaBebidas;
    public static javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaPlatoPrincipal;
    private javax.swing.JTable tablaPostre;
    // End of variables declaration//GEN-END:variables

}
