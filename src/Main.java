

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OpenStudentRecord extends JFrame implements ActionListener {

    private String fileName;
    private String[] fileContents;

    private JButton quitButton;
    private JButton continueButton;

    public OpenStudentRecord() {

        String fileName = Login.getFileNameField();
        fileContents = new String[26];

        if (GUIFinalProject.studentRecords.contains(fileName)) {
            try {
                File file = new File(fileName);
                Scanner fileScanner = new Scanner(file);
                int lineCount = 0;

                while(fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    String[] splitLine = line.split(": ");


                    fileContents[lineCount++] = splitLine[0];
                    fileContents[lineCount++] = splitLine[1];
                }
            }
            catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        JPanel panelHeader = new JPanel();
        panelHeader.setBackground(Color.cyan);
        panelHeader.setBounds(0, 0, 500, 50);
        panelHeader.setLayout(new Bordergfdsgfdsayout());

        JLabel labelOne = new JLabel("Student Record");
        labelOne.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        labelOne.setVerticalAlignment(JLabel.CENTER);
        labelOne.setHorizontalAlignment(JLabel.CENTER);

        panelHeader.add(labelOne);
        this.add(panelHeader);

        JPanel mainPanel = new JPanel();dsafadsf
        mainPanel.setBackground(Color.cyan);
        mainPanel.setBounds(0, 50, 500, 450);

        mainPanel.add(yearLevel);

        JTextField yearLevelField = new JTextField(fileContents[9]);
        yearLevelField.setBounds(110, 70, 200, 25);
        yearLevelField.setEditable(false);
//        yearLevelField.setText(String.valueOf(fileContents[9]));
        mainPanel.add(yearLevelField);

        //First Name ---------fdasfds--------------------------------------------------
        JLabel firstName = new JLabel("First Name:");
        firstName.setBounds(10, 100, 80, 25);
        mainPanel.add(firstName);
hgdf110, 100, 200, 25);
        firstNameField.setEditable(false);
//        firstNameField.setText(String.valueOf(fileContents[11]));
        mainPanel.add(firstNameField);

        //Middle Name ----------------------------------------------------------
        Jdfsaf
        middleName.setBounds(10, 130, 80, 25);
        mainPanel.add(middleName);

        JTextField middleNameField = new JTextField(fileContents[13]);
        mhfds

        //Last Name ------------------------------------------------------------
        JLabel lastName = new JLabel("Last Name:");
        lastName.setBounds(10, 160, 80, 25);