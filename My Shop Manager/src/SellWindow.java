import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;

public class SellWindow {

	JFrame SellitemPage;
	private JTextField textField;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellWindow window = new SellWindow();
					window.SellitemPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SellWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SellitemPage = new JFrame();
		SellitemPage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		SellitemPage.setTitle("My Shop Manager");
		SellitemPage.setResizable(false);
		SellitemPage.getContentPane().setBackground(new Color(128, 128, 128));
		SellitemPage.setBounds(100, 100, 809, 575);
		SellitemPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SellitemPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\cart logo.png"));
		lblNewLabel_6.setBounds(10, 308, 180, 179);
		SellitemPage.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("My");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel.setBounds(20, 24, 87, 68);
		SellitemPage.getContentPane().add(lblNewLabel);
		
		JLabel Sidebar = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("side bar 2.png")).getImage();
		
		JLabel lblShop = new JLabel("Shop");
		lblShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblShop.setForeground(Color.WHITE);
		lblShop.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblShop.setBounds(68, 83, 128, 68);
		SellitemPage.getContentPane().add(lblShop);
		
		JLabel lblManager = new JLabel("Manager");
		lblManager.setHorizontalAlignment(SwingConstants.CENTER);
		lblManager.setForeground(Color.WHITE);
		lblManager.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblManager.setBounds(10, 148, 180, 68);
		SellitemPage.getContentPane().add(lblManager);
		Sidebar.setIcon(new ImageIcon(img));
		Sidebar.setBounds(0, 0, 197, 538);
		SellitemPage.getContentPane().add(Sidebar);
		
		JComboBox prodbox = new JComboBox();
		prodbox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		prodbox.setForeground(Color.BLACK);
		prodbox.setBackground(Color.WHITE);
		prodbox.setBounds(621, 100, 128, 29);
		SellitemPage.getContentPane().add(prodbox);
		
		JComboBox catbox = new JComboBox();
		
		catbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(catbox.getSelectedItem().equals("Bakery"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Bread");
					prodbox.addItem("Cake");
					prodbox.addItem("cookies");
					prodbox.addItem("Rolls");
					prodbox.addItem("Burger Buns");
					prodbox.addItem("Hot Dog Buns");
					prodbox.addItem("Muffins");
					prodbox.addItem("French Bread");
					
					
				}
				else if(catbox.getSelectedItem().equals("Condiments"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Vinegar");
					prodbox.addItem("Honey");
					prodbox.addItem("Jam/Jelly");
					prodbox.addItem("Ketchup");
					prodbox.addItem("Mayonneise");
					prodbox.addItem("Mustard");
					prodbox.addItem("Soy Sauce");
					prodbox.addItem("Pasta Sauce");
					
					
				}
				else if(catbox.getSelectedItem().equals("Drinks"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Water");
					prodbox.addItem("Mango Juice");
					prodbox.addItem("Coffee");
					prodbox.addItem("Tea");
					prodbox.addItem("Cocacola");
					prodbox.addItem("7Up");
					prodbox.addItem("Mountain Dew");
					prodbox.addItem("Miranda");	
				}
				else if(catbox.getSelectedItem().equals("Dairy"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Milk");
					prodbox.addItem("Butter");
					prodbox.addItem("Cheese");
					prodbox.addItem("Cream Cheese");
					prodbox.addItem("Eggs");
					prodbox.addItem("Coconut Milk");
					prodbox.addItem("Whipping Cream");
					prodbox.addItem("Yogart");	
				}
				else if(catbox.getSelectedItem().equals("Dal"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Masur Dal");
					prodbox.addItem("Mung Dal");
					prodbox.addItem("Mashkalai Dal");
					prodbox.addItem("Chhola Dal");
					prodbox.addItem("Kheshari Dal");			
				}
				else if(catbox.getSelectedItem().equals("Flour"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Wheat Flour");
					prodbox.addItem("Besan");
					prodbox.addItem("Sooji");
					prodbox.addItem("Baking Powder");
					prodbox.addItem("Baking Soda");
					prodbox.addItem("Break Crumbs");
					prodbox.addItem("Yeast");
				}
				else if(catbox.getSelectedItem().equals("Household"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Batteries");
					prodbox.addItem("Detergent");
					prodbox.addItem("Dish Soap");
					prodbox.addItem("Fabric Softner");
					prodbox.addItem("Glass Cleaner");
					prodbox.addItem("Light Bulbs");
					prodbox.addItem("Sponges");
				}
				else if(catbox.getSelectedItem().equals("Personal"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Conditioner");
					prodbox.addItem("Cotton Buds");
					prodbox.addItem("Deodrant");
					prodbox.addItem("Hair Spray");
					prodbox.addItem("Lip Balm");
					prodbox.addItem("Lotion");
					prodbox.addItem("Mouth Wash");
					prodbox.addItem("Razor Blades");
					prodbox.addItem("Shampoo");
					prodbox.addItem("Shaving Cream");
					prodbox.addItem("Soap");
					prodbox.addItem("Tooth Brush");
					prodbox.addItem("Tooth Paste");
					prodbox.addItem("Sanitizers");
					prodbox.addItem("Hand Wash");
					
					
				}
				else if(catbox.getSelectedItem().equals("Paper/Plastic"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Aluminium Foil");
					prodbox.addItem("Bags");
					prodbox.addItem("Coffee Filters");
					prodbox.addItem("Cups");
					prodbox.addItem("Paper Towels");
					prodbox.addItem("Plastic Wrap");
					prodbox.addItem("Toilet Paper");
					prodbox.addItem("Wax Paper");
					
					
				}
				else if(catbox.getSelectedItem().equals("Snacks"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Potato Chips");
					prodbox.addItem("Crackers");
					prodbox.addItem("Popcorn");
					prodbox.addItem("Nuts");
					prodbox.addItem("Lays");
					prodbox.addItem("Cateberry");
					prodbox.addItem("Dairy Milk");
					prodbox.addItem("Lays");
					prodbox.addItem("Mr.Twist");
					prodbox.addItem("Ruchi DalVaja");
					prodbox.addItem("Kitkat");
					
					
				}
				else if(catbox.getSelectedItem().equals("Spices"))
				{
					prodbox.removeAllItems();
					prodbox.setSelectedItem(null);
					prodbox.addItem("Garam Masala");
					prodbox.addItem("Pepper");
					prodbox.addItem("Red Chilli Powder");
					prodbox.addItem("Turmeric Powder");
					prodbox.addItem("Coriander Powder");
					prodbox.addItem("Cumin Powder");
					prodbox.addItem("Black Pepper");
					prodbox.addItem("Bay Leaves");
					prodbox.addItem("Ginger");
					prodbox.addItem("Sugar");
					prodbox.addItem("Salt");
					
				}
			}
		});
		catbox.setModel(new DefaultComboBoxModel(new String[] {"","Bakery", "Condiments", "Drinks", "Dairy", "Dal", "Flour", "Household", "Personal", "Paper/Plastic", "Snacks", "Spices"}));
		catbox.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		catbox.setForeground(Color.BLACK);
		catbox.setBackground(Color.WHITE);
		catbox.setBounds(306, 100, 128, 29);
		SellitemPage.getContentPane().add(catbox);
		
		JLabel lblNewLabel_1 = new JLabel("Category");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(217, 99, 87, 29);
		SellitemPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Product Name");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(477, 99, 138, 29);
		SellitemPage.getContentPane().add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setBounds(217, 163, 87, 28);
		SellitemPage.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		textField.setBounds(306, 167, 151, 31);
		SellitemPage.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pieces");
		chckbxNewCheckBox.setForeground(Color.BLACK);
		chckbxNewCheckBox.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(306, 207, 61, 23);
		SellitemPage.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxKgLitre = new JCheckBox("Kg / Litre");
		chckbxKgLitre.setForeground(Color.BLACK);
		chckbxKgLitre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 12));
		chckbxKgLitre.setBounds(385, 207, 73, 23);
		SellitemPage.getContentPane().add(chckbxKgLitre);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Discount");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(528, 163, 87, 29);
		SellitemPage.getContentPane().add(lblNewLabel_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"0", "10", "20", "30", "40", "50", "60", "70"}));
		comboBox_1_1.setForeground(Color.BLACK);
		comboBox_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setBounds(621, 164, 103, 29);
		SellitemPage.getContentPane().add(comboBox_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Price");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(227, 258, 87, 28);
		SellitemPage.getContentPane().add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 0, 0));
		textField_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(305, 255, 114, 31);
		SellitemPage.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_3 = new JLabel("TAKA");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
		lblNewLabel_3.setBounds(426, 265, 46, 23);
		SellitemPage.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel(" %");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_4.setBounds(724, 164, 25, 29);
		SellitemPage.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("DONE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "        Item Added.");
			}
			
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton.setBounds(426, 309, 108, 29);
		SellitemPage.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(220, 387, 529, 87);
		SellitemPage.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Bread", "Bakery", "2 p", "90 taka", null},
				{"Oliv oil", "Souce & Oil", "500 gm", "240 taka", null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Name", "Category", "Quantity", "Prize", "Remove/Add"
			}
			
		));
		
		JButton btnSell = new JButton("SELL");
		btnSell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "        SOLD ! ");
				
			}
		});
		btnSell.setForeground(Color.BLACK);
		btnSell.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnSell.setBackground(new Color(255, 69, 0));
		btnSell.setBounds(426, 485, 108, 29);
		SellitemPage.getContentPane().add(btnSell);
		
		JLabel lblNewLabel_5 = new JLabel("Cart");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setBounds(224, 359, 53, 23);
		SellitemPage.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SellitemPage.dispose();
				MenuWindow menuwindow = new MenuWindow();
				menuwindow.menu.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setBounds(722, 24, 61, 23);
		SellitemPage.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("F:\\eclipse\\codes\\My Shop Manager\\image\\sell page 5.png"));
		lblNewLabel_7.setBounds(196, 0, 597, 72);
		SellitemPage.getContentPane().add(lblNewLabel_7);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(240, 248, 255), new Color(255, 255, 255), new Color(245, 255, 250), new Color(255, 255, 255)));
		panel.setBounds(200, 77, 583, 267);
		SellitemPage.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 224), new Color(255, 255, 240), new Color(255, 255, 255)));
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(200, 359, 583, 166);
		SellitemPage.getContentPane().add(panel_1);
		
	}
}
