package org.jabref.gui.historical;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;

import org.jabref.model.entry.BibEntry;

public class Controller {

    @FXML
    private DialogPane pane;

    private List<BibEntry> entries ;

    public void initialize() {
        entries = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            BibEntry entry = new BibEntry();
            entries.add(entry);
            pane.getChildren().add(entry);
        }
    }
}
