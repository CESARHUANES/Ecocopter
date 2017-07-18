
package ecocopter.sucesos.Interface;



import ecocopter.sucesos.Dao.DBSucesos;
import ecocopter.sucesos.Facade.VariablesSucesos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DlgEventos extends javax.swing.JFrame {

  DefaultTableModel dt=new DefaultTableModel();
  TableRowSorter<TableModel> sorter=null;
    public DlgEventos() {
        initComponents();
        jTable.setModel(dt);
        this.setTitle("Listado de Eventos");
        dt.addColumn("CODIGO");
        dt.addColumn("DESCRIPCION");
        jTable.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTable.getColumnModel().getColumn(0).setResizable(false);
        jTable.getColumnModel().getColumn(1).setResizable(false);
        jTable.getTableHeader().setEnabled(false);
        
        sorter = new TableRowSorter<TableModel>(dt);
        jTable.setRowSorter(sorter);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setResizable(false); // no permit cambiar de tamaño
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
      
        this.setLocationRelativeTo(null); 
        this.setAlwaysOnTop(true);
       
       }

   private void loadGrilla()
   {
      try {
          ArrayList lstEventos=new ArrayList();
           
          lstEventos=DBSucesos.lstCmbEventoSuceso();
             
         // lstEventos=VariablesSucesos.lstEventoSuceso;
            for(int i=0;i<lstEventos.size();i++){
           String codigo=((ArrayList)lstEventos.get(i)).get(0).toString().trim();
           String desc=((ArrayList)lstEventos.get(i)).get(1).toString().trim();
           dt.addRow(new Object[]{codigo,desc});
            }
      } catch (SQLException ex) {
          Logger.getLogger(DlgEventos.class.getName()).log(Level.SEVERE, null, ex);
      }
       
   } 
   private void filtro(){
    RowFilter<TableModel, Object> rf = null;
   int indiceColumnaTabla = 1;
    try {
    String texto="";
    texto=txtBuscar.getText().toUpperCase();
    txtBuscar.setText("");
    txtBuscar.setText(texto);
    rf = RowFilter.regexFilter(txtBuscar.getText(), indiceColumnaTabla);
    } catch (java.util.regex.PatternSyntaxException e) {
    }
    sorter.setRowFilter(rf);
     
 }
       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");
        jLabel1.setBounds(10, 10, 50, 20);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        txtBuscar.setBounds(80, 10, 280, 30);
        jLayeredPane1.add(txtBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable);

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 162, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarVentana(false);
    }//GEN-LAST:event_btnSalirActionPerformed
    private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
      int row=jTable.getSelectedRow();
      if(row>-1){
        VariablesSucesos.codigoEvento=jTable.getValueAt(row,0).toString().trim();
        VariablesSucesos.nomEvento=jTable.getValueAt(row,1).toString().trim();
       
        System.out.println("Codigo Evento"+VariablesSucesos.codigoEvento);
        JOptionPane.showMessageDialog( this,"Registro Seleccionado! "+ VariablesSucesos.codigoEvento,"Información",JOptionPane.INFORMATION_MESSAGE);
         cerrarVentana(false);
      }else{
      JOptionPane.showMessageDialog( this,"Seleccionar Registro!","Información",JOptionPane.INFORMATION_MESSAGE);
    
      }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
  
        filtro();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
     
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadGrilla();
    }//GEN-LAST:event_formWindowOpened
 
   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
