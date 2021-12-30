package org.jabref.gui.historical;

import java.util.ArrayList;

import org.jabref.model.entry.BibEntry;

public class Originator {
    private ArrayList<BibEntry> state;

    public void set() {
        set();
    }

    public void set(ArrayList<BibEntry> state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }

    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public static class Memento {
        private final ArrayList<BibEntry> state;

        public Memento(ArrayList<BibEntry> stateToSave) {
            state = stateToSave;
        }


        private ArrayList<BibEntry> getSavedState() {
            return state;
        }
    }
}
