/*
 * Copyright 2018 The kSAR Project. All rights reserved.
 * See the LICENSE file in the project root for more information.
 */

package net.atomique.ksar.ui;

import javax.swing.DefaultComboBoxModel;

public class LinuxDateFormat extends javax.swing.JDialog {

  /**
   * Creates new form LinuxDateFormat
   */
  public LinuxDateFormat(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    load_linuxformat();
    pack();
    setLocationRelativeTo(parent);
    toFront();
    setVisible(true);

  }

  private void load_linuxformat() {
    LinuxFormatComboModel.addElement("Automatic Detection");
    LinuxFormatComboModel.addElement("MM/DD/YY 23:59:59");
    LinuxFormatComboModel.addElement("MM/DD/YYYY 23:59:59");
    LinuxFormatComboModel.addElement("DD/MM/YY 23:59:59");
    LinuxFormatComboModel.addElement("DD/MM/YYYY 23:59:59");
    LinuxFormatComboModel.addElement("YYYY-MM-DD 23:59:59");
    LinuxFormatComboModel.addElement("MM/DD/YY 12:59:59 AM|PM");
    LinuxFormatComboModel.addElement("MM/DD/YYYY 12:59:59 AM|PM");
    LinuxFormatComboModel.addElement("DD/MM/YY 12:59:59 AM|PM");
    LinuxFormatComboModel.addElement("DD/MM/YYYY 12:59:59 AM|PM");
    LinuxFormatComboModel.addElement("YYYY-MM-DD 12:59:59 AM|PM");
  }

  /**
   * This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jComboBox1 = new javax.swing.JComboBox();
    jPanel4 = new javax.swing.JPanel();
    jCheckBox1 = new javax.swing.JCheckBox();
    jPanel2 = new javax.swing.JPanel();
    OkButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

    jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    jLabel1.setLabelFor(jComboBox1);
    jLabel1.setText("Select date format:");
    jPanel3.add(jLabel1);

    jComboBox1.setModel(LinuxFormatComboModel);
    jComboBox1.setPreferredSize(new java.awt.Dimension(300, 27));
    jPanel3.add(jComboBox1);

    jPanel1.add(jPanel3);

    jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

    jCheckBox1.setText("Always use this format");
    jPanel4.add(jCheckBox1);

    jPanel1.add(jPanel4);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    OkButton.setText("Ok");
    OkButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        OkButtonActionPerformed(evt);
      }
    });
    jPanel2.add(OkButton);

    getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void OkButtonActionPerformed(
      java.awt.event.ActionEvent evt) { //GEN-FIRST:event_OkButtonActionPerformed
    this.dispose();
    ok_to_proceed = true;
  } //GEN-LAST:event_OkButtonActionPerformed

  public boolean hasToRemenber() {
    return jCheckBox1.isSelected();
  }

  public String getDateFormat() {
    return (String) jComboBox1.getSelectedItem();
  }

  public boolean isOk() {
    return ok_to_proceed;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton OkButton;
  private javax.swing.JCheckBox jCheckBox1;
  private javax.swing.JComboBox jComboBox1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  // End of variables declaration//GEN-END:variables

  DefaultComboBoxModel LinuxFormatComboModel = new DefaultComboBoxModel();
  boolean ok_to_proceed = false;
}
