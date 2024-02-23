import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LoginWindow {

	JFrame frmMyShopManager;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindow window = new LoginWindow();
					window.frmMyShopManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	
	public void logedin() 
	{
		JOptionPane.showMessageDialog(null, "        Login Successful\n                  Welcome");
		frmMyShopManager.dispose();
		MenuWindow menuwindow = new MenuWindow();
		menuwindow.menu.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyShopManager = new JFrame();
		frmMyShopManager.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		frmMyShopManager.setTitle("My Shop Manager");
		frmMyShopManager.setResizable(false);
		frmMyShopManager.setBounds(100, 100, 809, 575);
		frmMyShopManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyShopManager.getContentPane().setLayout(null);
		frmMyShopManager.getContentPane().setBackground(Color.DARK_GRAY);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmMyShopManager.dispose();
				Splash window = new Splash();
		        window.Mysplash.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setBounds(694, 27, 76, 23);
		frmMyShopManager.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 17));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Employee"}));
		comboBox.setBounds(328, 287, 178, 32);
		frmMyShopManager.getContentPane().add(comboBox);
		
		JButton loginbutton = new JButton("Log In");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==loginbutton) {
					
					String accnt_type= (String) comboBox.getSelectedItem();
					String un = textField.getText();
					String pass = passwordField.getText();		
					
					if(accnt_type.equals("Admin")&&un.equals("Arafath")&&pass.equals("123")) 
					{
						logedin();
					}
					
					else if(accnt_type.equals("Admin")&&un.equals("Faisal")&&pass.equals("1234")) 
					{
						logedin();
					}
					else if(accnt_type.equals("Employee")&&un.equals("Wahid")&&pass.equals("234")) 
					{
						logedin();
					}
					else if(accnt_type.equals("Employee")&&un.equals("Sadik")&&pass.equals("2345")) 
					{
						logedin();
					}
					else
						{JOptionPane.showMessageDialog(null, "             Login Failed!\n\nIncorect Username or Password");
							textField.setText("");
							passwordField.setText("");
						
						}
				}
				
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\msm logo 5.png"));
		lblNewLabel_1.setBounds(179, 0, 428, 238);
		frmMyShopManager.getContentPane().add(lblNewLabel_1);
		loginbutton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		loginbutton.setBackground(Color.WHITE);
		loginbutton.setBounds(359, 460, 117, 32);
		frmMyShopManager.getContentPane().add(loginbutton);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBounds(328, 339, 178, 32);
		frmMyShopManager.getContentPane().add(textField);
		
		JLabel lblNewLabel = new JLabel("User Name : ");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(215, 330, 125, 45);
		frmMyShopManager.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passwordField.setForeground(Color.BLACK);
		passwordField.setBounds(328, 395, 178, 32);
		frmMyShopManager.getContentPane().add(passwordField);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 17));
		lblPassword.setBounds(215, 386, 125, 45);
		frmMyShopManager.getContentPane().add(lblPassword);
		Image img = new ImageIcon(this.getClass().getResource("/smsp3.png")).getImage();
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Untitled (1).png")).getImage();
		
		
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(-347, 0, 1140, 536);
		frmMyShopManager.getContentPane().add(lblNewLabel_2);
	}
}
