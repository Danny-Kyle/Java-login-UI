package src;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class guitest implements ActionListener{

    private static JLabel userlabel;
    private static JLabel passwordlabel;
    private static JLabel success;
    private static JTextField field1;
    private static JPasswordField passwordField;
    private static JButton button1;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        
        userlabel = new JLabel("User");
        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10,50, 80, 25);
        panel.add(passwordlabel);
        
        field1 = new JTextField(20);
        field1.setBounds(100, 20, 160,25);
        panel.add(field1);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        button1 = new JButton("Login");
        button1.setBounds(10,80,80,25);
        button1.addActionListener(new guitest());
        panel.add(button1);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        String user = field1.getText();
        String password = passwordField.getText();

        //this is used to view the user's input for the login and password
        System.out.println(user + ", " + password);

        if(user.equals("Ijay") && password.equals("eti123")){
            success.setText("Login Successful");
        }else if(!user.equals("Ijay") && password.equals("eti123")){
            success.setText("Username Incorrect");
        }else if (user.equals("Ijay") && !password.equals("eti123")){
            success.setText("Password Incorrect");
        }
        else {
            success.setText("Login Failed, username and password Incorrect");
        }
    }
}
