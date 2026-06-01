package fst_gui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FormPanel extends JPanel {

    private JTextField name;
    private JTextField email;

    private JComboBox<String> programmingLang;
    private JList<String> yearsExperience;

    private JRadioButton fullTime;
    private JRadioButton partTime;
    private ButtonGroup radioBtnGroup;

    private JCheckBox allDays;
    private JCheckBox allPlusWeekend;
    private JCheckBox allPlusNightShift;

    private JScrollPane listScroll;
    private JButton submit;
    private FormPanelListener formPanelListener;

    public FormPanel() {

        setPreferredSize(new Dimension(650, 240));
        Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        Border innerBorder = BorderFactory.createTitledBorder("Programmer data");
        Border border = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(border);
        initComps();
        layoutComps();
        activateForm();
    }

    public void setFormPanelListener(FormPanelListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }

    private void initComps() {

        name = new JTextField(10);
        email = new JTextField(10);
        programmingLang = new JComboBox<>();
        yearsExperience = new JList<>();
        fullTime = new JRadioButton("Full time");

        partTime = new JRadioButton("Part time");
        fullTime.setSelected(true);
        radioBtnGroup = new ButtonGroup();
        radioBtnGroup.add(fullTime);
        radioBtnGroup.add(partTime);
        listScroll = new JScrollPane(yearsExperience, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        allDays = new JCheckBox("Working all days");
        allPlusWeekend = new JCheckBox("Working all days plus the weekend");
        allPlusNightShift = new JCheckBox("Working all days and night shifts");

        DefaultComboBoxModel<String> comboProgramming = new DefaultComboBoxModel<>();
        comboProgramming.addElement("Pascal");
        comboProgramming.addElement("Java");
        comboProgramming.addElement("Python");
        comboProgramming.addElement("Rust");
        comboProgramming.addElement("Go");

        programmingLang.setModel(comboProgramming);
        programmingLang.setSelectedIndex(-1);

        DefaultListModel<String> experienceModel = new DefaultListModel<>();
        experienceModel.addElement("Less than 1 year.");
        experienceModel.addElement("1 - 3 years.");
        experienceModel.addElement("3 to 5 years.");
        experienceModel.addElement("More than 5 years.");

        yearsExperience.setModel(experienceModel);
        yearsExperience.setVisibleRowCount(3);

        submit = new JButton("Submit");
    }

    private void layoutComps() {

        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        add(name, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        add(email, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(fullTime, gbc);

        gbc.gridy = 3;
        add(partTime, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.insets = new Insets(4, 20, 4, 20);
        add(programmingLang, gbc);

        gbc.gridx = 3;
        add(programmingLang, gbc);

        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.fill = GridBagConstraints.VERTICAL;
        add(listScroll, gbc);

        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 3;
        gbc.gridy = 2;
        add(allDays, gbc);

        gbc.gridy = 3;
        add(allPlusWeekend, gbc);

        gbc.gridy = 4;
        add(allPlusNightShift, gbc);

        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        add(submit, gbc);
    }

    private void activateForm() {
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String programmerName = name.getText();
                String programmerEmail = email.getText();
                String workingTime = radioBtnGroup.getSelection().getActionCommand();
                String programmingIn = (String) programmingLang.getSelectedItem();
                String workingExperience = yearsExperience.getSelectedValue();
                List<String> availability = new ArrayList<>();

                if (allDays.isSelected()) {
                    availability.add(allDays.toString());
                }
                if (allPlusWeekend.isSelected()) {
                    availability.add(allPlusWeekend.toString());
                }
                if (allPlusNightShift.isSelected()) {
                    availability.add(allPlusNightShift.toString());
                }

                Programmer programmer = new Programmer(programmerName, programmerEmail, workingTime, programmingIn, workingExperience, availability);
                if (formPanelListener != null) {
                    formPanelListener.formEventOccurred(programmer);
                }
            }
        });
    }
}
