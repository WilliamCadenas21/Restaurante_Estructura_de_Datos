package Vista;

import Controlador.*;
import Modelo.ComidaAuxiliar;
import static Vista.VistaMenu.listaDePlatosDeUnPedido;
import static Vista.VistaMenu.listaPedidos;
import static Vista.VistaMenu.pedido;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InfoDeMesas extends javax.swing.JFrame {

    public InfoDeMesas() {
        initComponents();
        for (int i = 1; i <= 20; i++) {
            jComboBoxMesas.addItem("Mesa " + i);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfoMesas = new javax.swing.JTable();
        jComboBoxMesas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 255));

        jTableInfoMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Ver", "Mesero", "Hora del pedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableInfoMesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInfoMesasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInfoMesas);
        if (jTableInfoMesas.getColumnModel().getColumnCount() > 0) {
            jTableInfoMesas.getColumnModel().getColumn(0).setResizable(false);
            jTableInfoMesas.getColumnModel().getColumn(1).setResizable(false);
            jTableInfoMesas.getColumnModel().getColumn(2).setResizable(false);
            jTableInfoMesas.getColumnModel().getColumn(3).setResizable(false);
        }

        jTabbedPane1.addTab("Pedidos del día", jScrollPane1);

        jComboBoxMesas.setFocusable(false);

        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Total facturado por la mesa:");

        jLabelTotal.setForeground(new java.awt.Color(0, 102, 0));
        jLabelTotal.setText("$");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Buscar informacion de una mesa");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/linea_23(0)_24.png"))); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/FontAwesome_f057(0)_48.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelTotal))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jTableInfoMesas.getModel();
        int contador = 1, total = 0;

        int fila = modelo.getRowCount();
        //elimina lo que se encontraba anteriormente en la tabla
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
        
        //procede a buscar los pedidos realizados en la mesa especificada por el usuario:
        String str = String.valueOf(jComboBoxMesas.getSelectedItem());
        
        boolean observador = false;
        for (int i = 0; i < listaPedidos.getTamaño(); i++) {
            Pedido pedido = (Pedido) listaPedidos.getPosicion(i).getInfo();
            if (pedido.getMesa().equals(str)) {
                modelo.addRow(new Object[]{contador, "Lista de platos", pedido.getMesero(), pedido.getHoraPedido()});
                System.out.println("Valor del pedido" + contador + ":" + pedido.getPrecio());
                total = total + pedido.getPrecio();
                contador++;
                observador = true;
            }
        }
        if (!observador) {
            JOptionPane.showMessageDialog(this, "La mesa seleccionada se encuentra sin ventas hasta el momento");
        }
        
        jLabelTotal.setText(total + "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableInfoMesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInfoMesasMouseClicked
        if (evt.getClickCount() == 2) {
            mostrarPedido();
        }
    }//GEN-LAST:event_jTableInfoMesasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mostrarPedido() {
        String mesa = String.valueOf(jComboBoxMesas.getSelectedItem());//Nombre de la mesa de la fila seleccionada
        String hora = String.valueOf(jTableInfoMesas.getValueAt(jTableInfoMesas.getSelectedRow(), 3));
        
        boolean observador = true;
        int posicionEnLaLista = VistaMenu.listaPedidos.getTamaño() - 1;
        pedido = (Pedido) VistaMenu.listaPedidos.getPosicion(posicionEnLaLista).getInfo();

        do {//Este ciclo va de atras para adelante, porque los valores que se le ingresan a la listaPedidos, los nuevos, se agregan al final y al buscar desde el inicio se econtrarán antiguos pedidos.

            pedido = (Pedido) VistaMenu.listaPedidos.getPosicion(posicionEnLaLista).getInfo();
            if (pedido.getMesa().equals(mesa) && pedido.getHoraPedido().equals(hora)) {

                resultadoBusqueda();
                observador = false;
            }

            posicionEnLaLista--;
        } while (posicionEnLaLista >= 0 && observador);
    }

    private void resultadoBusqueda() {
        listaDePlatosDeUnPedido = pedido.getListaComida();
        ComidaAuxiliar comidaAuxiliar;
        String visualizarPedido="";
        for (int k = 0; k < listaDePlatosDeUnPedido.getTamaño(); k++) {

            comidaAuxiliar = (ComidaAuxiliar) listaDePlatosDeUnPedido.getPosicion(k).getInfo();
            String nombre = comidaAuxiliar.getNombrePlato();
            int cantidad = Integer.parseInt(String.valueOf(comidaAuxiliar.getCantidad()));
            visualizarPedido = visualizarPedido + "\n" + cantidad + "....................." + nombre;
            System.out.println(visualizarPedido + "\n");
        }

        JOptionPane.showMessageDialog(this, "Pedido: \n" + visualizarPedido, pedido.getMesa(), JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfoDeMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoDeMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoDeMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoDeMesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoDeMesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxMesas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableInfoMesas;
    // End of variables declaration//GEN-END:variables
}
