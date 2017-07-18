
package ecocopter.sucesos.Interface;

import ecocopter.sucesos.Bean.BeanAeronave;
import ecocopter.sucesos.Bean.BeanAreaResponsable;
import ecocopter.sucesos.Bean.BeanCategoria;
import ecocopter.sucesos.Bean.BeanClaseSuceso;
import ecocopter.sucesos.Bean.BeanDepartamento;

import ecocopter.sucesos.Bean.BeanFaseVuelo;
import ecocopter.sucesos.Bean.BeanMovimientoPublico;
import ecocopter.sucesos.Bean.BeanPlataforma;
import ecocopter.sucesos.Bean.BeanProveedor;
import ecocopter.sucesos.Bean.BeanReportador;
import ecocopter.sucesos.Dao.DBSucesos;
import ecocopter.sucesos.Facade.FacadeSucesos;
import ecocopter.sucesos.Facade.VariablesSucesos;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public final class DlgMantenimientoSucesos extends javax.swing.JFrame {
private String codReportador="";
private String codProveedor="";
private String codDestino="";
private String codOrigen="";
private String codLugarSuceso="";
private String codAreaResp="";
private String codFaseVuelo="";
private String codAreaMov="";
private String codSuceso="";
private String codCategoria="";
private String codEvento="";
private String codPlataforma="";
private String codAeronave="";

private String codigoRegistro="";

public DlgMantenimientoSucesos(){
    
}
    public DlgMantenimientoSucesos(String codSuceso) {
        initComponents();
        this.setTitle("Mantenimiento de Sucesos");
        FacadeSucesos facade=new FacadeSucesos();
       
        this.setCodigoRegistro(codSuceso);
        facade.lstCmbProveedor(cmbProveedor);
        facade.lstCmbReportador(cmbReportador);
        facade.lstCmbDepartamento(cmbDestino);
        facade.lstCmbDepartamento(cmbOrigen);
        facade.lstCmbDepartamento(cmbLugarSuceso);
        facade.lstCmbAreaResponsable(cmbAreaResp);
        facade.lstCmbFaseVuelo(cmbFaseVuelo);
        facade.lstCmbMovPublico(cmbAreaMov);
        facade.lstCmbClaseSuceso(cmbSuceso);
        facade.lstCmbCategoria(cmbCategoria);
        facade.lstCmbEvento(null);
        facade.lstCmbPlataforma(cmbPlataforma);
        facade.lstCmbAeronave(cmbAeronave);
          System.out.println("proveedor"+VariablesSucesos.lstProveedor.size());
            System.out.println("reportador"+VariablesSucesos.lstReportador.size());
            System.out.println("departamento"+VariablesSucesos.lstDepartamento.size());
            System.out.println("fasevuelo"+VariablesSucesos.lstFaseVuelo.size());
            System.out.println("area responsable"+VariablesSucesos.lstAreaResponsable.size());
            System.out.println("mov public"+VariablesSucesos.lstMovPublico.size());
            System.out.println("clase suceso"+VariablesSucesos.lstClaseSuceso.size());
            System.out.println("categoria"+VariablesSucesos.lstCategoriaSuceso.size());
          
            System.out.println("plataforma"+VariablesSucesos.lstPlataformaSuceso.size());
            System.out.println("areronave"+VariablesSucesos.lstAeronave.size());
        if(VariablesSucesos.estado.equalsIgnoreCase(ConstantesSucesos.ACTUALIZAR)){
        setDatos(this.getCodigoRegistro());
        }
        this.setResizable(false); // no permit cambiar de tamaño
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
        this.setLocationRelativeTo(null); 
        this.setAlwaysOnTop(true);
        txtCantCaracteres.setEditable(false);
        txtFecha.setEditable(false);
        txtDescEvento.setEditable(false);
       }
    
   private void setTextoDesc(){
   String texto="";
   texto=txtDescripcion.getText().toUpperCase();
    txtDescripcion.setLineWrap(true);
    txtDescripcion.setWrapStyleWord(true);
    if(!(validaCantDigitos(texto)))
        return;
    txtDescripcion.setText(texto);
    txtCantCaracteres.setText("");
    txtCantCaracteres.setText(""+texto.length());
   }
   private boolean validaCantDigitos(String texto){
    if(texto.length()==ConstantesSucesos.CANTIDAD_DIGISTOS){
     
     JOptionPane.showMessageDialog(this, "Cantidad maxima de digito(1000 caracteres).","Información", JOptionPane.INFORMATION_MESSAGE);
    
     return false;   
    }
     return true;   
   }
   private String getFecha(){
    String fecha="";
    String dia=Integer.toString(jCalendar.getCalendar().get(Calendar.DATE));
    String mes=Integer.toString(jCalendar.getCalendar().get(Calendar.MONTH)+1);
    String ano=Integer.toString(jCalendar.getCalendar().get(Calendar.YEAR)); 
    fecha=dia+"/"+mes+"/"+ano.trim();
    
    return fecha;
   }
   
   private boolean grabaSuceso(){
    FacadeSucesos facade=new FacadeSucesos();
    String descSuceso=txtDescripcion.getText();
 
    if(facade.grabaSuceso(this.getFecha(), descSuceso, Integer.parseInt(this.getCodAeronave()),
            this.getCodReportador(), this.getCodProveedor(),this.getCodSuceso(),
           this.getCodCategoria(), VariablesSucesos.codigoEvento, this.getCodPlataforma(),
           this.getCodFaseVuelo(),this.getCodAreaResp(), this.getCodAreaMov(),
           this.getCodOrigen(), this.getCodDestino(),this.getCodLugarSuceso(),"JCARRASCO")){
   
     return true;   
    }else{
        
       return false; 
    }
   }
   private boolean actualizaSuceso(){
    FacadeSucesos facade= new FacadeSucesos();
     String descSuceso=txtDescripcion.getText();
      System.out.println(""+this.getCodigoRegistro());
      System.out.println(""+this.getFecha());
      System.out.println(""+descSuceso);
      System.out.println(""+Integer.parseInt(this.getCodAeronave()));
      System.out.println(""+this.getCodReportador());
      System.out.println(""+this.getCodProveedor());
      System.out.println(""+this.getCodSuceso());
      System.out.println(""+this.getCodCategoria());
      System.out.println(""+this.getCodEvento());
      System.out.println(""+this.getCodPlataforma());
      System.out.println("");
      if(facade.actualizaSuceso(this.getCodigoRegistro(), this.getFecha(), descSuceso, Integer.parseInt(this.getCodAeronave()),
              this.getCodReportador(), this.getCodProveedor(), this.getCodSuceso(),
              this.getCodCategoria(),VariablesSucesos.codigoEvento, this.getCodPlataforma(),
              this.getCodFaseVuelo(), this.getCodAreaResp(), this.getCodAreaMov(),
              this.getCodOrigen(), this.getCodDestino(), this.getCodLugarSuceso(), "JCARRASCO")){
          return true;
      }else{
          return false;
      }
        
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox();
        cmbReportador = new javax.swing.JComboBox();
        cmbAeronave = new javax.swing.JComboBox();
        cmbOrigen = new javax.swing.JComboBox();
        cmbDestino = new javax.swing.JComboBox();
        cmbLugarSuceso = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbAreaMov = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbFaseVuelo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbSuceso = new javax.swing.JComboBox();
        cmbCategoria = new javax.swing.JComboBox();
        cmbAreaResp = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbPlataforma = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtDescEvento = new javax.swing.JTextField();
        jCalendar = new com.toedter.calendar.JCalendar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCantCaracteres = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Reportador:");
        jLabel1.setBounds(30, 30, 70, 14);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Proveedor:");
        jLabel2.setBounds(30, 90, 70, 20);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Aeronave:");
        jLabel4.setBounds(270, 30, 70, 20);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setText("Origen:");
        jLabel6.setBounds(30, 140, 50, 14);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProveedorItemStateChanged(evt);
            }
        });
        cmbProveedor.setBounds(100, 90, 150, 25);
        jLayeredPane2.add(cmbProveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbReportador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbReportador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbReportadorMouseClicked(evt);
            }
        });
        cmbReportador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbReportadorItemStateChanged(evt);
            }
        });
        cmbReportador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReportadorActionPerformed(evt);
            }
        });
        cmbReportador.setBounds(100, 30, 150, 25);
        jLayeredPane2.add(cmbReportador, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbAeronave.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAeronave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAeronaveItemStateChanged(evt);
            }
        });
        cmbAeronave.setBounds(350, 30, 150, 25);
        jLayeredPane2.add(cmbAeronave, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbOrigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbOrigenItemStateChanged(evt);
            }
        });
        cmbOrigen.setBounds(100, 140, 150, 25);
        jLayeredPane2.add(cmbOrigen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbDestino.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinoItemStateChanged(evt);
            }
        });
        cmbDestino.setBounds(350, 140, 150, 25);
        jLayeredPane2.add(cmbDestino, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbLugarSuceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbLugarSuceso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLugarSucesoItemStateChanged(evt);
            }
        });
        cmbLugarSuceso.setBounds(610, 140, 150, 25);
        jLayeredPane2.add(cmbLugarSuceso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setText("Destino:");
        jLabel7.setBounds(270, 140, 60, 20);
        jLayeredPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setText("Lugar Suceso:");
        jLabel8.setBounds(520, 140, 90, 20);
        jLayeredPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Area  Movimiento:");
        jLabel3.setBounds(780, 140, 110, 20);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbAreaMov.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAreaMov.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAreaMovItemStateChanged(evt);
            }
        });
        cmbAreaMov.setBounds(900, 140, 150, 25);
        jLayeredPane2.add(cmbAreaMov, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Fase de Vuelo:");
        jLabel5.setBounds(520, 30, 90, 20);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbFaseVuelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFaseVuelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFaseVueloItemStateChanged(evt);
            }
        });
        cmbFaseVuelo.setBounds(610, 30, 150, 25);
        jLayeredPane2.add(cmbFaseVuelo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setText("Area Responsable:");
        jLabel9.setBounds(780, 30, 110, 20);
        jLayeredPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setText("Clase Suc.:");
        jLabel10.setBounds(270, 90, 70, 20);
        jLayeredPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setText("Categoria:");
        jLabel11.setBounds(520, 90, 70, 20);
        jLayeredPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setText("Tipo Evento:");
        jLabel12.setBounds(780, 90, 90, 14);
        jLayeredPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbSuceso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSuceso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSucesoItemStateChanged(evt);
            }
        });
        cmbSuceso.setBounds(350, 90, 150, 25);
        jLayeredPane2.add(cmbSuceso, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoriaItemStateChanged(evt);
            }
        });
        cmbCategoria.setBounds(610, 90, 150, 25);
        jLayeredPane2.add(cmbCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbAreaResp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAreaResp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAreaRespItemStateChanged(evt);
            }
        });
        cmbAreaResp.setBounds(900, 30, 150, 25);
        jLayeredPane2.add(cmbAreaResp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setText("Plaforma:");
        jLabel13.setBounds(30, 180, 80, 20);
        jLayeredPane2.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cmbPlataforma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlataforma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPlataformaItemStateChanged(evt);
            }
        });
        cmbPlataforma.setBounds(100, 180, 150, 25);
        jLayeredPane2.add(cmbPlataforma, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.setBounds(900, 90, 140, 23);
        jLayeredPane2.add(btnAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setText("Descripción Evento:");
        jLabel16.setBounds(270, 180, 120, 20);
        jLayeredPane2.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        txtDescEvento.setBounds(400, 180, 500, 20);
        jLayeredPane2.add(txtDescEvento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCalendarMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCalendarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCalendarMousePressed(evt);
            }
        });
        jCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendarPropertyChange(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Fecha Seleccionada:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Cantidad de Caracteres:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 712, Short.MAX_VALUE)
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(434, 434, 434)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyPressed
      setTextoDesc();
    }//GEN-LAST:event_txtDescripcionKeyPressed

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
     //setTextoDesc();
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void cmbReportadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbReportadorItemStateChanged
    BeanReportador item=(BeanReportador)cmbReportador.getSelectedItem();
    int index=cmbReportador.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodReportador(item.getCodReportador());
   
    }
    }
    }//GEN-LAST:event_cmbReportadorItemStateChanged

    private void cmbAeronaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAeronaveItemStateChanged
    BeanAeronave item=(BeanAeronave)cmbAeronave.getSelectedItem();
    int index=cmbAeronave.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodAeronave(item.getCodAeronave());
   
    }
    }
    }//GEN-LAST:event_cmbAeronaveItemStateChanged

    private void cmbFaseVueloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFaseVueloItemStateChanged
     BeanFaseVuelo item=(BeanFaseVuelo)cmbFaseVuelo.getSelectedItem();
    int index=cmbFaseVuelo.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodFaseVuelo(item.getCodFaseVuelo());
   
    }
    }  
    }//GEN-LAST:event_cmbFaseVueloItemStateChanged

    private void cmbAreaRespItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAreaRespItemStateChanged
    BeanAreaResponsable item=(BeanAreaResponsable)cmbAreaResp.getSelectedItem();
    int index=cmbAreaResp.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodAreaResp(item.getCodAreaResponsable());
   
    }  
    }//GEN-LAST:event_cmbAreaRespItemStateChanged
    }
    private void cmbProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProveedorItemStateChanged
    BeanProveedor item=(BeanProveedor)cmbProveedor.getSelectedItem();
    int index=cmbProveedor.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodProveedor(item.getCodProveedor());
   
    }  
    }
    }//GEN-LAST:event_cmbProveedorItemStateChanged

    private void cmbSucesoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSucesoItemStateChanged
     BeanClaseSuceso item=(BeanClaseSuceso)cmbSuceso.getSelectedItem();
    int index=cmbSuceso.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodSuceso(item.getCodClaseSucesos());
   
    }  
    }
    }//GEN-LAST:event_cmbSucesoItemStateChanged

    private void cmbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoriaItemStateChanged
      BeanCategoria item=(BeanCategoria)cmbCategoria.getSelectedItem();
    int index=cmbCategoria.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodCategoria(item.getCodCategoria());
   
    }  
    } 
    }//GEN-LAST:event_cmbCategoriaItemStateChanged

    private void cmbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbOrigenItemStateChanged
    BeanDepartamento item=(BeanDepartamento)cmbOrigen.getSelectedItem();
    int index=cmbOrigen.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodOrigen(item.getCodDepartamento());
   
    }  
    }    
    }//GEN-LAST:event_cmbOrigenItemStateChanged

    private void cmbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDestinoItemStateChanged
     BeanDepartamento item=(BeanDepartamento)cmbDestino.getSelectedItem();
    int index=cmbDestino.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodDestino(item.getCodDepartamento());
   
    }  
    }  
    }//GEN-LAST:event_cmbDestinoItemStateChanged

    private void cmbLugarSucesoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLugarSucesoItemStateChanged
     BeanDepartamento item=(BeanDepartamento)cmbLugarSuceso.getSelectedItem();
    int index=cmbLugarSuceso.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodLugarSuceso(item.getCodDepartamento());
   
    }  
    }  
    }//GEN-LAST:event_cmbLugarSucesoItemStateChanged

    private void cmbAreaMovItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAreaMovItemStateChanged
     BeanMovimientoPublico item=(BeanMovimientoPublico)cmbAreaMov.getSelectedItem();
    int index=cmbAreaMov.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodAreaMov(item.getCodMovPublico());
   
    }  
    }
    }//GEN-LAST:event_cmbAreaMovItemStateChanged

    private void cmbPlataformaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPlataformaItemStateChanged
    BeanPlataforma item=(BeanPlataforma)cmbPlataforma.getSelectedItem();
    int index=cmbPlataforma.getSelectedIndex();
    if(index>0){
    if(evt.getStateChange()==ItemEvent.SELECTED){    
    this.setCodPlataforma(item.getCodPlataforma());
   
    }  
    }  
    }//GEN-LAST:event_cmbPlataformaItemStateChanged
    private void setDatos(String pCodSuceso){
        ArrayList lstSuc=new ArrayList();

     
        
        String pFecSuceso ="";
        String pDesSuceso ="";
        String pCodAeronave ="";
        String pCodRep ="";
        String pCodPro ="";
        String pClaseSuc ="";
        String pCategoria ="";
        String pCodEvento ="";
        String pCodPla ="";
        String pCodFase ="";
        String pCodAreaResp ="";
        String pCodMov ="";
        String pCodOr ="";
        String pCodDes ="";
        String pCodLug ="";
        String pUsuCrea=""; 
    try {
        lstSuc=DBSucesos.lstGrillaSucesos(pCodSuceso);
        for(int i=0;i<lstSuc.size();i++){
        pFecSuceso=((ArrayList)lstSuc.get(i)).get(0).toString().trim();
        pDesSuceso=((ArrayList)lstSuc.get(i)).get(1).toString().trim();
        pCodAeronave =((ArrayList)lstSuc.get(i)).get(2).toString().trim();
        pCodRep =((ArrayList)lstSuc.get(i)).get(3).toString().trim();
        pCodPro =((ArrayList)lstSuc.get(i)).get(4).toString().trim();
        pClaseSuc =((ArrayList)lstSuc.get(i)).get(5).toString().trim();
        System.out.println("clase suceso"+pClaseSuc);
        pCategoria =((ArrayList)lstSuc.get(i)).get(6).toString().trim();
        pCodEvento =((ArrayList)lstSuc.get(i)).get(7).toString().trim();
        pCodPla =((ArrayList)lstSuc.get(i)).get(8).toString().trim();
        pCodFase =((ArrayList)lstSuc.get(i)).get(9).toString().trim();
        pCodAreaResp =((ArrayList)lstSuc.get(i)).get(10).toString().trim();
        pCodMov =((ArrayList)lstSuc.get(i)).get(11).toString().trim();
        pCodOr =((ArrayList)lstSuc.get(i)).get(12).toString().trim();
        pCodDes =((ArrayList)lstSuc.get(i)).get(13).toString().trim();
        pCodLug =((ArrayList)lstSuc.get(i)).get(14).toString().trim();
        }
           
        setValueCmb(cmbAeronave,VariablesSucesos.lstAeronave,pCodAeronave);
        setValueCmb(cmbReportador,VariablesSucesos.lstReportador,pCodRep); 
        setValueCmb(cmbProveedor,VariablesSucesos.lstProveedor,pCodPro);
        setValueCmb(cmbSuceso,VariablesSucesos.lstClaseSuceso,pClaseSuc);
        setValueCmb(cmbCategoria,VariablesSucesos.lstCategoriaSuceso,pCategoria); 
        VariablesSucesos.codigoEvento=pCodEvento;
        txtDescEvento.setText("");
        txtDescEvento.setText(VariablesSucesos.nomEvento);
        setValueCmb(cmbPlataforma,VariablesSucesos.lstPlataformaSuceso,pCodPla);
        setValueCmb(cmbFaseVuelo,VariablesSucesos.lstFaseVuelo,pCodFase); 
        setValueCmb(cmbAreaResp,VariablesSucesos.lstAreaResponsable,pCodAreaResp);
        setValueCmb(cmbAreaMov,VariablesSucesos.lstMovPublico,pCodMov);
        setValueCmb(cmbOrigen,VariablesSucesos.lstDepartamento,pCodOr);
        setValueCmb(cmbDestino,VariablesSucesos.lstDepartamento,pCodDes); 
        setValueCmb(cmbLugarSuceso,VariablesSucesos.lstDepartamento,pCodLug);
        this.txtFecha.setText(pFecSuceso);
        this.txtDescripcion.setText(pDesSuceso);
        setTextoDesc();
        this.txtCantCaracteres.setText(""+pDesSuceso.length());
        
    } catch (SQLException ex) {
        Logger.getLogger(DlgMantenimientoSucesos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    private void setValueCmb(JComboBox cmb,ArrayList lstValue,String codigo){
        
    for(int i=0;i<lstValue.size();i++){
      if(codigo.trim().equalsIgnoreCase(((ArrayList)lstValue.get(i)).get(0).toString().trim())){
          cmb.setSelectedIndex(i+1);
          break;
      }  
    }    
        
    }
    private void cmbReportadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReportadorActionPerformed
     
    }//GEN-LAST:event_cmbReportadorActionPerformed

    private void cmbReportadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbReportadorMouseClicked
     

    }//GEN-LAST:event_cmbReportadorMouseClicked

    private void jCalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMouseClicked
        
    }//GEN-LAST:event_jCalendarMouseClicked

    private void jCalendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMouseExited
       
    }//GEN-LAST:event_jCalendarMouseExited

    private void jCalendarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMousePressed
       
    }//GEN-LAST:event_jCalendarMousePressed
    
    private void jCalendarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendarMouseReleased
        
    }//GEN-LAST:event_jCalendarMouseReleased

    private void jCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendarPropertyChange
        txtFecha.setText("");
        System.out.println("Fecha"+getFecha());
        txtFecha.setText(getFecha());  
    }//GEN-LAST:event_jCalendarPropertyChange

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if(!validarDatos())
         return;   
        
       DlgListadoSuceso suces=new DlgListadoSuceso();
        
        
        if(VariablesSucesos.estado.equalsIgnoreCase(ConstantesSucesos.INSERTAR)){
        if(grabaSuceso()){
         
        JOptionPane.showMessageDialog( this,"Se guardo el registro satisfactoriamente!","Informacion",JOptionPane.INFORMATION_MESSAGE);
       suces.setVisible(true);
        cerrarVentana(false);
       }else{
         
        JOptionPane.showMessageDialog( this,"Error al grabar el registro!","Error",JOptionPane.WARNING_MESSAGE);
        
       }
       }else{
          if(actualizaSuceso()){
        JOptionPane.showMessageDialog( this,"Se guardo el registro satisfactoriamente!","Informacion",JOptionPane.INFORMATION_MESSAGE);
        suces.setVisible(true);
        cerrarVentana(false);
          }else{
        JOptionPane.showMessageDialog( this,"Error al grabar el registro!","Error",JOptionPane.WARNING_MESSAGE);
   
           }
       }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       DlgListadoSuceso suces=new DlgListadoSuceso();
       suces.setVisible(true);
     cerrarVentana(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       DlgEventos evento=new DlgEventos();
       evento.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed
   private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
   private boolean validarDatos(){
        if(cmbReportador.getSelectedIndex()==0){
             JOptionPane.showMessageDialog( this,"Seleccionar Reportador!","Información",JOptionPane.WARNING_MESSAGE);
          return false;  
        }
        if(cmbProveedor.getSelectedIndex()==0){
             JOptionPane.showMessageDialog( this,"Seleccionar Proveedor!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
         if(cmbDestino.getSelectedIndex()==0){
              JOptionPane.showMessageDialog( this,"Seleccionar Destino!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
          if(cmbOrigen.getSelectedIndex()==0){
               JOptionPane.showMessageDialog( this,"Seleccionar Origen!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
           if(cmbLugarSuceso.getSelectedIndex()==0){
                JOptionPane.showMessageDialog( this,"Seleccionar Lugar Suceso!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
            if(cmbAreaResp.getSelectedIndex()==0){
                 JOptionPane.showMessageDialog( this,"Seleccionar Area Responsable!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
             if(cmbFaseVuelo.getSelectedIndex()==0){
                  JOptionPane.showMessageDialog( this,"Selecionar Fase de Vuelo!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
              if(cmbAreaMov.getSelectedIndex()==0){
                   JOptionPane.showMessageDialog( this,"Seleccionar Area de Movimiento!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
               if(cmbSuceso.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog( this,"Seleccionar Clase de Suceso!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                if(cmbCategoria.getSelectedIndex()==0){
                     JOptionPane.showMessageDialog( this,"Seleccionar Categoria!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                 if(cmbPlataforma.getSelectedIndex()==0){
                      JOptionPane.showMessageDialog( this,"Seleccionar Plataforma!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                 if(cmbAeronave.getSelectedIndex()==0){
                      JOptionPane.showMessageDialog( this,"Seleccionar Aeronave!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                 if(txtDescripcion.getText().length()<10){
                      JOptionPane.showMessageDialog( this,"Cantidad minima de caracteres=10 !","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                  if(txtDescripcion.getText().length()>1000){
                      JOptionPane.showMessageDialog( this,"Cantidad maxima de caracteres=1000 !","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
                  if(VariablesSucesos.codigoEvento.equalsIgnoreCase("")){
                      JOptionPane.showMessageDialog( this,"Seleccionar Tipo  Evento!","Información",JOptionPane.WARNING_MESSAGE);

          return false;  
        }
               
       
        
    return true;   
   }
  
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbAeronave;
    private javax.swing.JComboBox cmbAreaMov;
    private javax.swing.JComboBox cmbAreaResp;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JComboBox cmbDestino;
    private javax.swing.JComboBox cmbFaseVuelo;
    private javax.swing.JComboBox cmbLugarSuceso;
    private javax.swing.JComboBox cmbOrigen;
    private javax.swing.JComboBox cmbPlataforma;
    private javax.swing.JComboBox cmbProveedor;
    private javax.swing.JComboBox cmbReportador;
    private javax.swing.JComboBox cmbSuceso;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantCaracteres;
    private javax.swing.JTextField txtDescEvento;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables

   
    public String getCodReportador() {
        return codReportador;
    }

    
    public void setCodReportador(String codReportador) {
        this.codReportador = codReportador;
    }

    
    public String getCodProveedor() {
        return codProveedor;
    }

    
    public void setCodProveedor(String codProveedor) {
        this.codProveedor = codProveedor;
    }

    
    public String getCodDestino() {
        return codDestino;
    }

    
    public void setCodDestino(String codDestino) {
        this.codDestino = codDestino;
    }

    
    public String getCodOrigen() {
        return codOrigen;
    }

   
    public void setCodOrigen(String codOrigen) {
        this.codOrigen = codOrigen;
    }

    
    public String getCodLugarSuceso() {
        return codLugarSuceso;
    }

   
    public void setCodLugarSuceso(String codLugarSuceso) {
        this.codLugarSuceso = codLugarSuceso;
    }

    
    public String getCodAreaResp() {
        return codAreaResp;
    }

    
    public void setCodAreaResp(String codAreaResp) {
        this.codAreaResp = codAreaResp;
    }

    
    public String getCodFaseVuelo() {
        return codFaseVuelo;
    }

    
    public void setCodFaseVuelo(String codFaseVuelo) {
        this.codFaseVuelo = codFaseVuelo;
    }

    
    public String getCodAreaMov() {
        return codAreaMov;
    }

    
    public void setCodAreaMov(String codAreaMov) {
        this.codAreaMov = codAreaMov;
    }

    
    public String getCodSuceso() {
        return codSuceso;
    }

    
    public void setCodSuceso(String codSuceso) {
        this.codSuceso = codSuceso;
    }

    
    public String getCodCategoria() {
        return codCategoria;
    }

   
    public void setCodCategoria(String codCategoria) {
        this.codCategoria = codCategoria;
    }

   
    public String getCodEvento() {
        return codEvento;
    }

   
    public void setCodEvento(String codEvento) {
        this.codEvento = codEvento;
    }

    
    public String getCodPlataforma() {
        return codPlataforma;
    }

   
    public void setCodPlataforma(String codPlataforma) {
        this.codPlataforma = codPlataforma;
    }

   
    public String getCodAeronave() {
        return codAeronave;
    }

   
    public void setCodAeronave(String codAeronave) {
        this.codAeronave = codAeronave;
    }


    

    /**
     * @return the codigoRegistro
     */
    public String getCodigoRegistro() {
        return codigoRegistro;
    }

    /**
     * @param codigoRegistro the codigoRegistro to set
     */
    public void setCodigoRegistro(String codigoRegistro) {
        this.codigoRegistro = codigoRegistro;
    }

   
}
