package swingbooking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passdetails {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passdetails window = new passdetails();
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
	public passdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Passenger Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(206, 21, 121, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Travels Name");
		lblNewLabel_1.setBounds(23, 63, 101, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(206, 60, 224, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setBounds(23, 114, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt2 = new JTextField();
		txt2.setBounds(206, 111, 138, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setBounds(23, 171, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txt3 = new JTextField();
		txt3.setBounds(206, 168, 138, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("No of Seats");
		lblNewLabel_4.setBounds(10, 217, 114, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		txt4 = new JTextField();
		txt4.setBounds(206, 214, 86, 20);
		frame.getContentPane().add(txt4);
		txt4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Cost");
		lblNewLabel_5.setBounds(10, 265, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		txt5 = new JTextField();
		txt5.setBounds(206, 262, 86, 20);
		frame.getContentPane().add(txt5);
		txt5.setColumns(10);
		
		JButton btn1 = new JButton("Print");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String travels=txt1.getText();
				String from=txt2.getText();
				String to=txt3.getText();
				String noofseats=txt4.getText();
				String cost=txt5.getText();
				passdetails ps = new passdetails();
				ps.settxt1(travels);
				ps.settxt2(from);
				ps.settxt3(to);
				ps.settxt4(noofseats);
				ps.settxt5(cost);
				ps.setVisible(true);
			}
		});
		btn1.setBackground(Color.RED);
		btn1.setBounds(415, 162, 89, 23);
		frame.getContentPane().add(btn1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
		
		
	}

	private void settxt5(String cost) {
		// TODO Auto-generated method stub
		
	}

	private void settxt4(String noofseats) {
		// TODO Auto-generated method stub
		
	}

	private void settxt3(String to) {
		// TODO Auto-generated method stub
		
	}

	private void settxt2(String from) {
		// TODO Auto-generated method stub
		
	}

	private void settxt1(String travels) {
		// TODO Auto-generated method stub
		
	}

}
