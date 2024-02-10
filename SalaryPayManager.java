package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SalaryPayManager {

	private String username;

	 public SalaryPayManager(String username) {
        this.username = username;
    }

	void salaryPayManager(JFrame salaryPayManagerFrame) {
		JPanel managerSalary = new JPanel();
		managerSalary.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		managerSalary.setBackground(panelColor);
		managerSalary.setBounds(0,0,900,500);

		JLabel salPaySlip = new JLabel("MANAGER PAYSLIP");
		salPaySlip.setBounds(50,50,200,50);
		managerSalary.add(salPaySlip);

		JLabel salName = new JLabel("Employee Name");
		salName.setBounds(100,100,120,30);
		managerSalary.add(salName);

		JTextField salNametext = new JTextField();
		salNametext.setBounds(230,100,250,30);
		managerSalary.add(salNametext);

		JLabel salRPH = new JLabel("Rate per hour");
		salRPH.setBounds(100,130,120,30);
		managerSalary.add(salRPH);

		JTextField salRPHText = new JTextField();
		salRPHText.setBounds(230,130,250,30);
		managerSalary.add(salRPHText);

		JLabel salDuty = new JLabel("Duty (No. of hours)");
		salDuty.setBounds(100,160,120,30);
		managerSalary.add(salDuty);

		JTextField salDutyText = new JTextField();
		salDutyText.setBounds(230,160,250,30);
		managerSalary.add(salDutyText);

		JLabel salSSSContri = new JLabel("SSS Contribution");
		salSSSContri.setBounds(100,190,120,30);
		managerSalary.add(salSSSContri);

		JTextField salSSSContriText = new JTextField();
		salSSSContriText.setBounds(230,190,250,30);
		managerSalary.add(salSSSContriText);

		JLabel salPhilHealth = new JLabel("PhilHealth");
		salPhilHealth.setBounds(100,220,120,30);
		managerSalary.add(salPhilHealth);

		JTextField salPhilHealthText = new JTextField();
		salPhilHealthText.setBounds(230,220,250,30);
		managerSalary.add(salPhilHealthText);

		JLabel salHouseLoan = new JLabel("House loan");
		salHouseLoan.setBounds(100,250,120,30);
		managerSalary.add(salHouseLoan);

		JTextField salHouseLoanText = new JTextField();
		salHouseLoanText.setBounds(230,250,250,30);
		managerSalary.add(salHouseLoanText);

		JButton salCalculateBtn = new JButton("Calculate");
		salCalculateBtn.setBounds(200,300,200,30);
		managerSalary.add(salCalculateBtn);

		salCalculateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(salaryPayManagerFrame,"Successfully Sent");
			}
		});

		JButton exitBtn = new JButton("Exit");
		exitBtn.setBounds(200,350,150,30);
		managerSalary.add(exitBtn);

		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = salaryPayManagerFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			SalaryManagerList backToManagerList = new SalaryManagerList(username);
			backToManagerList.salaryManagerList(salaryPayManagerFrame);
			}
		});

		salaryPayManagerFrame.add(managerSalary);
		managerSalary.setLayout(null);
		managerSalary.setVisible(true);
		salaryPayManagerFrame.setVisible(true);
	}
}