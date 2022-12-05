import javax.management.StringValueExp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(null);

        frame.setSize(600,400);
        frame.setTitle("Facebook");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        //email label
        JLabel email = new JLabel(" Enter email: ");
        email.setBounds(10,30,120,20);
        panel.add(email);

        //email input
        JTextField emailField = new JTextField();
        emailField.setBounds(120,30,140,20);
        panel.add(emailField);

        //password
        JLabel password = new JLabel("Enter password: ");
        password.setBounds(10, 60, 120, 20);
        panel.add(password);

        //password input
        JTextField passwordField = new JTextField();
        passwordField.setBounds(120, 60, 140, 20);
        panel.add(passwordField);



        //btn
        JButton btn = new JButton(" Register");
        btn.setBounds(330,30,100,30);
        panel.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //sets display value
                String input = emailField.getText();
                String input2 = passwordField.getText();

                String result = input;
                String result2 = input2;

                //display
                JLabel display = new JLabel();
                display.setBounds(10,60,500,90);
                panel.add(display);
                display.setText("Esi piereģistrējies! Tavi piekļuves dati: " + result + " " + result2);

            }
        });


        frame.setVisible(true);


    }
}