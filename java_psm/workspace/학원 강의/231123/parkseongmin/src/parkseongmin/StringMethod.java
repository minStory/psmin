package parkseongmin;

public class StringMethod {
	public static void main(String[] args) {
		//String Ŭ����(java.lang) : charAt() �޼���
		//���ڿ��� �ϳ��� �ܾ� ������ ���
		String word = "1I2LOVE6YOU";
		//���ڿ����� ���ڸ� ã�� �����ϰ� ���ڸ� ���
		String text = "";
		//length() : ���ڿ� ���̸� ��ȯ, �ش� ���ڿ��� ���̸� ��ȯ�ϴ� �޼��带 ���ؼ� word����:11
		
		//�ƽ�Ű�ڵ带 �̿��� ����/���� �Ǻ�
		for(int i=0; i<word.length(); i++) {
			if(!((int)word.charAt(i)>=65 && (int)word.charAt(i)<=122)) {
				System.out.print("");
			}else{
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
		//Character.isDigit() : ����/���� �Ǻ� �Լ�
		for(int i=0; i<word.length(); i++) {
			if(!Character.isDigit(word.charAt(i))) {
				System.out.print(word.charAt(i));
			}
		}
		System.out.println();
		
		//indexOf() �޼��� : ���ڿ��� ������ �ܾ� �Ǵ� ���ڿ��� ��ġ�� �˻����� ��
		//��ġ�� �ε��� ���� ��ȯ
		String strIndex = "HelloWorld_MyWorld";
		
		//World ó�� �ε��� ��ȣ�� ��� ���۵Ǵ����� �˰���� ��
		System.out.println(strIndex.indexOf("World"));
		System.out.println(strIndex.lastIndexOf("World"));
		
		//replaceAll(���� ���, ������ �ܾ�) : �������� ������ �ܾ�� �����Ѵ�.
		String str = "�ڹ� ���α׷����� ������� �ڹٸ� ������ ����־��.";
		System.out.println(str.replaceAll("�ڹ�","java"));
		String newStr = str.replaceAll("�ڹ�","java");
		System.out.println(newStr);
		
		//substring() : ���ϴ� ��ġ�� ���ڿ��� �߶� ����ϴ� �޼���
		String subStr = "12345678";
		System.out.println(subStr.substring(5,8));
		String subStr_ = subStr.substring(0,3);
		System.out.println(subStr_);
		
		//split()
		String splitStr = "�ȳ�-�ϼ���";
		String[] arr = splitStr.split("-");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		//StringBuffer/StringBuilder ��� String�� �޼��� ��� ����
		
		//StringBuffer
		StringBuffer strBuffer = new StringBuffer("abc");
		System.out.println(strBuffer);
		StringBuffer strBuffer2 = strBuffer.append("zzz");
		System.out.println(strBuffer);
		strBuffer.insert(0,"���ۿ� �߰�");
		System.out.println(strBuffer);
		strBuffer.reverse();
		System.out.println(strBuffer);
		
		//StringBuilder
		StringBuilder strBuilder = new StringBuilder("ABC");
		System.out.println(strBuilder);
		StringBuilder strBuilder2 = strBuilder.append("ZZZ");
		System.out.println(strBuilder2);
		
		
	}
}














