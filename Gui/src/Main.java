package main;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Frame {

    public Main() throws HeadlessException {

        setSize(300,300);
        addWindowListener(new MyWindowListerener());
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();

    }

    private void beenden() {
        // Aufräumen ziemlich viel code
        dispose();
    }

    class MyWindowListerener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            beenden();
        }
    }
}