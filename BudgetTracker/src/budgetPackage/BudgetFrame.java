package budgetPackage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BudgetFrame extends JFrame{

	public BudgetFrame(JPanel thisPanel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to be altered later
        add(thisPanel);
        pack();
        setVisible(true);
	}
	
}
