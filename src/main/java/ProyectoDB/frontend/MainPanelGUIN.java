package ProyectoDB.frontend;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Webotes
 */
import ProyectoDB.frontend.MainPanelGUI;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.sql.Connection;
import javax.swing.ButtonGroup;

public class MainPanelGUIN extends javax.swing.JFrame implements ItemListener {

    private static Connection connection;

    /**
     * Creates new form MainPanelGUI
     *
     * @param connection
     */
    public MainPanelGUIN(Connection connection) {
        this.connection = connection;
        initComponents();
        VentaBoton.addItemListener(this);
        InventarioBoton.addItemListener(this);
        AltaBoton.addItemListener(this);
        BajaBoton.addItemListener(this);
        ConsultaBoton.addItemListener(this);
        ActualBoton.addItemListener(this);
        ReporteBoton.addItemListener(this);
        DataMBoton.addItemListener(this);
        ButtonGroup bg = new ButtonGroup();
        ButtonGroup bg2 = new ButtonGroup();
        bg.add(VentaBoton);
        bg.add(InventarioBoton);
        bg2.add(AltaBoton);
        bg2.add(BajaBoton);
        bg2.add(ConsultaBoton);
        bg2.add(ActualBoton);
        bg2.add(ReporteBoton);
        bg2.add(DataMBoton);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        VentaBoton = new javax.swing.JRadioButton();
        InventarioBoton = new javax.swing.JRadioButton();
        AltaBoton = new javax.swing.JRadioButton();
        BajaBoton = new javax.swing.JRadioButton();
        ReporteBoton = new javax.swing.JRadioButton();
        ConsultaBoton = new javax.swing.JRadioButton();
        ActualBoton = new javax.swing.JRadioButton();
        DataMBoton = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 114, 130));

        jPanel1.setBackground(new java.awt.Color(62, 49, 47));

        jLabel1.setFont(new java.awt.Font("Garamond", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido  ");

        jLabel3.setBackground(new java.awt.Color(62, 49, 47));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flowers.jpeg"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondoB (1).jpeg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(48, 140, 130));

        VentaBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 24)); // NOI18N
        VentaBoton.setForeground(new java.awt.Color(203, 245, 251));
        VentaBoton.setText("Venta");
        VentaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaBotonActionPerformed(evt);
            }
        });

        InventarioBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 24)); // NOI18N
        InventarioBoton.setForeground(new java.awt.Color(203, 245, 251));
        InventarioBoton.setText("Inventario");
        InventarioBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioBotonActionPerformed(evt);
            }
        });

        AltaBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        AltaBoton.setForeground(new java.awt.Color(226, 214, 236));
        AltaBoton.setText("Alta");
        AltaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaBotonActionPerformed(evt);
            }
        });

        BajaBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        BajaBoton.setForeground(new java.awt.Color(226, 214, 236));
        BajaBoton.setText("Baja");
        BajaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajaBotonActionPerformed(evt);
            }
        });

        ReporteBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        ReporteBoton.setForeground(new java.awt.Color(226, 214, 236));
        ReporteBoton.setText("Reporte");
        ReporteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteBotonActionPerformed(evt);
            }
        });

        ConsultaBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        ConsultaBoton.setForeground(new java.awt.Color(226, 214, 236));
        ConsultaBoton.setText("Consulta");
        ConsultaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaBotonActionPerformed(evt);
            }
        });

        ActualBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        ActualBoton.setForeground(new java.awt.Color(226, 214, 236));
        ActualBoton.setText("Actualziar");
        ActualBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualBotonActionPerformed(evt);
            }
        });

        DataMBoton.setFont(new java.awt.Font("Goudy Old Style", 3, 18)); // NOI18N
        DataMBoton.setForeground(new java.awt.Color(226, 214, 236));
        DataMBoton.setText("DataMart");
        DataMBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataMBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InventarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AltaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ActualBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BajaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ReporteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ConsultaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DataMBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(VentaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InventarioBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaBoton)
                            .addComponent(DataMBoton)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActualBoton)
                            .addComponent(AltaBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReporteBoton)
                            .addComponent(BajaBoton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaBotonActionPerformed


    }//GEN-LAST:event_VentaBotonActionPerformed

    private void InventarioBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InventarioBotonActionPerformed

    private void AltaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AltaBotonActionPerformed

    private void BajaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BajaBotonActionPerformed

    private void ReporteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReporteBotonActionPerformed

    private void ConsultaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsultaBotonActionPerformed

    private void ActualBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActualBotonActionPerformed

    private void DataMBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataMBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataMBotonActionPerformed

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
            java.util.logging.Logger.getLogger(MainPanelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanelGUIN(connection).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ActualBoton;
    private javax.swing.JRadioButton AltaBoton;
    private javax.swing.JRadioButton BajaBoton;
    private javax.swing.JRadioButton ConsultaBoton;
    private javax.swing.JRadioButton DataMBoton;
    private javax.swing.JRadioButton InventarioBoton;
    private javax.swing.JRadioButton ReporteBoton;
    private javax.swing.JRadioButton VentaBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (VentaBoton.isSelected()) {
                if(AltaBoton.isSelected()){
                    System.out.println("Queso plabas");
                } else if(BajaBoton.isSelected()){
                    System.out.println("Queso badon");
                }  else if(ConsultaBoton.isSelected()){
                    System.out.println("Queso bon");
                }  else if(ActualBoton.isSelected()){
                    System.out.println("Queso barias");
                } else if(ReporteBoton.isSelected()){
                    System.out.println("Queso plaras");
                }
            } else if (InventarioBoton.isSelected()) {
                if(AltaBoton.isSelected()){
                    System.out.println("1");
                } else if(BajaBoton.isSelected()){
                    System.out.println("2");
                }  else if(ConsultaBoton.isSelected()){
                    System.out.println("3");
                }  else if(ActualBoton.isSelected()){
                    System.out.println("4");
                } else if(ReporteBoton.isSelected()){
                    System.out.println("5");
                } else if(DataMBoton.isSelected()){
                    System.out.println("6");
                }
            }
        }
    }
}
