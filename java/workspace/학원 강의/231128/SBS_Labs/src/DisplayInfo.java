import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DisplayInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFilename = "twograde.csv"; //csv ������ �д� ����ּ� �������� �����Ѵ�.
		//��� ���: src ���
		//������:  C:\\ ������ ��θ� �����Ѵ�.


		try { //�Ϲݿ���ó�� try-catch ������ ���

			//BufferedReader �̿��Ͽ� 2�г�.csv �ҷ��´�.
			Reader reader = new InputStreamReader(new FileInputStream(strFilename),"euc-kr");
			BufferedReader br = new BufferedReader(reader);

			try {
				//���� ��ü������ �о� �������� ������ �� ������ �ľ��Ѵ�.
				String strTemp;
				int nLine = 0;
				while((strTemp = br.readLine())!=null) {
					nLine++;
				}
				br.close();
				reader.close();

				int nStudent = nLine-1; //�л���
				//GIS �迭 [] ��ü�� �л��� ��ŭ �����Ѵ�.
				GIS[] oneStudent = new GIS[nStudent];

				//Scanner Ŭ������ �̿��Ͽ� 2�г�.csv ������ �ٽ� �н��ϴ�.
				FileInputStream fin = new FileInputStream(strFilename);
				Scanner scanner = new Scanner(fin);
				strTemp = scanner.nextLine(); //���� �κ��� �׳� �а� �������� �����Ѵ�.

				//�����ڸ� �޸�(.)�� �����ϰ� �� �� �а� �� ���� ������ �迭�� �����մϴ�.
				String csvSplitBy = ",";
				String[] strLineArray;

				//������ �ٽ� �о� GIS [] �迭 ��ü ��ҿ� �а�, �г�, �й�, ����, ��������, �̸����� �Ҵ��Ѵ�.

				for(int i=0; i<nStudent; i++) {

					if(scanner.hasNextLine())
					{
						//�а� �г� �й� ���� �������� �̸���
						strTemp = scanner.nextLine();
						strLineArray = strTemp.split(csvSplitBy);

						String strDepartment = strLineArray[0];
						String nGrade = strLineArray[1];
						String strId = strLineArray[2];
						String strName = strLineArray[3];
						String strAddress = strLineArray[4];
						String strEmail = strLineArray[5];

						//��ü�迭�� ���
						oneStudent[i] = new GIS(nGrade,strId,strName,strAddress,strEmail);
						oneStudent[i].SetDepartment(strDepartment);

					}

				}

				//��Ʈ���� �ݴ´�.
				scanner.close();
				fin.close();

				System.out.format("%s\t\t %s\t %s\t\t %s\t %s\t\t %s\n","�а�","�г�","�й�","�̸�","��������","�̸���");
				System.out.format("------------------------------------------------------------------------------------------------");
				System.out.println(); //ù��°���� �����ٿ� ���ü� �ֵ��� �ڵ� ����
				//for-each ���� �̿��Ͽ� ������ ����غ���.
				for(GIS obj : oneStudent) {
					obj.Display();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//GIS[] �迭 ��ü�� ����ִ� for-each����� display ����Լ��� �̿��Ͽ� ����Ѵ�.

	}

}
