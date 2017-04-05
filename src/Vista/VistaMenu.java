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

    int i = 0, j = 0, numeroDeLaMesaACambiarElPedido = 0, precio = 0, cantidad = 0, total = 0;

    boolean variableBooleanaGlobal = true;

    Lista listaComidaAuxiliar = new Lista(), listaPedidos = new Lista();

    Object[] v = new Object[0];

    String nombreDelPlato = "", factura = "", inicioFactura = "", finFactura = "";//Las variables inicioFactura y finFactura me sirven para poder mostrar los datos en el area de texto.

    Pedido pedido;

    public VistaMenu() {
        initComponents();

        setLocationRelativeTo(null);

        mostrarFactura.setSize(500, 700);//Establesco el tamaño del frame emergente.

        ///////////////////Comienzo a agregar los datos estaticos en el area de texto que muestra la factura ////////////////////////////////////
        inicioFactura = "\t\t\t Restaurante La Prosperidad\n"
                + "\t\t\t\tCalle Viva N° 123\n"
                + Reloj.lblReloj.getText();

        finFactura = "\n\n\t\t\tGracias por su visita\n"
                + "\t\tPara mayor informacion: 3123456789";
        /////////////////////////////////////////////

        DefaultTableModel modelo_tabla_plato_principal = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modelo_tabla_postres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modelo_tabla_bebidas = (DefaultTableModel) tablaBebidas.getModel();

        while (i < Controlador.Restaurante.Lista_de_Platos.getTamaño()) {

            Plato_principal p = (Plato_principal) Controlador.Restaurante.Lista_de_Platos.getPosicion(i).getInfo();
            modelo_tabla_plato_principal.addRow(new Object[]{p.getNombre(), p.getprecio(), p.getCarboidratos(), 0});
            i++;
        }

        Tiempo();

        while (i < Controlador.Restaurante.Lista_de_Postres.getTamaño()) {

            Postre p = (Postre) Controlador.Restaurante.Lista_de_Postres.getPosicion(i).getInfo();
            modelo_tabla_postres.addRow(new Object[]{p.getNombre(), p.getPrecio(), p.getCarboidratos(), 0});

            i++;
        }

        Tiempo();

        while (i < Controlador.Restaurante.Lista_de_Bebidas.getTamaño()) {

            Bebidas b = (Bebidas) Controlador.Restaurante.Lista_de_Bebidas.getPosicion(i).getInfo();
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
        Cambiar_pedido = new javax.swing.JButton();
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
                "Mesa", "Duracion", "Resultado"
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

        DefaultTableModel tablaResultados = (DefaultTableModel) resultadoPedidos.getModel();

        tablaResultados.addRow(new Object[]{mesasJList.getSelectedValue(), "0:00", "Esperando cambio"});

        Llenar_tabla_de_resultado_de_pedidos();

        Llenar_tabla_de_cocina();
    }//GEN-LAST:event_AceptarActionPerformed

    private void tablaFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaFacturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaFacturaKeyPressed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked

        String mesa = String.valueOf(tablaFactura.getValueAt(tablaFactura.getSelectedRow(), 0));

        if (evt.getClickCount() == 2) {

            int posicionEnLaLista = listaPedidos.getTamaño() - 1;

            System.out.println("Tamaño: " + listaPedidos.getTamaño());

            pedido = (Pedido) listaPedidos.getPosicion(posicionEnLaLista).getInfo();

            variableBooleanaGlobal = true;

            do {

                pedido = (Pedido) listaPedidos.getPosicion(posicionEnLaLista).getInfo();

                if (pedido.getMesa().equals(mesa)) {

                    listaComidaAuxiliar = pedido.getListaComida();

                    ComidaAuxiliar comidaAuxiliar = (ComidaAuxiliar) listaComidaAuxiliar.getPosicion(0).getInfo();

                    for (int k = 0; k < listaComidaAuxiliar.getTamaño(); k++) {

                        comidaAuxiliar = (ComidaAuxiliar) listaComidaAuxiliar.getPosicion(k).getInfo();
                        factura = factura + "\n" + comidaAuxiliar.getCantidad() + "  " + comidaAuxiliar.getNombrePlato() + "..........$" + comidaAuxiliar.getPrecio();
                    }

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

        modeloTablaFactura.removeRow(tablaFactura.getSelectedRow());

        mostrarFactura.dispose();
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        mostrarFactura.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    void prueba(DefaultTableModel modelo, String tipo) {

        for (int k = 0; k < modelo.getRowCount(); k++) {

            if (Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3))) > 0) {

                nombreDelPlato = String.valueOf(modelo.getValueAt(k, 0));
                precio = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 1)));
                cantidad = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3)));

                listaComidaAuxiliar.agregar(new ComidaAuxiliar(tipo, nombreDelPlato, precio, cantidad));//Primero llenó una lista de objetos con los platos pedidos
                total = total + Integer.parseInt(String.valueOf(modelo.getValueAt(k, 1)));//Precio total del pedido, sirve para realizar la factura                                                                                                        //tipo Lista_comida_auxiliar para asi poder llenar la lista de pedidos, que me servira
            }                                                                                                                                                                                                    //despues para la creacion de la factura y el cambio de pedido durante los primeros 5 minutos

        }
    }

    void AgregarPedido() {

        DefaultTableModel modeloPlatos = (DefaultTableModel) tablaPlatoPrincipal.getModel();
        DefaultTableModel modeloTablaPostres = (DefaultTableModel) tablaPostre.getModel();
        DefaultTableModel modeloTablaBebidas = (DefaultTableModel) tablaBebidas.getModel();

        prueba(modeloPlatos, "Plato");
        prueba(modeloTablaPostres, "Postre");
        prueba(modeloTablaBebidas, "Bebida");

        listaPedidos.agregar(new Pedido(mesasJList.getSelectedValue(), listaComidaAuxiliar, total));
        listaComidaAuxiliar = new Lista();//Reinicio esta lista, porque de lo contrario me guadaria informacion de los platos antes pedidos.
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
        System.out.println("Entro a cambiar el pedido");
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
            Vector[k] = Lista_Auxiliar.getPosicion(k).getInfo();
        }

        JComboBox Combo = new JComboBox(Vector);
        TableColumn Columna_a_cambiar = Tabla_Cocina.getColumnModel().getColumn(1);
        TableCellEditor Editor_celda = new DefaultCellEditor(Combo);
        Columna_a_cambiar.setCellEditor(Editor_celda);
         */
        String hora = Reloj.lblReloj.getText();//Captura del tiempo actual en el que se ordena el pedido para cocina 

        try {

            System.out.println("V: " + mesasJList.getSelectedValue());

            if (!(mesasJList.getSelectedValue() == null)) {
                //Aqui se Llena la tabla cocina 
                modelo_pedidos.addRow(new Object[]{mesasJList.getSelectedValue(), false, hora});
            } else {

                JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }

    }

    private void Llenar_tabla_de_resultado_de_pedidos() {

        DefaultTableModel tabla_resultados = (DefaultTableModel) resultadoPedidos.getModel();

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
    public boolean calcularDiferenciaDeTiempos(String inicial, String actual) {

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
        if (Math.abs(final2 - inicial1) <= 8000) {
            return true;
        } else {
            return false;
        }
    }

    public static String calcularDiferenciaDeTiempos2(String inicial, String actual) {

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
        String res = String.valueOf(Math.abs(final2 - inicial1));
        float Resultado = Integer.parseInt(res)/1000;
        if (Resultado < 59) {
            return Resultado+" segundos";
        }else{
            Resultado = Resultado/60;
            return Resultado+" minutos";
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cambiar_pedido;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonPagar;
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
