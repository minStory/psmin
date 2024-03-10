package day47;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class AddFrame extends JFrame {
	//기본 생성자
	AddFrame() {
		setTitle("JFrame");
		setSize(300, 300);
		
		//컴포넌트 객체 생성 (만들기)
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		JTextField tf=new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());	//컴포넌트 부착 방식 관리자 고용
		
		//컴포넌트 객체 추가
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		setVisible(true);

		setVisible(true);
		//프로그램 종료 기능을 닫기 버튼으로 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AddFrame();
	}

}
