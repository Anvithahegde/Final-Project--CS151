package budgetPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class PopupFrame extends JFrame{

	
	public PopupFrame(Dimension d, Popup P) {
		this.setPreferredSize(d);
		this.add(P);
		this.setBackground(Color.BLACK);
		this.pack();
		this.setVisible(true);
        this.setResizable(true);
        this.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
        		System.exit(1);
        		// Note: JFrame.EXIT_ON_CLOSE stops ALL threads.  
                //When this function is phased out, alternate thread-terminating functions should be introduced
        	}
        });
	}
	
	
}
