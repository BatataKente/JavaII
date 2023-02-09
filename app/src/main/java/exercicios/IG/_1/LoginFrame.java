package exercicios.IG._1;

import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LoginFrame extends BFrame {
    private BLabel titleLabel;
    private BLabel registerLabel;
    private GroupLayout layout;
    private LoginPanel loginPanel;
    public LoginFrame() {
        initialize();
        this.setupLayout();
        loginPanel.setupLayout();
    }         
    private void initialize() {
        titleLabel = createTitleLabel();
        registerLabel = createRegisterLabel();
        loginPanel = createTitlePanel();
    }
    private BLabel createTitleLabel() {
        var titleLabel = new BLabel("Todo App", 48);
        titleLabel.setIcon(new ImageIcon(getClass().getResource("/oie_transparent.png")));
        return titleLabel;
    }
    private BLabel createRegisterLabel() {
        var registerLabel = new BLabel("clique aqui para cadastrar", 18);
        registerLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        return registerLabel;
    }
    private LoginPanel createTitlePanel() {
        var titlePanel = new LoginPanel();
        return titlePanel;
    }
    private void setupLayout() {
        layout = new BGroupLayout(getContentPane());
        setMinimumSize(new Dimension(440,570));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(layout);
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                    layout.createSequentialGroup()
                        .addGap(getWidth(0.15))
                        .addComponent(titleLabel)
                        .addGap(getWidth(0.05))
                        .addComponent(
                                loginPanel, getWidth(0.5), 
                                getWidth(0.5), Short.MAX_VALUE
                        )
                        .addComponent(
                                registerLabel, GroupLayout.DEFAULT_SIZE, 
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                        )
                        .addGap(getWidth(0.025))
                )
        );
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                layout.createSequentialGroup()
                        .addComponent(
                                titleLabel, GroupLayout.DEFAULT_SIZE, 
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                        )
                )
                .addGroup(
                        layout.createSequentialGroup()
                        .addGap(getWidth(0.2))
                        .addComponent(
                                loginPanel, GroupLayout.DEFAULT_SIZE, 
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                        )
                        .addGap(getWidth(0.2))
                )
                .addGroup(
                        layout.createSequentialGroup()
                        .addComponent(
                                registerLabel, GroupLayout.DEFAULT_SIZE, 
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE
                        )
                )
        );
        pack();
    }                   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | 
                       IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }      
}
