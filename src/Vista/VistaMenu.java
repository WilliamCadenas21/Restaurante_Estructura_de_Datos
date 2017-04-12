package Vista;

import Controlador.Lista;
import Controlador.Pedido;
import Controlador.Restaurante;
import Modelo.Bebida;
import Modelo.ComidaAuxiliar;
import Modelo.Mesero;
import Modelo.PlatoPrincipal;
import Modelo.Postre;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;

public class VistaMenu extends javax.swing.JFrame {

    static int i = 0, j = 0, numeroDeLaMesaACambiarElPedido = 0, precio = 0, cantidad = 0, total = 0, numeroDeLaFilaAElminar = 0;
    static boolean variableBooleanaGlobal = true;
    static Lista listaDePlatosDeUnPedido = new Lista(), listaPedidos = new Lista();
    static String nombreDelPlato = "", factura = "", horaActual = "", horaInicial = "", inicioFactura = "";//Las variables inicioFactura y finFactura me sirven para poder mostrar los datos en el area de texto.
    static Pedido pedido;
    DefaultTableModel modeloTablaPlatoPrincipal, modeloTablaPostres, modeloTablaBebidas, modeloTablaResultadoPedido, modeloTablaFactura, modeloTablaCocina;
    Object[] v = new Object[0];
    Object mesaSeleccionada;

