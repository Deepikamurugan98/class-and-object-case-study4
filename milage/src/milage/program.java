package milage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class program {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					program window = new program();
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
	public program() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mileage Calculator");
		lblNewLabel.setBounds(154, 11, 131, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance covered in km");
		lblNewLabel_1.setBounds(24, 50, 148, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Petrol Consumes in ltr");
		lblNewLabel_2.setBounds(24, 94, 148, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate Mileage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int  t1=Integer.parseInt(txt1.getText());
			int t2=Integer.parseInt(txt2.getText());
			int t3=(t1/t2);
	        txt3.setText(String.valueOf(t3));
			}
		});
		btnNewButton.setBounds(155, 137, 115, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Mileage per ltr");
		lblNewLabel_3.setBounds(24, 194, 148, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		txt1 = new JTextField();
		txt1.setBounds(199, 47, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(199, 91, 86, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(199, 191, 86, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
	}
}
