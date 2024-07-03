package ru.AnsySan.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoableEdit;

public class UndoListener implements UndoableEditListener {
    private UndoableEdit undo;

    public UndoListener(UndoableEdit undo) {
        this.undo = undo;
    }
    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undo.addEdit(e.getEdit());
    }
}
