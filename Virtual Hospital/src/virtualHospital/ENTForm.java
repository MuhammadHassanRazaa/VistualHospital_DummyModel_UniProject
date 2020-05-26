/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualHospital;

import javax.swing.JOptionPane;

/**
 *
 * @author sshth
 */
public class ENTForm extends javax.swing.JFrame {
public String ID[][]=null;
    public String[] EyeDiseases = {"Deafness", "Otitis media", "Otitis Externa", "Otitis Interna", "Sinusitis", "Rhinitis", "DNS", "Tonsillitis"};

    /**
     * Creates new form EyeForm
     */
    public ENTForm() {
        initComponents();
    }
    public ENTForm(String Id[][]){
        ID=Id;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Iritation = new javax.swing.JCheckBox();
        Etching = new javax.swing.JCheckBox();
        Watering = new javax.swing.JCheckBox();
        Burning = new javax.swing.JCheckBox();
        Redness = new javax.swing.JCheckBox();
        ScaringEyeLids = new javax.swing.JCheckBox();
        SwalingsMargins = new javax.swing.JCheckBox();
        photophibia = new javax.swing.JCheckBox();
        Dimness = new javax.swing.JCheckBox();
        Nausea = new javax.swing.JCheckBox();
        Hemorrhage = new javax.swing.JCheckBox();
        COngestion = new javax.swing.JCheckBox();
        Odema = new javax.swing.JCheckBox();
        SeverePain = new javax.swing.JCheckBox();
        GradualLossSugar = new javax.swing.JCheckBox();
        BackButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/maintitle.png"))); // NOI18N
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Please Select Your Symptoms");
        jLabel2.setToolTipText("");

        Iritation.setText("Deafness");

        Etching.setText("Loss of Hearing");

        Watering.setText("Painful Ears");

        Burning.setText("Nasal Discharge");

        Redness.setText("Discharge from Ears");
        Redness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RednessActionPerformed(evt);
            }
        });

        ScaringEyeLids.setText("Inflamation of External Ear");

        SwalingsMargins.setText("Inflamation of Internal Ear");

        photophibia.setText("Mild Coughing");

        Dimness.setText("Etching");

        Nausea.setText("Irritation");

        Hemorrhage.setText("Flue");

        COngestion.setText("Fever");

        Odema.setText("Runynose");

        SeverePain.setText("Nasal Congestion");

        GradualLossSugar.setText("Throat Pain");

        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/BackBUtton.png"))); // NOI18N
        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/virtualHospital/Images/nextButton.png"))); // NOI18N
        NextButton.setText("Next");
        NextButton.setName(""); // NOI18N
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Iritation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Hemorrhage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(photophibia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Redness, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 22, Short.MAX_VALUE))
                                    .addComponent(GradualLossSugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(COngestion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Etching, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Burning, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Dimness, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ScaringEyeLids, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SeverePain, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(SwalingsMargins)
                                            .addComponent(Watering, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Odema, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nausea, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Iritation)
                    .addComponent(Etching)
                    .addComponent(Watering))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Redness)
                    .addComponent(ScaringEyeLids)
                    .addComponent(SwalingsMargins))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Hemorrhage)
                    .addComponent(COngestion)
                    .addComponent(Odema))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(photophibia)
                    .addComponent(Dimness)
                    .addComponent(Nausea))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GradualLossSugar)
                    .addComponent(Burning)
                    .addComponent(SeverePain))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new DepartmentsList(ID).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed

        if (isvalidated()) {

            int n = GuessDisease();
            new ENTResults(n, EyeDiseases,ID).setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_NextButtonActionPerformed

    public int GuessDisease() {
        int n = 0;
        if (Iritation.isSelected()) {
            if (Etching.isSelected()) {
                n = 0;
                if (Hemorrhage.isSelected()) {
                    if (COngestion.isSelected()) {
                        if (SeverePain.isSelected()) {
                            if (photophibia.isSelected()) {
                                n = 5;
                            }
                        }
                    }
                }
            }
        } else if (Watering.isSelected()) {
            if (Redness.isSelected()) {
                n = 1;
            }
        } else if (ScaringEyeLids.isSelected()) {
            n = 2;
        } else if (SwalingsMargins.isSelected()) {
            n = 3;
        } else if (Hemorrhage.isSelected() && COngestion.isSelected() && Odema.isSelected()) {
            n = 4;
        } else if (Hemorrhage.isSelected() && photophibia.isSelected() && Burning.isSelected()) {
            n = 6;
            if (GradualLossSugar.isSelected()) {
                n = 7;
            }
        } else {
            n = 0;
        }

        return n;
    }

    private void RednessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RednessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RednessActionPerformed

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
            java.util.logging.Logger.getLogger(ENTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ENTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ENTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ENTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ENTForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JCheckBox Burning;
    private javax.swing.JCheckBox COngestion;
    private javax.swing.JCheckBox Dimness;
    private javax.swing.JCheckBox Etching;
    private javax.swing.JCheckBox GradualLossSugar;
    private javax.swing.JCheckBox Hemorrhage;
    private javax.swing.JCheckBox Iritation;
    private javax.swing.JCheckBox Nausea;
    private javax.swing.JButton NextButton;
    private javax.swing.JCheckBox Odema;
    private javax.swing.JCheckBox Redness;
    private javax.swing.JCheckBox ScaringEyeLids;
    private javax.swing.JCheckBox SeverePain;
    private javax.swing.JCheckBox SwalingsMargins;
    private javax.swing.JCheckBox Watering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JCheckBox photophibia;
    // End of variables declaration//GEN-END:variables

    private boolean isvalidated() {
        if (!((Iritation.isSelected()) || (Etching.isSelected()) || (Watering.isSelected()) || (Redness.isSelected()) || (ScaringEyeLids.isSelected()) || (SwalingsMargins.isSelected()) || (Hemorrhage.isSelected()) || (COngestion.isSelected()) || (Odema.isSelected()) || (photophibia.isSelected()) || (Dimness.isSelected()) || (Nausea.isSelected()) || (GradualLossSugar.isSelected()) || (Burning.isSelected()) || (SeverePain.isSelected()))) {
            JOptionPane.showMessageDialog(null, "One of the symptom must be selected", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}