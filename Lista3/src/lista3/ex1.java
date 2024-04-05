/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lista3;

public class ex1 extends javax.swing.JFrame {

    public ex1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();
        selectMercurio = new javax.swing.JRadioButton();
        selectMarte = new javax.swing.JRadioButton();
        selectSaturno = new javax.swing.JRadioButton();
        selectJupiter = new javax.swing.JRadioButton();
        selectVenus = new javax.swing.JRadioButton();
        selectUrano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(377, 299));

        lblTitulo.setText("Peso na Terra (kg):");

        btnCalcular.setText("Calcular Peso");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblSubTitulo.setText("Selecionar um Planeta:");

        selectMercurio.setText("Mercúrio");
        selectMercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMercurioActionPerformed(evt);
            }
        });

        selectMarte.setText("Marte");
        selectMarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMarteActionPerformed(evt);
            }
        });

        selectSaturno.setText("Saturno");
        selectSaturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectSaturnoActionPerformed(evt);
            }
        });

        selectJupiter.setText("Júpiter");
        selectJupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectJupiterActionPerformed(evt);
            }
        });

        selectVenus.setText("Venûs");
        selectVenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectVenusActionPerformed(evt);
            }
        });

        selectUrano.setText("Urano");
        selectUrano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUranoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPeso)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectSaturno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectVenus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectMercurio)
                                .addGap(33, 33, 33)
                                .addComponent(selectMarte)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectJupiter, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectUrano, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(lblSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectMercurio)
                    .addComponent(selectMarte)
                    .addComponent(selectJupiter))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectSaturno)
                    .addComponent(selectUrano)
                    .addComponent(selectVenus))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectMercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMercurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMercurioActionPerformed

    private void selectMarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMarteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMarteActionPerformed

    private void selectSaturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectSaturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectSaturnoActionPerformed

    private void selectJupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectJupiterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectJupiterActionPerformed

    private void selectVenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectVenusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectVenusActionPerformed

    private void selectUranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUranoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectUranoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double pesoTerra = Double.parseDouble(txtPeso.getText());
        double pesoPlaneta = 0.0;

        if (selectMercurio.isSelected()) {
            pesoPlaneta = pesoTerra * 0.37; // Fator de gravidade em Mercúrio
        } else if (selectVenus.isSelected()) {
            pesoPlaneta = pesoTerra * 0.88; // Fator de gravidade em Vênus
        } else if (selectMarte.isSelected()) {
            pesoPlaneta = pesoTerra * 0.38; // Fator de gravidade em Marte
        } else if (selectJupiter.isSelected()) {
            pesoPlaneta = pesoTerra * 2.64; // Fator de gravidade em Júpiter
        } else if (selectSaturno.isSelected()) {
            pesoPlaneta = pesoTerra * 1.15; // Fator de gravidade em Saturno
        } else if (selectUrano.isSelected()) {
            pesoPlaneta = pesoTerra * 1.17; // Fator de gravidade em Urano
        }

        javax.swing.JOptionPane.showMessageDialog(this, "Seu peso em " + nomePlaneta() + " é: " + pesoPlaneta + " kg");
    }//GEN-LAST:event_btnCalcularActionPerformed

    private String nomePlaneta() {
        if (selectMercurio.isSelected()) {
            return "Mercúrio";
        } else if (selectVenus.isSelected()) {
            return "Vênus";
        } else if (selectMarte.isSelected()) {
            return "Marte";
        } else if (selectJupiter.isSelected()) {
            return "Júpiter";
        } else if (selectSaturno.isSelected()) {
            return "Saturno";
        } else if (selectUrano.isSelected()) {
            return "Urano";
        } else {
            return "Desconhecido";
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
            java.util.logging.Logger.getLogger(ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ex1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton selectJupiter;
    private javax.swing.JRadioButton selectMarte;
    private javax.swing.JRadioButton selectMercurio;
    private javax.swing.JRadioButton selectSaturno;
    private javax.swing.JRadioButton selectUrano;
    private javax.swing.JRadioButton selectVenus;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
