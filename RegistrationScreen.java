package RegistrationScreen1;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class RegistrationScreen extends JFrame {
    private static final long serialVersionUID = -1319988806698852824L;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationScreen() {
        setTitle("Register");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 300); // Aumenta o tamanho da janela
        setLocationRelativeTo(null);

        // Criar componentes
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");

        // Definir tamanho preferido dos campos de texto
        usernameField.setPreferredSize(new Dimension(200, 30)); 
        passwordField.setPreferredSize(new Dimension(200, 30));

        // Layout manager (usando GridBagLayout)
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Espaçamento

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(usernameLabel, gbc);

        gbc.gridx = 1;
        add(usernameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        gbc.gridx = 1;
        add(passwordField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(registerButton, gbc);

        // Adicionar ActionListener ao botão de registro
        registerButton.addActionListener(e -> {
            String username = usernameField.getText();
            char[] password = passwordField.getPassword();
            // Chame um método para criar a conta do usuário
            createUserAccount(username, password);
            // Feche a janela após o registro
            dispose();
        });

        setVisible(true);
    }

    private void createUserAccount(String username, char[] password) {
        // Implemente a lógica para criar uma nova conta de usuário
        // (coloque sua lógica aqui)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RegistrationScreen());
    }
}
