package budgetPackage;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BudgetFrame extends JFrame{

	public BudgetFrame(JPanel thisPanel) {
		//Thiswas used by BudgetPanel. It is not currently in use
        add(thisPanel);
        pack();
        setVisible(true);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
                System.exit(1);
        	}
        });
	}
	
}
