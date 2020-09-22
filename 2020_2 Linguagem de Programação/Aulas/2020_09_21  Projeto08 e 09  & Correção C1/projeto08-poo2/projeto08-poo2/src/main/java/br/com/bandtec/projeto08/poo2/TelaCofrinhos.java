/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto08.poo2;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author jose
 */
public class TelaCofrinhos extends javax.swing.JFrame {
    
    Cofrinho cofre1 = new Cofrinho();
    Cofrinho cofre2 = new Cofrinho();
    Cofrinho cofre3 = new Cofrinho();
    
    void atualizarTela(JLabel lbValor, JLabel lbSituacao, Cofrinho cofre) {
        lbValor.setText(cofre.saldo.toString());
        
        lbSituacao.setText(cofre.situacao);
        lbSituacao.setForeground(Color.decode(cofre.cor));
    }

    /**
     * Creates new form TelaCofrinhos
     */
    public TelaCofrinhos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbValor1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSituacao1 = new javax.swing.JLabel();
        btDepositar101 = new javax.swing.JButton();
        btTirar101 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbValor2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbSituacao2 = new javax.swing.JLabel();
        btDepositar102 = new javax.swing.JButton();
        btTirar102 = new javax.swing.JButton();
        btDepositar103 = new javax.swing.JButton();
        btTirar103 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbValor3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbSituacao3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor no cofrinho 1:");

        lbValor1.setText("0");

        jLabel2.setText("Situação do cofrinho 1:");

        lbSituacao1.setText("---");

        btDepositar101.setText("Depositar 10");
        btDepositar101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar101ActionPerformed(evt);
            }
        });

        btTirar101.setText("Tirar 10");
        btTirar101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar101ActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor no cofrinho 2:");

        lbValor2.setText("0");

        jLabel4.setText("Situação do cofrinho 2:");

        lbSituacao2.setText("---");

        btDepositar102.setText("Depositar 10");
        btDepositar102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar102ActionPerformed(evt);
            }
        });

        btTirar102.setText("Tirar 10");
        btTirar102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar102ActionPerformed(evt);
            }
        });

        btDepositar103.setText("Depositar 10");
        btDepositar103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositar103ActionPerformed(evt);
            }
        });

        btTirar103.setText("Tirar 10");
        btTirar103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTirar103ActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor no cofrinho 3:");

        lbValor3.setText("0");

        jLabel6.setText("Situação do cofrinho 3:");

        lbSituacao3.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbValor1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSituacao1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDepositar101)
                        .addGap(18, 18, 18)
                        .addComponent(btTirar101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbValor2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSituacao2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDepositar102)
                        .addGap(18, 18, 18)
                        .addComponent(btTirar102))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbValor3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbSituacao3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btDepositar103)
                        .addGap(18, 18, 18)
                        .addComponent(btTirar103)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbValor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbSituacao1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar101)
                    .addComponent(btTirar101))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbValor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbSituacao2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar102)
                    .addComponent(btTirar102))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbValor3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbSituacao3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDepositar103)
                    .addComponent(btTirar103)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDepositar101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar101ActionPerformed
        cofre1.depositar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor1, lbSituacao1, cofre1);
    }//GEN-LAST:event_btDepositar101ActionPerformed

    private void btTirar101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar101ActionPerformed
        cofre1.tirar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor1, lbSituacao1, cofre1);
    }//GEN-LAST:event_btTirar101ActionPerformed

    private void btDepositar102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar102ActionPerformed
        cofre2.depositar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor2, lbSituacao2, cofre2);
    }//GEN-LAST:event_btDepositar102ActionPerformed

    private void btTirar102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar102ActionPerformed
        cofre2.tirar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor2, lbSituacao2, cofre2);
    }//GEN-LAST:event_btTirar102ActionPerformed

    private void btDepositar103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositar103ActionPerformed
        cofre3.depositar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor3, lbSituacao3, cofre3);
    }//GEN-LAST:event_btDepositar103ActionPerformed

    private void btTirar103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTirar103ActionPerformed
        cofre3.tirar10();
        
        // 2 objetos do tipo JLabel e 1 objeto do tipo Cofrinho  
        atualizarTela(lbValor3, lbSituacao3, cofre3);
    }//GEN-LAST:event_btTirar103ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCofrinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCofrinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCofrinhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDepositar101;
    private javax.swing.JButton btDepositar102;
    private javax.swing.JButton btDepositar103;
    private javax.swing.JButton btTirar101;
    private javax.swing.JButton btTirar102;
    private javax.swing.JButton btTirar103;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbSituacao1;
    private javax.swing.JLabel lbSituacao2;
    private javax.swing.JLabel lbSituacao3;
    private javax.swing.JLabel lbValor1;
    private javax.swing.JLabel lbValor2;
    private javax.swing.JLabel lbValor3;
    // End of variables declaration//GEN-END:variables
}
