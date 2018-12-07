package budgetPackage;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.omg.CORBA.Environment;

public class BudgetFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public BudgetFrame(JPanel thisPanel) {
		//JFrame, contains the JPanel. That is all.
        add(thisPanel);
        pack();
        setVisible(true);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
                System.exit(1);
                // Note: JFrame.EXIT_ON_CLOSE stops ALL threads.  
                //When this function is phased out, alternate thread-terminating functions should be introduced
        	}
        });
	}
	
}
