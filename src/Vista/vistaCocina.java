package Vista;

import Controlador.Lista;
import Controlador.Pedido;
import Modelo.ComidaAuxiliar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vistaCocina extends javax.swing.JFrame {

    /*
    La tabla de pedidos dependera de lo que se realize en Menu
     */
    String visualizarPedido = "";
    Lista listaResultadoDePedidosCocina = new Lista();
    int alturaFrameMostrarPedido = 0;
    private Lista listaDePlatosDeUnPedido;
    private Pedido pedido;
    private boolean variableBooleanaGlobal;

    public vistaCocina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCocina = new javax.swing.JTable();
        Aceptar = new javax.swing.JButton();

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
        tablaCocina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCocinaMouseClicked(evt);
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

    private void tablaCocinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCocinaMouseClicked
        if (evt.getClickCount() == 2) {
            mostrarPedido();
        }
    }//GEN-LAST:event_tablaCocinaMouseClicked

    void mostrarPedido() {//Busca la mesa seleccionada, me permite mostrar el pedido de una mesa.Solo muestra, no representa incoveniente alguno.

        String mesa = String.valueOf(this.tablaCocina.getValueAt(this.tablaCocina.getSelectedRow(), 0));//Nombre de la mesa de la fila seleccionada

        int posicionEnLaLista = VistaMenu.listaPedidos.getTamaño() - 1;
        this.pedido = (Pedido) VistaMenu.listaPedidos.getPosicion(posicionEnLaLista).getInfo();
        this.variableBooleanaGlobal = true;

        do {//Este ciclo va de atras para adelante, porque los valores que se le ingresan a la listaPedidos, los nuevos, se agregan al final y al buscar desde el inicio se econtrarán antiguos pedidos.

            this.pedido = (Pedido) VistaMenu.listaPedidos.getPosicion(posicionEnLaLista).getInfo();
            if (this.pedido.getMesa().equals(mesa)) {

                resultadoBusqueda();
                this.variableBooleanaGlobal = false;
            }

            posicionEnLaLista--;
        } while (posicionEnLaLista >= 0 && this.variableBooleanaGlobal);
    }

    void resultadoBusqueda() {//Una vez a encontrado la mesa comienza la concatenacion de lo que se mostrará. Funciona de la mano con mostrarPedido.

        this.listaDePlatosDeUnPedido = this.pedido.getListaComida();
        ComidaAuxiliar comidaAuxiliar;

        for (int k = 0; k < this.listaDePlatosDeUnPedido.getTamaño(); k++) {

            comidaAuxiliar = (ComidaAuxiliar) this.listaDePlatosDeUnPedido.getPosicion(k).getInfo();
            String nombre = comidaAuxiliar.getNombrePlato();
            int cantidad = Integer.parseInt(String.valueOf(comidaAuxiliar.getCantidad()));
            this.visualizarPedido = this.visualizarPedido + "\n" + cantidad + "....................." + nombre;
            System.out.println(this.visualizarPedido + "\n");
        }

        JOptionPane.showMessageDialog(this, "Pedido: \n" + this.visualizarPedido, this.pedido.getMesa(), JOptionPane.INFORMATION_MESSAGE);
        this.visualizarPedido = "";//Reiniciar para que no se concatenen los datos anteriores.
    }

    void Factura() {//Me permite llenar la tabla factura que se encuentra en mesero para poder mostrarla.
        DefaultTableModel tablaFactura = (DefaultTableModel) VistaMenu.tablaFactura.getModel();

        for (int i = 0; i < this.listaResultadoDePedidosCocina.getTamaño(); i++) {
            tablaFactura.addRow(new Object[]{this.listaResultadoDePedidosCocina.getPosicion(i).getInfo()});//Esto me funciona para poder mostrar el nombre de la mesa a la cual ya se le ha terminado de preparar el visualizarPedido, para que asi la factura se genere mostrandose cuando el usuario necesite.
        }
    }

    void resultadoDePedidos() {

        DefaultTableModel tablaResultadoPedidoCocina = (DefaultTableModel) tablaCocina.getModel();
        Lista numeroFilaHaEliminar = new Lista();//Guarda las posiciones en la tabla de las filas ha eliminar
        this.listaResultadoDePedidosCocina = new Lista();//Borra toda la informacion de la lista, para que asi no me guarde informacion correspodiente de los procesos anteriores.
        for (int i = 0; i < tablaResultadoPedidoCocina.getRowCount(); i++) {

            if (tablaResultadoPedidoCocina.getValueAt(i, 1).toString().equals("true")) {

                this.listaResultadoDePedidosCocina.Agregar(tablaResultadoPedidoCocina.getValueAt(i, 0));//Guarda el nombre de la mesa que se ha seleccionado para poder cambiar el valor el resultadoPedido.
                numeroFilaHaEliminar.Agregar(i);
            }
        }
            Object desicion = JOptionPane.showConfirmDialog(this, "Esta seguro(a)?");
            System.out.println(desicion);
            if (desicion.toString().equals("0")) {
                filasHaEliminar(numeroFilaHaEliminar, 0, tablaResultadoPedidoCocina);
            }
        cambiarResultadoPedido();
    }

    void filasHaEliminar(Lista filasHaEliminar, int i, DefaultTableModel modelo) {
        if (i < filasHaEliminar.getTamaño()) {
            
            String numeroFila = String.valueOf(filasHaEliminar.getPosicion(i).getInfo());
            modelo.removeRow(Integer.parseInt(numeroFila));
            for (int j = 0; j < filasHaEliminar.getTamaño(); j++) {
                int r = Integer.parseInt(String.valueOf(filasHaEliminar.getPosicion(j).getInfo()));
                filasHaEliminar.getPosicion(j).CambiarInfo(r-1);
            }
            filasHaEliminar(filasHaEliminar, i + 1, modelo);
        }

    }

    void cambiarResultadoPedido() {

        DefaultTableModel tablaResultadoPedidos = (DefaultTableModel) VistaMenu.resultadoPedidos.getModel();
        for (int i = 0; i < this.listaResultadoDePedidosCocina.getTamaño(); i++) {

            String mesaTablaCocina = String.valueOf(this.listaResultadoDePedidosCocina.getPosicion(i).getInfo());
            for (int j = 0; j < tablaResultadoPedidos.getRowCount(); j++) {

                String mesaTablaResultadoPedido = tablaResultadoPedidos.getValueAt(j, 0).toString();//Obtengo la posicion y la informacion, para luego convertirla a String y poder compararla despues
                
                if (mesaTablaCocina.equals(mesaTablaResultadoPedido)) {//Para encontrar la mesa que se ha seleccionado en cocina y poder cambiarle el valor de "Preparando" a "Listo"                                                                                             
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
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaCocina;
    // End of variables declaration//GEN-END:variables
}
