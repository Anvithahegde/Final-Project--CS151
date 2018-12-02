package budgetPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class BudgetFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public BudgetFrame(JPanel thisPanel) {
		//JFrame, contains the JPanel. That is all.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to be altered later
        add(thisPanel);
        pack();
        setVisible(true);
        setResizable(false);
	}
}
