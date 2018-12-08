package budgetPackage;

import java.util.ArrayList;

public class BudgetPercept {
	int debugmode = 0;
	protected Budget aBudget;
	String username;
	
	public BudgetPercept() {
		if (debugmode == 0) {
			Popup login = new Login();
			login.setPointer(this);
		}
		else if (debugmode == 1) {
			Popup panelTest = new MainPanel();
		}
	}
	
	public void userEntry(String name) {
		username = name;
		aBudget = new Budget(name);
		System.out.println(username);
		Popup panelTest = new MainPanel();
		panelTest.setPointer(this);
	}
	
	
	
	public void saveData() {
		
	}
	
	public ArrayList<BudgetItem> fetchBudget(){
		return aBudget.BudgetList;
	}
	
	
}
