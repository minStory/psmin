package day_0601;

public class Test07 {

	public static void main(String[] args) {
		Card c1=new Card();
		Card c2=new Card("HEART",10);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
class Card{
	String kind;
	int num;
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind,int num){
		this.kind=kind;
		this.num=num;
	}
	
	public String toString() {
		return "kind : "+kind+", number : "+num;
	}
}