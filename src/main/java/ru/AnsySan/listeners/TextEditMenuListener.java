package ru.AnsySan.listeners;

import ru.AnsySan.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        JMenu source = (JMenu) e.getSource();
        Component[] menuComponents = source.getMenuComponents();
        for(Component component : menuComponents) {
            component.setEnabled(component.isEnabled());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
