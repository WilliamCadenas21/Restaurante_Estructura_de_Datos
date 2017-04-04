package Vista;

import Modelo.Postre;
import Modelo.Bebidas;
import Modelo.Plato_principal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import Controlador.Lista;
import Controlador.Restaurante;

public class Vista_Agregar_Comida extends javax.swing.JFrame {

    File Comida = new File("Comida.p");  
    
    public Vista_Agregar_Comida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        Food_Price1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Add_Imagen_Button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Food_Text_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Food_Text_Price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Food_Text_Fat = new javax.swing.JTextField();
        Acept_Button = new javax.swing.JButton();
        Food_Type_Combobox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Timer_minutos = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        Timer_segundos = new javax.swing.JSpinner();

        jLabel4.setText("Precio:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setOpaque(true);

        Add_Imagen_Button.setText("Agregar foto");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        jLabel5.setText("Carbohidratos:");

        Acept_Button.setText("Aceptar");
        Acept_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acept_ButtonActionPerformed(evt);
            }
        });

        Food_Type_Combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plato principal", "Postre", "Bebida" }));

        jLabel6.setText("Tipo de comida:");

        jLabel7.setText("Minutos:");

        jLabel8.setText("Segundos: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Food_Text_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Food_Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Food_Text_Fat, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Food_Type_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(Timer_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(Timer_segundos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(Add_Imagen_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Acept_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_Imagen_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Food_Text_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Food_Text_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Food_Text_Fat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Timer_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Timer_segundos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Food_Type_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Acept_Button)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Acept_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acept_ButtonActionPerformed
        
        switch(Food_Type_Combobox.getSelectedIndex()){
        
            case 1:

                Controlador.Restaurante.Lista_de_Platos.Agregar(new Plato_principal(Food_Text_Name.getText(), Integer.parseInt(Food_Text_Price.getText()), Integer.parseInt(Food_Text_Fat.getText())));
                
                break;
                
            case 2:
                
                Controlador.Restaurante.Lista_de_Postres.Agregar(new Postre(Food_Text_Name.getText(), Integer.parseInt(Food_Text_Price.getText()), Integer.parseInt(Food_Text_Fat.getText()), (String.valueOf(Timer_minutos) + ":" + String.valueOf(Timer_segundos) )));
                
                break;
        
            case 3:
                
                Controlador.Restaurante.Lista_de_Bebidas.Agregar(new Bebidas(Food_Text_Name.getText(), Integer.parseInt(Food_Text_Price.getText()), Integer.parseInt(Food_Text_Fat.getText())));
                
                break;
        }
        
        try{
        
            FileWriter Escritor = new FileWriter(Comida, true);
            BufferedWriter Escritor_X = new BufferedWriter(Escritor);
            
            Modelo.Plato_principal p = (Modelo.Plato_principal) Controlador.Restaurante.Lista_de_Platos.getPosicion(Controlador.Restaurante.Lista_de_Platos.getTamaño()).getInfo();
            
            Escritor_X.write(p.getNombre());
            Escritor_X.write(String.valueOf(p.getprecio()));
            Escritor_X.write(String.valueOf(p.getCarboidratos()));            
            
            this.wait(500);
            
                Postre po = (Postre) Controlador.Restaurante.Lista_de_Postres.getPosicion(Controlador.Restaurante.Lista_de_Postres.getTamaño()).getInfo();
                
                Escritor_X.write(po.getNombre() + "|");
                Escritor_X.write(String.valueOf(po.getPrecio()) + "|");
                Escritor_X.write(String.valueOf(po.getCarboidratos()) + "|");      
                Escritor_X.write("Postre" + "|");
          
            this.wait(500);
   
                Modelo.Bebidas b = (Modelo.Bebidas) Controlador.Restaurante.Lista_de_Bebidas.getPosicion(Controlador.Restaurante.Lista_de_Bebidas.getTamaño()).getInfo();
                
                Escritor_X.write(b.getNombre() + "|");
                Escritor_X.write(String.valueOf(b.getprecio()) + "|");
                Escritor_X.write(String.valueOf(b.getCarboidratos()) + "|");  
                Escritor_X.write("Bebidas" + "|");

            this.wait(500);
            
            Escritor_X.write(Food_Text_Name.getText()); 
            Escritor_X.write(Food_Text_Price.getText()); 
            Escritor_X.write(Food_Text_Fat.getText()); 
            Escritor_X.write((String) Food_Type_Combobox.getSelectedItem()); 
            
        }catch(Exception e){
         e.printStackTrace();
        }
        
        try {
            new BufferedWriter(new FileWriter(new File("C:\\Users\\Jesus Mercado\\Documents\\NetBeansProjects\\Laboratorio_1\\Primer_ingreso.txt"), true)).write("Ya ingreso un mesero");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_Acept_ButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Agregar_Comida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acept_Button;
    private javax.swing.JButton Add_Imagen_Button;
    private javax.swing.JTextField Food_Price1;
    private javax.swing.JTextField Food_Text_Fat;
    private javax.swing.JTextField Food_Text_Name;
    private javax.swing.JTextField Food_Text_Price;
    private javax.swing.JComboBox Food_Type_Combobox;
    private javax.swing.JSpinner Timer_minutos;
    private javax.swing.JSpinner Timer_segundos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
