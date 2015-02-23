package lesson_12;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class Win2 extends JFrame implements ActionListener{

	private String addzero(int x) {
		return (x<10)?"0"+x:""+x;
	}
	private int c;
	JButton b1 = new JButton("cycle");
	JTextField fl = new JTextField();
	JLabel lab = new JLabel("Catalog");
	Timer tm = new Timer(1000,this);
	

	public static void main(String[] args) {
		new Win2();
		
	}
	
	Container cnt;
	
	public Win2(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(10, 10, 500, 400);
		cnt = getContentPane();
		setVisible(true);
		cnt.setLayout(null); //disable component manager
		cnt.add(b1);
		b1.setBounds(10, 50, 80, 30);
		b1.addActionListener(this);
		lab.setBounds(10, 90, 80, 30);
		fl.setBounds(90, 90, 80, 30);
		cnt.add(fl);
		cnt.add(lab);
		fl.setText("/home/");
		tm.start();		
		
	}
	@Override
	public void actionPerformed(ActionEvent a) {
		Object src = a.getSource();
		if (src==b1) {
			MyThread mt = new MyThread(this);
			mt.start();
	
		} else if (src==tm){
//			setTitle(getTitle() + ".");
			GregorianCalendar gc = new GregorianCalendar();
			int h = gc.get(Calendar.HOUR);
			int m = gc.get(Calendar.MINUTE);
			int s = gc.get(Calendar.SECOND);
//			setTitle(h+":"+ m + ":" + s);
			setTitle(addzero(h)+":"+ addzero(m) + ":" + addzero(s));
			Color col = new Color(c,c,c);
			c++;
			cnt.setBackground(col);
			if (c==255)
				c=0;
		}
	}
}
