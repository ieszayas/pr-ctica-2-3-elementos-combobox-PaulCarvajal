/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistacontrolador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DAM2_03
 */
public class Combobox extends javax.swing.JFrame {

    private static ArrayList<String> modulos_DAM1 = new ArrayList();
    private static ArrayList<String> modulos_DAM2 = new ArrayList();

    public Combobox() {
        initComponents();
        //modulos harcodeados para agregarlos directamente

        modulos_DAM2.add("Programacion de Servicios y Procesos");
        modulos_DAM2.add("Sistemas de Gestion Empresarial");
        modulos_DAM2.add("Desarrollo de Interfaces");
        modulos_DAM2.add("Programacion Multimedia");
        modulos_DAM2.add("Acceso a Datos");
        modulos_DAM2.add("Ingles");
        modulos_DAM2.add("Empresas");

        Curso_Combobox.addItem("DAM1");
        Curso_Combobox.addItem("DAM2");

        modulos_DAM1.add("Programacion");
        modulos_DAM1.add("Sistemas Informaticos");
        modulos_DAM1.add("FOL");
        modulos_DAM1.add("Lenguaje de Marcas");
        modulos_DAM1.add("Bases de Datos");
        modulos_DAM1.add("Entornos de Desarrollo");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_Modulos = new javax.swing.JLabel();
        Añadir_Boton = new javax.swing.JButton();
        Campo_modulos = new javax.swing.JTextField();
        Modulos_Combobox = new javax.swing.JComboBox<>();
        Agregar_Modulos = new javax.swing.JButton();
        Borrar_Modulos = new javax.swing.JButton();
        Curso_Combobox = new javax.swing.JComboBox<>();
        Borrar_uno_boton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Combobox_Modulos");

        Texto_Modulos.setText("Introduzca el nombre de los módulos y el curso que estas matriculado:");

        Añadir_Boton.setText("Añadir");
        Añadir_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Añadir_BotonActionPerformed(evt);
            }
        });

        Campo_modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_modulosActionPerformed(evt);
            }
        });

        Modulos_Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modulos_ComboboxActionPerformed(evt);
            }
        });

        Agregar_Modulos.setText("Agregar Todo");
        Agregar_Modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_ModulosActionPerformed(evt);
            }
        });

        Borrar_Modulos.setText("Borrar Todo");
        Borrar_Modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_ModulosActionPerformed(evt);
            }
        });

        Curso_Combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Curso_ComboboxActionPerformed(evt);
            }
        });

        Borrar_uno_boton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Paul\\Documents\\GitHub\\pr-ctica-2-3-elementos-combobox-PaulCarvajal\\SOL\\practica2_3\\src\\vistacontrolador\\trash.png")); // NOI18N
        Borrar_uno_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_uno_botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Añadir_Boton)
                            .addComponent(Campo_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Curso_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Modulos_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Agregar_Modulos)
                            .addComponent(Borrar_Modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Borrar_uno_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(Texto_Modulos)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Curso_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Campo_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Añadir_Boton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Modulos_Combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Borrar_uno_boton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addComponent(Agregar_Modulos)))
                .addGap(18, 18, 18)
                .addComponent(Borrar_Modulos)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_modulosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Campo_modulosActionPerformed

    private void Modulos_ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modulos_ComboboxActionPerformed

    }//GEN-LAST:event_Modulos_ComboboxActionPerformed

    private void Añadir_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_BotonActionPerformed
        //Controlado que el campo no este vacio
        if (Campo_modulos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No has introducido ningun modulo");
            return;
        }
        //Cuando no existan modulos, introduce el primero sin revisar si existe
        if (Modulos_Combobox.getItemCount() == 0) {
            Modulos_Combobox.addItem(Campo_modulos.getText());
            reset();
        } else {
            //Cuando el modulo ya existe manda un mensaje
            if (existeModulo()) {
                JOptionPane.showMessageDialog(null, "El modulo introducido ya existe");
                reset();
                return;
            }
            Modulos_Combobox.addItem(Campo_modulos.getText());
            reset();
        }


    }//GEN-LAST:event_Añadir_BotonActionPerformed

    private void Agregar_ModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_ModulosActionPerformed
        //Si me creo los objetos aqui cada vez que borre todos los items se crearan dos veces
        //meter cada elemento del arraylist al combobox
        if (Modulos_Combobox.getItemCount() == 0) {
            if (Curso_Combobox.getSelectedItem() == "DAM1") {
                for (String it : modulos_DAM1) {
                    Modulos_Combobox.addItem(it);
                }
            }else {
                for (String it : modulos_DAM2) {
                    Modulos_Combobox.addItem(it);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ya has agregado todos los modulos");
        }


    }//GEN-LAST:event_Agregar_ModulosActionPerformed

    private void Borrar_ModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_ModulosActionPerformed
        if(Modulos_Combobox.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "No existe ningun modulo para borrar");
            return;
        }
        Modulos_Combobox.removeAllItems();
    }//GEN-LAST:event_Borrar_ModulosActionPerformed

    private void Borrar_uno_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_uno_botonActionPerformed
        if(Modulos_Combobox.getItemCount() == 0){
            JOptionPane.showMessageDialog(null, "No existe ningun modulo para borrar");
            return;
        }
        Modulos_Combobox.removeItem(Modulos_Combobox.getSelectedItem());
    }//GEN-LAST:event_Borrar_uno_botonActionPerformed

    private void Curso_ComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Curso_ComboboxActionPerformed


    }//GEN-LAST:event_Curso_ComboboxActionPerformed

    /**
     * Comprueba que el modulo introducido no existe en el combobox
     *
     * @return
     */
    private boolean existeModulo() {
        for (int i = 0; i < Modulos_Combobox.getItemCount(); i++) {
            if (Modulos_Combobox.getItemAt(i).equalsIgnoreCase(Campo_modulos.getText())) {
                return true;
            }
        }
        return false;
    }
  
    private void reset() {
        Campo_modulos.setText("");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_Modulos;
    private javax.swing.JButton Añadir_Boton;
    private javax.swing.JButton Borrar_Modulos;
    private javax.swing.JButton Borrar_uno_boton;
    private javax.swing.JTextField Campo_modulos;
    private javax.swing.JComboBox<String> Curso_Combobox;
    private javax.swing.JComboBox<String> Modulos_Combobox;
    private javax.swing.JLabel Texto_Modulos;
    // End of variables declaration//GEN-END:variables
}
