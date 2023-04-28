package appLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		userlabel = new JLabel("user");
		userlabel.setBounds(10,20,80,25);
		panel.add(userlabel);
		
		userText= new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("password");
		passwordLabel.setBounds(10,50,80,25); //x,y,with,height
		panel.add(passwordLabel);
		
		passwordText= new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		button =new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		
		frame.setVisible(true);
		
		
	
		
	}

	

	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String userName=userText.getText();
		String password= passwordText.getText();
		
		if(userName.equals("tdavis112")&&password.equals("Candy21")||userName.equals("nkosi")&&password.equals("Cash")){
			success.setText("Login successful");
			
			
		}	
			else {
				success.setText("Login denied");
			}
	}

}


