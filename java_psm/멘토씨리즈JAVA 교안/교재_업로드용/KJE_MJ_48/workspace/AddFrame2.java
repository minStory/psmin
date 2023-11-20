package day48;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class Listener1 implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button =(JButton)e.getSource();//이벤트발생한 컴포넌트
		button.setText("버튼 클릭"); //버튼 문자열 재지정
	}} 
public class AddFrame2 extends JFrame{
	AddFrame2(){
		setTitle("JFrame");
		setSize(300,300);
		
		JButton button=new JButton("button");
		JCheckBox box = new JCheckBox("checkbox");
		JSlider slide = new JSlider();
		JTextField tf=new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);

		setVisible(true);
		//내 프로그램 닫는 기능을 닫기버튼으로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//버튼 컴포넌트에 액션이벤트 리스너 달기
		button.addActionListener(new Listener1());
		
	}
	public static void main(String[] args) {
		new AddFrame2();
	}
}
