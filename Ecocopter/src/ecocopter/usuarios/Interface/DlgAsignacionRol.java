
package ecocopter.usuarios.Interface;


import ecocopter.usuarios.Bean.BeanRol;
import ecocopter.usuarios.Facade.FacadeUsuarios;
import ecocopter.util.EcocopterUtil;
import ecocopter.util.LengthText;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class DlgAsignacionRol extends javax.swing.JFrame {
private String dni="";
private String codRol="";
private String codRol2="";
    
   
   public DlgAsignacionRol(String pDni,String pPaterno,String pMaterno,String pNombres,String pRol1,String pRol2,String pFecha) {
        initComponents();
        this.setTitle("Asignación de  Roles");
        this.setDni(pDni);
        this.txtUsuario.setEditable(false);
        this.txtUsuario.setText(pPaterno+" "+pMaterno+" "+pNombres);
       
        this.txtFecha.setText(pFecha);
        this.txtFecha.setDocument(new LengthText(10));
        this.setResizable(false); // no permite cambiar de tamaño
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//hinabililitar el cerrado
        this.setLocationRelativeTo(null); //centrado
        FacadeUsuarios usuario=new FacadeUsuarios();
        usuario.lstCmbRol(cmbRol);
        usuario.lstCmbRol(cmbRol2);
        EcocopterUtil.moveFocus(cmbRol);
      
        
    }
    public void isAsignarRolUsuario(){
     FacadeUsuarios facade=new FacadeUsuarios();
      String pDni=this.getDni();
      String pCodRol=this.getCodRol();
      String pCodRol2=this.getCodRol2();
      String pFecha=this.txtFecha.getText().trim();
      
      if(!isValidarDatos())
          return;
      
      
     if(facade.isAsignaRolUsuario(pDni, pCodRol,pCodRol2,pFecha , "CHUANES")){
         JOptionPane.showMessageDialog( null,"Se guardo el registro satisfactoriamente!",
                 "Información",JOptionPane.INFORMATION_MESSAGE);
    
    
        }else{
        JOptionPane.showMessageDialog( null,"Error al grabar registro!",
                "Error",JOptionPane.INFORMATION_MESSAGE);
        
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox();
        txtFecha = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbRol2 = new javax.swing.JComboBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Rol -Gestión de Reportes");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fecha de Caducidad:");

        cmbRol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRolItemStateChanged(evt);
            }
        });
        cmbRol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRolKeyPressed(evt);
            }
        });

        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFechaKeyPressed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(51, 0, 204));
        jLabel10.setText("DD/MM/YYYY");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Rol/ Gestión de Peligros");

        cmbRol2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRol2ItemStateChanged(evt);
            }
        });
        cmbRol2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbRol2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(cmbRol, 0, 310, Short.MAX_VALUE)
                            .addComponent(cmbRol2, 0, 310, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbRol2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/guardar.jpg"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbRolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRolItemStateChanged
     BeanRol item=(BeanRol)cmbRol.getSelectedItem();
    int index=cmbRol.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodRol(item.getCodRol());
   
    }
    }
    }//GEN-LAST:event_cmbRolItemStateChanged

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       isAsignarRolUsuario();
        cerrarVentana(false);
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       cerrarVentana(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbRol2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRol2ItemStateChanged
     BeanRol item2=(BeanRol)cmbRol2.getSelectedItem();
    int index=cmbRol2.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
   
     this.setCodRol2(item2.getCodRol());
    }
    }
    }//GEN-LAST:event_cmbRol2ItemStateChanged

    private void txtFechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(cmbRol);
       }
        
        EcocopterUtil.dateComplete(txtFecha, evt);
    }//GEN-LAST:event_txtFechaKeyPressed

    private void cmbRolKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRolKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(cmbRol2);
       }
    }//GEN-LAST:event_cmbRolKeyPressed

    private void cmbRol2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbRol2KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtFecha);
       }
    }//GEN-LAST:event_cmbRol2KeyPressed
    private boolean isValidarDatos(){
       boolean flag=true;
        if(cmbRol.getSelectedIndex()==0){
            
           flag=false;
            JOptionPane.showMessageDialog( this,"Seleccionar Rol 1!",
                "Información",JOptionPane.INFORMATION_MESSAGE);
        }else if(cmbRol2.getSelectedIndex()==0){
            
            flag=false;
             JOptionPane.showMessageDialog( this,"Seleccionar Rol 2!",
                "Información",JOptionPane.INFORMATION_MESSAGE);
        }else if(!EcocopterUtil.validaFecha(txtFecha.getText().toString(), "dd/mm/yyyy")){
           
        flag=false;
         JOptionPane.showMessageDialog(this,"Ingresar Fecha de Caducidad!",
                "Información",JOptionPane.INFORMATION_MESSAGE);
        }
        return flag;
    }
   private void cerrarVentana(boolean valor){
       DlgListadoUsuarios usu=new DlgListadoUsuarios();
        usu.setVisible(true);
      this.setVisible(valor);
      this.dispose();  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbRol;
    private javax.swing.JComboBox cmbRol2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the codRol
     */
    public String getCodRol() {
        return codRol;
    }

    /**
     * @param codRol the codRol to set
     */
    public void setCodRol(String codRol) {
        this.codRol = codRol;
    }

    /**
     * @return the codRol2
     */
    public String getCodRol2() {
        return codRol2;
    }

    /**
     * @param codRol2 the codRol2 to set
     */
    public void setCodRol2(String codRol2) {
        this.codRol2 = codRol2;
    }

   
}
