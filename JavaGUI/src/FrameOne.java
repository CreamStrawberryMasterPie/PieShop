import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

import InheritancePlayground.LocaLola;
import javax.swing.JTextField;
import java.awt.Font;

public class FrameOne {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextPane txtpnLiters;
	private JTextPane txtpnToxicity;
	private JButton btnPress;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne window = new FrameOne();
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
	public FrameOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(35, 35, 113, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 108, 113, 51);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		txtpnLiters = new JTextPane();
		txtpnLiters.setText("Liters");
		txtpnLiters.setBounds(62, 11, 58, 26);
		frame.getContentPane().add(txtpnLiters);
		
		txtpnToxicity = new JTextPane();
		txtpnToxicity.setText("Toxicity");
		txtpnToxicity.setBounds(62, 86, 58, 26);
		frame.getContentPane().add(txtpnToxicity);
		
		btnPress = new JButton("Press");
		btnPress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int gui_amount = Integer.parseInt(textField.getText());
				int gui_tox = Integer.parseInt(textField_1.getText());
				System.out.println("jo" + gui_amount + gui_tox);
				
				LocaLola guiLocaLola= new LocaLola(gui_amount,gui_tox);
				//lblNewLabel.setText(guiLocaLola.getString() + System.lineSeparator() + "Test");
				lblNewLabel.setText("<html><body>" + guiLocaLola.getFunTextWithAmountAndColor() +"<br>" + guiLocaLola.getFunTextWithToxicity() 
						+ "<br>" + guiLocaLola.getFunTextWithPrice() +  "<br>" + guiLocaLola.getFunTextWithAcid() +"</body></html>");
			}
		});
		btnPress.setBounds(59, 211, 89, 23);
		frame.getContentPane().add(btnPress);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(158, 35, 366, 149);
		frame.getContentPane().add(lblNewLabel);
		

	}
}
