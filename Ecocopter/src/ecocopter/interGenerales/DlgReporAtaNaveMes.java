
package ecocopter.interGenerales;

import ecocopter.bean.Nave;
import ecocopter.bean.ReportesGenerales;
import ecocopter.beanDataSource.reportajesGene.DSRepGeneSexto;
import ecocopter.conexion.VariablesConexion;
import ecocopter.dao.FacadeEcopter;
import ecocopter.dao.FacadeHoras;
import ecocopter.dao.FacadeReportes;
import ecocopter.interParticular.DlgReporteIncideMesAtas;
import ecocopter.interfaces.DlgReportes;
import ecocopter.util.EcocopterUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Cesar
 */
public final class DlgReporAtaNaveMes extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();
FacadeReportes reportes=new FacadeReportes();
FacadeHoras horas=new FacadeHoras();
EcocopterUtil util=new EcocopterUtil();
DSRepGeneSexto data= null;
List<DSRepGeneSexto>  lst = null;
private String codNave="";
public String ano="";
private String mes="";
private int cantHoras=0; 

    public DlgReporAtaNaveMes() {
        initComponents();
        listarCombo();
        cargarTamano();
        desabilitaTexto();
        clearTexto();
        setTitulo();
        setColumnName();
    }
   public void cargarTamano(){//llamar este metodo en el constructor
     this.setSize(900, 530);
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);//centrado
     
    }
