package GUI;

import Objects.GeneralMember;
import Objects.SpecialMember;
import Utilities.DAL;
import Utilities.Validation;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 * File: AddMemberFrame.java
 * Description: Add Member Frame is the window where members fill in member details and add new member to the database
 * @author Thomas Or 100613590
 */
public class AddMemberFrame extends javax.swing.JFrame {

    private double membershipCost;
    private String GMType = null;
    private String SMType = null;
    GeneralMember newGeneralMember = new GeneralMember();
    SpecialMember newSpecialMember = new SpecialMember();

    /**
     *Description: AddMemberFrame Constructor, initializes all JFrame components and uses abstract function "calcCost()" 
     * to show cost of selected membership. Membership selection is passed from Membership Selection Forms. 
     * @param sel
     */
    public AddMemberFrame(String sel) {
        super("General Membership Form");
        initComponents();
        membership.setText(sel);
        //radMale.setSelected(true);

        switch (sel) {
            //General Members ---------------------------------------------
            case "Home Games Package":
                membershipCost = newGeneralMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                GMType = sel;
                break;

            case "Home & Away Package":
                membershipCost = newGeneralMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                GMType = sel;
                break;

            case "AusKick":
                membershipCost = newGeneralMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                GMType = sel;
                break;

            //Special Members ---------------------------------------------
            case "Reserved Seating":
                membershipCost = newSpecialMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                SMType = sel;
                break;

            case "Premium Membership":
                membershipCost = newSpecialMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                SMType = sel;
                break;

            case "Supporter Membership":
                membershipCost = newSpecialMember.calcCost(sel);
                cost.setText("$" + Double.toString(membershipCost));
                SMType = sel;
                break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderBtnGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        SaveDetailsBtn = new javax.swing.JButton();
        ClearDetailsBtn = new javax.swing.JButton();
        MainMenuBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        radFemale = new javax.swing.JRadioButton();
        radMale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PictureLabel = new javax.swing.JLabel();
        cbbTeams = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cost = new javax.swing.JLabel();
        membership = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");
        jPanel1.setName("General Membership Form"); // NOI18N

        SaveDetailsBtn.setText("Save Details");
        SaveDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveDetailsBtnActionPerformed(evt);
            }
        });

        ClearDetailsBtn.setText("Clear Details");
        ClearDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearDetailsBtnActionPerformed(evt);
            }
        });

        MainMenuBtn.setText("Main Menu");
        MainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Member Registration");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Age");

        jLabel5.setText("Contact Number");

        txtEmail.setName(""); // NOI18N

        jLabel7.setText("Email");

        GenderBtnGroup.add(radFemale);
        radFemale.setText("Female");
        radFemale.setName("FEMALE"); // NOI18N

        GenderBtnGroup.add(radMale);
        radMale.setText("Male");
        radMale.setName("MALE"); // NOI18N

        jLabel6.setText("Gender");

        jLabel8.setText("Address");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radFemale))
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail)
                    .addComponent(txtContactNumber)
                    .addComponent(txtAge)
                    .addComponent(txtLastName)
                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radMale)
                    .addComponent(radFemale)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PictureLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/NorthLogo.png"))); // NOI18N
        PictureLabel.setText("Picture");
        PictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbbTeams.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North Melbourne Kangaroos", "Melbourne Demons", "Richmond Tigers", "Hawthorn Hawks", "St Kilda Saints", "Fremantle Dockers", "West Coast Eagles", "Adelaide Crows", "Port Adelaide Power", "Brisbane Lions", "GWS Giants", "Sydeny Swans", "Western Bulldogs", "Geelong Cats", "Gold Coast Suns", "Collingwood Magpies", "Calton Blues", "Essendon Bombers" }));
        cbbTeams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTeamsActionPerformed(evt);
            }
        });

        jLabel11.setText("Team");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PictureLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbTeams, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Membership:");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cost:");

        cost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        membership.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MainMenuBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(membership, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addComponent(SaveDetailsBtn)
                                .addGap(33, 33, 33)
                                .addComponent(ClearDetailsBtn)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainMenuBtn)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClearDetailsBtn)
                            .addComponent(SaveDetailsBtn))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(membership, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cost, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("General Membership Form");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveDetailsBtnActionPerformed
        //set string values to Gender radio buttons
        this.radMale.setActionCommand("MALE");
        this.radFemale.setActionCommand("FEMALE");

        if (Validation.validateName(txtFirstName.getText()) && Validation.validateName(txtLastName.getText())
                && Validation.validateAge(txtAge.getText()) && Validation.validateContactNumber(txtContactNumber.getText())
                && Validation.validateEmail(txtEmail.getText()) && Validation.validateAddress(txtAddress.getText())
                && Validation.validateGender(radMale.isSelected(), radFemale.isSelected())) {
            //CREATE TABLES
            DAL.createTables();

            //ADD NEW MEMBER TO DB
            DAL.insertMember(txtFirstName.getText(), txtLastName.getText(), txtAge.getText(),
                    txtContactNumber.getText(), txtEmail.getText(),
                    GenderBtnGroup.getSelection().getActionCommand(), txtAddress.getText(),
                    cbbTeams.getSelectedItem().toString(),
                    GMType,
                    SMType,
                    Double.toString(membershipCost));

            JOptionPane.showMessageDialog(null, "Member added to database");
        }
    }//GEN-LAST:event_SaveDetailsBtnActionPerformed

    private void MainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuBtnActionPerformed
        //Main Menu Button
        this.dispose();
    }//GEN-LAST:event_MainMenuBtnActionPerformed

    private void cbbTeamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTeamsActionPerformed
        //retrieve selected Team value from jCombobox
        JComboBox cb = (JComboBox) evt.getSource();
        String imageArray[] = {"NorthLogo.png", "Melbourne.png", "Tigers.png", "Hawks.png", "Saints.png", "Fremantle.png", "Eagles.png",
            "Crows.png", "Port_Adelaide.png", "Lions.png", "GWS.png", "Swans.png", "Bulldogs.png", "Cats.png", "Suns.png", "Collingwood.png",
            "Carlton.png", "Essendon.png"};
        //retrieve imgFileName depeneding on selected Team
        String imgFileName = imageArray[cb.getSelectedIndex()];
        //Change image on form to selected Team
        updateLabel(imgFileName);
    }//GEN-LAST:event_cbbTeamsActionPerformed

    private void ClearDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearDetailsBtnActionPerformed
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        GenderBtnGroup.clearSelection();
    }//GEN-LAST:event_ClearDetailsBtnActionPerformed

    /**Function: updateLabel
     *Description: Changes the jLabel with a picture by changing the jLabel's 'icon' property
     * @param name
     */
    protected void updateLabel(String name) {
        ImageIcon icon = createImageIcon("images/" + name);
        PictureLabel.setIcon(icon);
        //PictureLabel.setToolTipText("Logo of the " + name.toLowerCase());
        if (icon != null) {
            PictureLabel.setText(null);
        } else {
            PictureLabel.setText("Image not found");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearDetailsBtn;
    private javax.swing.ButtonGroup GenderBtnGroup;
    private javax.swing.JButton MainMenuBtn;
    private javax.swing.JLabel PictureLabel;
    private javax.swing.JButton SaveDetailsBtn;
    private javax.swing.JComboBox<String> cbbTeams;
    private javax.swing.JLabel cost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel membership;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}