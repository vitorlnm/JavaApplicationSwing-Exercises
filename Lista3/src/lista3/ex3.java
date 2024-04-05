package lista3;

import javax.swing.JOptionPane;

public class ex3 extends javax.swing.JFrame {

    public ex3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
            }
        });
        
        String str = JOptionPane.showInputDialog("Digite um número");
        int num = Integer.parseInt(str);

        String divisores = "Divisores de " + num + " são os números: ";

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores += i + ", ";
            }
        }

        JOptionPane.showMessageDialog(null, divisores.substring(0, divisores.length() - 2));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
