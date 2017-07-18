

package ecocopter.interfaces;

import ecocopter.bean.Horas;
import ecocopter.bean.HorasResumen;
import ecocopter.bean.Nave;
import ecocopter.dao.FacadeEcopter;
import ecocopter.dao.FacadeHoras;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class DlgRegistroHoras extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();//instaciamos ala tabla por defecto
DefaultTableModel dt2=new DefaultTableModel();//instacamos ala tabla por defecto
FacadeHoras facade=new FacadeHoras();

    public DlgRegistroHoras() {
        initComponents();
        cargarTamano();
        this.setTitle("Registro de Horas de Vuelo");
        listarCombo();
        cargaGrilla();
        namesColumns();
        cargaGrillaResumen();
        namesColumnsResumen();
    }
  public void namesColumns(){
    JTableHistorial.setModel(dt);
        dt.addColumn("CODIGO");
        dt.addColumn("NAVE");
        dt.addColumn("MES");
        dt.addColumn("AÑO");
        dt.addColumn("CANT.HORAS");
        dt.addColumn("FECHA REGISTRO");
      
        JTableHistorial.getColumnModel().getColumn(0).setPreferredWidth(80);
        JTableHistorial.getColumnModel().getColumn(1).setPreferredWidth(100);
        JTableHistorial.getColumnModel().getColumn(2).setPreferredWidth(100);
        JTableHistorial.getColumnModel().getColumn(3).setPreferredWidth(100);
        JTableHistorial.getColumnModel().getColumn(4).setPreferredWidth(100);
        JTableHistorial.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        JTableHistorial.getTableHeader().setEnabled(false);//desabilitar los tamaños de las clumnas    
  }
  public void namesColumnsResumen(){
    JTableResumen.setModel(dt2);

        dt2.addColumn("NAVE");
        dt2.addColumn("MES");
        dt2.addColumn("AÑO");
        dt2.addColumn("TOTAL HORAS/MES");
        JTableResumen.getColumnModel().getColumn(0).setPreferredWidth(100);
        JTableResumen.getColumnModel().getColumn(1).setPreferredWidth(100);
        JTableResumen.getColumnModel().getColumn(2).setPreferredWidth(100);
        JTableResumen.getColumnModel().getColumn(3).setPreferredWidth(100);
        JTableResumen.getTableHeader().setEnabled(false);//desabilitar los tamaños de las clumnas    
  }
  private void inicializar(){
    this.cmbNave.setSelectedIndex(-1);
    this.spnHoras.setValue(0);
    
  }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableResumen = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableHistorial = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbAno = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        cmbNave = new javax.swing.JComboBox();
        cmbMes = new com.toedter.calendar.JMonthChooser();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        spnHoras = new com.toedter.components.JSpinField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        JTableResumen.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(JTableResumen);

        jLabel4.setText("Total de Horas Voladas");

        jLabel5.setText("Historial de Horas Voladas");

        JTableHistorial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(JTableHistorial);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRegistrar.setText("Registar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Selecionar Mes:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Seleccionar Nave:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Horas Voladas:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Seleccionar año:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbNave, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbMes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAno, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6))
                            .addComponent(cmbAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(spnHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void cargaGrilla(){
        dt.setRowCount(0);
      ArrayList lstHistorial=new ArrayList() ;  
      lstHistorial=FacadeHoras.listaHistorialHoras();
      for(int i=0;i<lstHistorial.size();i++){
          String idHora=((ArrayList)(lstHistorial.get(i))).get(0).toString();
          String nomAeronave=((ArrayList)(lstHistorial.get(i))).get(1).toString();
          String mes=((ArrayList)(lstHistorial.get(i))).get(2).toString();
          String ano=((ArrayList)(lstHistorial.get(i))).get(3).toString();
          String horas=((ArrayList)(lstHistorial.get(i))).get(4).toString();
          String fecha=((ArrayList)(lstHistorial.get(i))).get(5).toString();
         
          dt.addRow(new Object[]{idHora,nomAeronave,mes,ano,horas,fecha} );
      }   
         
     
    }
     public void cargaGrillaResumen(){
          dt2.setRowCount(0);
      ArrayList lstResumen=new ArrayList() ;  
      lstResumen=FacadeHoras.listaResumenHoras();
      for(int i=0;i<lstResumen.size();i++){
          String aeronave=((ArrayList)(lstResumen.get(i))).get(0).toString();
          String mes=((ArrayList)(lstResumen.get(i))).get(1).toString();
          String ano=((ArrayList)(lstResumen.get(i))).get(2).toString();
          String cantHoras=((ArrayList)(lstResumen.get(i))).get(3).toString();
          
         
          dt2.addRow(new Object[]{aeronave,mes,ano,cantHoras} );
      }   
     
    }
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if(!validaSelecNave())
            return;
       
        if(!validaHoras())
            return;
       if(registraHora()){
        JOptionPane.showMessageDialog( null,"Hora Registrada","Información",JOptionPane.INFORMATION_MESSAGE);  
        cargaGrilla();
        cargaGrillaResumen();
        }else{
        JOptionPane.showMessageDialog( null,"Error al Registrar","Error",JOptionPane.WARNING_MESSAGE);
    
        }
            
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargaGrilla();
        cargaGrillaResumen();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminaResgistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        DlgPrincipal princ=new DlgPrincipal();
        princ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    public boolean validaSelecNave(){
     int index=cmbNave.getSelectedIndex();
     if(index<0){
       JOptionPane.showMessageDialog( null," Seleccionar un Aeronave","Información",JOptionPane.INFORMATION_MESSAGE);    
         return false;
     }
     return true;    
    }
    public boolean validaAnos(){
    
     String ano=String.valueOf(cmbAno.getYear()).trim();
     String  dato=String.valueOf(cmbAno.getValue()).trim();
     if(ano.length()!=4 || ano.trim()==null || (!isNumeric(ano))){
        System.out.println("Años"+ano);
         System.out.println("Años"+dato);
       JOptionPane.showMessageDialog( null," Seleccionar un año Correcto","Información",JOptionPane.INFORMATION_MESSAGE);    
        return false;
     }
     return true;    
    }
    public static boolean isNumeric(String str)  
    {  
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }
    public boolean validaHoras(){
     int horas=spnHoras.getValue();
     
     if(horas<1){
       JOptionPane.showMessageDialog( null,"Ingrese la hora correcta","Información",JOptionPane.INFORMATION_MESSAGE);    
        return false;
     }
     return true;    
    }
   
    
    public boolean  registraHora(){
     boolean flag=true;
     try{
     FacadeHoras facade=new FacadeHoras();
     facade.registraHoras(new Horas(this.getCodnave(),this.obtenerMes(),this.anos(),this.getHoras()));
     }catch(Exception e){
       e.printStackTrace();
       flag=false;
     }
     return flag;
     }
    
   
    public void cargarTamano(){//llamar este metodo en el constructor
     
     this.setSize(690, 650);
     this.setResizable(false); // no permite cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     //this.setAlwaysOnTop( true );//se antepone al modal anterior
     this.setLocationRelativeTo(null);//centrado
    }
    ArrayList lista=(ArrayList)FacadeEcopter.ListaNave();
    public void listarCombo(){
    Nave nave;
    this.cmbNave.removeAllItems();
    for(int f=0; f<lista.size();f++){
    nave=(Nave)lista.get(f);
    this.cmbNave.insertItemAt(FacadeEcopter.LeerNave(f).getNomNave(), f);
    }
    }
    
    public String getMes(int mes){
    String meses="";
    switch(mes) {        
        case 1:
        meses="enero";
        break;
        case 2:
        meses="febrero";
        break;
        case 3:
        meses="marzo";
        break;
        case 4:
        meses="abril";
        break;
        case 5:
        meses="mayo";
        break;
        case 6:
        meses="junio";
        break;
        case 7:
        meses="julio";
        break;
        case 8:
        meses="agosto";
        break;
        case 9:
        meses="setiembre";
        break;
        case 10:
        meses="octubre";
        break;
        case 11:
        meses="noviembre";
        break;
        case 12:
        meses="diciembre";
        break; 

        }
    return meses.trim();  
    }
     private String obtenerMes(){
        int numMes=0;
        String nomMes="";
        numMes=cmbMes.getMonth()+1; 
        nomMes=this.getMes(numMes);
        return nomMes;
    }
     private int getHoras(){
         
     int numHoras=spnHoras.getValue();
     
     return numHoras;  
     }
     private String  anos(){
     String ano="";    
     return  ano=String.valueOf(cmbAno.getYear());     
    }
     public  int getCodnave(){
        Nave nave;
        int codNave = 0;
        try{
        int index=cmbNave.getSelectedIndex();
        nave=(Nave)lista.get(index);
        codNave=Integer.parseInt(nave.getIdNave());
        System.out.print("Codigo Nave"+nave);
        }catch(Exception e){
            e.printStackTrace();
        }
      return codNave;
    }
     public void eliminaResgistro(){
        String idArchivo;
        int fila=JTableHistorial.getSelectedRow();
        if(fila>-1){
        idArchivo=JTableHistorial.getValueAt(fila,0).toString();
        
        if(!facade.deleteHistHora(idArchivo))
         return;   
        cargaGrilla();
        cargaGrillaResumen();
        JOptionPane.showMessageDialog( null,"Registro Eliminado","Información",JOptionPane.INFORMATION_MESSAGE);  
         
        }else{
        JOptionPane.showMessageDialog( null,"Usted debe seleccionar un Registro.!","Información",JOptionPane.INFORMATION_MESSAGE);   

        }
    }
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
            java.util.logging.Logger.getLogger(DlgRegistroHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRegistroHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRegistroHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRegistroHoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgRegistroHoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableHistorial;
    private javax.swing.JTable JTableResumen;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private com.toedter.calendar.JYearChooser cmbAno;
    private com.toedter.calendar.JMonthChooser cmbMes;
    private javax.swing.JComboBox cmbNave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.components.JSpinField spnHoras;
    // End of variables declaration//GEN-END:variables
}
