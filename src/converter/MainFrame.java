package converter;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        init = new Initialization();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        labelHex = new javax.swing.JPanel();
        lebelDec = new javax.swing.JLabel();
        labelOct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelBIn = new javax.swing.JLabel();
        textDec = new javax.swing.JTextField();
        textOct = new javax.swing.JTextField();
        textHex = new javax.swing.JTextField();
        textBin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Converter");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0};
        jPanel1Layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        labelHex.setLayout(jPanel1Layout);

        lebelDec.setText("Decimal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        labelHex.add(lebelDec, gridBagConstraints);

        labelOct.setText("Octal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        labelHex.add(labelOct, gridBagConstraints);

        jLabel3.setText("Hexadecimal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        labelHex.add(jLabel3, gridBagConstraints);

        labelBIn.setText("Binary");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        labelHex.add(labelBIn, gridBagConstraints);

        textDec.setPreferredSize(new java.awt.Dimension(200, 23));
        textDec.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textDecCaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        labelHex.add(textDec, gridBagConstraints);

        textOct.setPreferredSize(new java.awt.Dimension(200, 23));
        textOct.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textOctCaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        labelHex.add(textOct, gridBagConstraints);

        textHex.setPreferredSize(new java.awt.Dimension(200, 23));
        textHex.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textHexCaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        labelHex.add(textHex, gridBagConstraints);

        textBin.setPreferredSize(new java.awt.Dimension(200, 23));
        textBin.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textBinCaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        labelHex.add(textBin, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textDecCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textDecCaretUpdate
        try {
            dec = textDec.getText();
            int d = Integer.parseInt(dec);
            textOct.setText(init.decToOct(d));
            textHex.setText(init.decToHex(d));
            textBin.setText(init.decToBin(d));
        } catch (Exception e) {

        }
    }//GEN-LAST:event_textDecCaretUpdate

    private void textOctCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textOctCaretUpdate
        try {
            oct = textOct.getText();
            int oc = Integer.parseInt(oct);

            textDec.setText(init.octToDec(oc));
            textBin.setText(init.octToBin(oc));
            textHex.setText(init.octToHex(oc));
        } catch (Exception e) {

        }

    }//GEN-LAST:event_textOctCaretUpdate

    private void textHexCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textHexCaretUpdate

        try {
            hex = textHex.getText().toUpperCase();

            textDec.setText(init.hexToDec(hex));
            //oct vuce od dec
            textBin.setText(init.hexToBin(hex));

        } catch (Exception e) {

        }

    }//GEN-LAST:event_textHexCaretUpdate

    private void textBinCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textBinCaretUpdate

        try {
            bin = textBin.getText();

            textDec.setText(init.binToDec(bin));

        } catch (Exception e) {

        }


    }//GEN-LAST:event_textBinCaretUpdate

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelBIn;
    private javax.swing.JPanel labelHex;
    private javax.swing.JLabel labelOct;
    private javax.swing.JLabel lebelDec;
    private javax.swing.JTextField textBin;
    private javax.swing.JTextField textDec;
    private javax.swing.JTextField textHex;
    private javax.swing.JTextField textOct;
    // End of variables declaration//GEN-END:variables
    private final Initialization init;
    private String dec;
    private String oct;
    private String bin;
    private String hex;
}