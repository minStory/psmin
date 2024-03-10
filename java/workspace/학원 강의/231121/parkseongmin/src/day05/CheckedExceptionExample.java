package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		//�Ϲ� ���� : ����� ����(üũ�� ��Ȳ�� �������̴�)
		BufferedReader reader = null;
		try {
			//����� �ڵ�� ����ó���� �Ϲ� ���� ó��
			reader=new BufferedReader(new FileReader("example.txt"));			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//finally : ����ڰ� ���� ���� try-catch
			//reader ����� ���۰� �ִ� ��� ���۸� �ݴ´�.
			//reader ����� ���۰� ���� ���� �ٽ� �����ڵ�� �߻����Ѽ� Ȯ���Ѵ�.
			try {
				if(reader!=null) {
					reader.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
