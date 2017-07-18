
package ecocopter.usuarios.Interface;

import ecocopter.usuarios.Facade.FacadeUsuarios;
import ecocopter.util.EcocopterUtil;
import ecocopter.util.EcocopterVariables;
import ecocopter.util.JTextFieldUtil;
import ecocopter.util.LengthText;

import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class DlgMantenimientoUsuarios extends javax.swing.JFrame {
private String dni="";
private String aPaterno="";
private String aMaterno="";
private String nombres="";
private String usuario="";
private String password="";
private String confirmar="";
private String estado="";
 JTextFieldUtil util=null;
  
    public DlgMantenimientoUsuarios() {
        initComponents();
        this.setTitle("Mantenimiento de Usuarios");
        this.setResizable(false); // no permite cambiar de tamaño
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
        this.setLocationRelativeTo(null); //centrado
        
        EcocopterUtil.moveFocus(txtDni);
        maxLogitud();
        cleanDatos();
        
       EcocopterVariables.vAceptar=false;
            
        
       
    }
    public void setParametros(String pDni,String pPaterno,String pMaterno,String pNombres,
            String pUsuario,String pPassword,String pEstado){
         if(VariablesUsuarios.editar.equalsIgnoreCase(ConstantesUsuarios.EDITAR)){
        
        this.txtDni.setText(pDni);
        this.txtDni.setEditable(false);
        this.txtPaterno.setText(pPaterno);
        this.txtMaterno.setText(pMaterno);
        this.txtNombres.setText(pNombres);
        this.txtUsuario.setText(pUsuario);
        this.txtUsuario.setEditable(false);
        this.txtPassword.setText(pPassword);
        this.txtConfirmar.setText(pPassword);
        if(pEstado.equalsIgnoreCase("ACTIVO")){
        this.cmbEstado.setSelectedIndex(0);
         }else{
        this.cmbEstado.setSelectedIndex(1);    
        }
         }
    }
    public boolean grabarUsuario(FacadeUsuarios facade)
    {
     if(VariablesUsuarios.editar.equalsIgnoreCase(ConstantesUsuarios.EDITAR)){
         if(facade.actualizaUsuario(this.getDni(), this.getaPaterno(), this.getaMaterno(), this.getNombres(), 
            this.getUsuario(), this.getPassword(), this.getEstado(), "CHUANES")){
        return true;
    }else{
        return false;
    }
       
       }else{
    if(facade.grabaUsuario(this.getDni(), this.getaPaterno(), this.getaMaterno(), this.getNombres(), 
            this.getUsuario(), this.getPassword(), this.getEstado(), "CHUANES")){
        return true;
    }else{
        return false;
    }
   }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtPaterno = new javax.swing.JTextField();
        txtMaterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmar = new javax.swing.JPasswordField();
        lblMensajeError = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_BOTTOM), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Documento de Identidad:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Apellido Paterno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
        });

        txtPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPaternoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPaternoKeyReleased(evt);
            }
        });

        txtMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaternoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaternoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombres:");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombresKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Usuario:");

        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Password:");

        txtPassword.setText("jPasswordField1");
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Estado:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACTIVO", "INACTIVO" }));
        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });
        cmbEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbEstadoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Confirmar Password:");

        txtConfirmar.setText("jPasswordField1");
        txtConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPaterno)
                            .addComponent(txtMaterno)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
   
        setDni(txtDni.getText().trim());
        setaPaterno(txtPaterno.getText().trim());
        setaMaterno(txtMaterno.getText().trim());
        setNombres(txtNombres.getText());
        setUsuario(txtUsuario.getText().trim());
        setPassword(txtPassword.getText().trim());
        setConfirmar(txtConfirmar.getText().trim());
        setEstado(String.valueOf(cmbEstado.getSelectedIndex()));
    
    if(!isValidarDatos())
        return;
    if(!UtilValidaDatos.isDniCorrecto(this.getDni())){
        JOptionPane.showMessageDialog(this,
        "DNI Incorrecto","Información",
        JOptionPane.INFORMATION_MESSAGE);
         EcocopterUtil.moveFocus(txtDni);
     return;   
    }
    if(!UtilValidaDatos.isContrasenaIgual(this.getPassword(),this.getConfirmar())) {
        lblMensajeError.setText("Las contraseñas no coindicen");
         EcocopterUtil.moveFocus(txtConfirmar);
        return;
    } 
    if(!UtilValidaDatos.isConstrasenaValida(this.getPassword())){
       return; 
    }
    FacadeUsuarios facade=new FacadeUsuarios();
    if(!VariablesUsuarios.editar.equalsIgnoreCase(ConstantesUsuarios.EDITAR)){
    if(!facade.isDni(this.getDni())){
         JOptionPane.showMessageDialog(this,
        "El DNI ingresado ya se encuentra registrado!","Información",
        JOptionPane.INFORMATION_MESSAGE);
          EcocopterUtil.moveFocus(txtDni);
       return; 
    }
    }
   if(!VariablesUsuarios.editar.equalsIgnoreCase(ConstantesUsuarios.EDITAR)){
    if(!facade.isUsuario(this.getUsuario())){
         JOptionPane.showMessageDialog(this,
        "El Usuario ingresado ya se encuentra registrado!","Información",
        JOptionPane.INFORMATION_MESSAGE);
          EcocopterUtil.moveFocus(txtDni);
       return; 
    }
   }
      if(grabarUsuario(facade)){
        JOptionPane.showMessageDialog(this,
        "Se guardo el registro satisfactoriamente!","Información",
        JOptionPane.INFORMATION_MESSAGE);  
        cleanDatos();
         cerrarVentana(false);
      }else{
         JOptionPane.showMessageDialog(this,
        "Error al grabar el registro!","Error",
        JOptionPane.ERROR_MESSAGE); 
      }
    }//GEN-LAST:event_btnAceptarActionPerformed
   
    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtPaterno);
       }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtPaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtMaterno);
       }
     
    }//GEN-LAST:event_txtPaternoKeyPressed

    private void txtMaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtNombres);
       }
      
    }//GEN-LAST:event_txtMaternoKeyPressed

    private void txtNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtUsuario);
           
       }
       
    }//GEN-LAST:event_txtNombresKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
     if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtPassword);
       }
     
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtConfirmar);
       }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(cmbEstado);
       }
    }//GEN-LAST:event_txtConfirmarKeyPressed

    private void cmbEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbEstadoKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           EcocopterUtil.moveFocus(txtDni);
       }
    }//GEN-LAST:event_cmbEstadoKeyPressed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
    
        int index=cmbEstado.getSelectedIndex();
        if(evt.getStateChange()==ItemEvent.SELECTED){   
            if(index==0){
            this.setEstado("0");
            }else{
            this.setEstado("1");
            }
        }
     
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void txtPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaternoKeyReleased
       util=new JTextFieldUtil();
       util.JTexttoUpper(txtPaterno);
    }//GEN-LAST:event_txtPaternoKeyReleased

    private void txtMaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaternoKeyReleased
        util=new JTextFieldUtil();
       util.JTexttoUpper(txtMaterno);
    }//GEN-LAST:event_txtMaternoKeyReleased

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
         util=new JTextFieldUtil();
       util.JTexttoUpper(txtNombres);
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        util=new JTextFieldUtil();
       util.JTexttoUpper(txtUsuario);
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
      
        
        cerrarVentana(false);
    }//GEN-LAST:event_btnCancelarActionPerformed
  private void cerrarVentana(boolean valor){
      EcocopterVariables.vAceptar=true;
      DlgListadoUsuarios usu=new DlgListadoUsuarios();
       usu.setVisible(true);
      this.setVisible(valor);
      this.dispose();  
    }
    private void cleanDatos(){
   lblMensajeError.setText("");
   txtDni.setText("");
   txtPaterno.setText("");
   txtMaterno.setText("");
   txtNombres.setText("");
   txtUsuario.setText("");
   txtPassword.setText("");
   txtConfirmar.setText("");
   
  }
  private void maxLogitud(){
        txtDni.setDocument(new LengthText(8));
        txtPaterno.setDocument(new LengthText(50));
        txtMaterno.setDocument(new LengthText(50));
        txtNombres.setDocument(new LengthText(50));
        txtUsuario.setDocument(new LengthText(10));
        txtPassword.setDocument(new LengthText(10));  
        txtConfirmar.setDocument(new LengthText(10));  
       
  }
  private boolean isValidarDatos(){
      if(this.getDni().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar DNI!","Información",
        JOptionPane.INFORMATION_MESSAGE); 
        EcocopterUtil.moveFocus(txtDni);   
        return false;  
      }
      if(this.getaPaterno().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar Apellido Paterno!","Información",
        JOptionPane.INFORMATION_MESSAGE); 
           EcocopterUtil.moveFocus(txtPaterno);
        return false;  
      }
      if(this.getaMaterno().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar Apellido Materno!","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtMaterno);
        return false;  
      }
      if(this.getNombres().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar Nombres!","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtNombres);
        return false;  
      }
      if(this.getUsuario().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar Usuario!","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtUsuario);
        return false;  
      }
      if(this.getPassword().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Ingresar Password!","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtPassword);
        return false;  
      }
      if(this.getConfirmar().length()==0 ){
           JOptionPane.showMessageDialog(this,
        "Confirmar Password!","Información",
        JOptionPane.INFORMATION_MESSAGE); 
           EcocopterUtil.moveFocus(txtConfirmar);
        return false;  
      }
      //LONGITUD MINIMA
      if(this.getaPaterno().length()<3 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en apellido paterno = 3 .","Información",
        JOptionPane.INFORMATION_MESSAGE); 
           EcocopterUtil.moveFocus(txtPaterno);
        return false;  
      }
      if(this.getaMaterno().length()<3 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en apellido materno = 3 .","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtMaterno);
        return false;  
      }
      if(this.getNombres().length()<3 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en nombres = 3 .","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtNombres);
        return false;  
      }
      if(this.getUsuario().length()<7 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en usuario = 7 .","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtUsuario);
        return false;  
      }
      if(this.getPassword().length()<6 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en password = 6 .","Información",
        JOptionPane.INFORMATION_MESSAGE);  
           EcocopterUtil.moveFocus(txtPassword);
        return false;  
      }
      if(this.getConfirmar().length()<6 ){
           JOptionPane.showMessageDialog(this,
        "Londitud minima de caracteres \n en confirmar password = 3 .","Información",
        JOptionPane.INFORMATION_MESSAGE); 
           EcocopterUtil.moveFocus(txtConfirmar);
        return false;  
      }
      return true;
  }
 
 
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JPasswordField txtConfirmar;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPaterno;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

  
    public String getDni() {
        return dni;
    }

   
    public void setDni(String dni) {
        this.dni = dni;
    }

   
    public String getaPaterno() {
        return aPaterno;
    }

   
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

   
    public String getaMaterno() {
        return aMaterno;
    }

    
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

  
    public String getNombres() {
        return nombres;
    }

   
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

  
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getPassword() {
        return password;
    }

   
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getConfirmar() {
        return confirmar;
    }

    
    public void setConfirmar(String confirmar) {
        this.confirmar = confirmar;
    }

    
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
