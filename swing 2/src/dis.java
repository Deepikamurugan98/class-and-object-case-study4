import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dis {

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
					dis window = new dis();
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
	public dis() {
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
		
		JLabel lblNewLabel = new JLabel("Distance Calculator");
		lblNewLabel.setBounds(172, 11, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Principal Amount");
		lblNewLabel_1.setBounds(23, 48, 108, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Discount Percentage");
		lblNewLabel_2.setBounds(23, 94, 108, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		txt1 = new JTextField();
		txt1.setBounds(182, 45, 137, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(182, 91, 137, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBounds(182, 193, 137, 20);
		frame.getContentPane().add(txt3);
		txt3.setColumns(10);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            int t1=Integer.parseInt(txt1.getText());
            int t2=Integer.parseInt(txt2.getText());
            int t3=t1-((t1*t2)/100);
		    txt3.setText(String.valueOf(t3));
			}
		});
		btnNewButton.setBounds(145, 138, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Net price");
		lblNewLabel_3.setBounds(23, 196, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS");
		lblNewLabel_4.setBounds(326, 48, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setBounds(326, 94, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS");
		lblNewLabel_6.setBounds(326, 196, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