    public VistaMenu() {
        initComponents();
        jLabelUsuario.setText(((Mesero) Controlador.Restaurante.listaDeEmpleados.getPosicion(Mesero.indiceLista).getInfo()).getNombre());
        inicioFactura = "\t\t\t Restaurante La Prosperidad\n"
                + "\t\t\tCalle Viva N° 123\n"
                + Reloj.lblReloj.getText();

        agregarJComboBox(this.tablaPlatoPrincipal);
        agregarJComboBox(this.tablaPostre);
        agregarJComboBox(this.tablaBebidas);

        this.modeloTablaPlatoPrincipal = (DefaultTableModel) this.tablaPlatoPrincipal.getModel();
        this.modeloTablaPostres = (DefaultTableModel) this.tablaPostre.getModel();
        this.modeloTablaBebidas = (DefaultTableModel) this.tablaBebidas.getModel();

        mostrarPlatosEnTablas(modeloTablaPlatoPrincipal, "Plato", Restaurante.listaDePlatos);
        mostrarPlatosEnTablas(modeloTablaPostres, "Postre", Restaurante.listaDePostres);
        mostrarPlatosEnTablas(modeloTablaBebidas, "Bebida", Restaurante.listaDeBebidas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarFactura = new javax.swing.JFrame();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaDeTextoParaMostrarFactura = new javax.swing.JTextArea();
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
        jLabel2 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();

        mostrarFactura.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        areaDeTextoParaMostrarFactura.setEditable(false);
        areaDeTextoParaMostrarFactura.setColumns(20);
        areaDeTextoParaMostrarFactura.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        areaDeTextoParaMostrarFactura.setRows(5);
        jScrollPane4.setViewportView(areaDeTextoParaMostrarFactura);

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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                "Nombre", "Precio", "Carbohidratos", "Cant"
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
        tablaPlatoPrincipal.setRowHeight(20);
        jScrollPane1.setViewportView(tablaPlatoPrincipal);
        if (tablaPlatoPrincipal.getColumnModel().getColumnCount() > 0) {
            tablaPlatoPrincipal.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaPlatoPrincipal.getColumnModel().getColumn(1).setPreferredWidth(50);
            tablaPlatoPrincipal.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaPlatoPrincipal.getColumnModel().getColumn(3).setResizable(false);
            tablaPlatoPrincipal.getColumnModel().getColumn(3).setPreferredWidth(3);
        }

        jTabbedPane2.addTab("Plato_principal", jScrollPane1);

        tablaPostre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio", "Carbohidratos", "Cant"
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
        tablaPostre.setRowHeight(20);
        jScrollPane2.setViewportView(tablaPostre);
        if (tablaPostre.getColumnModel().getColumnCount() > 0) {
            tablaPostre.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaPostre.getColumnModel().getColumn(1).setPreferredWidth(40);
            tablaPostre.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaPostre.getColumnModel().getColumn(3).setResizable(false);
            tablaPostre.getColumnModel().getColumn(3).setPreferredWidth(6);
        }

        jTabbedPane2.addTab("Postre", jScrollPane2);

        tablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Nombre", "Precio", "Carbohidratos", "Cant"
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
        tablaBebidas.setRowHeight(20);
        jScrollPane3.setViewportView(tablaBebidas);
        if (tablaBebidas.getColumnModel().getColumnCount() > 0) {
            tablaBebidas.getColumnModel().getColumn(0).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(0).setPreferredWidth(200);
            tablaBebidas.getColumnModel().getColumn(1).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(1).setPreferredWidth(40);
            tablaBebidas.getColumnModel().getColumn(2).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaBebidas.getColumnModel().getColumn(3).setResizable(false);
            tablaBebidas.getColumnModel().getColumn(3).setPreferredWidth(3);
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
        resultadoPedidos.setRowHeight(20);
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
        tablaFactura.setRowHeight(20);
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

        jLabel2.setText("Mesero:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUsuario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelUsuario))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        validarPedidoRepetido();
    }//GEN-LAST:event_AceptarActionPerformed

    private void tablaFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaFacturaKeyPressed
    }//GEN-LAST:event_tablaFacturaKeyPressed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked

        String mesa = String.valueOf(this.tablaFactura.getValueAt(this.tablaFactura.getSelectedRow(), 0));

        if (evt.getClickCount() == 2) {

            int posicionEnLaLista = this.listaPedidos.getTamaño() - 1;
            this.pedido = (Pedido) this.listaPedidos.getPosicion(posicionEnLaLista).getInfo();
            this.variableBooleanaGlobal = true;

            do {//Este ciclo va de atras para adelante, porque los valores que se le ingresan a la listaPedidos, los nuevos, se agregan al final y al buscar desde el inicio se econtrarán antiguos pedidos.

                this.pedido = (Pedido) this.listaPedidos.getPosicion(posicionEnLaLista).getInfo();
                if (this.pedido.getMesa().equals(mesa)) {
                    mostrarFacturaPedido(0);
                }
                posicionEnLaLista--;
            } while (posicionEnLaLista >= 0 && this.variableBooleanaGlobal);
        }
    }//GEN-LAST:event_tablaFacturaMouseClicked

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed

        modeloTablaFactura = (DefaultTableModel) tablaFactura.getModel();
        modeloTablaResultadoPedido = (DefaultTableModel) resultadoPedidos.getModel();

        this.mostrarFactura.dispose();

        int posicionMesaFactura = this.tablaFactura.getSelectedRow();
        String mesaFactura = String.valueOf(this.modeloTablaFactura.getValueAt(posicionMesaFactura, 0));

        eliminarFilaDeUnaTabla(this.modeloTablaResultadoPedido, mesaFactura, posicionMesaFactura);
        eliminarFilaDeUnaTabla(this.modeloTablaFactura, mesaFactura, this.tablaFactura.getSelectedRow());
    }//GEN-LAST:event_botonPagarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.mostrarFactura.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void cambiarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPedidoActionPerformed
        this.modeloTablaCocina = (DefaultTableModel) vistaCocina.tablaCocina.getModel();

