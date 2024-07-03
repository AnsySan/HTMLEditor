package ru.AnsySan.listeners;

import ru.AnsySan.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    public void windowClosing(WindowEvent e) {
        view.exit();
    }
}
