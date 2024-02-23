import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SellRecordWindow {

	JFrame SRpage;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SellRecordWindow window = new SellRecordWindow();
					window.SRpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SellRecordWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		SRpage = new JFrame();
		SRpage.setResizable(false);
		SRpage.setTitle("My Shop Manager");
		SRpage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		SRpage.getContentPane().setBackground(new Color(192, 192, 192));
		SRpage.setBounds(100, 100, 809, 575);
		SRpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SRpage.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SRpage.dispose();
				MenuWindow menuwindow = new MenuWindow();
				menuwindow.menu.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(711, 27, 65, 23);
		SRpage.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(128, 128, 128), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel.setBackground(new Color(255, 153, 51));
		panel.setBounds(147, 3, 636, 81);
		SRpage.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("SELL RECORDS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 35));
		
		
		JLabel lblNewLabel_1 = new JLabel("MY");
		lblNewLabel_1.setBounds(48, 197, 62, 54);
		SRpage.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1_1 = new JLabel("Shop");
		lblNewLabel_1_1.setBounds(31, 256, 95, 54);
		SRpage.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Manager");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(10, 321, 138, 54);
		SRpage.getContentPane().add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(245, 245, 245), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(0, 3, 148, 533);
		SRpage.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1_11 = new JLabel("Category");
		lblNewLabel_1_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_11.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_11.setBounds(243, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_1_11);
		
		JLabel lblNewLabel_1_2 = new JLabel("Quantity");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(338, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_11 = new JLabel("Item Name");
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setBackground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(169, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(433, 95, 65, 14);
		SRpage.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Date");
		lblNewLabel_1_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_4.setBounds(522, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Time");
		lblNewLabel_1_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_5.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_5.setBounds(615, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Seller");
		lblNewLabel_1_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_6.setBounds(711, 95, 72, 14);
		SRpage.getContentPane().add(lblNewLabel_1_6);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(155, 112, 628, 413);
		SRpage.getContentPane().add(table);
	}
}
