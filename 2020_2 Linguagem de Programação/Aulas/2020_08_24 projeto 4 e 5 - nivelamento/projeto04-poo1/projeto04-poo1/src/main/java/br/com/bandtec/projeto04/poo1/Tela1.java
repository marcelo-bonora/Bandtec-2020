/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto04.poo1;

import java.awt.Color;

/**
 *
 * @author jyoshiriro
 */
public class Tela1 extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Tela1() {
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

        lbTexto1 = new javax.swing.JLabel();
        lbTexto2 = new javax.swing.JLabel();
        lbTexto3 = new javax.swing.JLabel();
        tfCampo1 = new javax.swing.JTextField();
        tfCampo2 = new javax.swing.JTextField();
        tfCampo3 = new javax.swing.JTextField();
        btAcao1 = new javax.swing.JButton();
        btAcao2 = new javax.swing.JButton();
        btAcao3 = new javax.swing.JButton();
        btAcoesDiversas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTexto1.setForeground(new java.awt.Color(0, 0, 255));
        lbTexto1.setText("Sou o 1º texto");

        lbTexto2.setForeground(new java.awt.Color(255, 0, 0));
        lbTexto2.setText("Sou o segundo");

        lbTexto3.setForeground(new java.awt.Color(0, 153, 51));
        lbTexto3.setText("Eu o 3º");

        btAcao1.setText("Ação 1");
        btAcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao1ActionPerformed(evt);
            }
        });

        btAcao2.setText("Ação 2");
        btAcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao2ActionPerformed(evt);
            }
        });

        btAcao3.setText("Ação 3");
        btAcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcao3ActionPerformed(evt);
            }
        });

        btAcoesDiversas.setText("Ações Diversas");
        btAcoesDiversas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcoesDiversasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAcoesDiversas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTexto1)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCampo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btAcao1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btAcao2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAcao3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTexto2)
                                    .addComponent(tfCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 26, Short.MAX_VALUE)
                                        .addComponent(lbTexto3))
                                    .addComponent(tfCampo3))))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTexto1)
                    .addComponent(lbTexto2)
                    .addComponent(lbTexto3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcao1)
                    .addComponent(btAcao2)
                    .addComponent(btAcao3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btAcoesDiversas)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao1ActionPerformed

        // pegamos o objeto "lbTexto1"
        // mudamos seu atributo "text" com setText()
        lbTexto1.setText("É nois no Java Swing");
        
        // Sempre que vamos mudar um atributo, usamos setX() 
        // (ex: atributo "cor" -> setCor("azul"). Atributo altura -> setAltura(1.94)
        
    }//GEN-LAST:event_btAcao1ActionPerformed

    private void btAcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao2ActionPerformed
        
        // pegamos o objeto "lbTexto2"
        // mudamos seu atributo "text" com setText()
        // No setText() usamos o valor do "text" do "tfCampo2"
        // Ou seja, para pegar o valor de um atributo usamos getX()
        // (ex: atributo "cor" -> getCor(). Atributo altura -> getAltura()
        lbTexto2.setText(tfCampo2.getText());
    }//GEN-LAST:event_btAcao2ActionPerformed

    private void btAcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcao3ActionPerformed
        
        // pegamos o objeto "lbTexto3"
        // mudamos seu atributo "foreground" com setForeground()
        lbTexto3.setForeground(Color.MAGENTA);
        
        // também é possível usar o código hexadecimal RGB (igual ao CSS)
        // lbTexto3.setForeground(Color.decode("#00FF00"));
    }//GEN-LAST:event_btAcao3ActionPerformed

    private void btAcoesDiversasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcoesDiversasActionPerformed
        // exemplos legais:
        
        // deixando um elemento INVISÍVEL
        lbTexto1.setVisible(false);
        
        // Pegando um texto e convertendo em número
        String texto1 = tfCampo1.getText(); // os getText() SEMPRE vêm como String
        
        Integer valorInteiro = Integer.valueOf(texto1);
        Double valorReal = Double.valueOf(texto1);
        
        // É necessária essa conversão para coisas como:
        // O número está num intervalo de valor válido?
        // É maior ou menor de idade?
        // Aprovado (>=6) ou reprovado (else)?
    }//GEN-LAST:event_btAcoesDiversasActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcao1;
    private javax.swing.JButton btAcao2;
    private javax.swing.JButton btAcao3;
    private javax.swing.JButton btAcoesDiversas;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbTexto2;
    private javax.swing.JLabel lbTexto3;
    private javax.swing.JTextField tfCampo1;
    private javax.swing.JTextField tfCampo2;
    private javax.swing.JTextField tfCampo3;
    // End of variables declaration//GEN-END:variables
}
