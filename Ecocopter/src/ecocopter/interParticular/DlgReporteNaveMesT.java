
package ecocopter.interParticular;

import ecocopter.bean.ReportesGenerales;
import ecocopter.beanDataSource.reportajesParti.DSRepPartiCuarto;
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
import javax.swing.JOptionPane;
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

public final class DlgReporteNaveMesT extends javax.swing.JFrame {
DefaultTableModel dt=new DefaultTableModel();
FacadeReportes reportes=new FacadeReportes();
FacadeHoras horas=new FacadeHoras();
EcocopterUtil util=new EcocopterUtil();
DSRepPartiCuarto data= null;
List<DSRepPartiCuarto> lst = new ArrayList<DSRepPartiCuarto>();
private String mes="";
private String ano="";
private int cantHoras=0;
 
    public DlgReporteNaveMesT() {
        initComponents();
        cargarTamano();
        setTitulo();
        setColumnName();
        desabilitaTexto();
        clearTexto();
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
     this.setTitle("Reportes Totales-N°Fallas vs. Aeronaves ");
    } 
     private void setColumnName(){
    JTable.setModel(dt);
    dt.addColumn("AERONAVE");
    dt.addColumn("N°FALLAS");
    dt.addColumn("HORAS");
     dt.addColumn("INDICE");
    JTable.getColumnModel().getColumn(0).setPreferredWidth(80);
    JTable.getColumnModel().getColumn(1).setPreferredWidth(80);
    JTable.getColumnModel().getColumn(2).setPreferredWidth(80);
    JTable.getColumnModel().getColumn(3).setPreferredWidth(80);
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        spnano = new com.toedter.calendar.JYearChooser();
        btnPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbmes = new com.toedter.calendar.JMonthChooser();
        btnReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFallas = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtIndice = new javax.swing.JTextField();

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

        btnReporte.setText("Generar ");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar mes:");

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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbmes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnano, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        txtFallas.setBounds(100, 20, 80, 25);
        jLayeredPane1.add(txtFallas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtHoras.setForeground(new java.awt.Color(255, 255, 255));
        txtHoras.setBounds(100, 60, 80, 25);
        jLayeredPane1.add(txtHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtIndice.setForeground(new java.awt.Color(255, 255, 255));
        txtIndice.setBounds(100, 100, 80, 25);
        jLayeredPane1.add(txtIndice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void calcularDatos(int totalFallas,int totalHoras){
     double indice=0.00;
     txtFallas.setText(""+totalFallas);
     if(totalFallas==0){
     JOptionPane.showMessageDialog( null,"No se determino fallas.","Información",JOptionPane.WARNING_MESSAGE);
     }
     txtFallas.setDisabledTextColor(Color.BLUE);
     txtHoras.setText(""+totalHoras);
     txtHoras.setDisabledTextColor(Color.BLUE);
     if(totalHoras<=totalFallas){
      txtHoras.setDisabledTextColor(Color.RED);   
     }
     indice=Double.parseDouble(String.valueOf(totalFallas))/Double.parseDouble(String.valueOf(totalHoras));
     indice=Math.rint(indice*100)/100;
     txtIndice.setText(""+indice);
     if(indice>=1){
     this.txtIndice.setDisabledTextColor(Color.RED);
      JOptionPane.showMessageDialog( null," Verificar la Cantidad de Horas de Vuelo.\n Indice de Falla Incorrecto.","Información",JOptionPane.WARNING_MESSAGE);
     }else{
     this.txtIndice.setDisabledTextColor(Color.BLUE);
    
     } 
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
    DlgReportes reportes=new DlgReportes();
     reportes.setVisible(true);
     this.setVisible(false);    
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        
        cargaJasper();
    }//GEN-LAST:event_btnPdfActionPerformed
   public void cargaJasper(){
       try {
           String imagen="\\\\"+VariablesConexion.ip+"\\Sistema\\imagen\\logo.jpg";
           String rutaInform="\\\\"+VariablesConexion.ip+"\\Sistema\\reportes\\reporte4.jasper";
           Map parametros = new HashMap();
           parametros.put("mes",obtenerMes());
           parametros.put("ano",this.getAno());
          // parametros.put("imagen",this.getClass().getResourceAsStream(imagen));
           JasperPrint jasperPrint = JasperFillManager.fillReport(rutaInform, parametros, new JRBeanCollectionDataSource(lst));
           JasperViewer viewer=new JasperViewer(jasperPrint,false);
           viewer.setTitle("Informe");
           viewer.setVisible(true);

       } catch (JRException ex) {
           Logger.getLogger(DlgReporteIncideMesAtas.class.getName()).log(Level.SEVERE, null, ex);
       }
     }
    private String meses(){
    return    mes=String.valueOf(cmbmes.getMonth()+1); 
    }
    private String  anos(){
    return  ano=String.valueOf(spnano.getYear());     
    }
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        dt.setRowCount(0);
        clearTexto();
        int sumaHoras=0;
        int sumaAtas=0;
        double indice=0;
        this.setMes(this.meses());
        this.setAno(this.anos());
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        for(ReportesGenerales x:reportes.ListReporteNaveMesT(this.getMes(),this.getAno())){
        setCantHoras(horas.getCantHorasMesNaveAno(obtenerMes(),x.getNomNave(), this.getAno()));  
        indice=Double.parseDouble(String.valueOf(x.getCantAta()))/Double.parseDouble(String.valueOf(this.getCantHoras()));
        indice=Math.rint(indice*100)/100;
        datos.setValue(x.getCantAta(), "", x.getNomNave());
        dt.addRow(new Object[]{x.getNomNave(),x.getCantAta(),this.getCantHoras(),indice} );
        sumaHoras=sumaHoras+getCantHoras();
        sumaAtas=sumaAtas+x.getCantAta();
        data=new DSRepPartiCuarto(x.getNomNave(),x.getCantAta());
        lst.add(data);
        }
        JFreeChart barchart=ChartFactory.createBarChart("N°Fallas vs. Naves en función al mes", "Aeronaves", "N° Fallas", datos,PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot   barcrt=barchart.getCategoryPlot();
        barcrt.setRangeGridlinePaint(Color.orange);
        ChartPanel barpanel=new ChartPanel(barchart);
        capa.removeAll();
        capa.add(barpanel,BorderLayout.CENTER);
        capa.validate();
        System.out.println("Fallas= "+sumaAtas+" Horas="+sumaHoras);
       calcularDatos(sumaAtas,sumaHoras);
         System.out.println("Fallas= "+sumaAtas+" Horas="+sumaHoras);
    }//GEN-LAST:event_btnReporteActionPerformed
   
    
    private String obtenerMes(){
        int numMes=0;
        String nomMes="";
        numMes=cmbmes.getMonth()+1; 
        nomMes=util.getMes(numMes);
        return nomMes.trim();
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
            java.util.logging.Logger.getLogger(DlgReporteNaveMesT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReporteNaveMesT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReporteNaveMesT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReporteNaveMesT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReporteNaveMesT().setVisible(true);
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
