/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vew;

import Model.Paises;
import controller.ControlPaises;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mario
 */
public class frmPaises extends javax.swing.JInternalFrame {
    ControlPaises cp=new ControlPaises();
    private int fila=-1;
    int codigo;
    private int sw=0;
    
    public void llenarTabla(String nombre){
        tabla.setColumnCount(0);
        tabla.addColumn("codigo");
        tabla.addColumn("pais");
        List<Paises> lista=cp.mostrar(nombre);
        tabla.setNumRows(lista.size());
        jLabel2.setText("cantidad de registros: "+lista.size());
        for (int i = 0; i < lista.size(); i++) {
            tabla.setValueAt(lista.get(i).getPais_cod(), i, 0);
            tabla.setValueAt(lista.get(i).getPais_nom(), i, 1);
        }
        jTable1.setModel(tabla);
    }
    /**
     * Creates new form frmPaises
     */
    public frmPaises() {
        initComponents();
        llenarTabla("");
    }
    DefaultTableModel tabla=new DefaultTableModel();
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        v1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jToolBar2.setRollover(true);

        jButton2.setText("Agregar");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);
        jToolBar2.add(jSeparator1);

        jButton3.setText("Editar");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);
        jToolBar2.add(jSeparator2);

        jButton4.setText("Eliminar");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton4);
        jToolBar2.add(jSeparator3);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jToolBar2.add(jTextField1);

        jPanel1.add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Lista de paises", jPanel1);

        jLabel1.setText("nombre pais:");

        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(v1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(148, 148, 148))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
        );

        jTabbedPane1.addTab("gestion de paises", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        jLabel2.setText("jLabel2");
        jToolBar1.add(jLabel2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (v1.getText().equals("")) {
             JOptionPane.showMessageDialog(this, "Debe ingresar datos","el museo",JOptionPane.OK_OPTION+JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            switch(sw){
                case 0:
                    cp.create(v1.getText());
                    break;
                case 1:
                    cp.update(codigo,v1.getText());
                    break;
            }
        }
            llenarTabla("");
            v1.setText("");
            jTabbedPane1.setSelectedIndex(0);                    
            JOptionPane.showMessageDialog(this, "Operacion realizada","el museo",JOptionPane.OK_OPTION+JOptionPane.INFORMATION_MESSAGE);
            sw=0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (fila>-1) {          
            codigo= Integer.parseInt(String.valueOf(jTable1.getValueAt(fila, 0)));
            v1.setText(String.valueOf(jTable1.getValueAt(fila, 1)));
            sw=1;
            jTabbedPane1.setSelectedIndex(1);
            fila=-1;
        }
        else{
           JOptionPane.showMessageDialog(this, "debe seleccionar una fila","advertencia",JOptionPane.OK_OPTION+JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        llenarTabla(jTextField1.getText());
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (fila>-1) {
            int res=JOptionPane.showConfirmDialog(this, "¿desea eliminar el pais: "+String.valueOf(jTable1.getValueAt(fila, 1))+"?","advertencia",JOptionPane.YES_NO_OPTION);
            if(res==0){
                cp.delete(Integer.parseInt(String.valueOf(jTable1.getValueAt(fila, 0))));
                llenarTabla("");
                JOptionPane.showMessageDialog(this, "pais eliminado","el museo",JOptionPane.OK_OPTION+JOptionPane.INFORMATION_MESSAGE);
                fila=-1;
           }
        }else{
           JOptionPane.showMessageDialog(this, "debe seleccionar una fila","advertencia",JOptionPane.OK_OPTION+JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       fila=jTable1.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        sw=0;
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField v1;
    // End of variables declaration//GEN-END:variables
}
