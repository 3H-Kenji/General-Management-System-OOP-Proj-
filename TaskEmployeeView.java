package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TaskEmployeeView{

	private String username;

	public TaskEmployeeView(String username) {
        this.username = username;
    }

	void taskEmployeeView(JFrame taskEmployeeFrame){
		JPanel employeeTaskPanel = new JPanel();
		employeeTaskPanel.setBounds(0,0,900,500);

		Color panelColor = new Color(23, 127, 117);
		employeeTaskPanel.setBackground(panelColor);
		employeeTaskPanel.setBounds(0,0,900,500);

		JLabel managerTask = new JLabel("Employee's Task");
		managerTask.setBounds(50,10,200,30);
		employeeTaskPanel.add(managerTask);

		//EXAMPLE RANING TABLE ARI REPRESENTATION RANIS UNSAY NAWNG WALA PANI NA FINALIZE
		String data[][] = {{"Date Received", "Task Name", "Due Date"},
                			{"23/12/28", "Embalsamador", "Next week"},
                			{"0", "0", "0"},
                			{"0", "0", "0"}};

        String column[] = {"Date Received", "Task Name", "Due Date"};

		JTable managerTaskTable = new JTable(data,column);
		managerTaskTable.setBounds(50,50,800,350);
		employeeTaskPanel.add(managerTaskTable);
		
	/*	*enable scrolling when the table contains a 
			large number of rows or columns.

		JScrollPane sp = new JScrollPane(managerTaskTable);
		employeeTaskPanel.add(sp)
	*/	

		JButton backBtn = new JButton("Back");
		backBtn.setBounds(700,10,150,30);
		employeeTaskPanel.add(backBtn);

		backBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Container frame = taskEmployeeFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();

			TaskOptionsView backToOptions = new TaskOptionsView(username);
			backToOptions.managerTaskOptionsView(taskEmployeeFrame);
			}
		});

		taskEmployeeFrame.add(employeeTaskPanel);
		employeeTaskPanel.setLayout(null);
		employeeTaskPanel.setVisible(true);
		taskEmployeeFrame.setVisible(true);
	}
}