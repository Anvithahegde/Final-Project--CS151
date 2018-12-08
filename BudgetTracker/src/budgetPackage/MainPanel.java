package budgetPackage;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends Popup{
	protected JTextField summeryPanel;
	protected JPanel innerPanel;
	protected JButton creationButton;
	protected JButton saveButton;

	public void setContents() {
		summeryPanel = new JTextField();
		setLayout(summeryPanel,0,0,1,1/4);
		innerPanel = new JPanel();
		setLayout(innerPanel, 0, 1,1,1/2);
		creationButton = new JButton();
		setLayout(creationButton, 0, 2,1/2,1/4);
		saveButton = new JButton();
		setLayout(saveButton, 1, 2,1/2,1/4);
		
	}

	@Override
	public Dimension objectSize() {
		return new Dimension (300,500);
	}

	@Override
	public void frameAbort() {
		// TODO Auto-generated method stub
		
	}


}
