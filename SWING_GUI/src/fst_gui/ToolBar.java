package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel {

    private JButton resetBtn;
    private JButton saveBtn;
    private JButton loadBtn;
    private ToolBarListener toolBarListener;

    public ToolBar() {
        initComps();
        layoutComps();
        activate();
    }

    public void setToolBarListener(ToolBarListener toolBarListener) {
        this.toolBarListener = toolBarListener;
    }

    private void initComps() {

        resetBtn = new JButton("Reset");
        loadBtn = new JButton("Load");
        saveBtn = new JButton("Save");
        resetBtn.setActionCommand("RESET");
        loadBtn.setActionCommand("LOAD");
        saveBtn.setActionCommand("SAVE");
    }

    private void layoutComps() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(resetBtn);
        add(saveBtn);
        add(loadBtn);

    }

    private void activate() {

        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (toolBarListener != null) {
                    toolBarListener.toolBarEventOccurred(resetBtn.getActionCommand());
                }
            }
        });

        loadBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (toolBarListener != null) {
                    toolBarListener.toolBarEventOccurred(loadBtn.getActionCommand());
                }
            }
        });

        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (toolBarListener != null) {
                    toolBarListener.toolBarEventOccurred(saveBtn.getActionCommand());
                }
            }
        });
    }
}
