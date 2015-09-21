// Jframe to ask if the user is happy with their password
// found in Fig 12.39 on page 522
package Exercise_2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FlowLayoutFrame extends JFrame
{
	private final JButton YesJButton; //button to say yes
	private final JButton NoJButton; // button to say no
	private final FlowLayout layout; // layout object
	private final Container container; // container to set layout
	private final JTextArea textArea;
	private JButton DoneButton;

	
	public FlowLayoutFrame()
	{
		super ("Question"); // sets the title
		textArea = new JTextArea(10,15); //sets location of the text box
		textArea.setSize(200,50);
		textArea.setText("  Do you like your password?");
		textArea.setEnabled(true);
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		add(textArea);
		
		// set up Yes Button and register listener
		YesJButton = new JButton("Yes");
		add(YesJButton);
		YesJButton.addActionListener(
				new ActionListener() //adds a listener for when the button is pressed
				{
					@Override
					public void actionPerformed(ActionEvent event)
					{
						YesJButton.setVisible(false);
						NoJButton.setVisible(false);
						textArea.setText("Thank you for using this program.");
						DoneButton = new JButton("Done"); //sets up a done button to close the program at the end
						add(DoneButton);
						DoneButton.addActionListener(
								new ActionListener()
								{
									@Override
									public void actionPerformed(ActionEvent event)
									{
										try{Thread.sleep(1000);} 
										catch(Exception e){};
										
										System.exit(0);
									}
								}
							);
						
						layout.layoutContainer(container);
						

						
						
					}
				}
		);
	
		//setup the no button
		NoJButton = new JButton("No");
		add(NoJButton);
		NoJButton.addActionListener(
			new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent event)
				{
					YesJButton.setVisible(false);
					NoJButton.setVisible(false);
					textArea.setText(" Sorry about that, you can rerun \n      the program to try again.");
					DoneButton = new JButton("Done");
					add(DoneButton);
					DoneButton.addActionListener(
							new ActionListener()
							{
								@Override
								public void actionPerformed(ActionEvent event)
								{
									try{Thread.sleep(1000);} 
									catch(Exception e){};
									
									System.exit(0);
								}
							}
						);
					layout.layoutContainer(container);
					
				
				}
			}
		);
		
		
	}
	
}
