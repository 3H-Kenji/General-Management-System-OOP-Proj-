package cite.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DemoteManagerList {

	private String username;

	 public DemoteManagerList(String username) {
        this.username = username;
    }

	void demoteManagerList(JFrame demoteManagerListFrame){
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

		JButton demoteBtn = new JButton("Demote to Employee");
		demoteBtn.setBounds(700,420,150,30);
		managerListPanel.add(demoteBtn);

		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Container frame = demoteManagerListFrame.getContentPane();

				frame.removeAll();
				frame.repaint();
				frame.revalidate();
			PromoteOptionsView backToOptions = new PromoteOptionsView(username);
			backToOptions.promoteOptionsView(demoteManagerListFrame);
			}
		});

		demoteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(demoteManagerListFrame,"Manager has been Demoted to Employee");			
			}
		});

		demoteManagerListFrame.add(managerListPanel);
		managerListPanel.setLayout(null);
		managerListPanel.setVisible(true);
		demoteManagerListFrame.setVisible(true);
	}
}