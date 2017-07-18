

package ecocopter.interfaces;

import ecocopter.indiParticular.DlgIndiceAtaMesNave;
import ecocopter.indiParticular.DlgIndiceAtaNaveMesT;
import ecocopter.indiParticular.DlgIndiceAtasMes;
import ecocopter.inidiGeneral.DlgIndiceAtasMesNave;
import ecocopter.indiParticular.DlgIndiceMesNave;
import ecocopter.indiParticular.DlgIndiceMesAtas;
import ecocopter.inidiGeneral.DlgIndiceAtaAno;
import ecocopter.inidiGeneral.DlgIndiceAtasNave;
import ecocopter.inidiGeneral.DlgIndiceMesAtasNave;
import ecocopter.inidiGeneral.DlgIndiceNaveAnoT;
import ecocopter.interParticular.DlgReporteIncideAtaMes;
import ecocopter.interParticular.DlgReporteIncideMesNave;

import ecocopter.interParticular.DlgReporteIncideMesAtas;
import ecocopter.interGenerales.DlgReporAtaNav;
import ecocopter.interGenerales.DlgReporAtaNaveMes;
import ecocopter.interGenerales.DlgReporAtaNaveT;
import ecocopter.interGenerales.DlgReporAtasNaveAtas;
import ecocopter.interGenerales.DlgReporNaveAnoT;
import ecocopter.interParticular.DlgReporteNaveMesT;
import ecocopter.interParticular.DlgReporteAtaMesNave;
import java.awt.Dimension;

/**
 *
 * @author desarrollo2
 */
public final class DlgReportes extends javax.swing.JFrame {

