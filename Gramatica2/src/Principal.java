
public class Principal extends javax.swing.JFrame {

    private String simboloInicial;
    private String terminais;
    private String naoTerminais;
    private String producoes;

    private String producoesVazias = "";
    private String[] vTerminais, vNaoTerminais, vProducoes, vetorNproducoes, vProducaoVazio;

    public void ProducoesVazias() {

        for (int i = 0; i < vProducoes.length; i++) {
            for (int j = 0; j < vProducoes[i].length(); j++) {

                if (vProducoes[i].charAt(j) == '&') {
                    if (producoesVazias == "") {
                        producoesVazias += vetorNproducoes[i];
                    } else {

                        producoesVazias += "," + vetorNproducoes[i];
                    }
                }

            }
        }
        vProducaoVazio = producoesVazias.split(",");

        producoesVazias = "";
        //teste nao ta funcionando ainda
        String prod = producoes;
         for (int i = 0; i < vProducoes.length; i++) {
            for (int j = 0; j < vProducoes[i].length(); j++) {
               for(int t = 0; t < vProducaoVazio.length; t++){
                   if(vProducaoVazio[t].charAt(0) == vProducoes[i].charAt(j)){
                       
                       prod += "\n" + vetorNproducoes[i]+ "-" + vProducoes[i].replace(vProducaoVazio[t], "");
                       
                   }
                   
               }
               if('&' == vProducoes[i].charAt(j)){
                       prod += "\n" + vetorNproducoes[i] + "-" + vProducoes[i].replace("&", "");
                   }
            }
         }
         System.out.println("tetetet: " + prod);
        
    }

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextTerminais = new javax.swing.JTextField();
        TextNaoTerminais = new javax.swing.JTextField();
        TextSimboloInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextProducoes = new javax.swing.JTextArea();
        BotaoSalvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextGramatica = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextTerminais.setText("a,b,c,d,e");

        TextNaoTerminais.setText("J,G,H,K,L");

        TextSimboloInicial.setText("J");
        TextSimboloInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSimboloInicialActionPerformed(evt);
            }
        });

        jLabel1.setText("Terminais:");

        jLabel2.setText("Não Terminais:");

        jLabel3.setText("Simbolo Inicial:");

        jLabel4.setText("Produções:");

        TextProducoes.setColumns(20);
        TextProducoes.setRows(5);
        TextProducoes.setText("J-abG\nG-cd\nH-eK\nK-dL\nL-&");
        jScrollPane1.setViewportView(TextProducoes);

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        jButton2.setText("Dale");

        jButton3.setText("Dale");

        jButton4.setText("Dale");

        TextGramatica.setEditable(false);
        TextGramatica.setColumns(20);
        TextGramatica.setRows(5);
        TextGramatica.setBorder(javax.swing.BorderFactory.createTitledBorder("Gramatica"));
        jScrollPane2.setViewportView(TextGramatica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextTerminais)
                            .addComponent(TextSimboloInicial)
                            .addComponent(TextNaoTerminais)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextSimboloInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextTerminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNaoTerminais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoSalvar)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextSimboloInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSimboloInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSimboloInicialActionPerformed

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        simboloInicial = TextSimboloInicial.getText();
        terminais = TextTerminais.getText();
        naoTerminais = TextNaoTerminais.getText();
        producoes = TextProducoes.getText();

        vTerminais = terminais.split(",");
        vNaoTerminais = naoTerminais.split(",");
        vProducoes = producoes.split("\n");

        String aux = "";
        for (int i = 0; i < vNaoTerminais.length; i++) {
            for (int j = 0; j < vProducoes.length; j++) {
                if (vNaoTerminais[i].charAt(0) == (vProducoes[j].charAt(0))) {
                    if (aux == "") {
                        aux += vNaoTerminais[i];
                    } else {
                        aux += "," + vNaoTerminais[i];
                    }

                }
            }
        }
        vetorNproducoes = aux.split(",");
        aux = "";

        for (int i = 0; i < vProducoes.length; i++) {
            vProducoes[i] = vProducoes[i].replace(vProducoes[i].charAt(0) + "", "");
            vProducoes[i] = vProducoes[i].replace(vProducoes[i].charAt(0) + "", "");
        }
        ProducoesVazias();

    }//GEN-LAST:event_BotaoSalvarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JTextArea TextGramatica;
    private javax.swing.JTextField TextNaoTerminais;
    private javax.swing.JTextArea TextProducoes;
    private javax.swing.JTextField TextSimboloInicial;
    private javax.swing.JTextField TextTerminais;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
