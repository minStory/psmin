package day47;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class AddFrame extends JFrame {
	//�⺻ ������
	AddFrame() {
		setTitle("JFrame");
		setSize(300, 300);
		
		//������Ʈ ��ü ���� (�����)
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		JTextField tf=new JTextField("text �Է�",20);
		this.setLayout(new FlowLayout());	//������Ʈ ���� ��� ������ ���
		
		//������Ʈ ��ü �߰�
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		setVisible(true);

		setVisible(true);
		//���α׷� ���� ����� �ݱ� ��ư���� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AddFrame();
	}

}
