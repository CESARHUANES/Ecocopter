
package ecocopter.interfaces;

import ecocopter.bean.Nave;
import ecocopter.bean.VariablesEcocopter;
import ecocopter.dao.FacadeEcopter;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class DlgCargaArchivo extends javax.swing.JFrame {

    String codNave;
    public DlgCargaArchivo() {
        initComponents();
      
        this.setTitle("Seleccionar Archivo");
        listarCombo();
        cargarTamano();
        txtDirectorio.setEditable(false);
    }
    public void cargarTamano(){//llamar este metodo en el constructor
     
    // this.setMinimumSize(new Dimension(800, 400)); //Minima dimension
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInformacion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtDirectorio = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmbNave = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCargar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/cargar.png"))); // NOI18N
        btnCargar.setText("Cargar Archivo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/buscar.gif"))); // NOI18N
        btnBuscar.setText("Buscar Archivo");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seleccionar Archivo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccionar Aeronave:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnBuscar)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList lista=(ArrayList)FacadeEcopter.ListaNave();
    public void listarCombo(){
    Nave nave;
    this.cmbNave.removeAllItems();
    for(int f=0; f<lista.size();f++){
    nave=(Nave)lista.get(f);
    this.cmbNave.insertItemAt(FacadeEcopter.LeerNave(f).getNomNave(), f);
    }
    }


    public  String selectIndex(){
        Nave nave;
        try{
        int index=cmbNave.getSelectedIndex();
        nave=(Nave)lista.get(index);
        codNave=nave.getIdNave();
        System.out.print("Codigo Nave"+nave);
        }catch(Exception e){
            e.printStackTrace();
        }
      return codNave;
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
       DlgCabeceraArchivo cab=new DlgCabeceraArchivo();
       cab.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    public void initComponentes(){
        this.txtDirectorio.setEditable(false);
    }
    private boolean validaSeleccion(){
      boolean flag=true;  
        if(this.cmbNave.getSelectedIndex()==-1){
            System.out.println(this.cmbNave.getSelectedIndex());
          flag=false;
        }
       return flag; 
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        if(!validaSeleccion()){
         JOptionPane.showMessageDialog( null,"Debe seleccionar un registro","Información",JOptionPane.INFORMATION_MESSAGE);
   
            return;
        }
        seleccionarArchivo();
    }//GEN-LAST:event_btnBuscarActionPerformed
   
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        String directorio="";
        directorio=txtDirectorio.getText().trim();
        try {
            
            if(!directorio.equalsIgnoreCase("")){
             DlgLeerArchivo dlgLeer=new DlgLeerArchivo();
             dlgLeer.leerArchivo(directorio,this.selectIndex());
             this.setVisible(false);
            }else{
            JOptionPane.showMessageDialog( null,"No selecciono algun Archivo","Información",JOptionPane.INFORMATION_MESSAGE);
   
            }
        } catch (Exception ex) {
            Logger.getLogger(DlgCargaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCargarActionPerformed
public void seleccionarArchivo(){
          JFileChooser fileChooser=new JFileChooser();
          int returnVal=fileChooser.showOpenDialog(this);
          String directorio="";
          if(returnVal==JFileChooser.APPROVE_OPTION){
          File file = fileChooser.getSelectedFile();
          try{
          
            directorio=file.getAbsolutePath(); 
              
            if( file.getAbsolutePath().endsWith(".xlsx") || file.getAbsolutePath().endsWith(".XLSX")||file.getAbsolutePath().endsWith(".xls") || file.getAbsolutePath().endsWith(".XLS")){
               this.txtDirectorio.setText(directorio);
               lblInformacion.setText("Archivo Seleccionado: "+file.getName());
                System.out.println("Ruta"+directorio);
                System.out.println("Directorio"+file.isDirectory());
                System.out.println("Absolute file"+file.getAbsoluteFile()); 
                System.out.println("Absolute file"+file.getAbsoluteFile().exists());
                VariablesEcocopter.vPesoArchivo=String.valueOf(file.length());
            }else{
            txtDirectorio.setText("");
            lblInformacion.setText("");
            JOptionPane.showMessageDialog( null,"Selecione un Archivo de Extension Excel","Información",JOptionPane.INFORMATION_MESSAGE);
              }
             
          }catch(Exception ex){
            System.out.println("problem accessing file"+file.getAbsolutePath());
            JOptionPane.showMessageDialog( null,"Error al cargar el Archivo Excel","Error",JOptionPane.WARNING_MESSAGE);

            }
        }
       
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbNave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblInformacion;
    private javax.swing.JTextField txtDirectorio;
    // End of variables declaration//GEN-END:variables
}
