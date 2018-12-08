package budgetPackage;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public abstract class Popup extends JPanel{
	private JFrame thisFrame;
	GridBagConstraints gbc;
	
	
	public abstract void setContents();
	public abstract Dimension objectSize();
	public abstract void frameAbort();
	
	public Popup() {
		this.setLayout(new GridBagLayout());  
		this.gbc = new GridBagConstraints();
		this.setSize(objectSize());
		this.setContents();
		this.thisFrame = new PopupFrame(objectSize(), this);
	}
	
	
	public void GridXY(int x, int y) {
		gbc.gridx = x;
		gbc.gridy = y;
	}
	public void PadXY(int x, int y) {
		gbc.ipadx = x;
		gbc.ipady = y;
		
	}
	public void WeightXY(int x, int y) {
		gbc.weightx = x;
		gbc.weighty = y;
	}
	
	protected void closeThisFrame() {
		thisFrame.dispatchEvent(new WindowEvent(thisFrame, WindowEvent.WINDOW_CLOSING));
	}
}
