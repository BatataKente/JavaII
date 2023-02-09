/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.IG._1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Daniel
 */
public class LoginPanel extends JPanel {
    private BLabel welcomeLabel;
    private JTextField loginTextField;
    private JTextField passwordTextField;
    private JButton signInButton;
    private BLabel forgotPasswordLabel;
    private GroupLayout layout;
    public LoginPanel() {
        initialize();
    }
    private void initialize() {
        welcomeLabel = createWelcomeLabel();
        loginTextField = createTextField("Login");
        passwordTextField = createTextField("Senha");
        signInButton = createSignInButton();
        forgotPasswordLabel = new BLabel(
                "Esqueceu sua senha?", Font.PLAIN, 12, Color.BLACK
        );
    }
    private JTextField createTextField(String title) {
        var textField = new JTextField();
        textField.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createLineBorder(Color.BLACK), 
                        title, (int) (getWidth() * 0.1), 
                        2, Default.font(Font.PLAIN, 12)
                )
        );
        return textField;
    }
    private JButton createSignInButton() {
        var signInButton = new JButton();
        signInButton.setFont(Default.font(Font.PLAIN, 12));
        signInButton.setText("Entrar");
        return signInButton;
    }
    private BLabel createWelcomeLabel() {
        var welcomeLabel = new BLabel("Bem Vindo", Font.PLAIN, 18, Color.BLACK);
        return welcomeLabel;
    }
    void setupLayout() {
        layout = new GroupLayout(this);
        setLayout(layout);
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGap((int) (getHeight()* 0.1))
                .addComponent(
                        welcomeLabel
                )
                .addGap((int) (getHeight()* 0.1))
                .addComponent(loginTextField)
                .addGap((int) (getHeight()* 0.05))
                .addComponent(passwordTextField)
                .addGap((int) (getHeight()* 0.05))
                .addComponent(signInButton)
                .addComponent(
                        forgotPasswordLabel, (int) (getHeight()* 0.1),
                        (int) (getHeight()* 0.1), (int) (getHeight()* 0.1)
                )
        );
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGap((int) (getHeight()* 0.1))
                .addGroup(
                    layout.createParallelGroup()
                    .addComponent(
                            welcomeLabel, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                    )
                    .addComponent(loginTextField)
                    .addComponent(passwordTextField)
                    .addComponent(
                            signInButton, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                    )
                    .addComponent(
                            forgotPasswordLabel, GroupLayout.DEFAULT_SIZE,
                            GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                    )
                )
                .addGap((int) (getHeight()* 0.1))
        );
    }
}
