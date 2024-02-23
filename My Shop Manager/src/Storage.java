import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Storage {

	protected static Storage storage;
	JFrame strpage;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Storage window = new Storage();
					window.strpage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Storage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		strpage = new JFrame();
		strpage.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\eclipse\\codes\\My Shop Manager\\image\\msm icon.png"));
		strpage.setTitle("My Shop Manager");
		strpage.getContentPane().setForeground(Color.BLACK);
		strpage.getContentPane().setBackground(Color.WHITE);
		strpage.setBounds(100, 100, 809, 575);
		strpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		strpage.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strpage.dispose();
				AddWindow addPage = new AddWindow();
				addPage.addpage.setVisible(true);
			}
		});
		btnNewButton.setBounds(713, 32, 70, 23);
		strpage.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(158, 130, 625, 342);
		strpage.getContentPane().add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Serial No", "Product name", "Category", "Price", "Import date", "Expire date"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(53);
		table.getColumnModel().getColumn(1).setPreferredWidth(79);
		
		JLabel lblNewLabel_1 = new JLabel("MY");
		lblNewLabel_1.setBounds(48, 197, 62, 54);
		strpage.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1_1 = new JLabel("Shop");
		lblNewLabel_1_1.setBounds(31, 256, 95, 54);
		strpage.getContentPane().add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 40));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Manager");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(10, 321, 138, 54);
		strpage.getContentPane().add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 153, 51));
		panel_1.setBounds(0, 85, 148, 451);
		strpage.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product Name");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2.setBounds(248, 101, 107, 25);
		strpage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Category");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(355, 101, 107, 25);
		strpage.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Price");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(460, 101, 107, 25);
		strpage.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Import Date");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(Color.BLACK);
		lblNewLabel_2_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(577, 101, 95, 25);
		strpage.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Expire Date");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(Color.BLACK);
		lblNewLabel_2_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(682, 101, 101, 25);
		strpage.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Serial No");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(Color.BLACK);
		lblNewLabel_2_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(165, 101, 70, 25);
		strpage.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel = new JLabel("STORAGE");
		lblNewLabel.setBounds(321, 11, 194, 67);
		strpage.getContentPane().add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 51));
		panel.setBounds(0, 0, 793, 82);
		strpage.getContentPane().add(panel);
		
		JButton btnNewButton_1 = new JButton("Add New");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 102, 204));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_1.setBounds(288, 485, 95, 24);
		strpage.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Edit");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_1_1.setBackground(new Color(255, 153, 0));
		btnNewButton_1_1.setBounds(432, 487, 89, 24);
		strpage.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Remove");
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnNewButton_1_2.setBackground(new Color(255, 0, 0));
		btnNewButton_1_2.setBounds(559, 487, 89, 24);
		strpage.getContentPane().add(btnNewButton_1_2);
	}
}
