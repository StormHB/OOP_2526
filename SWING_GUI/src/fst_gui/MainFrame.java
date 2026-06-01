package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private FormPanel formPanel;
    private JScrollPane txtAreaScroll;
    private AppMenuBar menuBar;
    private ToolBar toolBar;
    private static final String SAVEFILE = "./SWING_GUI/src/fst_gui/txtDataFile.txt";

    public MainFrame() {
        super("Simple gui app");
        initComps();
        layoutComps();
        activateFrame();
        initFrame();
    }

    private void initFrame() {

        setSize(650, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void activateFrame() {

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formEventOccurred(Programmer programmer) {
                setText2TxtArea(programmer.toString());
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccurred(String eventCommand) {
                if (eventCommand == "RESET") {
                    resetTxtArea();
                }
                if (eventCommand == "SAVE") {
                    AUX_IO.saveTxtDataFromArea(getAllTextFromArea(), SAVEFILE);
                }
                if (eventCommand == "LOAD") {
                    String data = AUX_IO.loadTxtDataFromFile(SAVEFILE);
                    resetTxtArea();
                    setText2TxtArea(data);
                }
            }
        });

        menuBar.setMenuBarListener(new AppMenuBarListener() {
            @Override
            public void menuBarEventOccurred(String menuBarEventActionCommand) {
                if (menuBarEventActionCommand.equals("Save")) {
                    String data = getAllTextFromArea();
                    AUX_IO.saveTxtDataWithFileChooser(data);
                }
                if (menuBarEventActionCommand.equals("Load")) {
                    String data = AUX_IO.loadTxtDataWithFileChooser();
                    setText2TxtArea(data);
                }
            }
        });
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(txtAreaScroll, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void initComps() {

        textArea = new JTextArea();
        txtAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        toolBar = new ToolBar();
        menuBar = new AppMenuBar();
        formPanel = new FormPanel();
        setJMenuBar(menuBar);
    }

    private void setText2TxtArea(String txt) {
        textArea.append(txt);
    }

    private void resetTxtArea() {
        textArea.setText(null);
    }

    private String getAllTextFromArea() {
        return textArea.getText();
    }


}