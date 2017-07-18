
package ecocopter.interParticular;

import ecocopter.bean.Atas;
import ecocopter.bean.ReportesGenerales;
import ecocopter.beanDataSource.reportajesParti.DSRepPartiDecimo;
import ecocopter.conexion.VariablesConexion;
import ecocopter.dao.FacadeHoras;
import ecocopter.dao.FacadeReportes;
import ecocopter.interfaces.DlgReportes;
import ecocopter.util.EcocopterUtil;
import ecocopter.util.UtilDescargaExcel;
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


public final class DlgReporteAtaMesNave extends javax.swing.JFrame {
    DefaultTableModel dt=new DefaultTableModel();
    FacadeReportes reportes=new FacadeReportes();
    FacadeHoras horas=new FacadeHoras();
    EcocopterUtil util=new EcocopterUtil();
    DSRepPartiDecimo data= null;
    List<DSRepPartiDecimo> lst = new ArrayList<DSRepPartiDecimo>();
    private String mes="";
    private String ano="";
    private String codAta="";
    private int cantHoras=0;
    private JFreeChart barchart=null;
    private ChartPanel barpanel=null;
   
    public DlgReporteAtaMesNave() {
    initComponents();
    cargarTamano();
    setTitulo();
    setColumnName();
    listarCombo();
    desabilitaTexto();
    clearTexto();
    }
    public void cargarTamano(){//llamar este metodo en el constructor
     this.setSize(900, 580);
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
     this.setTitle("N°Fallas vs. Aeronaves ");
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

    ArrayList lista=(ArrayList)FacadeReportes.ListAtas();
    public void listarCombo(){
    Atas ata;
    this.cmbAta.removeAllItems();
    for(int f=0; f<lista.size();f++){
    ata=(Atas)lista.get(f);
    this.cmbAta.insertItemAt(FacadeReportes.LeerAta(f).getCodAta(), f);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spnano = new com.toedter.calendar.JYearChooser();
        btnPdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbmes = new com.toedter.calendar.JMonthChooser();
        btnReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbAta = new javax.swing.JComboBox();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFallas = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtIndice = new javax.swing.JTextField();
        capa = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jProgressBar = new javax.swing.JProgressBar();
        jLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

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

        jLabel6.setText("Seleccionar Ata:");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnano, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(cmbmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbAta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbmes, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spnano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        txtFallas.setBounds(100, 20, 80, 25);
        jLayeredPane1.add(txtFallas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtHoras.setForeground(new java.awt.Color(255, 255, 255));
        txtHoras.setBounds(100, 60, 80, 25);
        jLayeredPane1.add(txtHoras, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtIndice.setForeground(new java.awt.Color(255, 255, 255));
        txtIndice.setBounds(100, 100, 80, 25);
        jLayeredPane1.add(txtIndice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        capa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        capa.setLayout(new java.awt.BorderLayout(20, 20));

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
        jScrollPane2.setViewportView(JTable);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText(" Descargar Excel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addComponent(capa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(capa, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private String meses(){
    return    mes=String.valueOf(cmbmes.getMonth()+1); 
    }
    private String  anos(){
    return  ano=String.valueOf(spnano.getYear());     
    }
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
public void cargaJasper(){
       try {
           String imagen="\\\\"+VariablesConexion.ip+"\\Sistema\\imagen\\logo.jpg";
           String rutaInform="\\\\"+VariablesConexion.ip+"\\Sistema\\reportes\\reporte10.jasper";
           Map parametros = new HashMap();
           parametros.put("ata",this.getCodAta());
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
    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        dt.setRowCount(0);
        clearTexto();
        int sumaHoras=0;
        int sumaAtas=0;
        double indice=0;
        this.setMes(this.obtenerMes());
        this.setAno(this.anos());
        this.setCodAta(this.getValueAta());
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        System.out.println("MES"+this.getMes()+"Cod Ata"+this.getCodAta()+"Año"+this.getAno());
        for(ReportesGenerales x:reportes.ListReporte5(this.getMes(),this.getCodAta(),this.getAno())){
            setCantHoras(horas.getCantHorasMesNaveAno(this.getMes(),x.getNomNave(), this.getAno()));
            indice=Double.parseDouble(String.valueOf(x.getCantAta()))/Double.parseDouble(String.valueOf(this.getCantHoras()));
            indice=Math.rint(indice*100)/100;
            datos.setValue(x.getCantAta(), "", x.getNomNave());
            dt.addRow(new Object[]{x.getNomNave(),x.getCantAta(),this.getCantHoras(),indice} );
            sumaHoras=sumaHoras+getCantHoras();
            sumaAtas=sumaAtas+x.getCantAta();
            data=new DSRepPartiDecimo(x.getNomNave(),x.getCantAta(),this.getCantHoras(),indice);
            lst.add(data);
        }
         setBarchart(ChartFactory.createBarChart("N°Fallas vs. Aeronaves ", "Aeronaves", "N° Fallas", datos,PlotOrientation.VERTICAL,false,true,false));
        CategoryPlot   barcrt=getBarchart().getCategoryPlot();
        barcrt.setRangeGridlinePaint(Color.orange);
        setBarpanel(new ChartPanel(getBarchart()));
        capa.removeAll();
        capa.add(getBarpanel(),BorderLayout.CENTER);
        capa.validate();
        System.out.println("Fallas= "+sumaAtas+" Horas="+sumaHoras);
        calcularDatos(sumaAtas,sumaHoras);
        System.out.println("Fallas= "+sumaAtas+" Horas="+sumaHoras);
    }//GEN-LAST:event_btnReporteActionPerformed
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        DlgReportes reportes=new DlgReportes();
        reportes.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
     
            UtilDescargaExcel util=new UtilDescargaExcel();
            util.gestionDescargaExcel(JTable, jProgressBar, jLabel, getBarchart());
            
    }//GEN-LAST:event_JTableMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       
    }//GEN-LAST:event_formKeyPressed
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
     public  String getValueAta(){
        String codAta="";
        try{
        int index=cmbAta.getSelectedIndex();
        codAta=this.cmbAta.getItemAt(index).toString();
        System.out.println("Nave"+codAta);
        }catch(Exception e){
            e.printStackTrace();
        }
      return codAta;
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
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReporteAtaMesNave().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel capa;
    private javax.swing.JComboBox cmbAta;
    private com.toedter.calendar.JMonthChooser cmbmes;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JYearChooser spnano;
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
     * @return the barpanel
     */
    public ChartPanel getBarpanel() {
        return barpanel;
    }

    /**
     * @param barpanel the barpanel to set
     */
    public void setBarpanel(ChartPanel barpanel) {
        this.barpanel = barpanel;
    }

    /**
     * @return the barchart
     */
    public JFreeChart getBarchart() {
        return barchart;
    }

    /**
     * @param barchart the barchart to set
     */
    public void setBarchart(JFreeChart barchart) {
        this.barchart = barchart;
    }
}
