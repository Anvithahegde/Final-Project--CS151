package budgetPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BudgetPerceptOld {
	/**This class interfaces between Budget and BudgetPanel,
	 * altering Budget according to user command and altering the UI to reflect the Budget status
	 */
	private BudgetPanel panel; //Panel and Percept have each other as properties, allowing them to easily use each other
    protected JTextArea commandArea; //This area is where commands are copied, and instructions are shown
    protected JTextArea budgetArea; //This area is where the budget is displayed
    protected int runStatus; //Current runtime status (0:just initialized,1:Budget set,-1:Error)
    protected Budget aBudget;
    private String nameToBe; //perspective name of a new BudgetItem, mid-declaration
    private Double valueToBe; //perspective value of a new BudgetItem, mid-declaration

	public BudgetPerceptOld(BudgetPanel panel1, JTextArea area1, JTextArea area2) {
		/**
		 * 
		 */
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
		if (text.contains("abort") && runStatus != 0) {
			//-exit is a command to set runStatus to one
			commandArea.append("Abort successful\n");
			runStatus = 1;
		}
		if (runStatus == 0) { //Entering the name of the Budget
			this.aBudget = new Budget(text);
			if (this.aBudget.fileExists == true) {
				commandArea.append("File loaded\n");
			}
			else {
				commandArea.append("File not found; creating new user\n");
			}
			runStatus++;
		}
		else if (runStatus == 1){ //Entering a command
			//if( text.toLowerCase().contains("command")){
			if( text.toLowerCase().contains("index")){
				//this is the index of commands
				
			}
			if(text.toLowerCase().contains("new item")){
				commandArea.append("Enter the name of the new item\n");
				runStatus = 2;
			}
			if(text.toLowerCase().contains("remove item")){
				commandArea.append("Enter the name of the item to remove\n");
				runStatus = 4;
			}
			if(text.toLowerCase().contains("debugitemcheck")){
				aBudget.debugCheck();
			}
			if(text.toLowerCase().contains("overload")){
				//For testing scrollbar functionality
				commandArea.append("REEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
				commandArea.append("EEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\nEEEEEEEEEEEEEEEEEEEEEEE\n");
			}
			if(text.toLowerCase().contains("quit")){
				//exit the application
				System.exit(1);
			}
		}
		else if (runStatus == 2) {  //Entering name of a new budget item
			//entering a new budget item - name
			nameToBe = text;
			commandArea.append("Enter the value of the new item\n");
			runStatus = 3;
		}
		else if (runStatus == 3) { //entering the value of a new budget item
			try{
				valueToBe = Double.valueOf(text).doubleValue();
				aBudget.newItem(nameToBe, valueToBe);
				commandArea.append("Item successfully added\n");
				runStatus = 1;
			}
			catch (NumberFormatException nfe){
				commandArea.append("Invalid value detected.\nPlease enter the value again\n");
			}
		}
		else if (runStatus == 4) {
			int i = aBudget.removeByName(text);
			if (i == 1) {
				commandArea.append("Item successfully removed\n");
			}
			else if (i == -1) {
				commandArea.append("Item not found, please re-enter item name\nOr enter abort to exit\n");
			}
			else {
				commandArea.append("Error: aBudget removal\n");
			}
			
		}
		if (runStatus == 1) {
			commandArea.append("Please enter a command\n(or enter 'index' for list of commands)\n");
		}
		//TODO add command to update budgetArea
		commandArea.append("> ");
		panel.updatePanel(commandArea, budgetArea); 
		//this is effectively the "return" of dataEntry, updating the UI with current information
	}
	
	
}
