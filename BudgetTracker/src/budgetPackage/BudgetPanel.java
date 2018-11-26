package budgetPackage;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BudgetPanel extends JPanel{

	private BudgetPercept percept; //Panel and Percept have each other as properties, allowing them to easily use each other
	protected JTextField inputField; //This field is where commands are entered
    protected JTextArea commandArea; //This area is where commands are copied, and instructions are shown
    protected JTextArea budgetArea; //This area is where the budget is displayed
    protected JButton inputButton;
    
	public BudgetPanel() {
		//constructor for the JPanel. 
		//(this will be overhauled at a later time)
		super(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		inputField = new JTextField(20);
        commandArea = new JTextArea(25, 20); 
        commandArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(commandArea);
        budgetArea = new JTextArea(25, 20); 
        budgetArea.setEditable(false);
        JScrollPane scrollPane2 = new JScrollPane(budgetArea);
        inputButton = new JButton("Add");
        inputButton.setBounds(10, 80, 80, 25);
        inputButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) { 
        		String text = inputField.getText();
        		percept.dataEntry(text);
        	}
        });
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        add(budgetArea, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        add(commandArea, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        add(inputField, c);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        add(inputButton, c);
        this.percept = new BudgetPercept(this, this.commandArea, this.budgetArea);
        
	}
	
	public void updatePanel(JTextArea area1, JTextArea area2) {
		//this command exists so that BudgetPercept can update the UI
	    this.commandArea = area1; 
	    this.budgetArea = area2; 
	}
}
