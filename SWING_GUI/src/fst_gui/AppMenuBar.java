package fst_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AppMenuBar extends JMenuBar implements ActionListener {

    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem loadFile;
    private JMenuItem saveFile;
    private JMenuItem exitApp;
    private AppMenuBarListener menuBarListener;

    public AppMenuBar() {
        initComps();
        layoutComps();
        activateMenuBar();
    }

    private void initComps() {
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        loadFile = new JMenuItem("Load...");
        saveFile = new JMenuItem("Save...");
        exitApp = new JMenuItem("Exit");

        loadFile.setAccelerator(KeyStroke.getKeyStroke("control L"));
        //loadFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
        saveFile.setAccelerator(KeyStroke.getKeyStroke("control S"));
        exitApp.setAccelerator(KeyStroke.getKeyStroke("control X"));

        fileMenu.setMnemonic('F');


    }

    private void layoutComps() {
        fileMenu.add(loadFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exitApp);
        add(fileMenu);
        add(editMenu);
    }

    private void activateMenuBar() {
        exitApp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loadFile.setActionCommand("Load");
        loadFile.addActionListener(this);
        saveFile.setActionCommand("Save");
        saveFile.addActionListener(this);

        exitApp.setActionCommand("Exit");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Load")) {
            if (menuBarListener != null) {
                menuBarListener.menuBarEventOccurred("Load");
            }
        }
        if (ae.getActionCommand().equals("Save")) {
            menuBarListener.menuBarEventOccurred(ae.getActionCommand());
        }
    }
    public void setMenuBarListener(AppMenuBarListener menuBarListener) {
        this.menuBarListener = menuBarListener;
    }
}