    public DlgReportes() {
        initComponents();
        this.setTitle("Maestro de Reportes");
        cargarTamano();
        cargaNombres();
    }
    public void cargaNombres(){
      String texto1 = "<html><body>N° Fallas vs. Aeronaves<br>en Función al Mes y Año</body></html>" ;
      btnRep1.setText(texto1);
        String texto2 = "<html><body>N° Fallas vs.Atas<br>en Función al Mes y Año</html>" ;
      btnRep2.setText(texto2);
        String texto3 = "<html><body>N° Fallas vs.Meses<br>en Función a Atas y Año</body></html>" ;
      btnRep3.setText(texto3);
        String texto4 = "<html><body>N° Fallas vs.Meses<br>en Función a Aeronaves y Año</body></body></html>" ;
      btnRep4.setText(texto4);
       String texto5 = "<html><body>N° Fallas vs.Atas<br>en Función a Aeronaves y Año</body></html>" ;
      btnRep5.setText(texto5);
        String texto6 = "<html><body>N° Fallas vs.Atas<br>en Función a Aeronaves ,Mes y Año</body></html>" ;
      btnRep6.setText(texto6);
      String texto7 = "<html><body>N° Fallas vs.Atas <br>en Función al Año</body></html>" ;
      btnRep7.setText(texto7);
        String texto8 = "<html><body>N° Fallas vs.Meses<br>en Función a Aeronaves ,Atas y Año</html>" ;
      btnRep8.setText(texto8);
      String texto9="<html><body>N° Fallas vs.Aeronaves<br>en Función al Año</html>";
      btnRep9.setText(texto9);
      String texto10="<html><body>N° Fallas vs.Aeronaves<br>en Función a Atas ,mes y Año</html>";
      btnRep10.setText(texto10);
      
      /**************Indices*****************/
       String txtIndi1 = "<html><body>Indice vs.Aeronaves<br>en Función a Meses y Año</body></html>" ;
      btnInd1.setText(txtIndi1);
        String txtIndi2 = "<html><body>Indice vs. Atas<br>en Función al Mes y Año</body></html>" ;
      btnInd2.setText(txtIndi2);
        String txtIndi3 = "<html><body>Indice vs.Meses<br>en Función a Atas y Año</body></html>" ;
      btnInd3.setText(txtIndi3);
        String txtIndi4 = "<html><body>Indice vs. Meses<br>en Función a Aeronaves y Año</body></body></html>" ;
      btnInd4.setText(txtIndi4);
      String txtIndi5 = "<html><body>Indice vs.Atas <br>en Función a Aeronaves y Año</body></html>" ;
       
      btnInd5.setText(txtIndi5);
        String txtIndi6 = "<html><body>Indice vs.Atas<br>en Función a Aeronaves,mes y Año</body></html>" ;
      btnInd6.setText(txtIndi6);
      String txtIndi7 = "<html><body>Indice vs.Atas<br>en Función al Año</body></body></html>" ;
      btnInd7.setText(txtIndi7);
        String txtIndi8 = "<html><body>Indice vs. Meses<br>en Función a Aeronaves ,Atas y Año</body></body></html>" ;
      btnInd8.setText(txtIndi8);
      String txtIndi9="<html><body>Indice vs. Aeronaves<br>en Función a Aeronaves</body></body></html>";
      btnInd9.setText(txtIndi9);
      String txtIndi10="<html><body>Indice vs. Aeronaves<br>en Función a Atas ,Mes y Año</body></body></html>";
      btnInd10.setText(txtIndi10);
       
     
      
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnInd1 = new javax.swing.JButton();
        btnInd5 = new javax.swing.JButton();
        btnInd7 = new javax.swing.JButton();
        btnInd4 = new javax.swing.JButton();
        btnInd2 = new javax.swing.JButton();
        btnInd9 = new javax.swing.JButton();
        btnIndiSalir = new javax.swing.JButton();
        btnInd8 = new javax.swing.JButton();
        btnInd3 = new javax.swing.JButton();
        btnInd6 = new javax.swing.JButton();
        btnInd10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnRep1 = new javax.swing.JButton();
        btnRep6 = new javax.swing.JButton();
        btnRep8 = new javax.swing.JButton();
        btnRep2 = new javax.swing.JButton();
        btnRep5 = new javax.swing.JButton();
        btnRep4 = new javax.swing.JButton();
        btnRep3 = new javax.swing.JButton();
        btnRep9 = new javax.swing.JButton();
        btnRep7 = new javax.swing.JButton();
        btnRepSalir = new javax.swing.JButton();
        btnRep10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd1ActionPerformed(evt);
            }
        });

        btnInd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd5ActionPerformed(evt);
            }
        });

        btnInd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd7ActionPerformed(evt);
            }
        });

        btnInd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd4ActionPerformed(evt);
            }
        });

        btnInd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd2ActionPerformed(evt);
            }
        });

        btnInd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd9ActionPerformed(evt);
            }
        });

        btnIndiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/logout.jpg"))); // NOI18N
        btnIndiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndiSalirActionPerformed(evt);
            }
        });

        btnInd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd8ActionPerformed(evt);
            }
        });

        btnInd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd3ActionPerformed(evt);
            }
        });

        btnInd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd6ActionPerformed(evt);
            }
        });

        btnInd10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInd10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInd1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInd5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInd9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInd10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnInd6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(btnInd2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInd3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInd4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInd7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIndiSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInd8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInd1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnInd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInd6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInd5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInd3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnInd4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInd7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInd8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnInd10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInd9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIndiSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Indices", jPanel2);

        btnRep1.setBackground(new java.awt.Color(204, 204, 204));
        btnRep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep1ActionPerformed(evt);
            }
        });

        btnRep6.setBackground(new java.awt.Color(204, 204, 204));
        btnRep6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep6ActionPerformed(evt);
            }
        });

        btnRep8.setBackground(new java.awt.Color(204, 204, 204));
        btnRep8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep8ActionPerformed(evt);
            }
        });

        btnRep2.setBackground(new java.awt.Color(204, 204, 204));
        btnRep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep2ActionPerformed(evt);
            }
        });

        btnRep5.setBackground(new java.awt.Color(204, 204, 204));
        btnRep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep5ActionPerformed(evt);
            }
        });

        btnRep4.setBackground(new java.awt.Color(204, 204, 204));
        btnRep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep4ActionPerformed(evt);
            }
        });

        btnRep3.setBackground(new java.awt.Color(204, 204, 204));
        btnRep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep3ActionPerformed(evt);
            }
        });

        btnRep9.setBackground(new java.awt.Color(204, 204, 204));
        btnRep9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep9ActionPerformed(evt);
            }
        });

        btnRep7.setBackground(new java.awt.Color(204, 204, 204));
        btnRep7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep7ActionPerformed(evt);
            }
        });

        btnRepSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ecocopter/iconos/logout.jpg"))); // NOI18N
        btnRepSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepSalirActionPerformed(evt);
            }
        });

        btnRep10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRep1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRep2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRep3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRep4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRep9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRep10, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRepSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRep5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRep6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRep7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRep8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRep2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRep3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRep4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRep6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRep5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRep7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRep8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRep10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRep9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRepSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Reportajes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd7ActionPerformed
      DlgIndiceAtaAno inci=new  DlgIndiceAtaAno();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd7ActionPerformed

    private void btnIndiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIndiSalirActionPerformed
      
        DlgPrincipal princ=new DlgPrincipal();
        princ.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnIndiSalirActionPerformed

    private void btnInd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd1ActionPerformed
      
        DlgIndiceAtaNaveMesT inci=new  DlgIndiceAtaNaveMesT();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd1ActionPerformed

    private void btnInd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd5ActionPerformed
       DlgIndiceAtasNave inci=new  DlgIndiceAtasNave();
        inci.setVisible(true);
        
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd5ActionPerformed

    private void btnInd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd4ActionPerformed
     DlgIndiceMesNave inci=new   DlgIndiceMesNave() ;
      inci.setVisible(true);
     cerrarVentana(false);
    }//GEN-LAST:event_btnInd4ActionPerformed

    private void btnInd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd2ActionPerformed
       DlgIndiceAtasMes inci=new  DlgIndiceAtasMes();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd2ActionPerformed

    private void btnInd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd9ActionPerformed
      DlgIndiceNaveAnoT inci=new DlgIndiceNaveAnoT();
      inci.setVisible(true);
      cerrarVentana(false);
    }//GEN-LAST:event_btnInd9ActionPerformed

    private void btnInd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd8ActionPerformed
       DlgIndiceMesAtasNave inci=new  DlgIndiceMesAtasNave();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd8ActionPerformed

    private void btnInd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd3ActionPerformed
       DlgIndiceMesAtas inci=new  DlgIndiceMesAtas();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd3ActionPerformed

    private void btnInd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd6ActionPerformed
        DlgIndiceAtasMesNave inci=new  DlgIndiceAtasMesNave();
        inci.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnInd6ActionPerformed

    private void btnRep7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep7ActionPerformed
      DlgReporAtaNaveT rep=new DlgReporAtaNaveT();
      rep.setVisible(true);
      cerrarVentana(false); 
    }//GEN-LAST:event_btnRep7ActionPerformed

    private void btnRep9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep9ActionPerformed
      DlgReporNaveAnoT rep=new DlgReporNaveAnoT();
      rep.setVisible(true);
      cerrarVentana(false);
    }//GEN-LAST:event_btnRep9ActionPerformed

    private void btnRep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep3ActionPerformed
      
        DlgReporteIncideMesAtas rep=new DlgReporteIncideMesAtas();
        rep.setVisible(true);
        cerrarVentana(false);
                         
    }//GEN-LAST:event_btnRep3ActionPerformed

    private void btnRep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep4ActionPerformed
      DlgReporteIncideMesNave rep=new DlgReporteIncideMesNave();
      rep.setVisible(true);
      cerrarVentana(false); 
    }//GEN-LAST:event_btnRep4ActionPerformed

    private void btnRep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep5ActionPerformed
     DlgReporAtaNav rep=new DlgReporAtaNav();
      rep.setVisible(true);
      cerrarVentana(false); 
    }//GEN-LAST:event_btnRep5ActionPerformed

    private void btnRep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep2ActionPerformed
      
        DlgReporteIncideAtaMes rep=new DlgReporteIncideAtaMes();
        rep.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnRep2ActionPerformed

    private void btnRep8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep8ActionPerformed
      
        DlgReporAtasNaveAtas rep=new DlgReporAtasNaveAtas();
        rep.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnRep8ActionPerformed

    private void btnRep6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep6ActionPerformed
      
      DlgReporAtaNaveMes rep=new DlgReporAtaNaveMes();
      rep.setVisible(true);
      cerrarVentana(false);
    }//GEN-LAST:event_btnRep6ActionPerformed

    private void btnRep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep1ActionPerformed
      
        DlgReporteNaveMesT rep=new DlgReporteNaveMesT();
        rep.setVisible(true);
        cerrarVentana(false);
    }//GEN-LAST:event_btnRep1ActionPerformed

    private void btnRepSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepSalirActionPerformed
       DlgPrincipal princ=new DlgPrincipal();
        princ.setVisible(true);
        cerrarVentana(false); 
    }//GEN-LAST:event_btnRepSalirActionPerformed

    private void btnInd10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInd10ActionPerformed
    DlgIndiceAtaMesNave inci=new DlgIndiceAtaMesNave();
    inci.setVisible(true);
    cerrarVentana(false);
    }//GEN-LAST:event_btnInd10ActionPerformed

    private void btnRep10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep10ActionPerformed
      DlgReporteAtaMesNave rep=new DlgReporteAtaMesNave();
      rep.setVisible(true);
      cerrarVentana(false);
    }//GEN-LAST:event_btnRep10ActionPerformed
