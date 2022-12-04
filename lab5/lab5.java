import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Objects;

public class lab5 {

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
    checkbox1.setBounds(26, 245, 150, 32);
    checkbox1.setFont(textFont2);
    jPanel.add(checkbox1);

    JLabel errorLabel = new JLabel();
    errorLabel.setBounds(250, 29, 280, 32);
    errorLabel.setForeground(Color.decode("#cf000f"));
    errorLabel.setFont(textFont);
    jPanel.add(errorLabel);

    JButton b = new JButton("Зареєструватися");
    b.setBounds(100, 280, 148, 35);
    b.setBackground(Color.decode("#bfbfbf"));
    b.setForeground(Color.decode("#377d22"));
    b.setOpaque(true);
    b.setBorderPainted(false);
    b.setFont(textFont);

    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // String regex = "[а-яёА-ЯЁ]+";
        String regexLatin = "[a-zA-Z]{1}";
        Pattern patternLatin = Pattern.compile(regexLatin);
        Matcher mLatin = patternLatin.matcher(nameInput.getText());

        Matcher mLatinLogin = patternLatin.matcher(loginInput.getText());

        Matcher mLatinPassword = patternLatin.matcher(passwordInput.getText());

        Matcher mLatinPassword2 = patternLatin.matcher(password2Input.getText());

        String regexNumber = "[-+]?\\d+";
        Pattern patternNumber = Pattern.compile(regexNumber);
        Matcher mNumber = patternNumber.matcher(nameInput.getText());

        if (nameInput.getText().trim().isEmpty()) {
          errorLabel.setText("Імʼя не введено ");

        } else if (mNumber.find()) {
          errorLabel.setText("Імʼя не може бути числом ");

        } else if (mLatin.find()) {
          errorLabel.setText("Кирилицею будь-ласка ");

        } else if (loginInput.getText().contains(" ")) {
          errorLabel.setText("Приберіть пробіл з логіна ");

        } else if (loginInput.getText().trim().isEmpty()) {
          errorLabel.setText("Логін не введений ");

        } else if (!mLatinLogin.find()) {
          errorLabel.setText("Латиницею будь-ласка ");

        } else if (passwordInput.getText().contains(" ") || password2Input.getText().contains(" ")) {
          errorLabel.setText("Приберіть пробіл з пароля ");

        } else if (passwordInput.getText().trim().isEmpty()) {
          errorLabel.setText("Пароль не введений ");

        } else if (password2Input.getText().trim().isEmpty()) {
          errorLabel.setText("Пароль 2 не введений ");

        } else if (!mLatinPassword.find()) {
          errorLabel.setText("Пароль латиницею будь-ласка ");

        } else if (!mLatinPassword2.find()) {
          errorLabel.setText("Напишіть пароль 2 латиницею ");

        } else if (!Objects.equals(passwordInput.getText(), password2Input.getText())) {
          errorLabel.setText("Паролі різні ");

        } else if (!checkbox1.isSelected()) {
          errorLabel.setText("Погодьтеся з умовами ");

        } else {
          errorLabel.setText("");

          Object[] options = { "Підтвердити" };
          int n = JOptionPane.showOptionDialog(jFrame,
          "Реєстрація успішна",
          "lab5",
          JOptionPane.YES_NO_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null, // do not use a custom Icon
          options, // the titles of buttons
          options[0]); // default button title
          System.exit(0);
        }
      }
    });
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
    jFrame.setTitle("lab5");
    return jFrame;
  }
}