        llenarVectorCambioPedido();
        seleccionDeHoraInicial();
        desicionCambioPedido();
    }//GEN-LAST:event_cambiarPedidoActionPerformed

    private void validarPedidoRepetido() {
        modeloTablaCocina = (DefaultTableModel) vistaCocina.tablaCocina.getModel();
        boolean mesaYaSelecionada = false;
        if (modeloTablaCocina.getRowCount() < 5) {
            for (int k = 0; k < modeloTablaCocina.getRowCount(); k++) {
                if (mesasJList.getSelectedValue() == modeloTablaCocina.getValueAt(k, 0)) {
                    mesaYaSelecionada = true;
                }
            }
            if (mesaYaSelecionada == false) {
                AgregarPedido();
                agregarFilaATablaResultadoDePedidos();
            } else {
                JOptionPane.showMessageDialog(this, "Lo sentimos pero la " + mesasJList.getSelectedValue() + " ya se encuentra con un pedido pendiente");
                reinciarValoresDeLasTablas(this.modeloTablaPlatoPrincipal);//Reinicia los valores para que este listo para una nueva seleccion
                reinciarValoresDeLasTablas(this.modeloTablaPostres);
                reinciarValoresDeLasTablas(this.modeloTablaBebidas);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Lo sentimos pero el mesero solo puede tener 5 mesas pendientes por pedido");
            reinciarValoresDeLasTablas(this.modeloTablaPlatoPrincipal);//Reinicia los valores para que este listo para una nueva seleccion
            reinciarValoresDeLasTablas(this.modeloTablaPostres);
            reinciarValoresDeLasTablas(this.modeloTablaBebidas);
        }

    }

    void mostrarFacturaPedido(int alturaFrame) {

        this.listaDePlatosDeUnPedido = this.pedido.getListaComida();
        ComidaAuxiliar comidaAuxiliar;
        alturaFrame = 180;

        for (int k = 0; k < this.listaDePlatosDeUnPedido.getTamaño(); k++) {

            comidaAuxiliar = (ComidaAuxiliar) this.listaDePlatosDeUnPedido.getPosicion(k).getInfo();
            String nombre = comidaAuxiliar.getNombrePlato();
            int precioUnitario = Integer.parseInt(String.valueOf(comidaAuxiliar.getPrecio()));
            cantidad = Integer.parseInt(String.valueOf(comidaAuxiliar.getCantidad()));
            int totalUnitario = precioUnitario * cantidad;
            this.factura = this.factura + "\n" + cantidad + "  " + nombre + "..........$" + totalUnitario;
            alturaFrame = alturaFrame + 30;
        }

        this.factura = this.factura + "\n\n\t\t\tGracias por su visita\n"
                + "\t\tPara mayor informacion: 3123456789";

        this.areaDeTextoParaMostrarFactura.setText(this.inicioFactura + this.factura);
        this.mostrarFactura.setSize(500, alturaFrame);
        this.mostrarFactura.setVisible(true);//Se abre el frame que muestra la factura. 
        this.variableBooleanaGlobal = false;
        this.factura = "";
    }

    void mostrarPlatosEnTablas(DefaultTableModel modelo, String TipoDeObjeto, Lista lista) {

        tiempo();
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

    void tiempo() {//Me sirve para que la ejecucion entre ciclo y ciclo se frene, para asi poder evitar que el programa se coloque muy lento.
        j = 0;
        i = 0;
        try {
            this.wait(5000);
        } catch (Exception e) {
        }
    }

    void seleccionDeHoraInicial() {
        this.mesaSeleccionada = JOptionPane.showInputDialog(this, "Pedidos:", "Seleccion de mesa", 1, null, v, 3);//Me permite seleccionar la mesaTablaCocina a la cual se le vá a realizar el cambio de visualizarPedido.     

        for (int k = 0; k < this.modeloTablaCocina.getRowCount(); k++) {

            String mesaTablaCocina = String.valueOf(this.modeloTablaCocina.getValueAt(k, 0));
            try {

                if (this.mesaSeleccionada.equals(mesaTablaCocina)) {
                    this.horaInicial = (String) this.modeloTablaCocina.getValueAt(k, 2);
                    this.numeroDeLaFilaAElminar = k;
                }
            } catch (NullPointerException e) {
            }
        }
    }

    /**
     * Esta subrutina llena un vector temporal para mostrarlo e la lista de
     * mesas a cambiar pedido
     */
    void llenarVectorCambioPedido() {
        v = new Object[this.modeloTablaCocina.getRowCount()];

        for (int k = 0; k < this.modeloTablaCocina.getRowCount(); k++) {//Reinicio el vector, para que no se copien los pedidos que ya han sido realizados.
            v[k] = this.modeloTablaCocina.getValueAt(k, 0);
        }
    }

    void desicionCambioPedido() {
        variableBooleanaGlobal = true;
        horaActual = Reloj.lblReloj.getText();//captura la hora en que se decidio cambiar el pedido

        while (numeroDeLaMesaACambiarElPedido < listaPedidos.getTamaño() && variableBooleanaGlobal) {

            pedido = (Pedido) listaPedidos.getPosicion(numeroDeLaMesaACambiarElPedido).getInfo();

            try {

                if (mesaSeleccionada.equals(pedido.getMesa())) {//Busco la mesaTablaCocina  que ha sido seleccionada para realizar el cambio de visualizarPedido de dicha mesaTablaCocina.

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
    }

    void AgregarPlatosAUnPedido(DefaultTableModel modelo, String tipo) {

        try {

            for (int k = 0; k < modelo.getRowCount(); k++) {

                int valor = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3)));

                if (valor > 0) {

                    this.nombreDelPlato = String.valueOf(modelo.getValueAt(k, 0));
                    this.precio = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 1)));
                    this.cantidad = Integer.parseInt(String.valueOf(modelo.getValueAt(k, 3)));

                    this.listaDePlatosDeUnPedido.Agregar(new ComidaAuxiliar(tipo, this.nombreDelPlato, this.precio, this.cantidad));//Primero llenó una lista de objetos con los platos pedidos
                    //Precio total del visualizarPedido, sirve para realizar la factura.
                    //tipo Lista_comida_auxiliar para asi poder llenar la lista de pedidos, que me servira
                    //despues para la creacion de la factura y el cambio de visualizarPedido durante los primeros 5 minutos.    
                    this.total = this.total + this.precio * this.cantidad;
                }
            }
        } catch (Exception e) {
        }
    }

    void AgregarPedido() {

        this.modeloTablaPlatoPrincipal = (DefaultTableModel) this.tablaPlatoPrincipal.getModel();
        this.modeloTablaPostres = (DefaultTableModel) this.tablaPostre.getModel();
        this.modeloTablaBebidas = (DefaultTableModel) this.tablaBebidas.getModel();

        AgregarPlatosAUnPedido(this.modeloTablaPlatoPrincipal, "Plato");
        AgregarPlatosAUnPedido(this.modeloTablaPostres, "Postre");
        AgregarPlatosAUnPedido(this.modeloTablaBebidas, "Bebida");

        listaPedidos.Agregar(new Pedido(this.mesasJList.getSelectedValue(), listaDePlatosDeUnPedido, total));
        listaDePlatosDeUnPedido = new Lista();//Reinicio esta lista, porque de lo contrario me guadaria informacion de los platos antes pedidos.
    }

    void cambiarPedido(String mesa) {

        modeloTablaCocina = (DefaultTableModel) vistaCocina.tablaCocina.getModel();
        modeloTablaResultadoPedido = (DefaultTableModel) resultadoPedidos.getModel();

        eliminarFilaDeUnaTabla(modeloTablaResultadoPedido, mesa, 0);
        eliminarFilaDeUnaTabla(modeloTablaCocina, mesa, 0);
    }

    void llenarTablaDeCocina() {

        this.modeloTablaPlatoPrincipal = (DefaultTableModel) this.tablaPlatoPrincipal.getModel();
        this.modeloTablaPostres = (DefaultTableModel) this.tablaPostre.getModel();
        this.modeloTablaBebidas = (DefaultTableModel) this.tablaBebidas.getModel();
        this.modeloTablaCocina = (DefaultTableModel) vistaCocina.tablaCocina.getModel();

        this.horaActual = Reloj.lblReloj.getText();//Captura del tiempo actual en el que se ordena el visualizarPedido para cocina 

        try {

            if (this.mesasJList.getSelectedValue() != null) {
                //Aqui se Llena la tabla cocina 
                this.modeloTablaCocina.addRow(new Object[]{this.mesasJList.getSelectedValue(), false, this.horaActual});

                reinciarValoresDeLasTablas(this.modeloTablaPlatoPrincipal);//Lo coloco aqui para que solo se reinicien los valores de las tablas para cuando se cumplan todas las condiciones de realizar un visualizarPedido.
                reinciarValoresDeLasTablas(this.modeloTablaPostres);
                reinciarValoresDeLasTablas(this.modeloTablaBebidas);
            } else {

                JOptionPane.showMessageDialog(this, "Por favor indique una mesa a la cual se le asigne un pedido.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(this, "Por favor indique un plato o una bebida para realizar el pedido.");
        }
    }

    void reinciarValoresDeLasTablas(DefaultTableModel modelo) {

        for (int k = 0; k < modelo.getRowCount(); k++) {
            modelo.setValueAt(0, k, 3);
        }
    }

    void agregarFilaATablaResultadoDePedidos() {

        this.modeloTablaResultadoPedido = (DefaultTableModel) this.resultadoPedidos.getModel();
        this.modeloTablaResultadoPedido.addRow(new Object[]{this.mesasJList.getSelectedValue(), "Preparando", "Preparando"});

        llenarTablaDeCocina();
    }

    /**
     * funcion para calcular el tiempo que ha pasado
     *
     * @param inicial timepo en el que se realizo el visualizarPedido
     * @param actual tiempo en el que se pidio cambiar el visualizarPedido
     * @return
     */
    private boolean calcularDiferenciaDeTiempos(String inicial, String actual) {//Funciona para decidir si el visualizarPedido puede ser cambiado o no.

        String ini = inicial.substring(0, inicial.length() - 3);
        String fin = actual.substring(0, actual.length() - 3);

        String[] vec0 = ini.split(":");
        String[] vec1 = fin.split(":");

        int inicial1 = Integer.parseInt(vec0[1]) * 60 * 1000 + Integer.parseInt(vec0[2]) * 1000;
        int final2 = Integer.parseInt(vec1[1]) * 60 * 1000 + Integer.parseInt(vec1[2]) * 1000;
        if (final2 - inicial1 <= 8000) {//aqui se encuetr el tiempo maximo en el que puede ser cambiado el pedido
            return true;
        } else {
            return false;
        }
    }
    /**
     * Sirve para borrar una fila de cualquier tabla 
     * @param modelo aqui se especifica la tabla a la cual se desea borar una fila
     * @param datoACompar se envia el dato que necessitara para saber que fila eliminara 
     * @param columna y se le especifica en que columna estara el dato
     */
    void eliminarFilaDeUnaTabla(DefaultTableModel modelo, String datoACompar, int columna) {

        for (int k = 0; k < modelo.getRowCount(); k++) {

            if (modelo.getValueAt(k, columna).equals(datoACompar)) {

                modelo.removeRow(k);
            }
        }
    }

    final void agregarJComboBox(JTable tabla) {

        String[] cantidad = new String[20];

        for (int k = 0; k < 20; k++) {
            cantidad[k] = String.valueOf(k);
        }

        JComboBox jcb = new JComboBox(cantidad);
        TableColumn tc = tabla.getColumnModel().getColumn(3);
        TableCellEditor e = new DefaultCellEditor(jcb);
        tc.setCellEditor(e);
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
    public static javax.swing.JTextArea areaDeTextoParaMostrarFactura;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton cambiarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelUsuario;
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
    public static javax.swing.JTable resultadoPedidos;
    private javax.swing.JTable tablaBebidas;
    public static javax.swing.JTable tablaFactura;
    private javax.swing.JTable tablaPlatoPrincipal;
    private javax.swing.JTable tablaPostre;
    // End of variables declaration//GEN-END:variables
}
