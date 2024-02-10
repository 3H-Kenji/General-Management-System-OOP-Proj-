package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PromoteOptionsView {

	private String username;

	 public PromoteOptionsView(String username) {
        this.username = username;
    }

	void promoteOptionsView(JFrame promoteOptionsViewFrame) {
		JPanel promoteOptionPanel = new JPanel();
		promoteOptionPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		promoteOptionPanel.setBackground(panelColor);
		promoteOptionPanel.setBounds(0,0,900,500);

		JLabel demoteManagerLabel = new JLabel("Demote a Manager");
		demoteManagerLabel.setBounds(300,100,200,50);
		promoteOptionPanel.add(demoteManagerLabel);

		JLabel promoteEmployeeLabel = new JLabel("Promote a Employee");
		promoteEmployeeLabel.setBounds(300,250,200,50);
		promoteOptionPanel.add(promoteEmployeeLabel);

		JButton managerOptionPromote = new JButton("Manager's List");
		managerOptionPromote.setBounds(300,150,300,50);
		promoteOptionPanel.add(managerOptionPromote);		

		JButton employeeOptionPromote = new JButton("Employee's List");
		employeeOptionPromote.setBounds(300,300,300,50); 
		promoteOptionPanel.add(employeeOptionPromote);

		managerOptionPromote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = promoteOptionsViewFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			DemoteManagerList viewManagerList = new DemoteManagerList(username);
			viewManagerList.demoteManagerList(promoteOptionsViewFrame);
			}
		});

		employeeOptionPromote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = promoteOptionsViewFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			PromoteEmployeeList emploTaskView = new PromoteEmployeeList(username);
			emploTaskView.promoteEmployeeList(promoteOptionsViewFrame);
			}
		});

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		promoteOptionPanel.add(backBtn);
				
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = promoteOptionsViewFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			ProfileView backToProf = new ProfileView(username);
			backToProf.adminProfileView(promoteOptionsViewFrame);
			}
		});

		promoteOptionsViewFrame.add(promoteOptionPanel);
		promoteOptionPanel.setLayout(null);
		promoteOptionPanel.setVisible(true);
		promoteOptionsViewFrame.setVisible(true);
	}	
}