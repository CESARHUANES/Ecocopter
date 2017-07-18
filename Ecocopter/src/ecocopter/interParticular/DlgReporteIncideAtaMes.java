
package ecocopter.interParticular;

import ecocopter.bean.ReportesParticulares;
import ecocopter.beanDataSource.reportajesParti.DSRepPartiPrimero;
import ecocopter.conexion.VariablesConexion;
import ecocopter.dao.FacadeHoras;
import ecocopter.dao.FacadeReportes;
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


public class DlgReporteIncideAtaMes extends javax.swing.JFrame {
    DefaultTableModel dt=new DefaultTableModel();
    FacadeReportes reportes=new FacadeReportes();
    FacadeHoras horas=new FacadeHoras();
    EcocopterUtil util=new EcocopterUtil();
    DSRepPartiPrimero data= null;
   List<DSRepPartiPrimero> lista = new ArrayList<DSRepPartiPrimero>();

    public String mes="";
    public String ano="";
    private int totalAtas=0;//total de fallas en determinado mes
    private int cantHoras=0; 

    public DlgReporteIncideAtaMes() {
        initComponents();
        cargarTamano();
        desabilitaTexto();
        setTitulo();
        setColumnName();
        clearTexto();
    }
     private void cargarTamano(){//llamar este metodo en el constructor
     this.setSize(900, 530);
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);//centrado
     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbmes = new com.toedter.calendar.JMonthChooser();
        spnano = new com.toedter.calendar.JYearChooser();
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

        btnReporte.setText("Generar");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnPdf.setText("Exportar PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar mes:");

        jLabel2.setText("Seleccionar año:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbmes, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(spnano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbmes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Total Fallas:");
        jLabel3.setBounds(10, 20, 80, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Total Horas: ");
        jLabel4.setBounds(10, 60, 70, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Indice Fallas :");
        jLabel5.setBounds(10, 100, 80, 20);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtFallas.setForeground(new java.awt.Color(255, 255, 255));
        txtFallas.setBounds(130, 20, 80, 25);
        jLayeredPane1.add(txtFallas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtHoras.setForeground(new java.awt.Color(255, 255, 255));
        txtHoras.setBounds(130, 60, 80, 25);
        jLayeredPane1.add(txtHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtIndice.setForeground(new java.awt.Color(255, 255, 255));
        txtIndice.setBounds(130, 100, 80, 25);
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
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
      this.setTitle("N° Fallas vs. Atas en Función al mes.");   
    }
    private void setColumnName(){
    JTable.setModel(dt);
    dt.addColumn("ATA");
    dt.addColumn("N°FALLAS");
    dt.addColumn("HORAS");
    dt.addColumn("INDICE");
    JTable.getColumnModel().getColumn(0).setPreferredWidth(50);
    JTable.getColumnModel().getColumn(1).setPreferredWidth(90);
    JTable.getColumnModel().getColumn(2).setPreferredWidth(80);
    JTable.getColumnModel().getColumn(3).setPreferredWidth(80);
    }
  
    private void totalHorasMes(String mes,String ano){
     
      setCantHoras(horas.getCantHoras(mes,ano.trim()));
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
    private void indiceMes(){
     double ind=this.getCalulaIndice() ;  
     this.txtIndice.setText(""+ind);
     if(ind>1){
     this.txtIndice.setDisabledTextColor(Color.RED);
     }else{
      this.txtIndice.setDisabledTextColor(Color.BLUE);
   
     }
    }
    private String meses(){
    return    mes=String.valueOf(cmbmes.getMonth()+1); 
    }
    private String  anos(){
    return  ano=String.valueOf(spnano.getYear());     
    }
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        clearTexto();
         dt.setRowCount(0);
         int sumaAtas=0;
         double indice=0;
        this.setMes("0"+this.meses().trim());
        this.setAno(this.anos().trim());
        this.totalHorasMes(obtenerMes(),this.getAno().trim());
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for(ReportesParticulares x:reportes.ListReporte(this.getMes().trim(),this.getAno().trim())){
         indice=Double.parseDouble(String.valueOf(x.getCantAta()))/Double.parseDouble(String.valueOf(this.getCantHoras()));
         indice=Math.rint(indice*100)/100;
        dt.addRow(new Object[]{x.getAta(),x.getCantAta(),this.getCantHoras(),indice} );
        sumaAtas=sumaAtas+x.getCantAta();
        datos.setValue(x.getCantAta(), x.getAta(), x.getAta());
        data=new DSRepPartiPrimero(x.getAta(),x.getCantAta());
        lista.add(data);
        }
         this.txtFallas.setText(""+sumaAtas);
         this.txtFallas.setDisabledTextColor(Color.BLUE);
         System.out.println("Total Fallas= "+sumaAtas);
         JFreeChart barchart=ChartFactory.createBarChart("N° Fallas vs. Atas en función al mes", "Atas", "N° Fallas", datos,PlotOrientation.VERTICAL,false,true,false);
         CategoryPlot   barcrt=barchart.getCategoryPlot();
         barcrt.setRangeGridlinePaint(Color.BLUE);
         ChartPanel barpanel=new ChartPanel(barchart);
         capa.removeAll();
         capa.add(barpanel,BorderLayout.CENTER);
         capa.validate();
         this.indiceMes();
    }//GEN-LAST:event_btnReporteActionPerformed
   private String obtenerMes(){
        int numMes=0;
        String nomMes="";
        numMes=cmbmes.getMonth()+1; 
        nomMes=util.getMes(numMes);
        return nomMes.trim();
    }
    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed

     cargaJasper();
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

     DlgReportes reportes=new DlgReportes();
     reportes.setVisible(true);
     this.setVisible(false);    
    }//GEN-LAST:event_btnSalirActionPerformed
 
   
    public void cargaJasper(){
       try {
           String imagen="\\\\"+VariablesConexion.ip+"\\Sistema\\imagen\\logo.jpg";
           String rutaInform="\\\\"+VariablesConexion.ip+"\\Sistema\\reportes\\reporte.jasper";
           Map parametros = new HashMap();
           parametros.put("mes",obtenerMes());
           parametros.put("ano",this.getAno());
          // parametros.put("imagen",this.getClass().getResourceAsStream(imagen));
           JasperPrint jasperPrint = JasperFillManager.fillReport(rutaInform, parametros,  new JRBeanCollectionDataSource(lista));
           JasperViewer viewer=new JasperViewer(jasperPrint,false);
           viewer.setTitle("Informe");
           viewer.setVisible(true);

       } catch (JRException ex) {
           Logger.getLogger(DlgReporteIncideMesAtas.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(DlgReporteIncideAtaMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReporteIncideAtaMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReporteIncideAtaMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReporteIncideAtaMes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReporteIncideAtaMes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel capa;
    private com.toedter.calendar.JMonthChooser cmbmes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser spnano;
    private javax.swing.JTextField txtFallas;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtIndice;
    // End of variables declaration//GEN-END:variables

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
     * @return the totalAtas
     */
    public int getTotalAtas() {
        return totalAtas;
    }

    /**
     * @param totalAtas the totalAtas to set
     */
    public void setTotalAtas(int totalAtas) {
        this.totalAtas = totalAtas;
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
