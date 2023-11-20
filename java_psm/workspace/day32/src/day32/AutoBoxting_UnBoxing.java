package day32;

public class AutoBoxting_UnBoxing {

	public static void main(String[] args) {
		//Autoboxing
		Integer i=10;	//Integer i=new Integer(10);
		Double d=3.14;	//Double d=new Double(3.14);
		Float f=3.14f;	//Float f=new Float(3.14f);
		Character c='A';	//Character c=new Character('A');
		
		//AutoUnboxing
		int ii=i;
		double dd=d;
		float ff=f;
		char cc=c;
		System.out.println(ii);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
	}
}
