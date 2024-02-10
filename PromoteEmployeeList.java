package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PromoteEmployeeList {

	private String username;

	 public PromoteEmployeeList(String username) {
        this.username = username;
    }

	void promoteEmployeeList(JFrame promoteEmployeeListFrame){
		JPanel employeeListPanel = new JPanel();
		employeeListPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		employeeListPanel.setBackground(panelColor);
		employeeListPanel.setBounds(0,0,900,500);

		JLabel employeeListLabel = new JLabel("EMPLOYEE LIST");
		employeeListLabel.setBounds(50,10,100,30);
		employeeListPanel.add(employeeListLabel);


		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER

		Controller controller = new Controller();
		Object data[][] = controller.getMemberList();
        Object column[] = {"Name", "Age", "Address", "Contact info", "Email Address"};
        
		JTable employeeTable = new JTable(data, column);

		JScrollPane scrollPane = new JScrollPane(employeeTable);
		scrollPane.setBounds(50, 50, 800, 350);
		employeeListPanel.add(scrollPane);
		
		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		employeeListPanel.add(backBtn);

		JButton promoteBtn = new JButton("Promote to Manager");
		promoteBtn.setBounds(700,420,150,30);
		employeeListPanel.add(promoteBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = promoteEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			PromoteOptionsView backToOptions = new PromoteOptionsView(username);
			backToOptions.promoteOptionsView(promoteEmployeeListFrame);
			}
		});

		promoteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(promoteEmployeeListFrame,"Employee has been Promoted to Manager");			
			}
		});

		promoteEmployeeListFrame.add(employeeListPanel);
		employeeListPanel.setLayout(null);
		employeeListPanel.setVisible(true);
		promoteEmployeeListFrame.setVisible(true);
	}
}