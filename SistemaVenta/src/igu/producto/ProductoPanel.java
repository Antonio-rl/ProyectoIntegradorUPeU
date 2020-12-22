/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package igu.producto;

import igu.cliente.*;

import modelo.Tipo;
import data.TipoData;
import modelo.Producto;
import data.ProductoData;

import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author jonatan
 */
public class ProductoPanel extends javax.swing.JPanel {
    
    ProductosTableModel mtdc;

    private List<Tipo> tipos;

    private boolean esActualizacion;
    private Tipo tipoSelected;
    
    private DefaultComboBoxModel tiposComboxModel;
    

    

    /** Creates new form ClientePanel */
    public ProductoPanel() {
        initComponents();
        initComponents();
        esActualizacion = false;
        productoTable.setEnabled(true);
        mtdc = new ProductosTableModel();
        productoTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productoTable.setModel(mtdc);
        productoTable.setEnabled(true);

        //productoTable.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        //productoTable.setDefaultRenderer(Object.class, new EstiloTablaFootRenderer());
        tipos = TipoData.listCmb("");
        tiposComboxModel = new DefaultComboBoxModel(tipos.toArray());

        tipoCombo.setModel(tiposComboxModel);

        if (tipos.size() > 0) {
            //tipoSelected = tipos.get(0);
            //tipoCombo.getModel().setSelectedItem(tipoSelected);

        } else {
            // mtdc = new ModeloTablaDetalleCompra();
        }

        paintTable(mtdc);
    }
    
     public void paintTable(ProductosTableModel tableModel) {
        this.mtdc = tableModel;
        productoTable.setModel(mtdc);

        productoTable.getColumnModel().getColumn(0).setMaxWidth(35);
        //productoTable.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer() ); 

        

        setEventTable();
       

    }

