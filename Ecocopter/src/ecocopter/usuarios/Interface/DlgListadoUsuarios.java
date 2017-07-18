
package ecocopter.usuarios.Interface;

import ecocopter.interfaces.DlgPrincipal;
import ecocopter.usuarios.Facade.FacadeUsuarios;
import ecocopter.util.EcocopterUtil;
import ecocopter.util.JTableUtil;
import ecocopter.util.JTextFieldUtil;
import ecocopter.util.UtilDescargaExcel;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class DlgListadoUsuarios extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();
JTableUtilUsuarios util;
private int indiceBusqueda=0;  
public DlgListadoUsuarios() {
        initComponents();
        this.setTitle("Listado de Usuarios");
        util=new JTableUtilUsuarios(dt,jTable);
        this.setResizable(false); // no permite cambiar de tamaño
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inabilitar el cerrado
        this.setLocationRelativeTo(null); //centrado
        listaUsuariosRol();
        EcocopterUtil.moveFocus(txtBuscar);
        jProgressBar.setVisible(false);
    }
    public void listaUsuariosRol(){
        dt.setRowCount(0);
      FacadeUsuarios facade=new FacadeUsuarios();
      ArrayList lstUsuarioRol=new ArrayList() ;  
      lstUsuarioRol=facade.lstUsuarioRol();
      for(int i=0;i<lstUsuarioRol.size();i++){
          String dni=((ArrayList)(lstUsuarioRol.get(i))).get(0).toString();
          String ap=((ArrayList)(lstUsuarioRol.get(i))).get(1).toString();
          String am=((ArrayList)(lstUsuarioRol.get(i))).get(2).toString();
          String nom=((ArrayList)(lstUsuarioRol.get(i))).get(3).toString();
          String rol=((ArrayList)(lstUsuarioRol.get(i))).get(4).toString();
          String rol2=((ArrayList)(lstUsuarioRol.get(i))).get(5).toString();
          String fc=((ArrayList)(lstUsuarioRol.get(i))).get(6).toString();
          String usu=((ArrayList)(lstUsuarioRol.get(i))).get(7).toString();
          String pas=((ArrayList)(lstUsuarioRol.get(i))).get(8).toString();
          String es=((ArrayList)(lstUsuarioRol.get(i))).get(9).toString();
          dt.addRow(new Object[]{dni,ap,am,nom,rol,rol2,fc,usu,
            pas,es} );
      }
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cmbOpcion = new javax.swing.JComboBox();
        btnEditar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        btnAsignarRol = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jLabelProgress = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jScrollPane1.setViewportView(jTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar Usuario:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DNI", "AP_PATERNO", "AP_MATERNO", "NOMBRES", "USUARIO", "ROL" }));
        cmbOpcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOpcionItemStateChanged(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/editar.jpg"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/nuevo.jpg"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/salir.jpg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDescargar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/excel2.jpg"))); // NOI18N
        btnDescargar.setText("Descargar");
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
            }
        });

        btnAsignarRol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAsignarRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/asignar.jpg"))); // NOI18N
        btnAsignarRol.setText(" Rol");
        btnAsignarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarRolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAsignarRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(359, 359, 359)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsignarRol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
  
     UtilDescargaExcel archivo=new UtilDescargaExcel();
     archivo.gestionDescargaExcel(jTable, jProgressBar, jLabelProgress,null);
    
     
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       DlgMantenimientoUsuarios usu=new  DlgMantenimientoUsuarios();
       usu.setVisible(true);
       cerrarVentana(false);
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
      
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
     JTextFieldUtil jUtil=new JTextFieldUtil();
     jUtil.JTexttoUpper(txtBuscar);
     
     JTableUtil utilTable=new JTableUtil();
     
     utilTable.filtro(dt, jTable, txtBuscar,this.getIndiceBusqueda() );
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cmbOpcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOpcionItemStateChanged
      if(evt.getStateChange()==ItemEvent.SELECTED){
        int index=cmbOpcion.getSelectedIndex();
        if(index==0){//DNI
       this.setIndiceBusqueda(0);
        }else if(index==1){//PATERNO
       this.setIndiceBusqueda(1);
        }else if(index==2){//MATERNO
       this.setIndiceBusqueda(2);
        }else if(index==3){//NOMBRES
       this.setIndiceBusqueda(3);
        }else if(index==4){//USUARIO
       this.setIndiceBusqueda(4);   
        }else if(index==5){//USUARIO
       this.setIndiceBusqueda(5);   
        }
      }
      EcocopterUtil.moveFocus(txtBuscar);
    }//GEN-LAST:event_cmbOpcionItemStateChanged

    private void btnAsignarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarRolActionPerformed
      int row=jTable.getSelectedRow();
      if(row>-1){
      String dni=jTable.getValueAt(row, 0).toString().trim();
      String paterno=jTable.getValueAt(row, 1).toString().trim();
      String materno=jTable.getValueAt(row, 2).toString().trim();
      String nombres=jTable.getValueAt(row, 3).toString().trim();
       String rol1=jTable.getValueAt(row, 5).toString().trim();
      String rol2=jTable.getValueAt(row, 6).toString().trim();
      String fecha=jTable.getValueAt(row, 7).toString().trim();
      DlgAsignacionRol asignacion=new DlgAsignacionRol(dni,paterno,materno,nombres,rol1,rol2,fecha);
      asignacion.setVisible(true);
      
       cerrarVentana(false);
      }else{
       JOptionPane.showMessageDialog( null,"Seleccionar Registro!","Información",JOptionPane.INFORMATION_MESSAGE);
    

      }
    }//GEN-LAST:event_btnAsignarRolActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       DlgPrincipal principal=new DlgPrincipal();
       principal.setVisible(true);
       cerrarVentana(false);
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        int row=jTable.getSelectedRow();
        if(row>-1){
      String dni=jTable.getValueAt(row, 0).toString().trim();
      String paterno=jTable.getValueAt(row, 1).toString().trim();
      String materno=jTable.getValueAt(row, 2).toString().trim();
      String nombres=jTable.getValueAt(row, 3).toString().trim();
      String usuario=jTable.getValueAt(row, 4).toString().trim();
      String password=jTable.getValueAt(row, 8).toString().trim();
      String estado=jTable.getValueAt(row, 9).toString().trim();
      VariablesUsuarios.editar="E";
      DlgMantenimientoUsuarios mntUsuarios=new DlgMantenimientoUsuarios();
      mntUsuarios.setParametros(dni, paterno, materno, nombres, usuario, password, estado);
      mntUsuarios.setVisible(true);
      
       cerrarVentana(false);
       
      }else{
       JOptionPane.showMessageDialog( null,"Seleccionar Registro!","Información",JOptionPane.INFORMATION_MESSAGE);
    

      }
    }//GEN-LAST:event_btnEditarMouseClicked

   private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarRol;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbOpcion;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelProgress;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the indiceBusqueda
     */
    public int getIndiceBusqueda() {
        return indiceBusqueda;
    }

    /**
     * @param indiceBusqueda the indiceBusqueda to set
     */
    public void setIndiceBusqueda(int indiceBusqueda) {
        this.indiceBusqueda = indiceBusqueda;
    }
}
