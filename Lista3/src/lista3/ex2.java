package lista3;

import java.util.Random;

public class ex2 extends javax.swing.JFrame {

    public ex2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCampo = new javax.swing.JPanel();
        lblDescrisao = new javax.swing.JLabel();
        selectPapel = new javax.swing.JRadioButton();
        selectPedra = new javax.swing.JRadioButton();
        selectTesoura = new javax.swing.JRadioButton();
        btnJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        pnlTitulo.setBackground(new java.awt.Color(204, 204, 204));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setText("Jogo para Diversão");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(86, 86, 86))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitulo)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlCampo.setBackground(new java.awt.Color(102, 102, 102));

        lblDescrisao.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblDescrisao.setText("Escolha seu movimento:");

        selectPapel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        selectPapel.setText("Papel");
        selectPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPapelActionPerformed(evt);
            }
        });

        selectPedra.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        selectPedra.setText("Pedra");
        selectPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPedraActionPerformed(evt);
            }
        });

        selectTesoura.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        selectTesoura.setText("Tesoura");
        selectTesoura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTesouraActionPerformed(evt);
            }
        });

        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCampoLayout = new javax.swing.GroupLayout(pnlCampo);
        pnlCampo.setLayout(pnlCampoLayout);
        pnlCampoLayout.setHorizontalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lblDescrisao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJogar)
                    .addGroup(pnlCampoLayout.createSequentialGroup()
                        .addComponent(selectPedra)
                        .addGap(60, 60, 60)
                        .addComponent(selectPapel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(selectTesoura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pnlCampoLayout.setVerticalGroup(
            pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCampoLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblDescrisao)
                .addGap(48, 48, 48)
                .addGroup(pnlCampoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPapel)
                    .addComponent(selectTesoura)
                    .addComponent(selectPedra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnJogar)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPapelActionPerformed

    private void selectPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPedraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPedraActionPerformed

    private void selectTesouraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTesouraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectTesouraActionPerformed

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        int escolhaUsuario = -1;
        String escolhaUsuarioStr = "";
        if (selectPedra.isSelected()) {
            escolhaUsuario = 0;
            escolhaUsuarioStr = "Pedra";
        } else if (selectPapel.isSelected()) {
            escolhaUsuario = 1;
            escolhaUsuarioStr = "Papel";
        } else if (selectTesoura.isSelected()) {
            escolhaUsuario = 2;
            escolhaUsuarioStr = "Tesoura";
        }

        if (escolhaUsuario != -1) {
            int escolhaComp = escolhaComputador();
            String escolhaCompStr = "";
            switch (escolhaComp) {
                case 0:
                    escolhaCompStr = "Pedra";
                    break;
                case 1:
                    escolhaCompStr = "Papel";
                    break;
                case 2:
                    escolhaCompStr = "Tesoura";
                    break;
            }

            String vencedor = determinarVencedor(escolhaUsuario, escolhaComp);

            javax.swing.JOptionPane.showMessageDialog(this, "O vencedor é: " + vencedor
                    + "\n\nVocê escolheu: " + escolhaUsuarioStr
                    + "\nComputador escolheu: " + escolhaCompStr);

            selectPedra.setSelected(false);
            selectPapel.setSelected(false);
            selectTesoura.setSelected(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecione uma opção.");
        }
    }//GEN-LAST:event_btnJogarActionPerformed

    private int escolhaComputador() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private String determinarVencedor(int escolhaUsuario, int escolhaComputador) {
        if (escolhaUsuario == escolhaComputador) {
            return "Empate";
        } else if ((escolhaUsuario == 0 && escolhaComputador == 2)
                || (escolhaUsuario == 1 && escolhaComputador == 0)
                || (escolhaUsuario == 2 && escolhaComputador == 1)) {
            return "Você";
        } else {
            return "Computador";
        }
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
            java.util.logging.Logger.getLogger(ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ex2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel lblDescrisao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlCampo;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton selectPapel;
    private javax.swing.JRadioButton selectPedra;
    private javax.swing.JRadioButton selectTesoura;
    // End of variables declaration//GEN-END:variables
}