    private void setEventTable() {
        TableModelListener tml = new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                System.out.printf("tableChanged \n");
                tableHandlerEvent();
            }
        };
        this.productoTable.getModel().addTableModelListener(tml);

    }

    private void tableHandlerEvent() {
        if (tipoSelected != null) {
            System.out.printf("compraSelected \n");
            //SaldosCompra sal = CompraDetData.getSaldosByCompId(compraSelected.getId());
            
    }}
    
    private void resetForm() {
        campoNombre.requestFocus();
        campoNombre.setText("");
        campoNombre.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));

        campoStock.setText("");
        registarClienteButton.setText("REGISTRAR");
        registarClienteButton.setToolTipText("REGISTRAR");
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoStock = new javax.swing.JTextField();
        registarClienteButton = new javax.swing.JButton();
        actualizarClienteButton = new javax.swing.JButton();
        eliminarClienteButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoPrecio = new javax.swing.JTextField();
        tipoCombo = new javax.swing.JComboBox<>();
        clienteTitlePanel = new javax.swing.JPanel();
        productoTitle = new javax.swing.JLabel();
        clienteTablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productoTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 255, 102));
        setMinimumSize(new java.awt.Dimension(944, 371));
        setPreferredSize(new java.awt.Dimension(944, 371));

        jLabel2.setText("Stock");

        jLabel1.setText("Nombre");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        registarClienteButton.setText("Registrar");
        registarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registarClienteButtonActionPerformed(evt);
            }
        });

        actualizarClienteButton.setText("Actualizar");

        eliminarClienteButton.setText("Eliminar");
        eliminarClienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarClienteButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo");

        jLabel4.setText("Precio");

        tipoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo" }));
        tipoCombo.setToolTipText("");
        tipoCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoComboItemStateChanged(evt);
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
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formClientePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registarClienteButton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(tipoCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formClientePanelLayout.setVerticalGroup(
            formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formClientePanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(formClientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarClienteButton)
                    .addComponent(actualizarClienteButton)
                    .addComponent(registarClienteButton))
                .addGap(65, 65, 65))
        );

        productoTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        productoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productoTitle.setText("PRODUCTO");

        javax.swing.GroupLayout clienteTitlePanelLayout = new javax.swing.GroupLayout(clienteTitlePanel);
        clienteTitlePanel.setLayout(clienteTitlePanelLayout);
        clienteTitlePanelLayout.setHorizontalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteTitlePanelLayout.createSequentialGroup()
                .addComponent(productoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        clienteTitlePanelLayout.setVerticalGroup(
            clienteTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        productoTable.setModel(new javax.swing.table.DefaultTableModel(
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
        productoTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productoTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(productoTable);

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

    private void tipoComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoComboItemStateChanged
        // TODO add your handling code here:
          
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            tipoSelected = (Tipo) tipoCombo.getSelectedItem();
            int id = tipoSelected.getIdTipo();
            if (id > 0) {
                System.out.println("sssss");
                // MsgPanel.success(" cliente seleccionado: " + tipoSelected.getId());
                List<Producto> productosDelTipo = ProductoData.listActivesByCliente(tipoSelected.getIdTipo());
                if (productosDelTipo.size() > 0) {
                    int compraId = productosDelTipo.get(0).getIdTipo();// coge el primero
                    
                } else {
                    
                }

                productoTable.setEnabled(true);
                esActualizacion = true;
                tipoCombo.setBorder(new LineBorder(new java.awt.Color(0, 0, 0), 1));
                // MsgPanel.error("");
                paintTable(new ProductosTableModel());
            } else {
                
                tipoSelected = null;
                
                productoTable.setEnabled(false);
                paintTable(new ProductosTableModel());

            }

            //    this.setProveedor(prv);
        }
        
        tableHandlerEvent();

    }//GEN-LAST:event_tipoComboItemStateChanged

    private void registarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registarClienteButtonActionPerformed
        // TODO add your handling code here:
         if (campoNombre.getText().trim().isEmpty()) {
            campoNombre.requestFocus();
            campoNombre.setBorder(new LineBorder(new java.awt.Color(255, 0, 0), 3));
            

        } else {
            Producto s = new Producto();
            s.setNombreProd(campoNombre.getText());
            s.setStock(Integer.parseInt(campoStock.getText()));
            s.setIdTipo(tipoSelected.getIdTipo());
            s.setNomTipo(tipoSelected.getNomTipo());
            s.setPrecio(Double.parseDouble(campoPrecio.getText()));
            if (productoTable.getSelectedRow() != -1) {// ha seleccionado, update
                try {
                    Producto fila = (Producto) mtdc.getRow(productoTable.getSelectedRow());
                    s.setIdProducto(fila.getIdProducto());
                    System.out.println("id:" + s.getIdProducto());
                    if (s.getIdProducto()> 0) {
                        int returnId = ProductoData.update(s);
                        if (returnId != 0) {
                            paintTable(new ProductosTableModel());
                            resetForm();
                            
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede editar: " + ex.getMessage());
                }
            } else { // sin seleccionar, insert
                try {
                    int returnId = ProductoData.create(s);
                    if (returnId != 0) {
                        paintTable(new ProductosTableModel());
                        // s.setId(returnId);//necesitamos subir el id, ya no
                        //tablaClienteModel.addRow(s);
                        resetForm();
                        
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No se puede insertar: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_registarClienteButtonActionPerformed

    private void eliminarClienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarClienteButtonActionPerformed
        // TODO add your handling code here:
         if (productoTable.getSelectedRow() != -1) {
            try {
                int opc = JOptionPane.showConfirmDialog(this, "¿Realmente desea eliminar?", "Quitar", JOptionPane.YES_NO_OPTION);
                if (opc == JOptionPane.OK_OPTION) {
                    Tipo fila = (Tipo) mtdc.getRow(productoTable.getSelectedRow());
                    System.out.printf("eliminarButtonActionPerformed getId:%d getSelectedRow:%d \n", fila.getIdTipo(), productoTable.getSelectedRow());

                    int opcion = TipoData.delete(fila.getIdTipo());
                    if (opcion != 0) {
                        //tablaClienteModel.removeRow(productoTable.getSelectedRow());
                        paintTable(new ProductosTableModel());
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
    private javax.swing.JTextField campoPrecio;
    private javax.swing.JTextField campoStock;
    private javax.swing.JPanel clienteTablePanel;
    private javax.swing.JPanel clienteTitlePanel;
    private javax.swing.JButton eliminarClienteButton;
    private javax.swing.JPanel formClientePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productoTable;
    private javax.swing.JLabel productoTitle;
    private javax.swing.JButton registarClienteButton;
    private javax.swing.JComboBox<String> tipoCombo;
    // End of variables declaration//GEN-END:variables

}
