
package ecocopter.sucesos.Interface;

import ecocopter.interfaces.DlgPrincipal;
import ecocopter.sucesos.Facade.FacadeSucesos;
import ecocopter.sucesos.Facade.GrabarArchivoExcel;
import ecocopter.sucesos.Facade.VariablesSucesos;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.oxbow.swingbits.table.filter.TableRowFilterSupport;


public class DlgListadoSuceso extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();
JTable table ;
JTableUtilSucesos util;
    public DlgListadoSuceso() {
        initComponents();
        cargaTamano();
        jProgressBar.setVisible(false);
        jTable.setModel(dt);
        jTable = buildTable(ConstantesSucesos.colNamesSuceso,FacadeSucesos.data());
        Rectangle r=jTable.getCellRect(0, 2, true);
        jScrollPane2.getViewport().scrollRectToVisible(r);
       
    }
    
    private void cargaTamano(){
     this.setMinimumSize(new Dimension(1200, 600)); //Minima dimension
     this.setTitle("Listado de Sucesos");
     this.setResizable(false); // no permite cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);   
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabelProgress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        btnNuevo.setBounds(10, 20, 150, 45);
        jLayeredPane1.add(btnNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/eliminar.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.setBounds(340, 20, 150, 45);
        jLayeredPane1.add(btnEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/editar.jpg"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        btnEditar.setBounds(180, 20, 150, 45);
        jLayeredPane1.add(btnEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/salir.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.setBounds(660, 20, 150, 45);
        jLayeredPane1.add(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/excel.jpg"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        btnGuardar.setBounds(500, 20, 150, 45);
        jLayeredPane1.add(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jProgressBar.setBounds(820, 20, 250, 40);
        jLayeredPane1.add(jProgressBar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLabelProgress.setBounds(820, 70, 240, 20);
        jLayeredPane1.add(jLabelProgress, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     JFileChooser fileChooser=new JFileChooser();
     fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
     int resultado=fileChooser.showSaveDialog(this);
     if(resultado==JFileChooser.CANCEL_OPTION){
     return;    
     }
     File file=fileChooser.getSelectedFile();
     String directorio=file.getAbsolutePath();
     System.out.println("Directorio"+directorio);
     GrabarArchivoExcel archivo=new GrabarArchivoExcel();
     archivo.grabarArchivoExcel(jTable, directorio,jProgressBar, jLabelProgress);
    
     
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int row=jTable.getSelectedRow();
       
       if(row>-1){
       FacadeSucesos facade=new FacadeSucesos();
       String codSuceso=jTable.getValueAt(row, 0).toString().trim();
       String estado=ConstantesSucesos.ESTADO;
       if(facade.eliminaSuceso(codSuceso, estado)){
        JOptionPane.showMessageDialog( null," Registro Eliminado!","Información",JOptionPane.INFORMATION_MESSAGE);
        
        jTable = buildTable(ConstantesSucesos.colNamesSuceso,FacadeSucesos.data());
      
       }else{
       
        JOptionPane.showMessageDialog( null,"No se puedo Eliminar el Registro!","Error",JOptionPane.WARNING_MESSAGE);
       
       }
       }else{
       JOptionPane.showMessageDialog( null,"Seleccionar Registro!","Información",JOptionPane.INFORMATION_MESSAGE);
    
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int row=jTable.getSelectedRow();
        if(row>-1){
        
       VariablesSucesos.estado="M";
        String codSuceso=jTable.getValueAt(row, 0).toString().trim();
        VariablesSucesos.nomEvento=jTable.getValueAt(row, 10).toString().trim();
        DlgMantenimientoSucesos mante=new DlgMantenimientoSucesos(codSuceso);
        mante.setVisible(true);
       cerrarVentana(false);
       
        }else{
        JOptionPane.showMessageDialog( null,"Seleccionar Registro!","Información",JOptionPane.INFORMATION_MESSAGE);
     
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
      VariablesSucesos.estado="I";
       DlgMantenimientoSucesos mante=new DlgMantenimientoSucesos("");
        mante.setVisible(true);
       cerrarVentana(false);
     
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      DlgPrincipal principal=new DlgPrincipal();
      principal.setVisible(true);
      cerrarVentana(false);
        
  
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable = buildTable(ConstantesSucesos.colNamesSuceso,FacadeSucesos.data());
    }//GEN-LAST:event_formWindowOpened
    private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
    
    
    private JTable buildTable(Object[] colNames,Object[][]data) {
        table= TableRowFilterSupport.forTable(jTable).actions(true).searchable(true).useTableRenderers(true).apply();
        table.setModel( new DefaultTableModel(data, colNames) );
        table.getColumnModel().getColumn(0).setCellRenderer(new Renderer());
        util=new JTableUtilSucesos(table);
        return table;
    }
    @SuppressWarnings("serial")
    static class Renderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, 
                int row, int column) {
        
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            setText( getText()+"****" );
            return this;
        }
        
    }
   
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelProgress;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
