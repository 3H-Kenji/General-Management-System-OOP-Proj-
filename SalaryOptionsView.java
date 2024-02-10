package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SalaryOptionsView{

	private String username;

	 public SalaryOptionsView(String username) {
        this.username = username;
    }

	void salaryOptionsView(JFrame adminSalaryChoicesFrame){
		JPanel salaryOptionPanel = new JPanel();
		salaryOptionPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		salaryOptionPanel.setBackground(panelColor);
		salaryOptionPanel.setBounds(0,0,900,500);

		JButton managerOptionSalary = new JButton("Manager's List");
		managerOptionSalary.setBounds(300,150,300,50);
		salaryOptionPanel.add(managerOptionSalary);		

		JButton employeeOptionSalary = new JButton("Employee's List");
		employeeOptionSalary.setBounds(300,300,300,50);
		salaryOptionPanel.add(employeeOptionSalary);

		managerOptionSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminSalaryChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			SalaryManagerList viewManagerList = new SalaryManagerList(username);
			viewManagerList.salaryManagerList(adminSalaryChoicesFrame);
			}
		});

		employeeOptionSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminSalaryChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			SalaryEmployeeList emploTaskView = new SalaryEmployeeList(username);
			emploTaskView.salaryEmployeeList(adminSalaryChoicesFrame);
			}
		});

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		salaryOptionPanel.add(backBtn);
				
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = adminSalaryChoicesFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.adminProfileView(adminSalaryChoicesFrame);
			}
		});

		adminSalaryChoicesFrame.add(salaryOptionPanel);
		salaryOptionPanel.setLayout(null);
		salaryOptionPanel.setVisible(true);
		adminSalaryChoicesFrame.setVisible(true);
	}
}