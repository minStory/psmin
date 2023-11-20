package day_0519;

public class Text09 {

	public static void main(String[] args) {
		Hogarden b=new Hogarden("»£∞°µÁ","π–∏∆¡÷",5,"øπ¿œ","∑π∏Û∏¿");
		System.out.println(b.name+" "+b.kind+" "+b.alchole+" "+b.type+" "+b.taste);
		Hogarden b2=new Hogarden("«œ¿Ã≥◊ƒÀ");
		System.out.println(b2.name+" "+b2.kind+" "+b2.alchole+" "+b2.type+" "+b2.taste);
		Hogarden b3=new Hogarden();
		System.out.println(b3.name+" "+b3.kind+" "+b3.alchole+" "+b3.type+" "+b3.taste);
	}
}

class Beer{
	String name;
	String kind;
	int alchole;
	void drink() {
		System.out.println("∏∆¡÷∏∂Ω√±‚");
	}
	void mix() {
		System.out.println("º“¡÷+∏∆¡÷");
		System.out.println("æÁ¡÷+∏∆¡÷");
	}
}
class Hogarden extends Beer{
	String type;
	String taste;
	Hogarden(String name, String kind, int alchole, String type, String taste){
		this.name=name;
		this.kind=kind;
		this.alchole=alchole;
		this.type=type;
		this.taste=taste;
	}
	Hogarden(String n){
		this(n,"k",4,"t","ta");
		this.name=n;
		this.taste="good";
	}
	Hogarden(){
	}
	
}