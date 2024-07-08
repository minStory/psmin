package day45;

import java.io.*;

public class File01 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis=null;		//�Է½�Ʈ��
		FileOutputStream fos=null;		//��½�Ʈ��
		fis=new FileInputStream("prac.txt");		//�׻� �����ϴ� ���ϰ� ����
		fos=new FileOutputStream("result.txt");		//�������� ������ ���� ����, �����ϸ� ���� �����
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		int data;
		while((data=fis.read())!=-1) {
			//������ ���� �����ϱ� ���� data�� ����
			//data�� �о�� ����Ʈ�� �����ϴµ�, data�� ���� -1�� �ƴҶ� ���� �ݺ�
			//-1 : EOF(End of File)
			bos.write(data);
		}
		//���ϰ��� ������ �ݴ� �۾�
		bos.close();
		bis.close();
		
	}

}