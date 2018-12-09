package budgetPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainPanel extends Popup{
	protected JTextArea summeryPanel;
	protected JTextArea limitPanel1;
	protected JTextField limitPanel2;
	protected JTextArea limitPanel3;
	protected JTextArea limitPanel4;
	protected JPanel innerPanel;
	protected JButton creationButton;
	protected JButton saveButton;
	private double curLimit;

	public void setContents() {
		curLimit = 0;
		WeightXY(1,1);
		summeryPanel = new JTextArea();
		setLayout(summeryPanel,0,0,4,1,20);
		limitPanel1 = new JTextArea();
		limitPanel1.setText("Current Limit:");
		limitPanel1.setEditable(false);
		//limitPanel1.setBackground(Color.BLUE);
		setLayout(limitPanel1,0,1,1,1,10);
		limitPanel2 = new JTextField();
		limitPanel2.addKeyListener(new KeyListener(){
		    public void keyPressed(KeyEvent e){
		        if(e.getKeyCode() == KeyEvent.VK_ENTER){
		        	try {
		        		curLimit = Double.parseDouble(limitPanel2.getText());
		        		refreshLimit();
		        	}
		        	catch (NumberFormatException error){
		        		refreshLimit();
		        	}
		        	
		        }
		    }
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}});
		//limitPanel2.setBackground(Color.RED);
		setLayout(limitPanel2,1,1,1,1,10);
		limitPanel3 = new JTextArea();
		limitPanel3.setText("Limit remaining:");
		limitPanel3.setEditable(false);
		//limitPanel3.setBackground(Color.GREEN);
		setLayout(limitPanel3,2,1,1,1,10);
		limitPanel4 = new JTextArea();
		limitPanel4.setEditable(false);
		//limitPanel4.setBackground(Color.pink);
		setLayout(limitPanel4,3,1,1,1,10);
		innerPanel = new SubPanel(percept);
		gbc.ipady = 250;
		setLayout(innerPanel, 0,2,4,2,0);
		gbc.ipady = 0;
		gbc.gridwidth = 1;
		creationButton = new JButton();
		creationButton.setText("New Item");
		creationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Creationbutton responds");
			}
		});
		setLayout(creationButton,0,4,2,1,20);
		saveButton = new JButton();
		saveButton.setText("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Savebutton responds");
				percept.saveData();
			}
		});
		setLayout(saveButton,2,4,2,1,20);
		
	}

	@Override
	public Dimension objectSize() {
		return new Dimension (300,500);
	}

	public void refreshLimit() {
		Double curRemaining = curLimit;
		limitPanel2.setText(Double.toString(curLimit));
		limitPanel4.setText(Double.toString(curRemaining));
		
	}
//	@Override
//	public void frameAbort() {
//		// TODO Auto-generated method stub
//		
//	}


}
