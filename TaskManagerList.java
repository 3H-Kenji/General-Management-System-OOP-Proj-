package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskManagerList{

	private String username;

	public TaskManagerList(String username) {
        this.username = username;
    }

	void taskManagerList(JFrame taskManagerListFrame){
		JPanel managerListPanel = new JPanel();
		managerListPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(74, 123, 111);
		managerListPanel.setBackground(panelColor);
		managerListPanel.setBounds(0,0,900,500);

		JLabel managerListLabel = new JLabel("MANAGER LIST");
		managerListLabel.setBounds(50,10,100,30);
		managerListPanel.add(managerListLabel);


		//WALA PA GI FINALIZE ANG TABLE SO UNYA NA INIG ABOT SA CONTROLLER

		Controller controller = new Controller();
		Object data[][] = controller.getManagerList();
        Object column[] = {"Name", "Age", "Address", "Contact info", "Email Address"};
        
		JTable managerTable = new JTable(data, column);

		JScrollPane scrollPane = new JScrollPane(managerTable);
		scrollPane.setBounds(50, 50, 800, 350);
		managerListPanel.add(scrollPane);
		

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(10,420,150,30);
		managerListPanel.add(backBtn);

		JButton assignTask = new JButton("Assign Task");
		assignTask.setBounds(700,420,150,30);
		managerListPanel.add(assignTask);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskManagerListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskOptionsView backToTaskOptions = new TaskOptionsView(username);
			backToTaskOptions.adminTaskOptionsView(taskManagerListFrame);
			}
		});

		assignTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = taskManagerListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			TaskAssignManager assignManager = new TaskAssignManager(username);
			assignManager.taskAssignManager(taskManagerListFrame);
			}
		});

		taskManagerListFrame.add(managerListPanel);
		managerListPanel.setLayout(null);
		managerListPanel.setVisible(true);
		taskManagerListFrame.setVisible(true);
	}
}