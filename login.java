import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPage() {
        // Frame setup
        setTitle("Login Page");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Username field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);

        // Password field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        // Login button
        loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Replace "yourUsername" and "yourPassword" with your predefined username and password
                String username = "yourUsername";
                String password = "yourPassword";

                String inputUsername = usernameField.getText();
                String inputPassword = new String(passwordField.getPassword());

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    // Add code to open the main application window or perform any other action after successful login.
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
                }
            }
        });

        // Add components to the frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        // Set frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginPage();
            }
        });
    }
}

