/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualHospital;

import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sshth
 */
public class VirtualHospitalSecondForm extends JFrame {
    public  boolean isBackPressed;

   public String a;public String b;
  public      String[][] Dataa=new String[2][10]; 
  
    /**
     * Creates new form VirtualHospitalMainForm
     */
    public VirtualHospitalSecondForm() {
        initComponents();

    }

   public VirtualHospitalSecondForm(String[][]data) {
       Dataa=data;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        EmailText = new javax.swing.JTextField();
        FirstNameLabel2 = new javax.swing.JLabel();
        LastNameLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LastNameLabel4 = new javax.swing.JLabel();
        EmailComboBox = new javax.swing.JComboBox<>();
        Address1Text = new javax.swing.JTextField();
        Address2Text = new javax.swing.JTextField();
        LastNameLabel5 = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        NextButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        LastNameLabel8 = new javax.swing.JLabel();
        FEmailComboBox = new javax.swing.JComboBox<>();
        FAddress2Text = new javax.swing.JTextField();
        FAddress1Text = new javax.swing.JTextField();
        LastNameLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LastNameLabel6 = new javax.swing.JLabel();
        FEmailText = new javax.swing.JTextField();
        FirstNameLabel4 = new javax.swing.JLabel();
        SameCheckBox = new javax.swing.JCheckBox();
        FPhoneText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIRTUAL HOSPITAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/maintitle.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Contact Information");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        EmailText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EmailText.setNextFocusableComponent(EmailComboBox);

        FirstNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FirstNameLabel2.setText("Contact");

        LastNameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel2.setText("Email");

        jLabel3.setText("+92");

        LastNameLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel4.setText("Address Line 1");

        EmailComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EmailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@live.com", "@yahoo.com", "@protonmail.com" }));
        EmailComboBox.setSelectedItem("<Select Domain>");
        EmailComboBox.setName("EmailComboBox"); // NOI18N
        EmailComboBox.setNextFocusableComponent(Address1Text);

        Address1Text.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Address1Text.setNextFocusableComponent(Address2Text);
        Address1Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Address1TextKeyPressed(evt);
            }
        });

        Address2Text.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Address2Text.setNextFocusableComponent(FPhoneText);
        Address2Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Address2TextKeyPressed(evt);
            }
        });

        LastNameLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel5.setText("Address Line 2");

        PhoneText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        PhoneText.setNextFocusableComponent(EmailText);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(LastNameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LastNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(LastNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Address1Text)
                    .addComponent(Address2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PhoneText))
                            .addComponent(EmailText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NextButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/nextButton.png"))); // NOI18N
        NextButton.setText("Next");
        NextButton.setName(""); // NOI18N
        NextButton.setNextFocusableComponent(BackButton);
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/BackBUtton.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Father / Gaurdian Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N

        LastNameLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel8.setText("Email");

        FEmailComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FEmailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@hotmail.com", "@outlook.com", "@live.com", "@yahoo.com", "@protonmail.com" }));
        FEmailComboBox.setSelectedItem("<Select Domain>");
        FEmailComboBox.setName("EmailComboBox"); // NOI18N
        FEmailComboBox.setNextFocusableComponent(SameCheckBox);

        FAddress2Text.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FAddress2Text.setNextFocusableComponent(NextButton);
        FAddress2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddress2TextActionPerformed(evt);
            }
        });

        FAddress1Text.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FAddress1Text.setNextFocusableComponent(FAddress2Text);
        FAddress1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAddress1TextActionPerformed(evt);
            }
        });

        LastNameLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel9.setText("Address Line 1");

        jLabel4.setText("+92");

        LastNameLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        LastNameLabel6.setText("Address Line 2");

        FEmailText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FEmailText.setNextFocusableComponent(EmailComboBox);

        FirstNameLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FirstNameLabel4.setText("Contact");

        SameCheckBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SameCheckBox.setText("Same as above"); // NOI18N
        SameCheckBox.setNextFocusableComponent(FAddress1Text);
        SameCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SameCheckBoxStateChanged(evt);
            }
        });

        FPhoneText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FPhoneText.setNextFocusableComponent(FEmailText);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LastNameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastNameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FAddress1Text)
                            .addComponent(FAddress2Text)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstNameLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(LastNameLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FPhoneText))
                            .addComponent(FEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FEmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(SameCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(FPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LastNameLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FEmailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FAddress1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SameCheckBox))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNameLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAddress2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
      isBackPressed=true;
       
            new VirtualHospitalMainForm(Dataa).setVisible(true);
            this.dispose();
            
            
      
         
     
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        if (isValidated()) {
          a=(String) EmailComboBox.getSelectedItem();
          b=(String) FEmailComboBox.getSelectedItem();
                Dataa[0][6]="92"+PhoneText.getText().trim().replace("-", "");
                 Dataa[0][7]=EmailText.getText().trim()+EmailComboBox.getSelectedItem();
                 Dataa[0][8]=Address1Text.getText().trim();
             Dataa[0][9]=Address2Text.getText().trim();
                Dataa[1][4]="92"+FPhoneText.getText().trim().replace("-", "");
              Dataa[1][5]=FEmailText.getText().trim()+FEmailComboBox.getSelectedItem();
                Dataa[1][6]=FAddress1Text.getText().trim();
                Dataa[1][7]=FAddress2Text.getText().trim();
               
            
            
          new VirtualHospitalDetailCheckForm(Dataa,a,b).setVisible(true); 
          this.dispose();
        
        }

    }//GEN-LAST:event_NextButtonActionPerformed

    private void SameCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SameCheckBoxStateChanged
        if (SameCheckBox.isSelected()) {
            FAddress1Text.setEditable(false);
            FAddress2Text.setEditable(false);
            FAddress2Text.setText(Address2Text.getText().trim());
            FAddress1Text.setText(Address1Text.getText().trim());
        } else if (!SameCheckBox.isSelected()) {
            FAddress1Text.setEditable(true);
            FAddress2Text.setEditable(true);
            if (FAddress2Text.getText().trim().equals(Address2Text.getText().trim())) {
                FAddress2Text.setText("");
                FAddress1Text.setText("");
                FAddress1Text.requestFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_SameCheckBoxStateChanged

    private void FAddress1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAddress1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAddress1TextActionPerformed

    private void FAddress2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAddress2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAddress2TextActionPerformed

    private void Address2TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Address2TextKeyPressed
        if (SameCheckBox.isSelected()) {
            FAddress2Text.setText(Address2Text.getText().trim());
        }// TODO add your handling code here:
    }//GEN-LAST:event_Address2TextKeyPressed

    private void Address1TextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Address1TextKeyPressed
        if (SameCheckBox.isSelected()) {
            FAddress1Text.setText(Address1Text.getText().trim());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Address1TextKeyPressed

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
            java.util.logging.Logger.getLogger(VirtualHospitalSecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VirtualHospitalSecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VirtualHospitalSecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VirtualHospitalSecondForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VirtualHospitalSecondForm().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address1Text;
    private javax.swing.JTextField Address2Text;
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> EmailComboBox;
    private javax.swing.JTextField EmailText;
    private javax.swing.JTextField FAddress1Text;
    private javax.swing.JTextField FAddress2Text;
    private javax.swing.JComboBox<String> FEmailComboBox;
    private javax.swing.JTextField FEmailText;
    private javax.swing.JTextField FPhoneText;
    private javax.swing.JLabel FirstNameLabel2;
    private javax.swing.JLabel FirstNameLabel4;
    private javax.swing.JLabel LastNameLabel2;
    private javax.swing.JLabel LastNameLabel4;
    private javax.swing.JLabel LastNameLabel5;
    private javax.swing.JLabel LastNameLabel6;
    private javax.swing.JLabel LastNameLabel8;
    private javax.swing.JLabel LastNameLabel9;
    private javax.swing.JButton NextButton;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JCheckBox SameCheckBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
 public boolean isStringonlyInteger(String text) {
        boolean isStringInteger = true;
        try {
            long age = Long.parseLong(text);
            isStringInteger = true;
        } catch (NumberFormatException ex) {
            isStringInteger = false;
        }
        return isStringInteger;
    }
    private boolean isValidated() {
        if (PhoneText.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Patient Phone Number is required", "Error", JOptionPane.ERROR_MESSAGE);
            PhoneText.setText("");
            PhoneText.requestFocus();
            return false;
        }
        if (!isStringonlyInteger(PhoneText.getText().trim())) {
            
            JOptionPane.showMessageDialog(null, "Patient Contact # should be Integer ", "Error", JOptionPane.ERROR_MESSAGE);
            PhoneText.setText("");
            PhoneText.requestFocus();
            return false;

        }
         if (PhoneText.getText().trim().length() !=10 ) {
            JOptionPane.showMessageDialog(null, "Patient Phone should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            PhoneText.setText("");
            PhoneText.requestFocus();
            return false;

        }
        if (EmailText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Patient Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            EmailText.requestFocus();
            return false;

        }

        if (EmailText.getText().trim().contains("@") ) {
            JOptionPane.showMessageDialog(null, "Email should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            EmailText.setText("");
            EmailText.requestFocus();
            return false;

        }
         if (EmailText.getText().trim().contains(".") ) {
            JOptionPane.showMessageDialog(null, "Email should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            EmailText.setText("");
            EmailText.requestFocus();
            return false;

        }
        if(EmailComboBox.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Domain is required", "Error", JOptionPane.ERROR_MESSAGE);
            EmailComboBox.requestFocus();
            return false;
        }
        if (Address1Text.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Address Line 1 is required", "Error", JOptionPane.ERROR_MESSAGE);
            Address1Text.requestFocus();
            return false;

        }
        if (Address1Text.getText().trim().contains(",")) {
            JOptionPane.showMessageDialog(null, "Address Line 1 Should be valid. Comma not Allowed here", "Error", JOptionPane.ERROR_MESSAGE);
            Address1Text.requestFocus();
            return false;

        }
        if (Address2Text.getText().trim().contains(",")) {
            JOptionPane.showMessageDialog(null, "Address Line 2 Should be valid. Comma not Allowed here", "Error", JOptionPane.ERROR_MESSAGE);
            Address2Text.requestFocus();
            return false;

        }
        if (FPhoneText.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Father/Gaurdian Phone Number is required", "Error", JOptionPane.ERROR_MESSAGE);
            FPhoneText.setText("");
            FPhoneText.requestFocus();
            return false;
        }
        if (!isStringonlyInteger(FPhoneText.getText().trim())) {
            JOptionPane.showMessageDialog(null, "Father/ Gaurdian Contact # should be Integer ", "Error", JOptionPane.ERROR_MESSAGE);
            FPhoneText.setText("");
            FPhoneText.requestFocus();
            return false;

        }
         if (FPhoneText.getText().trim().length() < 0 || FPhoneText.getText().trim().length() > 10) {
            JOptionPane.showMessageDialog(null, "Father/ Gaurdian Phone should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            FPhoneText.setText("");
            FPhoneText.requestFocus();
            return false;

        }
        if (FEmailText.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Father/Gaurdian Email is required", "Error", JOptionPane.ERROR_MESSAGE);
            EmailText.requestFocus();
            return false;

        }

               if (FEmailText.getText().trim().contains("@")) {

            JOptionPane.showMessageDialog(null, "Father/ Gaurdian Email should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            FEmailText.setText("");
            FEmailText.requestFocus();
            return false;

        }
               if (EmailText.getText().trim().contains(".") ) {
            JOptionPane.showMessageDialog(null, "Email should be valid", "Error", JOptionPane.ERROR_MESSAGE);
            EmailText.setText("");
            EmailText.requestFocus();
            return false;

        }
        if(FEmailComboBox.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Father/Gaurdina Email's Domain is required", "Error", JOptionPane.ERROR_MESSAGE);
            FEmailComboBox.requestFocus();
            return false;
        }
        if (FAddress1Text.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Father/Gaurdian Address Line 1 is required", "Error", JOptionPane.ERROR_MESSAGE);
            FAddress1Text.requestFocus();
            return false;

        }
if (FAddress1Text.getText().trim().contains(",")) {
            JOptionPane.showMessageDialog(null, "Father/Gaurdian Address Line 1 Should be valid. Comma not Allowed here", "Error", JOptionPane.ERROR_MESSAGE);
            FAddress1Text.requestFocus();
            return false;

        }
        if (FAddress2Text.getText().trim().contains(",")) {
            JOptionPane.showMessageDialog(null, "Father/Gaurdian Address Line 2 Should be valid. Comma not Allowed here", "Error", JOptionPane.ERROR_MESSAGE);
            FAddress2Text.requestFocus();
            return false;

        }
        return true;
    }

   
}
