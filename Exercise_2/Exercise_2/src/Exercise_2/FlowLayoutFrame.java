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
	
	public FlowLayoutFrame()
	{
		super ("Question");
		
		layout = new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		// set up Yes Button and register listener
		YesJButton = new JButton("Yes");
		add(YesJButton);
		YesJButton.addActionListener(
				new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent event)
					{
						YesNo = true;
						
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
					YesNo = false;
				}
			}
		);
		
		
	}
	
}
