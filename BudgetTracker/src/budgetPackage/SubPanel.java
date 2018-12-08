package budgetPackage;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class SubPanel extends JPanel{
	BudgetPercept percept;
	ArrayList<BudgetItem> BudgetList;
	
	
	public SubPanel(BudgetPercept p) {
		this.percept = p;
		this.setBorder(new EtchedBorder());
		//JScrollPane scrollPanel = new JScrollPane(this);
        //this.add(scrollPanel, BorderLayout.CENTER);//
        //scrollPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);//S
        //scrollPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	public void update() {
		this.BudgetList = percept.fetchBudget();
		if (BudgetList.size() != 0) {
			
		}
	}
	
	
}
