/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.pharmacy.app.GUI.Employee;

/**
 *
 * @author phong
 */
public class UpdateContract extends javax.swing.JDialog {

    /**
     * Creates new form UpdateContract
     */
    public UpdateContract(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlContractButton = new javax.swing.JPanel();
        btnUpdateContract = new javax.swing.JButton();
        btnDeleteContract = new javax.swing.JButton();
        btnCancelContract = new javax.swing.JButton();
        pnlUpdateContract = new javax.swing.JPanel();
        lblUpdateContract = new javax.swing.JLabel();
        pnlContractInfo = new javax.swing.JPanel();
        lblDescription = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        lblSigningDate = new javax.swing.JLabel();
        txtSigningDate = new javax.swing.JTextField();
        lblPosition = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblEndDate = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        pnlSalaryTerms = new javax.swing.JPanel();
        lblBaseSalary = new javax.swing.JLabel();
        txtBaseSalary = new javax.swing.JTextField();
        lblBaseWorkDays = new javax.swing.JLabel();
        txtBaseWorkDays = new javax.swing.JTextField();
        pnlEmployeeInfo = new javax.swing.JPanel();
        lblEmployeeID = new javax.swing.JLabel();
        lblDegree = new javax.swing.JLabel();
        txtDegree = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtExperienceYears = new javax.swing.JTextField();
        lblContractID = new javax.swing.JLabel();
        txtContractID = new javax.swing.JTextField();
        txtEmployeeID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlContractButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));

        btnUpdateContract.setBackground(new java.awt.Color(0, 204, 51));
        btnUpdateContract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateContract.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateContract.setText("Cập nhật");
        pnlContractButton.add(btnUpdateContract);

        btnDeleteContract.setBackground(new java.awt.Color(255, 0, 0));
        btnDeleteContract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeleteContract.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteContract.setText("Xóa");
        pnlContractButton.add(btnDeleteContract);

        btnCancelContract.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelContract.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelContract.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelContract.setText("Hủy");
        btnCancelContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelContractActionPerformed(evt);
            }
        });
        pnlContractButton.add(btnCancelContract);

        pnlUpdateContract.setLayout(new java.awt.BorderLayout());

        lblUpdateContract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUpdateContract.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateContract.setText("HỢP ĐỒNG LAO ĐỘNG");
        pnlUpdateContract.add(lblUpdateContract, java.awt.BorderLayout.CENTER);

        pnlContractInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin hợp đồng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlContractInfo.setLayout(new java.awt.GridBagLayout());

        lblDescription.setText("Mô tả công việc:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 20);
        pnlContractInfo.add(lblDescription, gridBagConstraints);

        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
        pnlContractInfo.add(txtEndDate, gridBagConstraints);

        lblSigningDate.setText("Ngày ký kết:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        pnlContractInfo.add(lblSigningDate, gridBagConstraints);

        txtSigningDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSigningDateActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 30);
        pnlContractInfo.add(txtSigningDate, gridBagConstraints);

        lblPosition.setText("Chức vụ:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 20);
        pnlContractInfo.add(lblPosition, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 10);
        pnlContractInfo.add(txtPosition, gridBagConstraints);

        lblStartDate.setText("Ngày bắt đầu:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 20);
        pnlContractInfo.add(lblStartDate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 30);
        pnlContractInfo.add(txtStartDate, gridBagConstraints);

        lblEndDate.setText("Ngày kết thúc:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
        pnlContractInfo.add(lblEndDate, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
        pnlContractInfo.add(txtDescription, gridBagConstraints);

        pnlSalaryTerms.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Điều khoản lương", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlSalaryTerms.setLayout(new java.awt.GridBagLayout());

        lblBaseSalary.setText("Lương cơ bản:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        pnlSalaryTerms.add(lblBaseSalary, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 30);
        pnlSalaryTerms.add(txtBaseSalary, gridBagConstraints);

        lblBaseWorkDays.setText("Số ngày làm việc cơ bản:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 20);
        pnlSalaryTerms.add(lblBaseWorkDays, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 10);
        pnlSalaryTerms.add(txtBaseWorkDays, gridBagConstraints);

        pnlEmployeeInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlEmployeeInfo.setLayout(new java.awt.GridBagLayout());

        lblEmployeeID.setText("Mã nhân viên:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 20);
        pnlEmployeeInfo.add(lblEmployeeID, gridBagConstraints);

        lblDegree.setText("Bằng cấp:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 20, 20);
        pnlEmployeeInfo.add(lblDegree, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 5.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 30);
        pnlEmployeeInfo.add(txtDegree, gridBagConstraints);

        jLabel3.setText("Số năm kinh nghiệm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 20);
        pnlEmployeeInfo.add(jLabel3, gridBagConstraints);

        txtExperienceYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExperienceYearsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 10);
        pnlEmployeeInfo.add(txtExperienceYears, gridBagConstraints);

        lblContractID.setText("Mã hợp đồng:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 20, 20);
        pnlEmployeeInfo.add(lblContractID, gridBagConstraints);

        txtContractID.setEditable(false);
        txtContractID.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 30);
        pnlEmployeeInfo.add(txtContractID, gridBagConstraints);

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 10);
        pnlEmployeeInfo.add(txtEmployeeID, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlContractInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSalaryTerms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlContractButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlUpdateContract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEmployeeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlUpdateContract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlEmployeeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlContractInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlSalaryTerms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlContractButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelContractActionPerformed

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void txtSigningDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSigningDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSigningDateActionPerformed

    private void txtExperienceYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExperienceYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExperienceYearsActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateContract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateContract dialog = new UpdateContract(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelContract;
    private javax.swing.JButton btnDeleteContract;
    private javax.swing.JButton btnUpdateContract;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBaseSalary;
    private javax.swing.JLabel lblBaseWorkDays;
    private javax.swing.JLabel lblContractID;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblSigningDate;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblUpdateContract;
    private javax.swing.JPanel pnlContractButton;
    private javax.swing.JPanel pnlContractInfo;
    private javax.swing.JPanel pnlEmployeeInfo;
    private javax.swing.JPanel pnlSalaryTerms;
    private javax.swing.JPanel pnlUpdateContract;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtBaseWorkDays;
    private javax.swing.JTextField txtContractID;
    private javax.swing.JTextField txtDegree;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtExperienceYears;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtSigningDate;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
