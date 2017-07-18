/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ecocopter.interGenerales;

import ecocopter.bean.Atas;
import ecocopter.bean.Nave;
import ecocopter.bean.ReportesParticulares;
import ecocopter.beanDataSource.reportajesGene.DSRepGeneOctavo;
import ecocopter.conexion.VariablesConexion;
import ecocopter.dao.FacadeEcopter;
import ecocopter.dao.FacadeHoras;
import ecocopter.dao.FacadeReportes;
import ecocopter.interfaces.DlgReportes;
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
public final class DlgReporAtasNaveAtas extends javax.swing.JFrame {
   DefaultTableModel dt=new DefaultTableModel();
    FacadeReportes reportes=new FacadeReportes();
    FacadeHoras horas=new FacadeHoras();
    DSRepGeneOctavo data= null;
    List<DSRepGeneOctavo> lst = new ArrayList<DSRepGeneOctavo>();
   public String codAta="";
   public String ano="";
   private String codNave="";
   private int cantHoras=0; 
    /**
     * Creates new form DLgIncidenciaMes
     */
    public DlgReporAtasNaveAtas() {
      initComponents();
      listarComboNave();
      cargarTamano();
      listarComboAtas();
      clearTexto();
      desabilitaTexto();
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
      this.setTitle("N° Fallas vs. Meses en Función a Naves y Atas ");   
    }
    private void setColumnName(){
    JTable.setModel(dt);
    dt.addColumn("MES");
    dt.addColumn("N°FALLAS");
    dt.addColumn("HORAS");
    dt.addColumn("INDICE");
    JTable.getColumnModel().getColumn(0).setPreferredWidth(60);
    JTable.getColumnModel().getColumn(1).setPreferredWidth(70);
    JTable.getColumnModel().getColumn(2).setPreferredWidth(70);
    JTable.getColumnModel().getColumn(3).setPreferredWidth(70);
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

        panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbAta = new javax.swing.JComboBox();
        btnReporte = new javax.swing.JButton();
        spnanos = new com.toedter.calendar.JYearChooser();
        jLabel1 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        cmbNave = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
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

        panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Seleccionar Ata:");

        cmbAta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnReporte.setText("Generar ");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar año:");

        btnExportar.setText("Exportar PDF");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cmbNave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Seleccionar Nave:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(cmbNave, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbAta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnanos, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSalir)
                            .addGap(3, 3, 3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnReporte)
                            .addContainerGap()))
                    .addComponent(btnExportar)))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Total Fallas:");
        jLabel3.setBounds(10, 20, 70, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Total Horas:");
        jLabel4.setBounds(10, 60, 70, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Indice Fallas:");
        jLabel5.setBounds(10, 110, 70, 20);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtFallas.setBounds(100, 20, 80, 25);
        jLayeredPane1.add(txtFallas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtHoras.setBounds(100, 60, 80, 25);
        jLayeredPane1.add(txtHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtIndice.setBounds(100, 110, 80, 25);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        panel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
     ArrayList lstNave=(ArrayList)FacadeEcopter.ListaNave();
    public void listarComboNave(){
    Nave nave;
    this.cmbNave.removeAllItems();
    for(int f=0; f<lstNave.size();f++){
    nave=(Nave)lstNave.get(f);
    this.cmbNave.insertItemAt(FacadeEcopter.LeerNave(f).getNomNave(), f);
    }
    }
     public  int getCodnave(){
        Nave nave;
        int codNave = 0;
        try{
        int index=cmbNave.getSelectedIndex();
        nave=(Nave)lstNave.get(index);
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
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        clearTexto();
        dt.setRowCount(0);
        int sumaAtas=0;
        int sumaHoras=0;
        double indice=0;
        this.setAno(this.anos());
        this.setCodAta(this.getValueAta());
        this.setCodNave(getCastCodNave().trim());
      
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for(ReportesParticulares x:reportes.ListReporte4(this.getCodNave(),this.getCodAta(), this.getAno())){
            this.setCantHoras(horas.getCantHorasMesNaveAno(x.getMes().toLowerCase().trim(),this.getNomNave(),this.anos()));
            
            indice=Double.parseDouble(String.valueOf(x.getCantAta()))/Double.parseDouble(String.valueOf(this.getCantHoras()));
            indice=Math.rint(indice*100)/100;
            dt.addRow(new Object[]{x.getMes(),x.getCantAta(),this.getCantHoras(),indice} );
            sumaAtas=sumaAtas+x.getCantAta();
            sumaHoras=sumaHoras+this.getCantHoras();
            datos.setValue(x.getCantAta(), x.getMes(), x.getMes());
            data=new DSRepGeneOctavo(x.getMes(),x.getCantAta());
            lst.add(data);
        }
        this.txtFallas.setText(""+sumaAtas);
        this.txtFallas.setDisabledTextColor(Color.BLUE);
        this.txtHoras.setText(""+sumaHoras);
        this.txtHoras.setDisabledTextColor(Color.BLUE);
         JFreeChart barchart=ChartFactory.createBarChart("N° Fallas vs. Meses", "Meses", "N° Fallas", datos,PlotOrientation.VERTICAL,false,true,false);
         CategoryPlot   barcrt=barchart.getCategoryPlot();
         barcrt.setRangeGridlinePaint(Color.orange);
         ChartPanel barpanel=new ChartPanel(barchart);
         panel.removeAll();
         panel.add(barpanel,BorderLayout.CENTER);
         panel.validate();
        this.indiceAno();
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
     DlgReportes rep=new DlgReportes();
     rep.setVisible(true);
     this.setVisible(false);    
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
       
    cargaJasper();         
    }//GEN-LAST:event_btnExportarActionPerformed
    ArrayList lstAtas=(ArrayList)FacadeReportes.ListAtas();
    public void listarComboAtas(){
    Atas ata;
    this.cmbAta.removeAllItems();
    for(int f=0; f<lstAtas.size();f++){
    ata=(Atas)lstAtas.get(f);
    this.cmbAta.insertItemAt(FacadeReportes.LeerAta(f).getCodAta(), f);
    }
    }
    
    public  String getValueAta(){
        String codAta="";
        try{
        int index=cmbAta.getSelectedIndex();
        codAta=this.cmbAta.getItemAt(index).toString();
        System.out.println("Nave "+codAta);
        }catch(Exception e){
            e.printStackTrace();
        }
      return codAta;
    }
    
     private String  anos(){
    return  ano=String.valueOf(spnanos.getYear());     
    }
     public void cargaJasper(){
        try {
            String imagen="\\\\"+VariablesConexion.ip+"\\Sistema\\imagen\\logo.jpg";
            String rutaInform="\\\\"+VariablesConexion.ip+"\\Sistema\\reportes\\reporte8.jasper";
            Map parametros = new HashMap();
            parametros.put("ata",this.getCodAta());
             parametros.put("nave",this.getNomNave());
            parametros.put("ano",this.getAno());
            //parametros.put("imagen",this.getClass().getResourceAsStream(imagen));
            JasperPrint jasperPrint = JasperFillManager.fillReport(rutaInform, parametros, new JRBeanCollectionDataSource(lst));
            JasperViewer viewer=new JasperViewer(jasperPrint,false);
            viewer.setTitle("Informe");
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(DlgReporAtasNaveAtas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(DlgReporAtasNaveAtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtasNaveAtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtasNaveAtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReporAtasNaveAtas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReporAtasNaveAtas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbAta;
    private javax.swing.JComboBox cmbNave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    private com.toedter.calendar.JYearChooser spnanos;
    private javax.swing.JTextField txtFallas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the codAta
     */
    public String getCodAta() {
        return codAta;
    }

    /**
     * @param codAta the codAta to set
     */
    public void setCodAta(String codAta) {
        this.codAta = codAta;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
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
