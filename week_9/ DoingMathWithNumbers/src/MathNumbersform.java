public class MathNumbersform extends javax.swing.JFrame {

    public MathNumbersform() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserName = new javax.swing.JLabel();
        lblFirstNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblResultText = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtNumber1 = new javax.swing.JTextField();
        txtNumber2 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doing Math with Numbers - Programmer: Christian Alvarez");

        lblUserName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblUserName.setText("User Name");

        lblFirstNumber.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblFirstNumber.setText("First Number");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Second Number");

        lblResultText.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblResultText.setText("Result");

        lblResult.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtUserName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtNumber1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber1ActionPerformed(evt);
            }
        });

        txtNumber2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumber2ActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultText)
                            .addComponent(lblUserName)
                            .addComponent(lblFirstNumber)
                            .addComponent(jLabel3))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName)
                            .addComponent(txtNumber1)
                            .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstNumber)
                    .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        // 1 :: Declare variables for project
        String strNumber1, strNumber2, strResult;
        int number1, number2, result;

        // 2 :: Get test form text box
        strNumber1 = txtNumber1.getName();
        strNumber2 = txtNumber2.getText();

        // 3 :: Covert from string to int
        number1 = Intger.parseInt(strNumber1);
        number2 = Intger.parseInt(strNumber2);

        // 4 :: Calculate the sum in result
        

    }

    private void txtFirstNumberActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtSecondNumberActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(MathNumbersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathNumbersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathNumbersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathNumbersform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathNumbersform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFirstNumber;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResultText;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtNumber1;
    private javax.swing.JTextField txtNumber2;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
