package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login implements ActionListener{
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userlabel = new JLabel("User");
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		
		passLabel = new JLabel("Password");
		passLabel.setBounds(10, 50, 80, 25);
		panel.add(passLabel);
		
		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new login());
		panel.add(button);
		
		success = new JLabel();
		success.setBounds(10, 110, 100, 25);
		panel.add(success);
		
		frame.setVisible(true);
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String user = userText.getText();
		String password = passwordText.getText();
		
		if(user.equals("Alex") && password.equals("password")) {
			success.setText("Logged on!");
		}
		
	}

}
