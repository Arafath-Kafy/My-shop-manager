import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Splash {

	JFrame Mysplash;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash window = new Splash();
			        window.Mysplash.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Create the application.
	 */
	public Splash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mysplash = new JFrame();
		Mysplash.setTitle("My Shop Manager");
		Mysplash.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		Mysplash.setBounds(100, 100, 809, 575);
		Mysplash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mysplash.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mysplash.dispose();
			}
		});
		
		JButton btnNewButton = new JButton("Launch");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mysplash.dispose();
				LoginWindow login = new LoginWindow();
				login.frmMyShopManager.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setBounds(360, 418, 110, 36);
		Mysplash.getContentPane().add(btnNewButton);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 21));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(360, 475, 110, 36);
		Mysplash.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Let's Make Shoping Easy.....");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(308, 344, 221, 37);
		Mysplash.getContentPane().add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\msm logo 5.png"));
		lblNewLabel_1.setBounds(93, 90, 597, 219);
		Mysplash.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\Untitled (1).png"));
		lblNewLabel.setBounds(-222, 0, 1015, 536);
		Mysplash.getContentPane().add(lblNewLabel);
	}
}
