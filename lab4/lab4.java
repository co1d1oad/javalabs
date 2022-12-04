import javax.swing.*;
import java.awt.*;

public class lab4 {

  static JPanel jPanel = new JPanel(null);

  public static void main(String[] args) {
    JFrame jFrame = getFrame();
    jPanel.setBackground(Color.decode("#cac2d8"));

    Font textFont = new Font("Times New Roman", Font.ROMAN_BASELINE, 13);
    Font textFont2 = new Font("Times New Roman", Font.ROMAN_BASELINE, 12);
    Font titleFont = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18);

    jFrame.add(jPanel);

    JLabel titleLabel = new JLabel("Реєстрація");
    titleLabel.setBounds(135, 2, 250, 30);
    titleLabel.setForeground(Color.decode("#893c38"));
    titleLabel.setFont(titleFont);
    jPanel.add(titleLabel);

    JLabel nameLabel = new JLabel("Прізвище та імʼя:");
    nameLabel.setBounds(18, 29, 250, 30);
    nameLabel.setFont(textFont);
    jPanel.add(nameLabel);

    JTextField nameInput = new JTextField("", 15);
    nameInput.setForeground(Color.black);
    nameInput.setBounds(17, 52, 280, 33);
    jPanel.add(nameInput);

    JLabel loginLabel = new JLabel("Логін:");
    loginLabel.setBounds(18, 77, 250, 30);
    loginLabel.setFont(textFont);
    jPanel.add(loginLabel);

    JTextField loginInput = new JTextField("", 15);
    loginInput.setForeground(Color.black);
    loginInput.setBounds(17, 100, 280, 33);
    jPanel.add(loginInput);

    JLabel passwordLabel = new JLabel("Пароль:");
    passwordLabel.setBounds(18, 125, 250, 30);
    passwordLabel.setFont(textFont);
    jPanel.add(passwordLabel);

    JTextField passwordInput = new JTextField("", 15);
    passwordInput.setForeground(Color.black);
    passwordInput.setBounds(17, 148, 180, 33);
    jPanel.add(passwordInput);

    JLabel password2Label = new JLabel("Пароль (підтвердження):");
    password2Label.setBounds(18, 173, 250, 30);
    password2Label.setFont(textFont);
    jPanel.add(password2Label);

    JTextField password2Input = new JTextField("", 15);
    password2Input.setForeground(Color.black);
    password2Input.setBounds(17, 196, 180, 33);
    jPanel.add(password2Input);

    JCheckBox checkbox1 = new JCheckBox("Згоден з Умовами");
    checkbox1.setBounds(26, 245, 280, 32);
    checkbox1.setFont(textFont2);
    jPanel.add(checkbox1);

    JButton b = new JButton("Зареєструватися");
    b.setBounds(100, 280, 148, 35);
    b.setBackground(Color.decode("#bfbfbf"));
    b.setForeground(Color.decode("#377d22"));
    b.setOpaque(true);
    b.setBorderPainted(false);
    b.setFont(textFont);
    jPanel.add(b);

    jPanel.revalidate();
    jFrame.setVisible(true);
  }

  static JFrame getFrame() {
    JFrame jFrame = new JFrame();

    int windowWidth = 340;
    int windowHeight = 350;
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();

    jFrame.setBounds(dimension.width / 2 - windowWidth / 2, dimension.height / 2 - windowHeight / 2, windowWidth,
        windowHeight);
    jFrame.setTitle("lab4");
    return jFrame;
  }
}
