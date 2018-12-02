package budgetPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class BudgetPanel extends JPanel{


	private static final long serialVersionUID = -5363951776747612107L;
	private BudgetPercept percept; //Panel and Precept have each other as properties, allowing them to easily use each other
	protected JTextField inputField; //This field is where commands are entered
    protected JTextArea commandArea; //This area is where commands are copied, and instructions are shown
    protected JTextArea budgetArea; //This area is where the budget is displayed
    protected JButton inputButton;
    private JPanel commandWrapper;
    private JPanel budgetWrapper;
    
	public BudgetPanel() {
		
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(gridbag);

        inputField = new JTextField(20);
        c.fill = GridBagConstraints.HORIZONTAL;	
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        gridbag.setConstraints(inputField, c);
        add(inputField, c);
		
//		commandArea = new JTextArea(25, 20); 		
//        JScrollPane scrollPane = new JScrollPane(commandArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //not integrated (TODO)
//        commandArea.setEditable(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        //gridbag.setConstraints(commandArea,c);
        setCommandArea();
        add(commandWrapper, c);
        //add(scrollPane, c);
        
//        budgetArea = new JTextArea(25, 20); 
//        JScrollPane scrollPane2 = new JScrollPane(budgetArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); //not integrated (TODO)
//        budgetArea.setEditable(false);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        setBudgetArea();
        add(budgetWrapper, c);
        //add(scrollPane2, c);
        
        inputButton = new JButton("Add");
        inputButton.setBounds(10, 80, 80, 25);
        inputButton.addActionListener(buttonListener);
        //getRootPane().setDefaultButton(inputButton);
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
	    //updateSize(this.commandArea);
	    this.budgetArea = area2; 
	}
	
	public ActionListener buttonListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String text = inputField.getText();
			if (text != ""){
				percept.dataEntry(text);
			}
    		inputField.setText("");
		}
	};

	private void setCommandArea() {
		this.commandArea = new JTextArea(25, 20); 
		commandArea.setEditable(false);
		this.commandWrapper = new JPanel();
		Border commandB = new EtchedBorder();
		commandWrapper.setSize(new Dimension(25,20));
		commandWrapper.setBorder(commandB);
		JScrollPane scrollPanel = new JScrollPane(commandArea);
        commandWrapper.add(scrollPanel, BorderLayout.CENTER);//
        scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//S
        scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//SCROLLBAR_ALWAYS)SCROLLBAR_ALWAYS
		return; 
	}
	private void setBudgetArea() {
		this.budgetArea = new JTextArea(25, 20); 
		budgetArea.setEditable(false);
		this.budgetWrapper = new JPanel();
		Border budgetB = new EtchedBorder();
		budgetWrapper.setSize(new Dimension(25,20));
		budgetWrapper.setBorder(budgetB);
		JScrollPane scrollPanel2 = new JScrollPane(budgetArea);
        budgetWrapper.add(scrollPanel2 , BorderLayout.CENTER);
        scrollPanel2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//
        scrollPanel2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);//
		return; 
	}
	
}
