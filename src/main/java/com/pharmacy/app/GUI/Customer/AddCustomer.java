/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.pharmacy.app.GUI.Customer;

/**
 *
 * @author BOI QUAN
 */
public class AddCustomer extends javax.swing.JDialog {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer(java.awt.Frame parent, boolean modal) {
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

        plTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        plInformation = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        plLbl = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        plTxt = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        plButton = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        plTitle.setBackground(new java.awt.Color(255, 255, 255));
        plTitle.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plTitle.setMinimumSize(new java.awt.Dimension(400, 50));
        plTitle.setPreferredSize(new java.awt.Dimension(450, 50));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Thông tin khách hàng");
        lblTitle.setMaximumSize(new java.awt.Dimension(326589, 326589));
        lblTitle.setMinimumSize(new java.awt.Dimension(400, 50));
        lblTitle.setPreferredSize(new java.awt.Dimension(450, 50));
        plTitle.add(lblTitle);

        plInformation.setBackground(new java.awt.Color(255, 255, 255));
        plInformation.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plInformation.setMinimumSize(new java.awt.Dimension(400, 220));
        plInformation.setPreferredSize(new java.awt.Dimension(450, 220));
        plInformation.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setMaximumSize(new java.awt.Dimension(350, 5));
        jSeparator1.setMinimumSize(new java.awt.Dimension(350, 5));
        jSeparator1.setPreferredSize(new java.awt.Dimension(350, 5));
        plInformation.add(jSeparator1);

        plLbl.setBackground(new java.awt.Color(255, 255, 255));
        plLbl.setMaximumSize(new java.awt.Dimension(100, 100));
        plLbl.setMinimumSize(new java.awt.Dimension(100, 100));
        plLbl.setPreferredSize(new java.awt.Dimension(100, 100));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout2.setAlignOnBaseline(true);
        plLbl.setLayout(flowLayout2);

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Họ và Tên");
        lblName.setMaximumSize(new java.awt.Dimension(326589, 326589));
        lblName.setMinimumSize(new java.awt.Dimension(80, 30));
        lblName.setPreferredSize(new java.awt.Dimension(100, 30));
        plLbl.add(lblName);

        lblPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPhone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhone.setText("Số điện thoại");
        lblPhone.setMaximumSize(new java.awt.Dimension(326589, 326589));
        lblPhone.setMinimumSize(new java.awt.Dimension(80, 30));
        lblPhone.setPreferredSize(new java.awt.Dimension(100, 30));
        plLbl.add(lblPhone);

        plInformation.add(plLbl);

        plTxt.setBackground(new java.awt.Color(255, 255, 255));
        plTxt.setMaximumSize(new java.awt.Dimension(250, 100));
        plTxt.setMinimumSize(new java.awt.Dimension(250, 100));
        plTxt.setPreferredSize(new java.awt.Dimension(250, 100));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10);
        flowLayout1.setAlignOnBaseline(true);
        plTxt.setLayout(flowLayout1);

        txtName.setMaximumSize(new java.awt.Dimension(220, 30));
        txtName.setMinimumSize(new java.awt.Dimension(220, 30));
        txtName.setPreferredSize(new java.awt.Dimension(220, 30));
        plTxt.add(txtName);

        txtPhone.setMaximumSize(new java.awt.Dimension(220, 30));
        txtPhone.setMinimumSize(new java.awt.Dimension(220, 30));
        txtPhone.setPreferredSize(new java.awt.Dimension(220, 30));
        plTxt.add(txtPhone);

        plInformation.add(plTxt);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setMaximumSize(new java.awt.Dimension(350, 5));
        jSeparator2.setMinimumSize(new java.awt.Dimension(350, 5));
        jSeparator2.setPreferredSize(new java.awt.Dimension(350, 5));
        plInformation.add(jSeparator2);

        plButton.setBackground(new java.awt.Color(255, 255, 255));
        plButton.setMaximumSize(new java.awt.Dimension(326589, 326589));
        plButton.setMinimumSize(new java.awt.Dimension(400, 50));
        plButton.setPreferredSize(new java.awt.Dimension(450, 50));
        plButton.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 10));

        btnSave.setBackground(new java.awt.Color(0, 204, 51));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu");
        btnSave.setMaximumSize(new java.awt.Dimension(70, 30));
        btnSave.setMinimumSize(new java.awt.Dimension(70, 30));
        btnSave.setPreferredSize(new java.awt.Dimension(70, 30));
        plButton.add(btnSave);

        btnExit.setBackground(new java.awt.Color(153, 153, 153));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Thoát");
        btnExit.setMaximumSize(new java.awt.Dimension(70, 30));
        btnExit.setMinimumSize(new java.awt.Dimension(70, 30));
        btnExit.setPreferredSize(new java.awt.Dimension(70, 30));
        plButton.add(btnExit);

        plInformation.add(plButton);

        plTitle.add(plInformation);

        getContentPane().add(plTitle);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCustomer dialog = new AddCustomer(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel plButton;
    private javax.swing.JPanel plInformation;
    private javax.swing.JPanel plLbl;
    private javax.swing.JPanel plTitle;
    private javax.swing.JPanel plTxt;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
