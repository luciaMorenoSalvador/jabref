package org.jabref.gui.historical;

import java.util.ArrayList;
import java.util.List;

import org.jabref.model.entry.BibEntry;

public class Caretaker {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();

        BibEntry book;
        book = new BibEntry();
        ArrayList<BibEntry> state1;
        state1 = new ArrayList<>();
        state1.add(book);

        Originator originator = new Originator();
        originator.set(null);
        originator.set(state1);
        savedStates.add(originator.saveToMemento());
        state1.remove(0);

        originator.set(state1);

        originator.restoreFromMemento(savedStates.get(0));
    }
}
