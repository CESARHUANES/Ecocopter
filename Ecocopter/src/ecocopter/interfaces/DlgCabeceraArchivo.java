
package ecocopter.interfaces;

import ecocopter.bean.Cabecera;
import ecocopter.bean.VariablesEcocopter;
import ecocopter.dao.FacadeEcopter;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DlgCabeceraArchivo extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();
FacadeEcopter facade=new FacadeEcopter();
TableRowSorter<TableModel> sorter=null;
    
    public DlgCabeceraArchivo() {
        initComponents();
        namesColumns();
        cargaGrilla();
        this.setTitle("Registro de Archivos");
        cargarTamano();
    }
    public void namesColumns(){
        JTable.setModel(dt);
        dt.addColumn("CODIGO");
        dt.addColumn("COD.NAVE");
        dt.addColumn("NAVE");
        dt.addColumn("NOMBRE ARCHIVO");
        dt.addColumn("CANT.REG.");
        dt.addColumn("ESTADO");
        dt.addColumn("PESO(KB)");
        dt.addColumn("FECHA REGISTRO");
        JTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        JTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        JTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        JTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        JTable.getColumnModel().getColumn(4).setPreferredWidth(130);
        JTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        JTable.getColumnModel().getColumn(6).setPreferredWidth(120);
        JTable.getColumnModel().getColumn(7).setPreferredWidth(200);
        JTable.getTableHeader().setEnabled(false);//desabilitar los tamaños de las clumnas
        sorter = new TableRowSorter<TableModel>(dt);
        JTable.setRowSorter(sorter);
        JTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       
    }
    public void cargarTamano(){//llamar este metodo en el constructor
     
     this.setMinimumSize(new Dimension(800, 400)); //Minima dimension
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);
    // this.setAlwaysOnTop( true );
     
    }
     private void filtro(){
    RowFilter<TableModel, Object> rf = null;
   int indiceColumnaTabla = 2;
    try {
    rf = RowFilter.regexFilter(txtBuscar.getText(), indiceColumnaTabla);
    } catch (java.util.regex.PatternSyntaxException e) {
    }
    sorter.setRowFilter(rf);
     
 }
    public void cargaGrilla(){
      dt.setRowCount(0);
     for(Cabecera x:facade.Listcabecera())
      {
         dt.addRow(new Object[]{x.getIdArchivo(),x.getIdNave(),x.getNomNave(),x.getNomArchivo(),x.getCantReg(),x.getEstado(),x.getPesoArchivo(),
            x.getFecCarga()} );
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCarga = new javax.swing.JButton();
        btnDetalle = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCarga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/archivo.jpg"))); // NOI18N
        btnCarga.setText("Cargar Archivo");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });

        btnDetalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/detalle.png"))); // NOI18N
        btnDetalle.setText("Ver Detalle");
        btnDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/salir.jpg"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/eliminar.jpg"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCarga)
                .addGap(27, 27, 27)
                .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Buscar Aeronave:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      
      cargaGrilla();
    }//GEN-LAST:event_formWindowOpened

    private void btnDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleActionPerformed
        
        seleccionRegistro();
    }//GEN-LAST:event_btnDetalleActionPerformed

    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed
       DlgCargaArchivo carga=new DlgCargaArchivo();
       carga.setVisible(true);
       cerrarVentana(false);
       
    }//GEN-LAST:event_btnCargaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
     
      filtro();
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        seleccionRegistroElimina();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        DlgPrincipal princ=new DlgPrincipal();
        princ.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    
      private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
    public void seleccionRegistroElimina(){
        String idArchivo;
        int fila=JTable.getSelectedRow();
        if(fila>-1){
        String estado=(String)JTable.getValueAt(fila, 5);
        idArchivo=JTable.getValueAt(fila,0).toString();
        if(estado.trim().equalsIgnoreCase("P")){
        JOptionPane.showMessageDialog( null,"No se puede eliminar el registro!\n Ya que este a sido procesado","Información",JOptionPane.INFORMATION_MESSAGE);   
        }else{
        if(!facade.eliminarDetalle(idArchivo))
                     return;   
        if(!facade.eliminarCabecera(idArchivo))
                      return;
        cargaGrilla();
        JOptionPane.showMessageDialog( null,"Archivo Eliminado","Información",JOptionPane.INFORMATION_MESSAGE);  
         }   
        }else{
        JOptionPane.showMessageDialog( null,"Usted debe seleccionar un Registro.!","Información",JOptionPane.INFORMATION_MESSAGE);   

        }
    }

    public void  seleccionRegistro(){
     int fila=JTable.getSelectedRow();
     if(fila>-1){
      String idArchivo=(String)JTable.getValueAt(fila,0);
      String idNave=(String)JTable.getValueAt(fila,1);
      String nomNave=(String)JTable.getValueAt(fila,2);
      String estado=(String)JTable.getValueAt(fila,5);
      VariablesEcocopter.vIdArchivo=idArchivo;
      VariablesEcocopter.vIdNave=idNave;
      VariablesEcocopter.vnomNave=nomNave;
      VariablesEcocopter.vEstado=estado;
      cargaDetalle(VariablesEcocopter.vIdArchivo);
     }else{
       JOptionPane.showMessageDialog( null,"Usted debe seleccionar un Registro.!","Información",JOptionPane.INFORMATION_MESSAGE);

     }
    }
    public void cargaDetalle(String idArchivo){
      DlgDetalleArchivo detalle=new  DlgDetalleArchivo();
      detalle.setVisible(true);
      detalle.cargaGrillaDetalle(idArchivo);
      cerrarVentana(false);
        
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DlgCabeceraArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgCabeceraArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgCabeceraArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgCabeceraArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgCabeceraArchivo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnDetalle;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
