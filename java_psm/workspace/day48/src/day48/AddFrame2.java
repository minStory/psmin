package day48;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JTextField;

class Listener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button=(JButton)e.getSource();	//�̺�Ʈ�� �߻��� ������Ʈ
		button.setText("��ư�� Ŭ���ϼ̽��ϴ�.");	//��ư ���ڿ� ������
	}
}

public class AddFrame2 extends JFrame{
	AddFrame2(){
		setTitle("JFrame");
		setSize(300,300);
		
		//������Ʈ ��ü ����
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide= new JSlider();
		JTextField tf=new JTextField("text �Է�",20);
		this.setLayout(new FlowLayout());
		
		//������Ʈ ��ü �߰�
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		setVisible(true);
		//���α׷� �ݱ� ��ư ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ư ������Ʈ�� ���� ���� �׼��̺�Ʈ ������ �ޱ�
		button.addActionListener(new Listener1());
	}

	public static void main(String[] args) {
		new AddFrame2();
	}

}