package GUI;

import Utilities.MemberTableModel;
import Objects.Member;
import Utilities.DAL;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**File: SearchMemberForm.java
 *Description: SearchMemberForm is where users can view member records from the database.
 * Can also select and update a member and can search for a member by 'First name', 'Last name' or 'Team'.
 * @author Thomas Or 100613590
 */
public class SearchMemberForm extends javax.swing.JFrame {

    MemberTableModel memberModel = new MemberTableModel();
    int selectedRow;

    /**
     * Description: SearchMemnberForm Constructor, Initializes the form's components
     */
    public SearchMemberForm() {
        super("Search Members Form");
        initComponents();
        memberTable.setModel(memberModel);
        //cbbTeams.setSelectedItem("Melbourne Demons");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfLast = new javax.swing.JTextField();
        txfFirst = new javax.swing.JTextField();
        MainMenuBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();
        cbbTeams = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        imgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/NorthLogo.png"))); // NOI18N
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Search For Members");

        UpdateBtn.setText("UPDATE");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("DELETE");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        MainMenuBtn.setText("Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        SearchBtn.setText("SEARCH");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        memberTable.setAutoCreateRowSorter(true);
        memberTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        memberTable.setName(""); // NOI18N
        memberTable.getTableHeader().setReorderingAllowed(false);
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(memberTable);

        cbbTeams.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North Melbourne Kangaroos", "Melbourne Demons", "Richmond Tigers", "Hawthorn Hawks", "St Kilda Saints", "Fremantle Dockers", "West Coast Eagles", "Adelaide Crows", "Port Adelaide Power", "Brisbane Lions", "GWS Giants", "Sydeny Swans", "Western Bulldogs", "Geelong Cats", "Gold Coast Suns", "Collingwood Magpies", "Calton Blues", "Essendon Bombers" }));
        cbbTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTeamsActionPerformed(evt);
            }
        });

        jLabel11.setText("Team");

        refreshBtn.setText("REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txfLast, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(imgLabel)
                        .addGap(434, 434, 434)))
                .addComponent(MainMenuBtn)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenuBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txfLast, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        //UPDATE Button
        if (memberTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No Record has been selected", "Update Member", JOptionPane.WARNING_MESSAGE);
        } else {
            Member member = memberModel.getRow(selectedRow);
            new UpdateMemberForm(memberModel, member).setVisible(true);
            memberTable.setModel(memberModel);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        //DELETE Button
        if (memberTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "No student has been selected", "Delete Member!?", JOptionPane.WARNING_MESSAGE);
        } else {
            int ans = JOptionPane.showConfirmDialog(null, "DO YOU WISH TO DELETE?", "Delete Member!?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ans == JOptionPane.YES_OPTION) {
                //get the selected member and store in a member object
                Member member = memberModel.getRow(selectedRow);
                //delete the selected member    
                DAL.deleteMember(member);
                //Refresh the memberTable
                memberModel.getDataFromDatabase(null,null,1); 
                memberModel.fireTableRowsDeleted(selectedRow, selectedRow);
                memberTable.setModel(memberModel);
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        //SEARCH Button
        if (txfFirst.getText().isEmpty() && txfLast.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter a name to search in the Text Fields");
        } else {
            //Perform SQL WHERE LIKE query to search for members
            memberModel.getDataFromDatabase(txfFirst.getText(), null,2);
            //memberModel.getDataFromDatabase(null, txfLast.getText(),2);
            //Refresh memberTable
            memberModel.fireTableDataChanged();
            memberTable.setModel(memberModel);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        // when Table row is clicked, populate Name text fields
        selectedRow = memberTable.getSelectedRow();
        txfFirst.setText(memberModel.getValueAt(selectedRow, 1).toString());
        txfLast.setText(memberModel.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_memberTableMouseClicked

    private void cbbTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTeamsActionPerformed
        //retrieve selected Team value from jCombobox
        JComboBox cb = (JComboBox) evt.getSource();
        
        //Search for members depending on selected Team
        memberModel.getDataFromDatabase(cb.getSelectedItem().toString(),null,3);
        memberModel.fireTableDataChanged();
        memberTable.setModel(memberModel);
        
        //Change Team logo to selected Team's logo
        String imageArray[] = {"NorthLogo.png", "Melbourne.png", "Tigers.png", "Hawks.png", "Saints.png", "Fremantle.png", "Eagles.png",
            "Crows.png", "Port_Adelaide.png", "Lions.png", "GWS.png", "Swans.png", "Bulldogs.png", "Cats.png", "Suns.png", "Collingwood.png",
            "Carlton.png", "Essendon.png"};
        String imgFileName = imageArray[cb.getSelectedIndex()];
        updateLabel(imgFileName);
        

    }//GEN-LAST:event_cbbTeamsActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        //Refresh memberTable will all member records
        memberModel.getDataFromDatabase(null,null,1);
        memberModel.fireTableDataChanged();
        memberTable.setModel(memberModel);
    }//GEN-LAST:event_refreshBtnActionPerformed

    /**Function: updateLabel
     *Description: Changes the jLabel with a picture by changing the jLabel's 'icon' property
     * @param name
     */
    protected void updateLabel(String name) {
        ImageIcon icon = createImageIcon("images/" + name);
        imgLabel.setIcon(icon);
        //imgLabel.setToolTipText("Logo of the " + name.toLowerCase());
        if (icon != null) {
            imgLabel.setText(null);
        } else {
            imgLabel.setText("Image not found");
        }
    }

    /**Function: createImageIcon
     *Description: Generates an IconImage object or "file path" which can be set to a jLabel 
     * @param path
     * @return ImageIcon(imgURL)
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = AddMemberFrame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SearchMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SearchMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SearchMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SearchMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SearchMemberForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JComboBox<String> cbbTeams;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable memberTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField txfFirst;
    private javax.swing.JTextField txfLast;
    // End of variables declaration//GEN-END:variables
}
