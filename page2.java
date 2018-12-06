import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class page2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
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
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 367);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeDoctor = new JLabel("WELCOME DOCTOR!");
		lblWelcomeDoctor.setForeground(Color.BLACK);
		lblWelcomeDoctor.setBackground(Color.BLUE);
		lblWelcomeDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeDoctor.setFont(new Font("Palatino Linotype", Font.BOLD, 14));
		lblWelcomeDoctor.setBounds(10, 25, 389, 41);
		contentPane.add(lblWelcomeDoctor);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				Login1.main(null);
			}
		});
		btnBack.setBounds(22, 273, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("Add Patient");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				patientadd p1 = new patientadd();
				p1.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(41, 181, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSearchPatient = new JButton("Search Patient ");
		btnSearchPatient.setBounds(153, 181, 115, 23);
		contentPane.add(btnSearchPatient);
		
		JButton btnAddAppointment = new JButton("Add Appointment");
		btnAddAppointment.setBounds(284, 181, 115, 23);
		contentPane.add(btnAddAppointment);
	}

}