private void desabilitaTexto(){
    this.txtFallas.setEnabled(false);
    this.txtHoras.setEnabled(false);
    this.txtIndice.setEnabled(false);
    } 
  private void clearTexto(){
     this.txtFallas.setText("");
     this.txtHoras.setText("");
     this.txtIndice.setText("");
     this.txtFallas.setText("0.00");
     this.txtHoras.setText("0.00");
     this.txtIndice.setText("0.00");
    }
    private void setTitulo(){
     this.setTitle("N°Fallas vs. Atas en Función al Mes y Aeronaves");
    }  
     private void setColumnName(){
    JTable.setModel(dt);
    dt.addColumn("ATA");
    dt.addColumn("N° FALLAS");
    dt.addColumn("HORAS");
    dt.addColumn("INDICE");
    JTable.getColumnModel().getColumn(0).setPreferredWidth(50);
    JTable.getColumnModel().getColumn(1).setPreferredWidth(90);
    JTable.getColumnModel().getColumn(2).setPreferredWidth(70);
    JTable.getColumnModel().getColumn(3).setPreferredWidth(80);

     }
   
     private void totalHorasMesAno(String mes,String nomNave,String ano){
     
        setCantHoras(horas.getCantHorasMesNaveAno(mes,nomNave,ano));
     System.out.println(""+getCantHoras());
     this.txtHoras.setText(""+getCantHoras());
     this.txtHoras.setDisabledTextColor(Color.BLUE);
    }
      private double getCalulaIndice(){
     double totalFallas=0;
     double totalHoras=0;
     double totalIndice=0;
    totalFallas=Double.parseDouble(this.txtFallas.getText().trim().toString());
    totalHoras=Double.parseDouble(this.txtHoras.getText().trim().toString());
    totalIndice=totalFallas/totalHoras; 
    totalIndice= Math.rint(totalIndice*100)/100;
    System.out.println("Indice Fallas"+totalIndice);
    return totalIndice;   
    }
     private void indiceAno(){
     double ind=this.getCalulaIndice() ;  
     this.txtIndice.setText(""+ind);
     if(ind>1){
     this.txtIndice.setDisabledTextColor(Color.RED);
     }else{
      this.txtIndice.setDisabledTextColor(Color.BLUE);
   
     }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        spnano = new com.toedter.calendar.JYearChooser();
        btnPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cmbNave = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmbmes = new com.toedter.calendar.JMonthChooser();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFallas = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtIndice = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        capa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        capa.setLayout(new java.awt.BorderLayout(20, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnPdf.setText("Exportar PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar año:");

        btnReporte.setText("Generar");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Aeronave:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbNave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Seleccionar Mes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbmes, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(spnano, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(cmbNave, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbmes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Total Fallas:");
        jLabel3.setBounds(10, 20, 80, 14);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Total Horas:");
        jLabel4.setBounds(10, 50, 80, 14);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Total Indice:");
        jLabel5.setBounds(10, 90, 80, 14);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtFallas.setBounds(130, 10, 70, 25);
        jLayeredPane1.add(txtFallas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtHoras.setBounds(130, 50, 70, 25);
        jLayeredPane1.add(txtHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndiceActionPerformed(evt);
            }
        });
        txtIndice.setBounds(130, 90, 70, 25);
        jLayeredPane1.add(txtIndice, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        jScrollPane2.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(capa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

     DlgReportes rep=new DlgReportes();
     rep.setVisible(true);
     this.setVisible(false);    
        
    }//GEN-LAST:event_btnSalirActionPerformed
     public  String getNomNave(){
        String nave="";
        try{
        int index=cmbNave.getSelectedIndex();
        nave=this.cmbNave.getItemAt(index).toString();
        System.out.print("nave "+nave);
        }catch(Exception e){
            e.printStackTrace();
        }
      return nave;
    }
    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        
        cargaJasper();
    }//GEN-LAST:event_btnPdfActionPerformed
   public void cargaJasper(){
       try {
          
           String imagen="\\\\"+VariablesConexion.ip+"\\Sistema\\imagen\\logo.jpg";
           String rutaInform="\\\\"+VariablesConexion.ip+"\\Sistema\\reportes\\reporte6.jasper";
           Map parametros = new HashMap();
           parametros.put("nave",getNomNave());
           parametros.put("mes",obtenerMes());
           parametros.put("ano",this.getAno());
          // parametros.put("imagen",this.getClass().getResourceAsStream(imagen));
           JasperPrint jasperPrint = JasperFillManager.fillReport(rutaInform, parametros, new JRBeanCollectionDataSource(lst));
           JasperViewer viewer=new JasperViewer(jasperPrint,false);
           viewer.setTitle("Informe");
           viewer.setVisible(true);
           lst = null;
       } catch (JRException ex) {
           Logger.getLogger(DlgReporteIncideMesAtas.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
  
    private String  anos(){
    return  ano=String.valueOf(spnano.getYear());     
    }
     /**
     * @param args the command line arguments
     */
     ArrayList lista=(ArrayList)FacadeEcopter.ListaNave();
    public void listarCombo(){
    Nave nave;
    this.cmbNave.removeAllItems();
    for(int f=0; f<lista.size();f++){
    nave=(Nave)lista.get(f);
    this.cmbNave.insertItemAt(FacadeEcopter.LeerNave(f).getNomNave(), f);
    }
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
    public String getCastCodNave(){
    String codigo="";
    codigo=String.valueOf(this.getCodnave());
    return codigo.trim();
    } 
    private String meses(){
    return    mes=String.valueOf(cmbmes.getMonth()+1); 
    }
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        clearTexto(); 
       dt.setRowCount(0);
       int sumaAtas=0;
        double indice=0;
        this.setAno(this.anos());
        this.setCodNave(this.getCastCodNave());
        this.setMes("0"+this.meses().trim());
        this.totalHorasMesAno(obtenerMes(),getNomNave(),this.getAno().trim());

        System.out.println("CODIGO NAVE "+this.getCodNave()+"MES "+this.getMes()+" ANO "+this.getAno());
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for(ReportesGenerales x:reportes.ListReporteAtaNaveMes(this.getCodNave(),this.getMes(),this.getAno())){
            datos.setValue(x.getCantAta(), "", x.getCodAta());
            indice=Double.parseDouble(String.valueOf(x.getCantAta()))/Double.parseDouble(String.valueOf(this.getCantHoras()));
            indice=Math.rint(indice*100)/100;
            dt.addRow(new Object[]{x.getCodAta(),x.getCantAta(),this.getCantHoras(),indice} );
            sumaAtas=sumaAtas+x.getCantAta();
            lst = new ArrayList<DSRepGeneSexto>();
            data=new DSRepGeneSexto(x.getCodAta(),x.getCantAta());
            lst.add(data);
        }
        this.txtFallas.setText(""+sumaAtas);
        this.txtFallas.setDisabledTextColor(Color.BLUE);
        System.out.println("Total Fallas= "+sumaAtas);
        JFreeChart barchart=ChartFactory.createBarChart("N°Fallas vs. Atas ", "Atas", "N° Fallas", datos,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot   barcrt=barchart.getCategoryPlot();
        barcrt.setRangeGridlinePaint(Color.orange);
        ChartPanel barpanel=new ChartPanel(barchart);
        capa.removeAll();
        capa.add(barpanel,BorderLayout.CENTER);
        capa.validate();
         this.indiceAno();
        
    }//GEN-LAST:event_btnReporteActionPerformed
    private String obtenerMes(){
        int numMes=0;
        String nomMes="";
        numMes=cmbmes.getMonth()+1; 
        nomMes=util.getMes(numMes);
        return nomMes.trim();
    }
    private void txtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndiceActionPerformed

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
            java.util.logging.Logger.getLogger(DlgReporAtaNaveMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtaNaveMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtaNaveMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtaNaveMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReporAtaNaveMes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel capa;
    private javax.swing.JComboBox cmbNave;
    private com.toedter.calendar.JMonthChooser cmbmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser spnano;
    private javax.swing.JTextField txtFallas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables

   

    public String getAno() {
        return ano;
    }

   
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the codNave
     */
    public String getCodNave() {
        return codNave;
    }

    /**
     * @param codNave the codNave to set
     */
    public void setCodNave(String codNave) {
        this.codNave = codNave;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the cantHoras
     */
    public int getCantHoras() {
        return cantHoras;
    }

    /**
     * @param cantHoras the cantHoras to set
     */
    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    
}
