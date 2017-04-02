package Vista;

import Controlador.Primer_Ingreso;
import Modelo.Mesero;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Vista.Loging_de_Meseros;
import java.util.List;
import Controlador.Lista;

public class Vista_Agregar_Empleados extends javax.swing.JFrame {

    public static Lista Lista_De_Objetos_Tipo_Mesero = new Lista();//Lista de objetos de tipo mesero  
    public static Lista Lista_De_Objetos_Tipo_Cocineros = new Lista(); //Lista de objetos de tipo cocina.

    public static File Archivo_Meseros = new File("C:\\Users\\Jesus Mercado\\Documents\\NetBeansProjects\\Laboratorio_1\\Mesero.txt");
    public static File Archivo_Cocinero = new File("Cocinero.p");

    Icon Icono_foto;

    JTextField[] Vector_Mesas = new JTextField[5];

    int i = 0;

    Primer_Ingreso primer_ingreso = new Primer_Ingreso();

    /*
    
     Estructura Archivo_empleados
    
     Name    |   Age   |   Phone   |   Address   |   Employ   |   Password    |
    
     */
    public Vista_Agregar_Empleados() {
        initComponents();

        Vector_Mesas[0] = Mesa1_Text;
        Vector_Mesas[1] = Mesa2_Text;
        Vector_Mesas[2] = Mesa3_Text;
        Vector_Mesas[3] = Mesa4_Text;
        Vector_Mesas[4] = Mesa5_Text;
        for (int j = 0; j < Vector_Mesas.length; j++) {

            Vector_Mesas[j].setEditable(false);
        }

        Password_Text.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name_Text3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Imagen = new javax.swing.JFrame();
        Imagen_Selector = new javax.swing.JFileChooser();
        Photo = new javax.swing.JLabel();
        Add_Picture_Button = new javax.swing.JButton();
        Name_Text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Phone_Text = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Address_Text = new javax.swing.JTextField();
        Boton_Agregar_Empleado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Age_Spinner = new javax.swing.JSpinner();
        Password_Text = new javax.swing.JPasswordField();
        Mesa1_Text = new javax.swing.JTextField();
        Mesa2_Text = new javax.swing.JTextField();
        Mesa5_Text = new javax.swing.JTextField();
        Mesa4_Text = new javax.swing.JTextField();
        Mesa3_Text = new javax.swing.JTextField();
        Mesas_Combobox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("Nombre:");

        Imagen_Selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imagen_SelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ImagenLayout = new javax.swing.GroupLayout(Imagen.getContentPane());
        Imagen.getContentPane().setLayout(ImagenLayout);
        ImagenLayout.setHorizontalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagen_Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ImagenLayout.setVerticalGroup(
            ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImagenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Imagen_Selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Photo.setBackground(new java.awt.Color(153, 153, 153));
        Photo.setOpaque(true);

        Add_Picture_Button.setText("Agregar foto");
        Add_Picture_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Picture_ButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("Direccion:");

        Boton_Agregar_Empleado.setText("Aceptar");
        Boton_Agregar_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Agregar_EmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Contraseña:");

        jLabel6.setText("Edad:");

        Password_Text.setText("jPasswordField1");

        Mesas_Combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15", "Mesa 16", "Mesa 17", "Mesa 18", "Mesa 19", "Mesa 20" }));
        Mesas_Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mesas_ComboboxActionPerformed(evt);
            }
        });

        jLabel8.setText("Mesas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(Add_Picture_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Boton_Agregar_Empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(Password_Text)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Mesa1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Mesa2_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Mesa3_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Mesa4_Text)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Mesa5_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Mesas_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Age_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(Address_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(Phone_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(Name_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Mesa1_Text, Mesa2_Text, Mesa3_Text, Mesa4_Text, Mesa5_Text});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_Picture_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Phone_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Age_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mesas_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mesa1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa2_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa3_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa4_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa5_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(Boton_Agregar_Empleado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Imagen_SelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imagen_SelectorActionPerformed

    }//GEN-LAST:event_Imagen_SelectorActionPerformed

    private void Add_Picture_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Picture_ButtonActionPerformed

        Imagen.setVisible(true);

        Imagen_Selector.setApproveButtonText("Agregar foto");

        Imagen_Selector.setMultiSelectionEnabled(false);

        Imagen_Selector.showOpenDialog(null);

        String URL = Imagen_Selector.getSelectedFile().getPath();

        Icono_foto = new ImageIcon(URL);

        Photo.setIcon(Icono_foto);

    }//GEN-LAST:event_Add_Picture_ButtonActionPerformed

    private void Boton_Agregar_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Agregar_EmpleadoActionPerformed

        try {
            if (new BufferedReader(new FileReader(new File("C:\\Users\\Jesus Mercado\\Documents\\NetBeansProjects\\Laboratorio_1\\Mesero.txt"))).readLine() != null) {
                
                 Loging_de_Meseros login = new Loging_de_Meseros();
                 login.setVisible(true);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        Controlador.Restaurante.Lista_de_Empleados.Agregar(new Modelo.Mesero(Name_Text.getText(), Integer.parseInt(String.valueOf(Age_Spinner.getValue())), Phone_Text.getText(), Address_Text.getText(), String.valueOf(Password_Text.getPassword())));

        try { 

            FileWriter Escritor = new FileWriter(Archivo_Meseros, true);
            BufferedWriter Escritor_S = new BufferedWriter(Escritor);
/*
            int i = 0;
 
            do {//Aqui escribo en en archivo de empleados los meseros que se agregen 

                System.out.println("Respondiendo");

                Mesero m = (Mesero) Vista.Loging_de_Meseros.Lista_De_Registros_De_Meseros.getPosicion(i).ObtenerInfo();
                
                Escritor_S.write(m.getNombre());
                Escritor_S.write(m.getEdad());
                Escritor_S.write(m.getTelefono());
                Escritor_S.write(m.getDireccion());
                Escritor_S.write(m.getContraseña());
                
                Escritor_S.newLine();

                i++;

            } while (i < Vista.Loging_de_Meseros.Lista_De_Registros_De_Meseros.getTamaño());*/

            Escritor_S.write(Name_Text.getText() + "|");
            Escritor_S.write(String.valueOf(Age_Spinner.getValue()) + "|");
            Escritor_S.write(Phone_Text.getText() + "|");
            Escritor_S.write(Address_Text.getText() + "|");
            Escritor_S.write(Password_Text.getText() + "|");

            Escritor_S.newLine();

            Escritor_S.flush();

        } catch (Exception e) {

            e.printStackTrace();

        }

        Name_Text.setText("");
        Phone_Text.setText("");
        Address_Text.setText("");
        Password_Text.setText("");
        Age_Spinner.setValue(0);
        
        try {
            new BufferedWriter(new FileWriter(new File("C:\\Users\\Jesus Mercado\\Documents\\NetBeansProjects\\Laboratorio_1\\Primer_ingreso.txt"), true)).write("Ya existen tres platos");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_Boton_Agregar_EmpleadoActionPerformed

    private void Mesas_ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mesas_ComboboxActionPerformed

        try {

            Vector_Mesas[i].setText(String.valueOf(Mesas_Combobox.getSelectedItem()));
            Vector_Mesas[i].setEditable(false);
            Vector_Mesas[i].setEnabled(true);

            i++;

        } catch (ArrayIndexOutOfBoundsException e) {

            for (int j = 0; j < 5; j++) {

                Vector_Mesas[0].setText((String) Mesas_Combobox.getSelectedItem());
                Vector_Mesas[j].setText("");
            }

            i = 0;

        }

    }//GEN-LAST:event_Mesas_ComboboxActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Agregar_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Picture_Button;
    private javax.swing.JTextField Address_Text;
    private javax.swing.JSpinner Age_Spinner;
    private javax.swing.JButton Boton_Agregar_Empleado;
    private javax.swing.JFrame Imagen;
    private javax.swing.JFileChooser Imagen_Selector;
    private javax.swing.JTextField Mesa1_Text;
    private javax.swing.JTextField Mesa2_Text;
    private javax.swing.JTextField Mesa3_Text;
    private javax.swing.JTextField Mesa4_Text;
    private javax.swing.JTextField Mesa5_Text;
    private javax.swing.JComboBox Mesas_Combobox;
    private javax.swing.JTextField Name_Text;
    private javax.swing.JTextField Name_Text3;
    private javax.swing.JPasswordField Password_Text;
    private javax.swing.JTextField Phone_Text;
    private javax.swing.JLabel Photo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
