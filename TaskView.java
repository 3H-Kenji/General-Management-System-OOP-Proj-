package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskView{

	private String username;

	public TaskView(String username) {
        this.username = username;
    }

	void taskView(JFrame taskFrame){
		JPanel taskPanel = new JPanel();
	
		Color panelColor = new Color(23, 127, 117);
		taskPanel.setBackground(panelColor);
		taskPanel.setBounds(0,0,900,500);

		JLabel employeeTask = new JLabel("Employee's Task");
		employeeTask.setBounds(50,10,200,30);
		taskPanel.add(employeeTask);

		
		String data[][] = {{"Date Received", "Task Name", "Due Date"},
                			{"23/12/28", "Embalsamador", "Next week"},
                			{"0", "0", "0"},
                			{"0", "0", "0"}};

        String column[] = {"Date Received", "Task Name", "Due Date"};

		JTable taskTable = new JTable(data,column);
		taskTable.setBounds(50,50,800,350);
		taskPanel.add(taskTable);
		
	/*	*enable scrolling when the table contains a 
			large number of rows or columns.
	
		JScrollPane sp = new JScrollPane(taskTable);
		taskPanel.add(sp);
	*/

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		taskPanel.add(backBtn);

		backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = taskFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

				ProfileView backToProf = new ProfileView(username);
				backToProf.employeeProfileView(taskFrame);
			}
		});

		taskFrame.add(taskPanel);
		taskPanel.setLayout(null);
		taskPanel.setVisible(true);
		taskFrame.setVisible(true);
	}
}