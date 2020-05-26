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
public class CardiologyForm extends javax.swing.JFrame {

 public String[][]Dataa;
    public String[] HeartDiseases = {"Hypertension", "Carditis", "Mayocarial Infaraction", "Venricular Septal Defect"};

    /**
     * Creates new form EyeForm
     */
    public CardiologyForm() {
        initComponents();
    }public CardiologyForm(String[][]data){
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ChestPain = new javax.swing.JCheckBox();
        PressureInChest = new javax.swing.JCheckBox();
        ShortnessOfBreath = new javax.swing.JCheckBox();
        FailuretoThrive = new javax.swing.JCheckBox();
        ExerciseHeartbeat = new javax.swing.JCheckBox();
        AbnormalHeatbeat = new javax.swing.JCheckBox();
        LightHeadedness = new javax.swing.JCheckBox();
        Nausea = new javax.swing.JCheckBox();
        Vomiting = new javax.swing.JCheckBox();
        PoorEating = new javax.swing.JCheckBox();
        Fatigue = new javax.swing.JCheckBox();
        JawPain = new javax.swing.JCheckBox();
        UpperBackPain = new javax.swing.JCheckBox();
        EasyTiring = new javax.swing.JCheckBox();
        Breathlessness = new javax.swing.JCheckBox();
        FastBreathing = new javax.swing.JCheckBox();
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

        ChestPain.setText("Chest Pain");

        PressureInChest.setText("Pressure in the Chest");

        ShortnessOfBreath.setText("Shortness of Breath");
        ShortnessOfBreath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShortnessOfBreathActionPerformed(evt);
            }
        });

        FailuretoThrive.setText("Failure to thrive");

        ExerciseHeartbeat.setText("During Exercise Shortness of Breath");
        ExerciseHeartbeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExerciseHeartbeatActionPerformed(evt);
            }
        });

        AbnormalHeatbeat.setText("Abnormal Heartbeat");

        LightHeadedness.setText("Light Headedness");

        Nausea.setText("Nausea");

        Vomiting.setText("Vomiting");

        PoorEating.setText("Poor Eating");

        Fatigue.setText("Fatigue");

        JawPain.setText("Jaw Pain");

        UpperBackPain.setText("Upper Back Pain");

        EasyTiring.setText("Easy Tiring");

        Breathlessness.setText("Breathlessness");

        FastBreathing.setText("Fast Breathing");

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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409)
                        .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Breathlessness, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ChestPain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Fatigue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nausea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FastBreathing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(ExerciseHeartbeat, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JawPain, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PressureInChest, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AbnormalHeatbeat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FailuretoThrive, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vomiting, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EasyTiring, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LightHeadedness)
                            .addComponent(ShortnessOfBreath, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpperBackPain, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PoorEating, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ChestPain)
                    .addComponent(PressureInChest)
                    .addComponent(ShortnessOfBreath))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExerciseHeartbeat)
                    .addComponent(AbnormalHeatbeat)
                    .addComponent(LightHeadedness))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Fatigue)
                    .addComponent(JawPain)
                    .addComponent(UpperBackPain))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Nausea)
                    .addComponent(Vomiting)
                    .addComponent(PoorEating))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FastBreathing)
                    .addComponent(FailuretoThrive)
                    .addComponent(EasyTiring))
                .addGap(18, 18, 18)
                .addComponent(Breathlessness)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        new DepartmentsList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
     
        if (isvalidated()) {

          int  n= GuessDisease();
          new CardiologyResults(n,HeartDiseases,Dataa ).setVisible(true);
          this.dispose();
        }
            
    }//GEN-LAST:event_NextButtonActionPerformed

    public int GuessDisease() {
        int n = 0;
        if (ChestPain.isSelected() && PressureInChest.isSelected() && ShortnessOfBreath.isSelected()) {
            
                            n = 0;
                      
            
        } else if (ExerciseHeartbeat.isSelected() && AbnormalHeatbeat.isSelected()&& LightHeadedness.isSelected()&& Fatigue.isSelected() && AbnormalHeatbeat.isSelected()) {
            n = 1;
        } else if (Vomiting.isSelected() && UpperBackPain.isSelected() && Nausea.isSelected() && LightHeadedness.isSelected()&&ShortnessOfBreath.isSelected() ) {
            n = 2;
        } else if (PoorEating.isSelected()&& FailuretoThrive.isSelected()&& FastBreathing.isSelected()&&Breathlessness.isSelected()&& EasyTiring.isSelected() ) {
            n = 3;
        }
        
        
        else n=0;
    return n;
    }

    private void ExerciseHeartbeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExerciseHeartbeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExerciseHeartbeatActionPerformed

    private void ShortnessOfBreathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShortnessOfBreathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShortnessOfBreathActionPerformed

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
            java.util.logging.Logger.getLogger(CardiologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardiologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardiologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardiologyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardiologyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AbnormalHeatbeat;
    private javax.swing.JButton BackButton;
    private javax.swing.JCheckBox Breathlessness;
    private javax.swing.JCheckBox ChestPain;
    private javax.swing.JCheckBox EasyTiring;
    private javax.swing.JCheckBox ExerciseHeartbeat;
    private javax.swing.JCheckBox FailuretoThrive;
    private javax.swing.JCheckBox FastBreathing;
    private javax.swing.JCheckBox Fatigue;
    private javax.swing.JCheckBox JawPain;
    private javax.swing.JCheckBox LightHeadedness;
    private javax.swing.JCheckBox Nausea;
    private javax.swing.JButton NextButton;
    private javax.swing.JCheckBox PoorEating;
    private javax.swing.JCheckBox PressureInChest;
    private javax.swing.JCheckBox ShortnessOfBreath;
    private javax.swing.JCheckBox UpperBackPain;
    private javax.swing.JCheckBox Vomiting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private boolean isvalidated() {
        if (!((ChestPain.isSelected()) || (PressureInChest.isSelected()) || (ShortnessOfBreath.isSelected()) || (ExerciseHeartbeat.isSelected()) || (AbnormalHeatbeat.isSelected()) || (LightHeadedness.isSelected()) || (Fatigue.isSelected()) || (JawPain.isSelected()) || (UpperBackPain.isSelected()) || (Nausea.isSelected()) || (Vomiting.isSelected()) || (PoorEating.isSelected()) || (FastBreathing.isSelected()) || (FailuretoThrive.isSelected()) || (EasyTiring.isSelected()) || (Breathlessness.isSelected()))) {
            JOptionPane.showMessageDialog(null, "One of the symptom must be selected", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
