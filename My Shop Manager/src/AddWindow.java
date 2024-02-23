import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;

public class AddWindow {

	JFrame addpage;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWindow window = new AddWindow();
					window.addpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addpage = new JFrame();
		addpage.setTitle("My Shop Manager");
		addpage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		addpage.setResizable(false);
		addpage.getContentPane().setBackground(Color.LIGHT_GRAY);
		addpage.setBounds(100, 100, 809, 575);
		addpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addpage.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addpage.dispose();
				MenuWindow menuwindow = new MenuWindow();
				menuwindow.menu.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setBounds(722, 24, 61, 23);
		addpage.getContentPane().add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 255, 255), null, null, null));
		panel.setBackground(new Color(0, 153, 255));
		panel.setBounds(0, 0, 793, 80);
		addpage.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("ADD ITEM");
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(new Color(0, 102, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setBounds(279, 157, 87, 29);
		addpage.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"","Bakery", "Condiments", "Drinks", "Dairy", "Dal", "Flour", "Household", "Personal", "Paper/Plastic", "Snacks", "Spices"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(427, 158, 128, 29);
		addpage.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(281, 213, 138, 29);
		addpage.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(281, 285, 87, 28);
		addpage.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(427, 285, 120, 31);
		addpage.getContentPane().add(textField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pieces");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(562, 291, 77, 23);
		addpage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxKgLitre = new JCheckBox("Kg / Litre");
		chckbxKgLitre.setForeground(Color.BLACK);
		chckbxKgLitre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		chckbxKgLitre.setBounds(650, 291, 87, 23);
		addpage.getContentPane().add(chckbxKgLitre);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(427, 213, 128, 31);
		addpage.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "        Item Added. ");
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(0, 153, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 24));
		btnNewButton.setBounds(438, 354, 87, 41);
		addpage.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Enter new item information");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_3.setBounds(280, 102, 226, 27);
		addpage.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("Check item Storage");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addpage.dispose();
				Storage storage=new Storage();
				storage.strpage.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 153, 0));
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton_2.setBounds(377, 466, 208, 23);
		addpage.getContentPane().add(btnNewButton_2);
		
		
		JLabel lblNewLabel_5 = new JLabel("MY");
		lblNewLabel_5.setBounds(87, 384, 62, 54);
		addpage.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1_2 = new JLabel("Shop");
		lblNewLabel_1_2.setBounds(78, 433, 95, 54);
		addpage.getContentPane().add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 25));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Manager");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1_1_1_1.setBounds(39, 471, 138, 54);
		addpage.getContentPane().add(lblNewLabel_1_1_1_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\storage logo.png"));
		lblNewLabel_4.setBounds(29, 92, 194, 325);
		addpage.getContentPane().add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(236, 86, 557, 450);
		addpage.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, UIManager.getColor("Button.background"), null, null, null));
		panel_2.setBackground(new Color(0, 153, 255));
		panel_2.setBounds(0, 86, 233, 450);
		addpage.getContentPane().add(panel_2);
	}
}
