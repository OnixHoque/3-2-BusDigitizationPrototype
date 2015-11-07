package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiFairDistance extends JDialog {
	public static guiFairDistance dialog;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog = new guiFairDistance();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public guiFairDistance() {
		setTitle("Ticket Price and Distance for FALGUN BUS SERVICE");
		setModal(true);
		setBounds(100, 100, 608, 307);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFrom = new JLabel("From:");
			lblFrom.setBounds(10, 11, 46, 14);
			contentPanel.add(lblFrom);
		}
		{
			JList list = new JList();
			list.setBounds(10, 36, 155, 191);
			contentPanel.add(list);
		}
		{
			JLabel lblTo = new JLabel("To:");
			lblTo.setBounds(176, 11, 46, 14);
			contentPanel.add(lblTo);
		}
		{
			JList list = new JList();
			list.setBounds(175, 36, 155, 191);
			contentPanel.add(list);
		}
		{
			JLabel lblFairFromshahbagh = new JLabel("Ticket Price:");
			lblFairFromshahbagh.setBounds(337, 47, 89, 14);
			contentPanel.add(lblFairFromshahbagh);
		}
		{
			textField = new JTextField();
			textField.setText("10");
			textField.setBounds(436, 44, 97, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblTaka = new JLabel("taka");
			lblTaka.setBounds(543, 47, 26, 14);
			contentPanel.add(lblTaka);
		}
		{
			JLabel lblDistance = new JLabel("Distance:");
			lblDistance.setBounds(341, 101, 85, 14);
			contentPanel.add(lblDistance);
		}
		{
			textField_1 = new JTextField();
			textField_1.setText("1.29");
			textField_1.setBounds(436, 101, 97, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblKm = new JLabel("km");
			lblKm.setBounds(543, 101, 46, 14);
			contentPanel.add(lblKm);
		}
		{
			JButton btnUpdate = new JButton("Update");
			btnUpdate.setBounds(493, 204, 89, 23);
			contentPanel.add(btnUpdate);
		}
		
		JCheckBox chckbxSymmetricFair = new JCheckBox("Symmetric Fair");
		chckbxSymmetricFair.setSelected(true);
		chckbxSymmetricFair.setBounds(436, 71, 133, 23);
		contentPanel.add(chckbxSymmetricFair);
		
		JLabel lblGetDistanceFrom = new JLabel("Get Distance from Google Maps...");
		lblGetDistanceFrom.setForeground(Color.BLUE);
		lblGetDistanceFrom.setBounds(390, 131, 187, 14);
		contentPanel.add(lblGetDistanceFrom);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Close");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//ialog.dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
