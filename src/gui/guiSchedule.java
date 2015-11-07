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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class guiSchedule extends JDialog {
	public static guiSchedule dialogS;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtam;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialogS = new guiSchedule();
			dialogS.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialogS.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public guiSchedule() {
		setTitle("Schedule for FALGUN BUS SERVICE");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblBusStops = new JLabel("Bus Stops:");
			lblBusStops.setBounds(20, 11, 64, 14);
			contentPanel.add(lblBusStops);
		}
		{
			JList list = new JList();
			list.setBounds(20, 36, 146, 184);
			contentPanel.add(list);
		}
		{
			JLabel lblArivalTime = new JLabel("Arival Time:");
			lblArivalTime.setBounds(190, 11, 82, 14);
			contentPanel.add(lblArivalTime);
		}
		{
			txtam = new JTextField();
			txtam.setText("9:00AM");
			txtam.setBounds(190, 34, 135, 20);
			contentPanel.add(txtam);
			txtam.setColumns(10);
		}
		{
			JButton btnAdd = new JButton("Add");
			btnAdd.setBounds(335, 33, 89, 23);
			contentPanel.add(btnAdd);
		}
		{
			JList list = new JList();
			list.setBounds(190, 65, 135, 155);
			contentPanel.add(list);
		}
		{
			JButton btnDelete = new JButton("Delete");
			btnDelete.setBounds(335, 129, 89, 23);
			contentPanel.add(btnDelete);
		}
		{
			JButton btnMoveUp = new JButton("Move Up");
			btnMoveUp.setBounds(335, 163, 89, 23);
			contentPanel.add(btnMoveUp);
		}
		{
			JButton btnMoveDown = new JButton("Move Down");
			btnMoveDown.setBounds(335, 197, 89, 23);
			contentPanel.add(btnMoveDown);
		}
		{
			JButton btnUpdate = new JButton("Update");
			btnUpdate.setBounds(335, 96, 89, 23);
			contentPanel.add(btnUpdate);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton cancelButton = new JButton("Close");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
