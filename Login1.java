import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Login1 {

	private JFrame frame;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login1 window = new Login1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 333);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 580, 294);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel username = new JLabel("USERNAME:");
		username.setForeground(Color.BLUE);
		username.setBounds(96, 77, 82, 14);
		panel.add(username);
		
		JLabel lblLoginForm = new JLabel("LOGIN FORM");
		lblLoginForm.setBounds(192, 5, 98, 19);
		lblLoginForm.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panel.add(lblLoginForm);
		
		user = new JTextField();
		user.setBounds(192, 74, 135, 20);
		panel.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setBounds(96, 109, 89, 14);
		panel.add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( user.getText().isEmpty() || password.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null,"User and Password field should not be empty" + "!");
				}
				else if(user.getText().equals("admin")&& password.getText().equals("12345"))
				{
					JOptionPane.showMessageDialog(null,"Login successfull!");
					frame.dispose();
					page2 p2 = new page2();
					p2.setVisible(true);
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Please input correct username and password!");
				}
					
					
			}
		});
		btnLogin.setBounds(96, 205, 89, 23);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setText("");
				password.setText("");
			}
		});
		btnReset.setBounds(201, 205, 89, 23);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnExit.setBounds(300, 205, 89, 23);
		panel.add(btnExit);
		
		password = new JPasswordField();
		password.setBounds(192, 105, 135, 20);
		panel.add(password);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPassword.isSelected())
				{
					password.setEchoChar((char)0);
				}
				else
				{
					password.setEchoChar('*');
				}
			}
		});
		chckbxShowPassword.setBounds(193, 132, 134, 23);
		panel.add(chckbxShowPassword);
	}
}
