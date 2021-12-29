package org.jabref.gui.historical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.DialogPane;

import org.jabref.model.entry.BibEntry;

@SuppressWarnings("checkstyle:NoWhitespaceBefore")
public class Controller {

    @FXML
    private DialogPane pane;

    private List<Collection<String>> entries ;

    public void initialize() {
        entries = new ArrayList<java.util.Collection<String>>();
        for (int i = 1; i <= 1000; i++) {
            BibEntry entry = new BibEntry();
            entries.add(entry.getFieldValues());
            pane.getChildren().add(entry);
        }
    }
}
