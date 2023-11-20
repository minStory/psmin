package day48;

import java.awt.event.*;

import javax.swing.*;

//class MenuActionListener implements ActionListener{
//	@Override
//	public void actionPerformed(ActionEvent e) {
//			JOptionPane.showMessageDialog(null, "�˾�"); //������ �˸�â
//	}}

public class MenuTest extends JFrame{
	MenuTest(){
		setTitle("Menu �����");
		createMenu();
		setSize(250,200);
		setVisible(true);		
	}
	public void createMenu() {
		//�޴��� ����
		JMenuBar mb = new JMenuBar();
		//�޴� ����
		JMenu screenMenu = new JMenu("�޴���1");
		
		//�޴��� ������ ������ ����
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator(); //���м�
		screenMenu.add(new JMenuItem("Exit"));
		//�޴������� ��ü ���� �޴��� ���̱�
		JMenuItem item = new JMenuItem("�˾�");
		item.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "�˾�"); //������ �˸�â
	}});
		screenMenu.add(item);
		
		//�޴��ٿ� �޴� ����
		mb.add(screenMenu);		
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		mb.add(new JMenu("����"));
		
		//�޴��ٸ� ���� �������� �޴��� ����
		setJMenuBar(mb);
	
	}
	public static void main(String[] args) {
			new MenuTest();
	}

}
