/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igu.tipo;

import modelo.Tipo;
import data.TipoData;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;


public class TipoPanel extends javax.swing.JPanel {
    TiposTableModel tiposTableModel;
    /** Creates new form ClientePanel */
    public TipoPanel() {
        initComponents();
         initComponents();
        tablaTipo.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        resetForm();
        tiposTableModel = new TiposTableModel();
        paintTable(tiposTableModel);
    }
    
    private void resetForm() {
        campoNombre.requestFocus();
        campoNombre.setText("");
        campoNombre.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));

       
        registarTipoButton.setText("REGISTRAR");
        registarTipoButton.setToolTipText("REGISTRAR");
        
    }

    private void paintTable(TiposTableModel tablaClienteModel) {
        this.tiposTableModel = tablaClienteModel;
        tablaTipo.setModel(tablaClienteModel);
        tablaTipo.getColumnModel().getColumn(0).setMaxWidth(35);
        //   tablaTipo.getColumnModel().getColumn(0).setCellRenderer(new TableCellFormatter(null)); //TableCellFormatter("#,##0.0000")
    }

    private void paintForm() {
        if (tablaTipo.getSelectedRow() != -1) {
            Tipo filax = (Tipo) tiposTableModel.getRow(tablaTipo.getSelectedRow());
            Tipo d = TipoData.getByPId(filax.getIdTipo());
            campoNombre.setText(d.getNomTipo());
            campoNombre.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));

            
            System.out.printf("getId:%d getSelectedRow:%d \n", d.getIdTipo(), tablaTipo.getSelectedRow());

            registarTipoButton.setText("MODIFICAR");
            registarTipoButton.setToolTipText("MODIFICAR");
            
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formClientePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        registarTipoButton = new javax.swing.JButton();
        actualizarClienteButton = new javax.swing.JButton();
        eliminarClienteButton = new javax.swing.JButton();
        clienteTitlePanel = new javax.swing.JPanel();
        clienteTitle = new javax.swing.JLabel();
        clienteTablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTipo = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 255, 102));
        setMinimumSize(new java.awt.Dimension(944, 371));
        setPreferredSize(new java.awt.Dimension(944, 371));

        jLabel1.setText("Nombre");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        registarTipoButton.setText("Registrar");
        registarTipoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarTipoButtonActionPerformed(evt);
            }
        });

        actualizarClienteButton.setText("Actualizar");

        eliminarClienteButton.setText("Eliminar");
        eliminarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formClientePanelLayout = new javax.swing.GroupLayout(formClientePanel);
        formClientePanel.setLayout(formClientePanelLayout);
        formClientePanelLayout.setHorizontalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(actualizarClienteButton)
                .addGap(45, 45, 45)
                .addComponent(eliminarClienteButton)
                .addGap(43, 43, 43))
            .addGroup(formClientePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registarTipoButton))
                .addGap(0, 67, Short.MAX_VALUE))
        );
        formClientePanelLayout.setVerticalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarClienteButton)
                    .addComponent(actualizarClienteButton)
                    .addComponent(registarTipoButton))
                .addGap(65, 65, 65))
        );

        clienteTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clienteTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clienteTitle.setText("TIPO");

        javax.swing.GroupLayout clienteTitlePanelLayout = new javax.swing.GroupLayout(clienteTitlePanel);
        clienteTitlePanel.setLayout(clienteTitlePanelLayout);
        clienteTitlePanelLayout.setHorizontalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteTitlePanelLayout.createSequentialGroup()
                .addComponent(clienteTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        clienteTitlePanelLayout.setVerticalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clienteTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tablaTipo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaTipo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout clienteTablePanelLayout = new javax.swing.GroupLayout(clienteTablePanel);
        clienteTablePanel.setLayout(clienteTablePanelLayout);
        clienteTablePanelLayout.setHorizontalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clienteTablePanelLayout.setVerticalGroup(
            clienteTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(formClientePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(clienteTitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clienteTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clienteTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(formClientePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void registarTipoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarTipoButtonActionPerformed
        // TODO add your handling code here:
        if (campoNombre.getText().trim().isEmpty()) {
            campoNombre.requestFocus();
            campoNombre.setBorder(new LineBorder(new java.awt.Color(255, 0, 0), 3));
            

        } else {
            Tipo s = new Tipo();
            s.setNomTipo(campoNombre.getText());
            
            if (tablaTipo.getSelectedRow() != -1) {// ha seleccionado, update
                try {
                    Tipo fila = (Tipo) tiposTableModel.getRow(tablaTipo.getSelectedRow());
                    s.setIdTipo(fila.getIdTipo());
                    System.out.println("id:" + s.getIdTipo());
                    if (s.getIdTipo()> 0) {
                        int returnId = TipoData.update(s);
                        if (returnId != 0) {
                            paintTable(new TiposTableModel());
                            resetForm();
                            
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede editar: " + ex.getMessage());
                }
            } else { // sin seleccionar, insert
                try {
                    int returnId = TipoData.create(s);
                    if (returnId != 0) {
                        paintTable(new TiposTableModel());
                        // s.setId(returnId);//necesitamos subir el id, ya no
                        //tablaClienteModel.addRow(s);
                        resetForm();
                        
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede insertar: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_registarTipoButtonActionPerformed

    private void eliminarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteButtonActionPerformed
        // TODO add your handling code here:
        if (tablaTipo.getSelectedRow() != -1) {
            try {
                int opc = JOptionPane.showConfirmDialog(this, "¿Realmente desea eliminar?", "Quitar", JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.OK_OPTION) {
                    Tipo fila = (Tipo) tiposTableModel.getRow(tablaTipo.getSelectedRow());
                    System.out.printf("eliminarButtonActionPerformed getId:%d getSelectedRow:%d \n", fila.getIdTipo(), tablaTipo.getSelectedRow());

                    int opcion = TipoData.delete(fila.getIdTipo());
                    if (opcion != 0) {
                        //tablaClienteModel.removeRow(tablaTipo.getSelectedRow());
                        paintTable(new TiposTableModel());
                        resetForm();
                        
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "No se puede eliminar: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registo de la tabla");
        }
    }//GEN-LAST:event_eliminarClienteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarClienteButton;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPanel clienteTablePanel;
    private javax.swing.JLabel clienteTitle;
    private javax.swing.JPanel clienteTitlePanel;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JPanel formClientePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registarTipoButton;
    private javax.swing.JTable tablaTipo;
    // End of variables declaration//GEN-END:variables

}
