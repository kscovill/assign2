package s2e1;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Frame extends JPanel{

	private static int count = 0;

	public Frame(){

		//Initialize labels and textFields
        String labels[] = {
        		"First:             ",
        		"Last:           ",
        		"Town:           ",
        		"State:          ",
        		"Zip Code:     ",
        		"Address:    ",
        		"Job Status: "
        };
        JLabel label1 = new JLabel(labels[0]);
        JLabel label2 = new JLabel(labels[1]);
        JLabel label3 = new JLabel(labels[2]);
        JLabel label4 = new JLabel(labels[3]);
        JLabel label5 = new JLabel(labels[4]);
        JLabel label6 = new JLabel(labels[5]);
        JLabel label7 = new JLabel(labels[6]);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(10);
        JTextField textField4 = new JTextField(10);
        JTextField textField5 = new JTextField(10);
        JTextField textField6 = new JTextField(10);
        JTextField textField7 = new JTextField(10);
        
        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        
        
        // Initialize the JComboBox
        // found on StackOverFlow
        String[] employList = {
        		"Choose an employee...",
        		"John Doe",
        		"Jane Doe",
        		"Kyle Scovill",
        		"David Nielson"		
        };
        JComboBox box = new JComboBox(employList);
        box.setPreferredSize(new Dimension(390, 30));
        
        // Initialize the Jbuttons
        JButton button1 = new JButton("Gather Information");
        button1.setPreferredSize(new Dimension(300,40));
        JButton button2 = new JButton("Close");
        button2.setPreferredSize(new Dimension(80,40));
        JButton button3 = new JButton("Change ZIP");
        button3.setPreferredSize(new Dimension(190,40));
        // Add Components to this panel.
		
		 JFrame frame = new JFrame("Company Database");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	
		 //add components
		 frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,25));
		 frame.add(box);
		 frame.add(label1);
		 frame.add(textField1);
		 frame.add(label2);
		 frame.add(textField2);
		 frame.add(label3);
		 frame.add(textField3);
		 frame.add(label4);
		 frame.add(textField4);
		 frame.add(label5);
		 frame.add(textField5);
		 frame.add(label6);
		 frame.add(textField6);
		 frame.add(label7);
		 frame.add(textField7);
		 frame.add(button3);
		 frame.add(button1);
		 frame.add(button2);
		    
		 //display the window
		 frame.pack();
		 frame.setSize(410,360);
		 frame.setResizable(false);
		 frame.setLocationRelativeTo(null);
		 //frame.setMinimumSize(frame.setPreferredSize());
		 frame.setVisible(true);
		 
		 // adds a listener to the button to gather information
		 button1.addActionListener(
			new ActionListener() //adds a listener for when the button is pressed
			{
				@Override
				public void actionPerformed(ActionEvent event) // what happens after the yes is clicked
				{
						
					// Depending on the index selected
					// changes the textFields to display to corresponding information
					while(true){
						// found on StackOverFlow
						
						String[][] myArray = Main.getArray();
						int[] zipcode = Main.getZip();
						int[] e = {0};
						String textfield[] = {"","","","","","","",};
						int combo = box.getSelectedIndex();
						int rows = 4;
						int cols = 6;
						
						for (int i = 0; i < cols; i++) {
							
							for (int j = 0; j < rows; j++) {
								System.out.print(myArray[i][j] + ", ");
						    
							}
							System.out.println("");
						}
						
						
						if(combo == 0){
							textField1.setText("");
							textField2.setText("");
							textField3.setText("");
							textField4.setText("");
							textField5.setText("");
							textField6.setText("");
							textField7.setText("");
							JOptionPane.showMessageDialog(null, "PLEASE SELECT A VALID ENTRY...");
							return;
							
						}else{
							count = count +1;
							for (int i = 0; i < cols; i++) {
							
								for (int j = combo-1; j < combo; j++) {
									System.out.println(myArray[i][j]);
									textfield[i] = myArray[i][j];
									e[0] = zipcode[j];
						    
								}
							}
							
							// Set the textfields to equal the text from each employee
							String a = textfield[0];
							String b = textfield[1];
							String c = textfield[2];
							String d = textfield[3];
							
							String f = textfield[4];		
							String g = textfield[5];
							textField1.setText(a);
							textField2.setText(b);
							textField3.setText(c);
							textField4.setText(d);
							String e1 = Integer.toString(e[0]);
							textField5.setText(e1);
							textField6.setText(f);
							textField7.setText(g);
								
								 
							return;
						}
									
									
					} 
				}
			}
				
		);
		 
		//Add action listener to close JFrame and program
		button2.addActionListener(
			new ActionListener() //adds a listener for when the button is pressed
			{
				@Override
				public void actionPerformed(ActionEvent event) // what happens after the yes is clicked
				{
					JOptionPane.showMessageDialog(null, "You viewed " + count + " accounts in this session");
					System.exit(0);
				}
			}
		);

		//Add action listener to let the user change the zip
		 button3.addActionListener(
			new ActionListener() //adds a listener for when the button is pressed
			{
				@Override
				public void actionPerformed(ActionEvent event) // what happens after the yes is clicked
				{
					while(true){
						int combo = box.getSelectedIndex();
						if( combo == 0){
							JOptionPane.showMessageDialog(null, "PLEASE SELECT A VALID ENTRY...");
							return;
						}else{
							String newZip = JOptionPane.showInputDialog(null, "What would you like the ZIP Code to be?");
							if (newZip == null) { //  FROM STACKOVERFLOW
								// User canceled.
								break;
							}
							if(newZip.length() != 5){
								JOptionPane.showMessageDialog(null, "PLEASE ENTER A VALID 5 DIGIT ZIP CODE!");
							}else{
								textField5.setText(newZip);
								return;
							}
						}
					}
				}
			}
		);
		

	

	
	}
}
