package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SalaryEmployeeList{

	private String username;

	 public SalaryEmployeeList(String username) {
        this.username = username;
    }

	void salaryEmployeeList(JFrame salaryEmployeeListFrame){
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

		JButton paySalary = new JButton("Pay");
		paySalary.setBounds(700,420,150,30);
		employeeListPanel.add(paySalary);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = salaryEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			SalaryOptionsView backToSalaryOptions = new SalaryOptionsView(username);
			backToSalaryOptions.salaryOptionsView(salaryEmployeeListFrame);
			}
		});

		paySalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = salaryEmployeeListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			SalaryPayManager managerSal = new SalaryPayManager(username);
			managerSal.salaryPayManager(salaryEmployeeListFrame);
			}
		});

		salaryEmployeeListFrame.add(employeeListPanel);
		employeeListPanel.setLayout(null);
		employeeListPanel.setVisible(true);
		salaryEmployeeListFrame.setVisible(true);
	}
}