package proiect;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
	
	Login(){
		JFrame frame = new JFrame("Login");
	    frame.setSize(300, 150);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Adauga un panou care sa contina campurile de login si butonul de submit
	    JPanel panel = new JPanel();
	    frame.add(panel);
	    panel.setLayout(null);

	    // Adauga campul de text pentru nume de utilizator
	    JLabel userLabel = new JLabel("id utilizator");
	    userLabel.setBounds(10, 10, 80, 25);
	    panel.add(userLabel);

	    JTextField userText = new JTextField(20);
	    userText.setBounds(100, 10, 160, 25);
	    panel.add(userText);

	    // Adauga campul de text pentru parola
	    JLabel passwordLabel = new JLabel("Parola");
	    passwordLabel.setBounds(10, 40, 80, 25);
	    panel.add(passwordLabel);

	    JPasswordField passwordText = new JPasswordField(20);
	    passwordText.setBounds(100, 40, 160, 25);
	    panel.add(passwordText);

	    // Adauga butonul de login
	    JButton loginButton = new JButton("Log in");
	    loginButton.setBounds(10, 80, 80, 25);
	    panel.add(loginButton);

	    // Adauga un ascultator de evenimente pentru butonul de login
	    loginButton.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        String username = userText.getText();
	        char[] password = passwordText.getPassword();
	        String passwordString = new String(password);

			// Verifica daca numele de utilizator si parola sunt corecte
	        if (verifyCredentials(username, passwordString)) {
	          JOptionPane jOptionPane = new JOptionPane();
			// Daca da, afiseaza un mesaj de succes si inchide fereastra
	          jOptionPane.show();
	          frame.dispose();
	          WorkManagementSystem Nframe = new WorkManagementSystem();
	        } else {
	          // Daca nu, afiseaza un mesaj de eroare
	          JOptionPane.showMessageDialog(frame, "Numele de utilizator sau parola sunt incorecte!", "Eroare", JOptionPane.ERROR_MESSAGE);
	        }
	      }
	    });

	    // Afiseaza fereastra
	    frame.setVisible(true);
	}
  public static void main(String[] args) {
    // Creeaza fereastra
    Login logFr = new Login();
  }

  // Functia care verifica daca numele de utilizator si parola sunt corecte
  private static boolean verifyCredentials(String username, String password) {
    // Conecteaza-te la baza de date
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/proiect", "root", "2002");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    // Creeaza si executa o declaratie SQL
    Statement statement = null;
    try {
      statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM angajati WHERE user= '" + username+ "' AND pass = '" + password + "'");

      // Verifica daca s-a gasit un rand in tabelul users care sa corespunda numelui de utilizator si parolei
      if (resultSet.next()) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return false;
  }

public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}
}
