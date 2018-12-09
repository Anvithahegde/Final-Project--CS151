package budgetPackage;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;


public class Categories{

    private static final long serialVersionUID = 1L;

    public Categories() {
        JFrame frame = new JFrame("Budget Tracker");  // Setting title of the JFrame
        frame.setVisible(true);                          // Setting visibility of the JFrame
        frame.setBounds(200,100,700,600 );    // Setting location and size of the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c= frame.getContentPane();   // Creating an object of the Container class
        c.setLayout(null);    // Setting layout as null
        c.setBackground(Color.orange);


        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu expenselimit = new JMenu("Expense Limit");
        menuBar.add(expenselimit);

        JMenuItem menuItem = new JMenuItem("Set");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                JLabel date_label=new JLabel();
                Font f=new Font("Arial",Font.BOLD,20);
                date_label.setBounds(100,5,200,40);
                date_label.setText("Set");
                date_label.setFont(f);
                c.add(date_label);

            }
        });
        expenselimit.add(menuItem);

        JMenuItem menuI = new JMenuItem("View");
        menuI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("View");
            }
        });
        expenselimit.add(menuI);
        JMenuItem menuIt = new JMenuItem("Exit");
        menuIt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        expenselimit.add(menuIt);

        JMenu categories = new JMenu("Create Expense");
        menuBar.add(categories);

        JMenuItem menuItem1 = new JMenuItem("Utility Bills");
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Utility Bills:");
            }
        });
        categories.add(menuItem1);

        JMenuItem menuItem2 = new JMenuItem("Food");
        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Food:");
            }
        });
        categories.add(menuItem2);

        JMenuItem menuItem3 = new JMenuItem("Cleaning");
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cleaning:");
            }
        });
        categories.add(menuItem3);

        JMenuItem menuItem4 = new JMenuItem("Transport");
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Transport:");
            }
        });
        categories.add(menuItem4);
        JMenuItem menuItem5 = new JMenuItem("Miscellaneous");
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Miscellaneous:");
            }
        });
        categories.add(menuItem5);

        JMenuItem menuItem6 = new JMenuItem("Exit");
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        categories.add(menuItem6);

        JMenu NewMenu = new JMenu("View Expense");
        menuBar.add(NewMenu);
        JMenuItem nmmenuItem1 = new JMenuItem("Utility Bills");
        menuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Utility Bills:");
            }
        });
        NewMenu.add(nmmenuItem1);

        JMenuItem nmmenuItem2 = new JMenuItem("Food");
        menuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Food:");
            }
        });
        NewMenu.add(nmmenuItem2);

        JMenuItem nmmenuItem3 = new JMenuItem("Cleaning");
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cleaning:");
            }
        });
        NewMenu.add(nmmenuItem3);

        JMenuItem nmmenuItem4 = new JMenuItem("Transport");
        menuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Transport:");
            }
        });
        NewMenu.add(nmmenuItem4);

        JMenuItem nmmenuItem5 = new JMenuItem("Miscellaneous");
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Miscellaneous:");
            }
        });
        NewMenu.add(nmmenuItem5);

        JMenuItem nmmenuItem6 = new JMenuItem("Exit");
        menuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        NewMenu.add(nmmenuItem6);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Categories();

    }

}
