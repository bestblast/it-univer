package lesson_02;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Win extends JFrame implements ActionListener{

	public static void main(String[] args) {
		Win w = new Win();
		w.setVisible(true);
	}
	private JButton but = new JButton("Button");
	private JButton but2 = new JButton("Other button");
	private Container cnt;

	public Win(){
		setBounds(50, 100, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setTitle("Hello");
		setExtendedState(NORMAL);		
		cnt = getContentPane();
		cnt.setLayout(null);
		cnt.add(but);
		cnt.add(but2);
		but.setBounds(10, 10, 100, 50); //расположение кнопки
//		cnt.setBackground(Color.MAGENTA);
//		but.setBackground(Color.YELLOW);
		but.addActionListener(this);
		but2.setBounds(120, 10, 100, 50);
		but2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if(src == but)
			cnt.setBackground(Color.BLUE);	
		else 
			cnt.setBackground(Color.RED);
	};
}
