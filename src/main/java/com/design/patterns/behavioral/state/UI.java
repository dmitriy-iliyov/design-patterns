package com.design.patterns.behavioral.state;

import javax.swing.*;
import java.awt.*;

public class UI {

    private TCP tcp;
    private static JTextField textField = new JTextField();

    public UI(TCP tcp) {
        this.tcp = tcp;
    }

    public void init() {
        JFrame frame = new JFrame("TEST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        JButton open = new JButton("listening");
        open.addActionListener(e -> textField.setText(tcp.openConnection()));
        JButton established = new JButton("established");
        established.addActionListener(e -> textField.setText(tcp.establishedConnection()));
        JButton close = new JButton("closing");
        close.addActionListener(e -> textField.setText(tcp.closeConnection()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(open);
        buttons.add(established);
        buttons.add(close);
    }
}