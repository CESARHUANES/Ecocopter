

package ecocopter.interfaces;

import ecocopter.aeronave.DlgAeronave;
import ecocopter.sucesos.Interface.DlgListadoSuceso;
import ecocopter.usuarios.Interface.DlgListadoUsuarios;
import ecocopter.util.EcocopterUtil;
import java.awt.Dimension;


public class DlgPrincipal extends javax.swing.JFrame {

    public DlgPrincipal() {
        initComponents();
        cargarTamano();
        this.setTitle("Sistema de Registro de Fallas");
    }
  public void cargarTamano(){//llamar este metodo en el constructor
     
     this.setMinimumSize(new Dimension(800, 400)); //Minima dimension
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);//centrado
   
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuArchivo = new javax.swing.JMenuItem();
        mnuHoras = new javax.swing.JMenuItem();
        mnuAeronave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuReportes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnuItemSucesos = new javax.swing.JMenuItem();
        mnuUsuarios = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuConexion = new javax.swing.JMenuItem();
        mnuSalirs = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/copyrigth.png"))); // NOI18N
        jLabel1.setText("Todo los derechos reservados del autor.@copy rigth");

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setBorder(null);
        jMenu1.setText("Registros");
        jMenu1.setBorderPainted(true);
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuArchivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuArchivo.setText("Registrar Archivo");
        mnuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuArchivo);

        mnuHoras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuHoras.setText("Registrar Horas Vuelo");
        mnuHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHorasActionPerformed(evt);
            }
        });
        jMenu1.add(mnuHoras);

        mnuAeronave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuAeronave.setText("Registrar Aeronaves");
        mnuAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAeronaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAeronave);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(null);
        jMenu2.setText("Reportes");
        jMenu2.setBorderPainted(true);
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuReportes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuReportes.setText("Reportes");
        mnuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReportesActionPerformed(evt);
            }
        });
        jMenu2.add(mnuReportes);

        jMenuBar1.add(jMenu2);

        jMenu5.setBorder(null);
        jMenu5.setText("Administración");
        jMenu5.setBorderPainted(true);
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuItemSucesos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuItemSucesos.setText("Administración de Sucesos");
        mnuItemSucesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemSucesosActionPerformed(evt);
            }
        });
        jMenu5.add(mnuItemSucesos);

        mnuUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuUsuarios.setText("Administración de  Usuarios");
        mnuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuariosActionPerformed(evt);
            }
        });
        jMenu5.add(mnuUsuarios);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Conexión");
        jMenu3.setBorderPainted(true);
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuConexion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuConexion.setText("Test Conexión");
        mnuConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConexionActionPerformed(evt);
            }
        });
        jMenu3.add(mnuConexion);

        jMenuBar1.add(jMenu3);

        mnuSalirs.setBorder(null);
        mnuSalirs.setText("Salir");
        mnuSalirs.setBorderPainted(true);
        mnuSalirs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mnuSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuSalirs.add(mnuSalir);

        jMenuBar1.add(mnuSalirs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoActionPerformed
        
        DlgCabeceraArchivo cab=new DlgCabeceraArchivo();
        cab.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_mnuArchivoActionPerformed

    private void mnuHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHorasActionPerformed
        
        DlgRegistroHoras horas=new DlgRegistroHoras();
        horas.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_mnuHorasActionPerformed

    private void mnuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReportesActionPerformed
      
        DlgReportes rep=new  DlgReportes();
        rep.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_mnuReportesActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConexionActionPerformed
        
        EcocopterUtil util=new EcocopterUtil();
        util.verificaConexion();
        
    }//GEN-LAST:event_mnuConexionActionPerformed

    private void mnuAeronaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAeronaveActionPerformed
      DlgAeronave nave=new DlgAeronave();
      nave.setVisible(true);
     cerrarVentana(false);
    }//GEN-LAST:event_mnuAeronaveActionPerformed

    private void mnuItemSucesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemSucesosActionPerformed
       DlgListadoSuceso suc=new DlgListadoSuceso();
       suc.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_mnuItemSucesosActionPerformed

    private void mnuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuariosActionPerformed
       DlgListadoUsuarios usu=new DlgListadoUsuarios();
       usu.setVisible(true);
       cerrarVentana(false);
    }//GEN-LAST:event_mnuUsuariosActionPerformed
   private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
    }
 
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(DlgPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem mnuAeronave;
    private javax.swing.JMenuItem mnuArchivo;
    private javax.swing.JMenuItem mnuConexion;
    private javax.swing.JMenuItem mnuHoras;
    private javax.swing.JMenuItem mnuItemSucesos;
    private javax.swing.JMenuItem mnuReportes;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuSalirs;
    private javax.swing.JMenuItem mnuUsuarios;
    // End of variables declaration//GEN-END:variables
}
