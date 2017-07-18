
package ecocopter.aeronave;

import ecocopter.interfaces.DlgPrincipal;
import ecocopter.util.JTableUtil;
import ecocopter.util.JTextFieldUtil;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DlgAeronave extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();

FacadeAeronave nave=new FacadeAeronave();
private String estado="";
    public DlgAeronave() {
        initComponents();
        setTitle();
    }
    private void setTitle(){
    this.setTitle("Mantenimiento de Aeronaves");
    this.setResizable(false); // no permite cambiar de tamaño
    this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
    this.setLocationRelativeTo(null);
    setColumnNave();
    lstAeronave();
    inicializaDatos();
    }
    
    private void setColumnNave(){
        JTable.setModel(dt);
        dt.addColumn("CODIGO");
        dt.addColumn("DESCRIPCION");
        dt.addColumn("FECHA.CREA.");
        dt.addColumn("FECHA.MODIF");
        dt.addColumn("ESTADO");
        JTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        JTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        JTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        JTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        JTable.getColumnModel().getColumn(4).setPreferredWidth(100);

        JTable.getTableHeader().setEnabled(false);//desabilitar los tamaños de las clumnas
        
        desabilitaCodigo();
        limpiaDatos();
        
    }
    private void desabilitaCodigo(){
    txtCodigo.setEnabled(false);
    txtDescripcion.setFocusable(true);
    rbtnActivo.setSelected(true);
    rbtnInactivo.setSelected(false);
    btnGrabar.setEnabled(false);
    btnModificar.setEnabled(false);
    }
    private void limpiaDatos(){
    txtCodigo.setText("");
    txtDescripcion.setText("");
    }
    private void inicializaDatos(){
     this.setEstado("A");
     rbtnActivo.setSelected(true);
    }
    public void lstAeronave(){
     dt.setRowCount(0);
     for(BeanAeronave x:nave.ListAeronave()){
      

         dt.addRow(new Object[]{x.getCodigo(),x.getDescripcion(),x.getFecCreacion(),x.getFecModif(),x.getEstado()
           } );
        }   
        
    }
    private boolean getCodigo(){
    boolean flag=true;
    int codigo=nave.getNextCodigo();
    txtCodigo.setText(""+codigo);
    if(codigo==0 ){
       txtCodigo.setText("");
      JOptionPane.showMessageDialog(null,"No se pudo obtener el codigo de Aeronave","Error de Sistema",JOptionPane.ERROR_MESSAGE);
      flag=false;  
    }
    return flag;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbtnActivo = new javax.swing.JRadioButton();
        rbtnInactivo = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo:");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(24, 20, 80, 15);

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnNuevo);
        btnNuevo.setBounds(450, 20, 120, 30);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descripción");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(20, 60, 80, 15);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(20, 100, 90, 15);

        rbtnActivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtnActivo.setText("Activo");
        rbtnActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnActivoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(rbtnActivo);
        rbtnActivo.setBounds(130, 100, 90, 23);

        rbtnInactivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtnInactivo.setText("Inactivo");
        rbtnInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnInactivoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(rbtnInactivo);
        rbtnInactivo.setBounds(270, 100, 90, 23);
        jDesktopPane1.add(txtCodigo);
        txtCodigo.setBounds(130, 20, 180, 25);

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jDesktopPane1.add(txtDescripcion);
        txtDescripcion.setBounds(130, 60, 180, 25);

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnGrabar);
        btnGrabar.setBounds(450, 50, 120, 30);

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnModificar);
        btnModificar.setBounds(450, 80, 120, 30);

        btnsalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnsalir);
        btnsalir.setBounds(450, 110, 120, 30);

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
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        jDesktopPane2.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Buscar Aeronave:");
        jDesktopPane2.add(jLabel3);
        jLabel3.setBounds(20, 20, 120, 15);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jDesktopPane2.add(txtBuscar);
        txtBuscar.setBounds(160, 20, 210, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane2)
                    .addComponent(jDesktopPane1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       cleanSave(); 
      if(!getCodigo()){
        return;   
       }
      habilitaDefault();
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void habilitaDefault(){
     btnGrabar.setEnabled(true);
     btnModificar.setEnabled(false);    
    }
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
    JTableUtil util=new JTableUtil();
    util.filtro(dt, JTable, txtBuscar, 1);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
    JTextFieldUtil util=new JTextFieldUtil();
    util.JTexttoUpper(txtDescripcion);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
      if(!validaDatos())
        return; 
     
        saveDatos();
    }//GEN-LAST:event_btnGrabarActionPerformed
    private void saveDatos(){
     int idNave=Integer.parseInt(txtCodigo.getText().trim().toString());
     String nomNave=txtDescripcion.getText().trim();
     String estado=this.getEstado();
       
     if(!nave.grabaAeronave(new BeanAeronave(idNave,nomNave,estado)))
      return;
      lstAeronave();
      cleanSave();
    }
    private void rbtnActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnActivoActionPerformed
       if(rbtnActivo.isSelected()){
       this.setEstado("A");
       rbtnInactivo.setSelected(false);
       }
       if(!rbtnActivo.isSelected()){
        rbtnInactivo.setSelected(true);
        this.setEstado("I");
       }
    }//GEN-LAST:event_rbtnActivoActionPerformed

    private void rbtnInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnInactivoActionPerformed
       if(rbtnInactivo.isSelected()){
         this.setEstado("I");
        rbtnActivo.setSelected(false);
       }
       if(!rbtnInactivo.isSelected()){
        rbtnActivo.setSelected(true);
        this.setEstado("A");
       }
    }//GEN-LAST:event_rbtnInactivoActionPerformed

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
     seleccionaRegistro();  
    }//GEN-LAST:event_JTableMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
   
        if(!validaDatos())
        return;
     if(FacadeAeronave.validarActualizacion(txtCodigo.getText().trim()))
         return;
     updateDatos();
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        DlgPrincipal princ=new DlgPrincipal();
        princ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed
    private void updateDatos(){
     int idNave=Integer.parseInt(txtCodigo.getText().trim().toString());
     String nomNave=txtDescripcion.getText().trim();
     String est=this.getEstado();
      System.out.println("Nombre"+nomNave+"estado"+est);
     if(!nave.UpDateAeronave(new BeanAeronave(idNave,nomNave,est)))
      return;
      lstAeronave();
      cleanSave();
      btnModificar.setEnabled(false);
    }
    private boolean validaDatos(){
     boolean flag=true;
     if(txtCodigo.getText().length()==0 || txtCodigo.getText().trim()==null){
     
      JOptionPane.showMessageDialog(null,"Codigo no valido!","Error de Sistema",JOptionPane.WARNING_MESSAGE);
      return false;
     }
     if(txtDescripcion.getText().length()==0){
     
      JOptionPane.showMessageDialog(null,"Descripción  de Nave no valido!","Error de Sistema",JOptionPane.WARNING_MESSAGE);
     return false; 
     }
     String nombre=txtDescripcion.getText();
     int i=0;
     char letras[]=nombre.toCharArray();
     for(i=0;i<nombre.length();i++){
         if(letras[i]==' '){
        
       JOptionPane.showMessageDialog(null,"Descripción cuenta con espacios en blanco!","Error de Sistema",JOptionPane.WARNING_MESSAGE);
           return false; 
       //break;
     
         }         
     
     }
     if(!rbtnActivo.isSelected() && !rbtnInactivo.isSelected()){
      JOptionPane.showMessageDialog(null,"Selecccionar un estado!","Error de Sistema",JOptionPane.WARNING_MESSAGE);
    return false;
     }
     return flag;   
    }
    
    
  
    private void seleccionaRegistro(){
     int fila=JTable.getSelectedRow();
     if(fila>-1){
      cleanDatos();
      btnGrabar.setEnabled(false);
      btnModificar.setEnabled(true);
      int codigo=Integer.parseInt(JTable.getValueAt(fila, 0).toString());
      String descripcion=(String)JTable.getValueAt(fila,1);
      String est=JTable.getValueAt(fila,4).toString().trim();
      
      txtCodigo.setText(""+codigo);
      txtDescripcion.setText(descripcion.trim());
      if(est!=null){
       if("A".equalsIgnoreCase(est.trim())){
      rbtnActivo.setSelected(true);
      rbtnInactivo.setSelected(false);
      }
      if("I".equalsIgnoreCase(est.trim())){
      rbtnActivo.setSelected(false);
      rbtnInactivo.setSelected(true);
      }   
      }   
     }
    }
     private void cleanDatos(){
      txtCodigo.setText("");
      txtDescripcion.setText("");
      rbtnActivo.setSelected(false);
      rbtnInactivo.setSelected(false);
     }
     private void cleanSave(){
      txtCodigo.setText("");
      txtDescripcion.setText("");
      rbtnActivo.setSelected(true);
      rbtnInactivo.setSelected(false);
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton rbtnActivo;
    private javax.swing.JRadioButton rbtnInactivo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
