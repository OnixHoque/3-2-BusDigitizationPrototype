package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class mainDB extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtFalgun;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
			mainDB dialog = new mainDB();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public mainDB() {
		setTitle("Database Management");
		setResizable(false);
		
		setBounds(100, 100, 599, 517);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 573, 422);
		contentPanel.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Locations", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblAvailableLocations = new JLabel("Saved Locations:");
		lblAvailableLocations.setBounds(329, 11, 138, 14);
		panel.add(lblAvailableLocations);
		
		JList list = new JList();
		list.setBounds(329, 63, 177, 180);
		JScrollPane splist = new JScrollPane(list);
		splist.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		splist.setBounds(new Rectangle(329, 36, 229, 313));
		panel.add(splist);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(469, 360, 89, 23);
		panel.add(btnDelete);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(25, 11, 46, 14);
		panel.add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(67, 11, 186, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblLongitude = new JLabel("Latitude: 13.0412658 and Longitude: 80.2338514");
		lblLongitude.setBounds(25, 302, 258, 14);
		panel.add(lblLongitude);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(25, 44, 294, 247);
		panel.add(panel_3);
		
		JLabel lblName = new JLabel("Location Name:");
		lblName.setBounds(25, 327, 134, 14);
		panel.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 324, 150, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setBounds(230, 358, 89, 23);
		panel.add(btnUpdate);
		
		JButton btnAdd_1 = new JButton("Add");
		btnAdd_1.setBounds(131, 358, 89, 23);
		panel.add(btnAdd_1);
		
		JButton btnGo = new JButton("Go");
		btnGo.setBounds(263, 7, 56, 23);
		panel.add(btnGo);
		//panel.add(list);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Bus Companies", null, panel_1, null);
		panel_1.setLayout(null);
		
		JList list_1 = new JList();
		list_1.setBounds(20, 23, 163, 271);
		JScrollPane splist2 = new JScrollPane(list_1);
		splist2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		splist2.setBounds(new Rectangle(20, 33, 163, 222));
		
		panel_1.add(splist2);
		
		JLabel lblBusCompanies = new JLabel("Bus Companies:");
		lblBusCompanies.setBounds(20, 11, 121, 14);
		panel_1.add(lblBusCompanies);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(20, 266, 76, 23);
		panel_1.add(btnAdd);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setBounds(107, 266, 76, 23);
		panel_1.add(btnDelete_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(193, 33, 365, 351);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblBusServiceName = new JLabel("Bus Service Name:");
		lblBusServiceName.setBounds(10, 11, 118, 14);
		panel_4.add(lblBusServiceName);
		
		txtFalgun = new JTextField();
		txtFalgun.setText("Falgun");
		txtFalgun.setBounds(138, 8, 187, 20);
		panel_4.add(txtFalgun);
		txtFalgun.setColumns(10);
		
		JLabel lblRating = new JLabel("Rating (out of 5):");
		lblRating.setBounds(10, 42, 118, 14);
		panel_4.add(lblRating);
		
		textField_2 = new JTextField();
		textField_2.setText("3.5");
		textField_2.setBounds(138, 39, 86, 20);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route:");
		lblRoute.setBounds(10, 127, 46, 14);
		panel_4.add(lblRoute);
		
		JList list_2 = new JList();
		list_2.setBounds(10, 142, 118, 124);
		panel_4.add(list_2);
		
		JButton button = new JButton(">");
		button.setBounds(138, 142, 63, 23);
		panel_4.add(button);
		
		JList list_3 = new JList();
		list_3.setBounds(211, 142, 133, 124);
		panel_4.add(list_3);
		
		JButton button_1 = new JButton("<");
		button_1.setBounds(138, 173, 63, 23);
		panel_4.add(button_1);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setBounds(279, 303, 76, 32);
		panel_4.add(btnUpdate_1);
		
		JButton btnMoveUp = new JButton("Manage Schedule...");
		btnMoveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiSchedule dialog2 = new guiSchedule();
				dialog2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog2.setVisible(true);
			}
			
		});
		btnMoveUp.setBounds(203, 80, 152, 23);
		panel_4.add(btnMoveUp);
		
		JButton btnUp = new JButton("Up");
		btnUp.setBounds(138, 207, 63, 23);
		panel_4.add(btnUp);
		
		JButton btnDown = new JButton("Down");
		btnDown.setBounds(138, 241, 63, 23);
		panel_4.add(btnDown);
		
		JButton btnManageTicketPrice = new JButton("Ticket Price & Distance");
		btnManageTicketPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guiFairDistance dialog2 = new guiFairDistance();
				dialog2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog2.setVisible(true);
			}
		});
		btnManageTicketPrice.setBounds(10, 80, 185, 23);
		panel_4.add(btnManageTicketPrice);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("User Accounts", null, panel_2, null);
		panel_2.setLayout(null);
		
		JList list_4 = new JList();
		list_4.setBounds(10, 36, 189, 290);
		panel_2.add(list_4);
		
		JLabel lblUserlist = new JLabel("Userlist:");
		lblUserlist.setBounds(10, 11, 46, 14);
		panel_2.add(lblUserlist);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.setBounds(109, 347, 89, 23);
		panel_2.add(btnDelete_2);
		
		JLabel lblActivity = new JLabel("Activity:");
		lblActivity.setBounds(199, 11, 46, 14);
		panel_2.add(lblActivity);
		
		JList list_5 = new JList();
		list_5.setBounds(209, 36, 349, 337);
		panel_2.add(list_5);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Exit");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(1);
					}
				});
				cancelButton.setSize(76, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
