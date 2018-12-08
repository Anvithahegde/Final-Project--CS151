package budgetPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends Popup{
	protected JTextField summeryPanel;
	protected JPanel innerPanel;
	protected JButton creationButton;
	protected JButton saveButton;

	public void setContents() {
		WeightXY(1,1);
		summeryPanel = new JTextField();
		setLayout(summeryPanel,0,0,2,1);
		innerPanel = new SubPanel(percept);
		gbc.ipady = 250;
		setLayout(innerPanel, 0,1,2,2);
		gbc.ipady = 0;
		gbc.gridwidth = 1;
		creationButton = new JButton();
		creationButton.setText("New Item");
		creationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Creationbutton responds");
			}
		});
		setLayout(creationButton,0,3,1,1);
		saveButton = new JButton();
		saveButton.setText("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Savebutton responds");
				percept.saveData();
			}
		});
		setLayout(saveButton,1,3,1,1);
		
	}

	@Override
	public Dimension objectSize() {
		return new Dimension (300,500);
	}

//	@Override
//	public void frameAbort() {
//		// TODO Auto-generated method stub
//		
//	}


}
