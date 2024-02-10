package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SalaryView{

	private String username;

	public SalaryView(String username) {
        this.username = username;
    }

	void employeeSalaryView(JFrame salaryFrame){
		JPanel salaryPanel = new JPanel();
		salaryPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		salaryPanel.setBackground(panelColor);
		salaryPanel.setBounds(0,0,900,500);

		JLabel salInfo = new JLabel("Employee Salary");
		salInfo.setBounds(50,50,200,50);
		salaryPanel.add(salInfo);

		JLabel nameLbl = new JLabel("Name:");
		nameLbl.setBounds(100,100,120,30);
		salaryPanel.add(nameLbl);

		JLabel numOfHour = new JLabel("Number of Hour:");
		numOfHour.setBounds(100,130,120,30);
		salaryPanel.add(numOfHour);

		JLabel deductLbl = new JLabel("Deduction");
		deductLbl.setBounds(50,180,120,30);
		salaryPanel.add(deductLbl);

		JLabel taxLbl = new JLabel("Tax:");
		taxLbl.setBounds(100,210,120,30);
		salaryPanel.add(taxLbl);

		JLabel loanLbl = new JLabel("Loan:");
		loanLbl.setBounds(100,240,120,30);
		salaryPanel.add(loanLbl);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		salaryPanel.add(backBtn);

		backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = salaryFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				ProfileView backToProf = new ProfileView(username);
				backToProf.employeeProfileView(salaryFrame);

			}
		});


		salaryFrame.add(salaryPanel);
		salaryPanel.setLayout(null);
		salaryPanel.setVisible(true);
		salaryFrame.setVisible(true);
	}
	void managerSalaryView(JFrame managerSalaryFrame){
		JPanel managerSalaryPanel = new JPanel();
		managerSalaryPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		managerSalaryPanel.setBackground(panelColor);
		managerSalaryPanel.setBounds(0,0,900,500);

		JLabel salInfo = new JLabel("Employee Salary");
		salInfo.setBounds(50,50,200,50);
		managerSalaryPanel.add(salInfo);

		JLabel nameLbl = new JLabel("Name:");
		nameLbl.setBounds(100,100,120,30);
		managerSalaryPanel.add(nameLbl);

		JLabel numOfHour = new JLabel("Number of Hour:");
		numOfHour.setBounds(100,130,120,30);
		managerSalaryPanel.add(numOfHour);

		JLabel deductLbl = new JLabel("Deduction");
		deductLbl.setBounds(50,180,120,30);
		managerSalaryPanel.add(deductLbl);

		JLabel taxLbl = new JLabel("Tax:");
		taxLbl.setBounds(100,210,120,30);
		managerSalaryPanel.add(taxLbl);

		JLabel loanLbl = new JLabel("Loan:");
		loanLbl.setBounds(100,240,120,30);
		managerSalaryPanel.add(loanLbl);

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		managerSalaryPanel.add(backBtn);

		backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = managerSalaryFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				ProfileView backToProf = new ProfileView(username);
				backToProf.managerProfileView(managerSalaryFrame);

			}
		});


		managerSalaryFrame.add(managerSalaryPanel);
		managerSalaryPanel.setLayout(null);
		managerSalaryPanel.setVisible(true);
		managerSalaryFrame.setVisible(true);
	}
}