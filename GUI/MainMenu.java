package GUI;

import Objects.Member;
import Utilities.DAL;
import Utilities.MemberTableModel;
import Utilities.ReadWrite;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**File: MainMenu.java
 *Description: MainMenu is the 'Main Program' and is a jFrame which contains buttons to all the features of the application
 * which are Membership Selection/Adding a member, Search for a member, Backup DB, Restore from File, Open Help Doc.
 * @author Thomas Or 100613590
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     *Description: MainMenu Constructor, initializes the MainMenu frame's components
     */
    public MainMenu() {
        super("Main Menu");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        GeneralMembershipBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        SpecialMembershipBtn = new javax.swing.JButton();
        HelpDocBtn = new javax.swing.JButton();
        RestoreDatabaseBtn = new javax.swing.JButton();
        BackupDatabaseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/AFL.png"))); // NOI18N
        jLabel1.setText("Picture");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Membership Registration");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        GeneralMembershipBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GeneralMembershipBtn.setText("General Membership");
        GeneralMembershipBtn.setName("RegisterBtn"); // NOI18N
        GeneralMembershipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralMembershipBtnActionPerformed(evt);
            }
        });

        SearchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        SpecialMembershipBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SpecialMembershipBtn.setText("Special Membership");
        SpecialMembershipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpecialMembershipBtnActionPerformed(evt);
            }
        });

        HelpDocBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HelpDocBtn.setText("Help Document");
        HelpDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpDocBtnActionPerformed(evt);
            }
        });

        RestoreDatabaseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        RestoreDatabaseBtn.setText("Restore Database");
        RestoreDatabaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestoreDatabaseBtnActionPerformed(evt);
            }
        });

        BackupDatabaseBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BackupDatabaseBtn.setText("Backup Database");
        BackupDatabaseBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackupDatabaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupDatabaseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SpecialMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HelpDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(GeneralMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RestoreDatabaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackupDatabaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BackupDatabaseBtn, GeneralMembershipBtn, HelpDocBtn, RestoreDatabaseBtn, SearchBtn, SpecialMembershipBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GeneralMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackupDatabaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecialMembershipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HelpDocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RestoreDatabaseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BackupDatabaseBtn, GeneralMembershipBtn, HelpDocBtn, RestoreDatabaseBtn, SearchBtn, SpecialMembershipBtn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeneralMembershipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralMembershipBtnActionPerformed
        //GENERAL Member Selection Button
        new SelectGeneralMemberType().setVisible(true);
    }//GEN-LAST:event_GeneralMembershipBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        //Search Form Button
        new SearchMemberForm().setVisible(true);
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void SpecialMembershipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpecialMembershipBtnActionPerformed
        //SPECIAL Member Selection Button
        new SelectSpecialMemberType().setVisible(true);
    }//GEN-LAST:event_SpecialMembershipBtnActionPerformed

    private void HelpDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpDocBtnActionPerformed
        //HELP Document Button - Trys to open specified file.
        String document = "Help Document.pdf";
        try {
            File file = new File(document);
            Desktop.getDesktop().open(file);
        } catch (IOException ioE) {
            System.out.print(ioE.getMessage());
        }
    }//GEN-LAST:event_HelpDocBtnActionPerformed

    private void RestoreDatabaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestoreDatabaseBtnActionPerformed
        //Restore Database Button - Reads Binary File and creates new tables with File's data
        int ans = JOptionPane.showConfirmDialog(null, "DO YOU WISH TO Restore? Current data will be deleted", "Restore from File?",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (ans == JOptionPane.YES_OPTION) {
            DAL.restoreFromFile();
        }

    }//GEN-LAST:event_RestoreDatabaseBtnActionPerformed

    private void BackupDatabaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupDatabaseBtnActionPerformed
        //Backup Database Button - Saves current ArrayList to file
        
        MemberTableModel memberRecords = new MemberTableModel();
        ArrayList<Member> memberList = memberRecords.getDataFromDatabase(null, null, 1);
        try {
            ReadWrite.saveData(memberList);
        } catch (FileNotFoundException fnfex) {
            System.err.println("File NOT FOUND");
        } catch (NotSerializableException nsE) {
            System.err.println("class not serialised");
        } catch (IOException ioEx) {
            System.err.println("Issue(s) with writing object to file");
        }
    }//GEN-LAST:event_BackupDatabaseBtnActionPerformed

    /**
     * Description: Main function, the start of the application
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackupDatabaseBtn;
    private javax.swing.JButton GeneralMembershipBtn;
    private javax.swing.JButton HelpDocBtn;
    private javax.swing.JButton RestoreDatabaseBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton SpecialMembershipBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
