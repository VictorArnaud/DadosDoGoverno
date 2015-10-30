
package views;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jLabelListaDeDeputados = new javax.swing.JLabel();
        jButtonListaDeDeputados = new javax.swing.JButton();
        jLabelListaDePartidos = new javax.swing.JLabel();
        jButtonListaDePartidos = new javax.swing.JButton();
        jLabelPesquisarPolitico = new javax.swing.JLabel();
        jButtonPesquisarPolitico = new javax.swing.JButton();
        jLabelRelatorio = new javax.swing.JLabel();
        jButtonRelatorio = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelTelaInternalFrame = new javax.swing.JLabel();
        jLabelJFrame = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuLista = new javax.swing.JMenu();
        jMenuItemListaDeputados = new javax.swing.JMenuItem();
        jMenuItemListaPartidos = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemBemVindo = new javax.swing.JMenuItem();
        jMenuItemPesquisar = new javax.swing.JMenuItem();
        jMenuItemRelatorio = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jLabelListaDeDeputados.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelListaDeDeputados.setText("Lista de Deputados:");
        jInternalFrameBemVindo.getContentPane().add(jLabelListaDeDeputados);
        jLabelListaDeDeputados.setBounds(50, 30, 180, 21);

        jButtonListaDeDeputados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/politico3.png"))); // NOI18N
        jButtonListaDeDeputados.setToolTipText("Lista de Deputados");
        jInternalFrameBemVindo.getContentPane().add(jButtonListaDeDeputados);
        jButtonListaDeDeputados.setBounds(70, 70, 140, 130);

        jLabelListaDePartidos.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelListaDePartidos.setText("Lista de Partidos:");
        jInternalFrameBemVindo.getContentPane().add(jLabelListaDePartidos);
        jLabelListaDePartidos.setBounds(60, 240, 160, 20);

        jButtonListaDePartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/brasao2.png"))); // NOI18N
        jButtonListaDePartidos.setToolTipText("Lista de Partidos");
        jInternalFrameBemVindo.getContentPane().add(jButtonListaDePartidos);
        jButtonListaDePartidos.setBounds(60, 280, 150, 120);

        jLabelPesquisarPolitico.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelPesquisarPolitico.setText("Pesquisar Deputados: ");
        jInternalFrameBemVindo.getContentPane().add(jLabelPesquisarPolitico);
        jLabelPesquisarPolitico.setBounds(320, 30, 200, 21);

        jButtonPesquisarPolitico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/politico2.png"))); // NOI18N
        jButtonPesquisarPolitico.setToolTipText("Pesquisar deputados");
        jInternalFrameBemVindo.getContentPane().add(jButtonPesquisarPolitico);
        jButtonPesquisarPolitico.setBounds(350, 70, 140, 130);

        jLabelRelatorio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelRelatorio.setText("Relatório completo de cada deputado: ");
        jInternalFrameBemVindo.getContentPane().add(jLabelRelatorio);
        jLabelRelatorio.setBounds(270, 240, 340, 21);

        jButtonRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio2.png"))); // NOI18N
        jButtonRelatorio.setToolTipText("Relatorio completo de cada deputado");
        jInternalFrameBemVindo.getContentPane().add(jButtonRelatorio);
        jButtonRelatorio.setBounds(350, 280, 140, 120);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fechar.png"))); // NOI18N
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFechar);
        jButtonFechar.setBounds(830, 0, 40, 40);

        jLabelTelaInternalFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo5.jpg"))); // NOI18N
        jInternalFrameBemVindo.getContentPane().add(jLabelTelaInternalFrame);
        jLabelTelaInternalFrame.setBounds(0, 0, 870, 460);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(40, 120, 880, 490);

        jLabelJFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/telaDeFundo7.jpg"))); // NOI18N
        jLabelJFrame.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(jLabelJFrame);
        jLabelJFrame.setBounds(0, 0, 1000, 630);

        jMenuLista.setText("Lista");

        jMenuItemListaDeputados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemListaDeputados.setText("Lista de deputados");
        jMenuLista.add(jMenuItemListaDeputados);

        jMenuItemListaPartidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemListaPartidos.setText("Deputados por partido");
        jMenuLista.add(jMenuItemListaPartidos);

        jMenuBar.add(jMenuLista);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemBemVindo.setText("Bem-Vindo");
        jMenuItemBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemBemVindo);

        jMenuItemPesquisar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPesquisar.setText("Pesquisar");
        jMenuFerramentas.add(jMenuItemPesquisar);

        jMenuItemRelatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRelatorio.setText("Relatório completo");
        jMenuFerramentas.add(jMenuItemRelatorio);

        jMenuBar.add(jMenuFerramentas);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuSair);

        setJMenuBar(jMenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jMenuItemBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemBemVindoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonListaDeDeputados;
    private javax.swing.JButton jButtonListaDePartidos;
    private javax.swing.JButton jButtonPesquisarPolitico;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelJFrame;
    private javax.swing.JLabel jLabelListaDeDeputados;
    private javax.swing.JLabel jLabelListaDePartidos;
    private javax.swing.JLabel jLabelPesquisarPolitico;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JLabel jLabelTelaInternalFrame;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItemBemVindo;
    private javax.swing.JMenuItem jMenuItemListaDeputados;
    private javax.swing.JMenuItem jMenuItemListaPartidos;
    private javax.swing.JMenuItem jMenuItemPesquisar;
    private javax.swing.JMenuItem jMenuItemRelatorio;
    private javax.swing.JMenu jMenuLista;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}