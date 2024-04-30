package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {

    private JButton[] buttons;

    public ButtonPanel(String[] labels) {
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttons = new JButton[labels.length];

        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JButton(labels[i]);
            add(buttons[i]);
        }
    }

}

