/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BC;


/**
 *
 * @author Danny Kafui Gblonya
 */
public class BandwithCal extends javax.swing.JFrame {

    /**
     * Creates new form BandwithCal
     */
    public BandwithCal() {
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

        jPanel1 = new javax.swing.JPanel();
        kb = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        mb = new javax.swing.JTextField();
        gb = new javax.swing.JTextField();
        MB = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        GB = new javax.swing.JTextField();
        KB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        valueBox = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bandwith Calculator");
        setIconImages(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Latha", 0, 18))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel1.setText("bits (b):");
        jLabel1.setToolTipText("");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel2.setText("kilobits (kb):");
        jLabel2.setToolTipText("");
        jLabel2.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel3.setText("megabits (mb):");
        jLabel3.setToolTipText("");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel4.setText("gigabits (gb):");
        jLabel4.setToolTipText("");
        jLabel4.setAutoscrolls(true);
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel5.setText("Bytes (B):");
        jLabel5.setToolTipText("");
        jLabel5.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel6.setText("Kilobytes (KB):");
        jLabel6.setToolTipText("");
        jLabel6.setAutoscrolls(true);

        jLabel7.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel7.setText("Megabytes (MB):");
        jLabel7.setToolTipText("");
        jLabel7.setAutoscrolls(true);

        jLabel8.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel8.setText("Gigabytes (GB):");
        jLabel8.setToolTipText("");
        jLabel8.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GB)
                            .addComponent(MB)
                            .addComponent(KB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {B, GB, KB, MB, b, gb, kb, mb});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(KB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(MB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(GB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {B, GB, KB, MB, b, gb, kb, mb});

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bits(b)", "kilobits(kb)", "megabits(mb)", "gigabits(gb)", "Bytes(B)", "Kilobytes(KB)", "Megabytes(MB)", "Gigabytes(GB)" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Latha", 0, 14)); // NOI18N
        jLabel9.setText("Enter desired value :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(valueBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(convert)
                        .addGap(30, 30, 30)
                        .addComponent(reset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {convert, reset});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convert)
                    .addComponent(reset))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {convert, reset});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        b.setText("");
        kb.setText("");
        mb.setText("");
        gb.setText("");
        B.setText("");
        KB.setText("");
        MB.setText("");
        GB.setText("");
        valueBox.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
            
    }//GEN-LAST:event_comboActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
         double value;
         value = Double.parseDouble(valueBox.getText());
         Object selecteditem = combo.getSelectedItem(); 
            if(selecteditem == "bits(b)")
            {
                double newkb = value * 0.0009766;
                double newmb = value * 0.000001;
                double newgb = value * 0.000;
                double newB  = value * 0.125;
                double newKB = value * 0.0001221;
                double newMB = value * 0.0000001;
                double newGB = value * 0.0000;
                 b.setText(String.valueOf(value));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
            }    
            else if(selecteditem == "kilobits(kb)")
            {
                double newb = value * 1024;
                double newmb = value * 0.0009766;
                double newgb = value * 0.000001;
                double newB  = value * 128;
                double newKB = value * 0.125;
                double newMB = value * 0.0001221;
                double newGB = value * 0.0000001;
                 b.setText(String.valueOf(newb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
                kb.setText(String.valueOf(value));
                
            }
            else if(selecteditem == "megabits(mb)")
            {
                double newb  = value * 1048576;
                double newkb = value * 1024;
                double newgb = value * 0.0009766;
                double newB  = value * 131072;
                double newKB = value * 128;
                double newMB = value * 0.125;
                double newGB = value * 0.0001221;
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
                mb.setText(String.valueOf(value));
            }
            else if(selecteditem == "gigabits(gb)")
            {
                double newb  = value * 1073741824;
                double newkb = value * 1048576;
                double newmb = value * 1024;
                double newB  = value * 134217728;
                double newKB = value * 131072;
                double newMB = value * 128;
                double newGB = value * 0.125;
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
                gb.setText(String.valueOf(value));
            }
            else if(selecteditem == "Bytes(B)")
            {
                double newb  = value * 8;
                double newkb = value * 0.0078125;
                double newmb = value * 0.00000763;
                double newgb = value * 0.00000001;
                double newKB = value * 0.0009766;
                double newMB = value * 0.000001;
                double newGB = value * 0.0000;
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
                B.setText(String.valueOf(value));
            }
            else if(selecteditem == "Kilobytes(KB)")
            {
                double newb  = value * 8192;
                double newkb = value * 8;
                double newmb = value * 0.0078125;
                double newgb = value * 0.00000763;
                double newB  = value * 1024;
                double newMB = value * 0.0009766;
                double newGB = value * 0.000001;
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(newGB));
                KB.setText(String.valueOf(value));
            }
            else if(selecteditem == "Megabytes(MB)")
            {
                double newb  = value * 8388608;
                double newkb = value * 8192;
                double newmb = value * 8;
                double newgb = value * 0.0078125;
                double newB  = value * 1048576;
                double newKB = value * 1024;
                double newGB = value * 0.0009766;
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 GB.setText(String.valueOf(newGB));
                MB.setText(String.valueOf(value));
            }
            else if(selecteditem == "Gigabytes(GB)")
            {
                double newb  = value * 858993459;
                double newkb = value * 8388608;
                double newmb = value * 8192;
                double newgb = value * 8;
                double newB  = value * 1073741824;
                double newKB = value * 1048576;
                double newMB = value * 1024;
                
                 b.setText(String.valueOf(newb));
                 kb.setText(String.valueOf(newkb));
                 mb.setText(String.valueOf(newmb));
                 gb.setText(String.valueOf(newgb));
                 B.setText(String.valueOf(newB));
                 KB.setText(String.valueOf(newKB));
                 MB.setText(String.valueOf(newMB));
                 GB.setText(String.valueOf(value));
            }
    }//GEN-LAST:event_convertActionPerformed

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
            java.util.logging.Logger.getLogger(BandwithCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BandwithCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BandwithCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BandwithCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BandwithCal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B;
    private javax.swing.JTextField GB;
    private javax.swing.JTextField KB;
    private javax.swing.JTextField MB;
    private javax.swing.JTextField b;
    private javax.swing.JComboBox combo;
    private javax.swing.JButton convert;
    private javax.swing.JTextField gb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField kb;
    private javax.swing.JTextField mb;
    private javax.swing.JButton reset;
    private javax.swing.JTextField valueBox;
    // End of variables declaration//GEN-END:variables
}