public void cargarTamano(){//llamar este metodo en el constructor
     
     this.setMinimumSize(new Dimension(380, 380)); //Minima dimension
     this.setResizable(false); // no permit cambiar de tamaño
     this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);//inavilitar el cerrado
     this.setLocationRelativeTo(null);
     this.setAlwaysOnTop( true );
     
    }
  private void cerrarVentana(boolean valor){
      this.setVisible(valor);
      this.dispose();  
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
            java.util.logging.Logger.getLogger(DlgReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInd1;
    private javax.swing.JButton btnInd10;
    private javax.swing.JButton btnInd2;
    private javax.swing.JButton btnInd3;
    private javax.swing.JButton btnInd4;
    private javax.swing.JButton btnInd5;
    private javax.swing.JButton btnInd6;
    private javax.swing.JButton btnInd7;
    private javax.swing.JButton btnInd8;
    private javax.swing.JButton btnInd9;
    private javax.swing.JButton btnIndiSalir;
    private javax.swing.JButton btnRep1;
    private javax.swing.JButton btnRep10;
    private javax.swing.JButton btnRep2;
    private javax.swing.JButton btnRep3;
    private javax.swing.JButton btnRep4;
    private javax.swing.JButton btnRep5;
    private javax.swing.JButton btnRep6;
    private javax.swing.JButton btnRep7;
    private javax.swing.JButton btnRep8;
    private javax.swing.JButton btnRep9;
    private javax.swing.JButton btnRepSalir;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}
