package fst_gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.net.FileNameMap;

public class BrowseFileChooser extends JFileChooser {

    public BrowseFileChooser() {
        super("./DATA/");
        initFileChooser();
    }

    private void initFileChooser() {
        FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Text files", "txt");
        FileNameExtensionFilter csvFilter = new FileNameExtensionFilter("CSV files", "csv");
        this.addChoosableFileFilter(txtFilter);
        this.addChoosableFileFilter(csvFilter);
        setFileFilter(txtFilter);
    }
}
