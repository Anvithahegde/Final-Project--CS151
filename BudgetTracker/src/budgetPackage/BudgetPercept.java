package budgetPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BudgetPercept {
	//This class interfaces between Budget and BudgetPanel, 
	//altering Budget according to user command and altering the UI to reflect the Budget status
	private BudgetPanel panel; //Panel and Percept have each other as properties, allowing them to easily use each other
    protected JTextArea commandArea; //This area is where commands are copied, and instructions are shown
    protected JTextArea budgetArea; //This area is where the budget is displayed
    protected int runStatus; //Current runtime status (0:just initialized,1:Budget set,-1:Error)
    protected Budget aBudget;

	public BudgetPercept(BudgetPanel panel1, JTextArea area1, JTextArea area2) {
		//constructor for BudgetPercept, copies key areas of BudgetPanel for later use
		this.panel = panel1;
		this.commandArea = area1;
		this.budgetArea = area2;
		commandArea.append("Please enter the name of the user\n");
		commandArea.append("> ");
		runStatus = 0;
		panel.updatePanel(commandArea, budgetArea); 
	}
	
	public void dataEntry(String text) {
		//When the buttonlistener on the Panel is triggered, text in the InputField is copied over here
		commandArea.append(text + "\n");
		if (runStatus == 0) {
			this.aBudget = new Budget(text);
			if (this.aBudget.fileExists == true) {
				commandArea.append("File loaded\n");
			}
			else {
				commandArea.append("File not found; creating new user\n");
			}
			runStatus++;
		}
		
		
		//TODO add command to update budgetArea
		commandArea.append("> ");
		panel.updatePanel(commandArea, budgetArea); 
		//this is effectively the "return" of dataEntry, updating the UI with current information
	}
	
	
	
}
