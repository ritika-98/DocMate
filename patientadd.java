import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class patientadd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientadd frame = new patientadd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public patientadd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 240));
		panel.setBounds(0, 0, 591, 519);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblPatientInformation = new JLabel("PATIENT INFORMATION");
		lblPatientInformation.setFont(new Font("Britannic Bold", Font.PLAIN, 18));
		lblPatientInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatientInformation.setBounds(10, 11, 581, 40);
		panel.add(lblPatientInformation);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(35, 96, 80, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(169, 95, 177, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("AGE:");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAge.setBounds(35, 139, 70, 14);
		panel.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 139, 177, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER:");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(35, 183, 120, 30);
		panel.add(lblPhoneNumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(169, 190, 177, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblGender = new JLabel("GENDER:");
		lblGender.setBounds(35, 245, 70, 14);
		panel.add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setBounds(169, 242, 177, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAddress = new JLabel("ADDRESS:");
		lblAddress.setBounds(35, 281, 94, 14);
		panel.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setBounds(139, 281, 343, 76);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblRollNumber = new JLabel("ROLL NUMBER:");
		lblRollNumber.setBounds(35, 392, 107, 14);
		panel.add(lblRollNumber);
		
		textField_5 = new JTextField();
		textField_5.setBounds(139, 389, 165, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFathersName = new JLabel("FATHER'S NAME:");
		lblFathersName.setBounds(35, 436, 94, 14);
		panel.add(lblFathersName);
		
		textField_6 = new JTextField();
		textField_6.setBounds(139, 433, 165, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("MOTHER'S NAME:");
		lblNewLabel.setBounds(35, 461, 94, 14);
		panel.add(lblNewLabel);
		
		textField_7 = new JTextField();
		textField_7.setBounds(139, 458, 165, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				dispose();
				page2 pg = new page2();
				pg.setVisible(true);
			}
		});
		btnNewButton.setBounds(16, 496, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.setBounds(215, 496, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.setBounds(436, 496, 89, 23);
		panel.add(btnNewButton_2);
	}
}
