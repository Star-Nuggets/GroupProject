

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
                    fileContent
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
