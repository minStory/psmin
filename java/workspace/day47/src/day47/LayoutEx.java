package day47;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutEx {

	public static void main(String[] args) {
//		new FlowWindow();
//		new BorderWindow();
		new GridWindow();
	}
}
class FlowWindow extends JFrame{
	FlowWindow(){
		setTitle("flow window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn1=new JButton("btn1");
		JButton btn2=new JButton("btn2");
		JButton btn3=new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(new FlowLayout());
		
		setVisible(true);
	}
}
class BorderWindow extends JFrame{
	BorderWindow(){
		setTitle("flow window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1=new JButton("btn1");
		JButton btn2=new JButton("btn2");
		JButton btn3=new JButton("btn3");
		JButton btn4=new JButton("btn3");
		JButton btn5=new JButton("btn3");
		
		//동서남북중앙 위치 지정
		this.setLayout(new BorderLayout());
		this.add(btn1,BorderLayout.EAST);
		this.add(btn2,BorderLayout.WEST);
		this.add(btn3,BorderLayout.SOUTH);
		this.add(btn4,BorderLayout.NORTH);
		this.add(btn5,BorderLayout.CENTER);
		
		setVisible(true);
	}
}
class GridWindow extends JFrame{
	GridWindow(){
		setTitle("flow window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1=new JButton("btn1");
		JButton btn2=new JButton("btn2");
		JButton btn3=new JButton("btn3");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		//격자 개수 설정, 그냥 사용 가능
		this.setLayout(new GridLayout(2,2));
		
		setVisible(true);
	}
}