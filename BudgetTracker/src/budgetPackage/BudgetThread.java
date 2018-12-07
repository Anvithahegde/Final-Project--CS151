package budgetPackage;

public class BudgetThread {

	//The purpose of this thread is to demonstrate multithreading
	public BudgetThread() {
		super();
	}
 
	public void run() {
		BudgetFrame mainPanel = new BudgetFrame(new BudgetPanel());
	}
	
	
}

