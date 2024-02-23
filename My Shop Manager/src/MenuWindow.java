import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class MenuWindow {

	JFrame menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuWindow window = new MenuWindow();
					window.menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		menu = new JFrame();
		menu.setResizable(false);
		menu.setTitle("My Shop Manager");
		menu.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		menu.getContentPane().setBackground(new Color(0, 153, 204));
		menu.setBounds(100, 100, 809, 575);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menu.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\msm logo 5.png"));
		lblNewLabel_1_1_1.setBounds(140, 11, 486, 186);
		menu.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO SHOP MANAGER !");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel.setBounds(140, 225, 486, 79);
		menu.getContentPane().add(lblNewLabel);
		
		JButton menubutton1 = new JButton("Sell Item");
		menubutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==menubutton1) {
					menu.dispose();
					SellWindow sellpage = new SellWindow();
					sellpage.SellitemPage.setVisible(true);
				}
				
			}
		});
		menubutton1.setForeground(Color.BLACK);
		menubutton1.setBackground(Color.ORANGE);
		menubutton1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		menubutton1.setBounds(305, 315, 138, 32);
		menu.getContentPane().add(menubutton1);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnAddItem) {
					menu.dispose();
					AddWindow addPage = new AddWindow();
					addPage.addpage.setVisible(true);
				
			}}
		});
		btnAddItem.setForeground(Color.BLACK);
		btnAddItem.setBackground(Color.ORANGE);
		btnAddItem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		btnAddItem.setBounds(305, 362, 138, 32);
		menu.getContentPane().add(btnAddItem);
		
		JButton btnSellRecords = new JButton("Sell Records");
		btnSellRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menu.dispose();
				SellRecordWindow SRpage = new SellRecordWindow();
				SRpage.SRpage.setVisible(true);
			}
		});
		btnSellRecords.setForeground(Color.BLACK);
		btnSellRecords.setBackground(Color.ORANGE);
		btnSellRecords.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		btnSellRecords.setBounds(305, 448, 138, 40);
		menu.getContentPane().add(btnSellRecords);
		Image img = new ImageIcon(this.getClass().getResource("/Untitled (1).png")).getImage();
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "        Loged Out ");
				menu.dispose();
				LoginWindow login = new LoginWindow();
				login.frmMyShopManager.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 51, 51));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnNewButton.setBounds(667, 490, 83, 23);
		menu.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 28));
		lblNewLabel_1.setBounds(0, 0, 793, 536);
		menu.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(img));
	}
}
