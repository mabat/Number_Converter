package converter;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        conv = new Conversion();
        oper = new Operation();

        comboNumType.addItem("Decimal");
        comboNumType.addItem("Octal");
        comboNumType.addItem("Hexadecimal");
        comboNumType.addItem("Binary");
        comboOperationType.addItem("+");

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
        comboNumType = new javax.swing.JComboBox<>();
        comboOperationType = new javax.swing.JComboBox<>();
        textX = new javax.swing.JTextField();
        textY = new javax.swing.JTextField();
        textResult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Converter");

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        jPanel1Layout.rowHeights = new int[] {0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0, 7, 0};
        labelHex.setLayout(jPanel1Layout);

        lebelDec.setText("Decimal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(lebelDec, gridBagConstraints);

        labelOct.setText("Octal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(labelOct, gridBagConstraints);

        jLabel3.setText("Hexadecimal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(jLabel3, gridBagConstraints);

        labelBIn.setText("Binary");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
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

        comboNumType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumTypeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        labelHex.add(comboNumType, gridBagConstraints);

        comboOperationType.setSelectedIndex(-1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(comboOperationType, gridBagConstraints);

        textX.setPreferredSize(new java.awt.Dimension(200, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        labelHex.add(textX, gridBagConstraints);

        textY.setPreferredSize(new java.awt.Dimension(200, 23));
        textY.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textYCaretUpdate(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        labelHex.add(textY, gridBagConstraints);

        textResult.setEditable(false);
        textResult.setPreferredSize(new java.awt.Dimension(200, 23));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        labelHex.add(textResult, gridBagConstraints);

        jLabel1.setText("1st num:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(jLabel1, gridBagConstraints);

        jLabel2.setText("2nd num:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(jLabel2, gridBagConstraints);

        jLabel4.setText("Sum:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        labelHex.add(jLabel4, gridBagConstraints);

        jSeparator1.setPreferredSize(new java.awt.Dimension(300, 10));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        labelHex.add(jSeparator1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHex, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelHex, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textDecCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textDecCaretUpdate
        try {
            dec = textDec.getText();
            int d = Integer.parseInt(dec);

            textOct.setText(conv.decToOct(d));
            textHex.setText(conv.decToHex(d));
            textBin.setText(conv.decToBin(d));
        } catch (Exception e) {

        }
    }//GEN-LAST:event_textDecCaretUpdate

    private void textOctCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textOctCaretUpdate
        try {
            oct = textOct.getText();
            int oc = Integer.parseInt(oct);
            textDec.setText(conv.octToDec(oc));
            textBin.setText(conv.octToBin(oc));
            textHex.setText(conv.octToHex(oc));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_textOctCaretUpdate

    private void textHexCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textHexCaretUpdate

        try {
            hex = textHex.getText().toUpperCase();
            textDec.setText(conv.hexToDec(hex));
            //oct vuce od dec
            textBin.setText(conv.hexToBin(hex));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_textHexCaretUpdate

    private void textBinCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textBinCaretUpdate
        try {
            bin = textBin.getText();
            textDec.setText(conv.binToDec(bin));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_textBinCaretUpdate

    private void textYCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textYCaretUpdate

        try {
            X = textX.getText().toUpperCase();
            Y = textY.getText().toUpperCase();

            if (comboNumType.getSelectedItem().equals("Octal")) {
                String sum = oper.octalSum(X, Y);
                textResult.setText(sum);
                textOct.setText(sum);
            } else if (comboNumType.getSelectedItem().equals("Hexadecimal")) {
                String sum = oper.hexSum(X, Y);
                textResult.setText(sum);
                textHex.setText(sum);
            } else if (comboNumType.getSelectedItem().equals("Decimal")) {
                String sum = oper.decSum(X, Y);
                textResult.setText(sum);
                textDec.setText(sum);
            } else if (comboNumType.getSelectedItem().equals("Binary")) {
                String sum = oper.binSum(X, Y);
                textResult.setText(sum);
                textBin.setText(sum);
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_textYCaretUpdate

    private void comboNumTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumTypeActionPerformed

        textX.setText(null);
        textY.setText(null);
        textResult.setText(null);
        textBin.setText(null);
        textDec.setText(null);
        textHex.setText(null);
        textOct.setText(null);
    }//GEN-LAST:event_comboNumTypeActionPerformed

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
    private javax.swing.JComboBox<String> comboNumType;
    private javax.swing.JComboBox<String> comboOperationType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelBIn;
    private javax.swing.JPanel labelHex;
    private javax.swing.JLabel labelOct;
    private javax.swing.JLabel lebelDec;
    private javax.swing.JTextField textBin;
    private javax.swing.JTextField textDec;
    private javax.swing.JTextField textHex;
    private javax.swing.JTextField textOct;
    private javax.swing.JTextField textResult;
    private javax.swing.JTextField textX;
    private javax.swing.JTextField textY;
    // End of variables declaration//GEN-END:variables
    private final Conversion conv;
    private String dec;
    private String oct;
    private String bin;
    private String hex;
    private final Operation oper;
    private String X;
    private String Y;
}
