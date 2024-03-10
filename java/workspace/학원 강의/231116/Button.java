package parkseongmin;

public class Button {	//외부클래스
	//내부적으로 인터페이스를 만든다.
	public static interface ClickListener{
		//추상메서드
		void onClick();
	}
	
	//다형성 객체를 주입받을 수 있는 변수를 만든다.
	private ClickListener clickListener;
	//객체를 주입하는 Setter 메서드
	public void setClickListener(ClickListener clickListener) {
		//나의 객체를 가지고 온다.
		this.clickListener=clickListener;
	}
	public void click() {
		this.clickListener.onClick();
	}
}
