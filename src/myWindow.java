import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myWindow extends JFrame {
    public myWindow(){
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(650, 500);
        setSize(500, 500);
        setVisible(true);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton button1 = new JButton("Выход");

        ActionListener listener = new closeActionListener();
        button1.addActionListener(listener);
        panel.add(button1);

        JButton button2 = new JButton("Нажми на меня");
        add(button2);

        add(panel, BorderLayout.SOUTH);
    }

}
