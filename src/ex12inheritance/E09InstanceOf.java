package ex12inheritance;
/*
 * instanceod 연산자
 * 			:인스턴스 변수가 어떤 타입의 변수인지를 판단하는 연산자로
 * 형변환(즉 상속관계가 있으면)이 가능하면 true,아니면 false를 반환한다.
 * 객체간의 형변환이 되려면 반드시 두클래스 간에 상속관계가 잇어야한다. 
 * 부모클래스의 참조변수로 자식 객체를 참좔수 있으므로 매개변수로 전달된 인자가 어떤
 * 타입이니 확인할때 주로 사용된다.
 */
class Box{
	public void boxWrap() {
		System.out.println("Box로 포장합니다");
	}
}
class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("paperBox로 포장합니다");
	}
}
class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다");
	}
}

public class E09InstanceOf {
	static void wrapBox(Box b) {
		int num1=(int)1.0;
		double num2=1;
		
		if(b instanceof GoldPaperBox) {
			((GoldPaperBox)b).goldWrap();
		}
		else if(b instanceof PaperBox) {
			((PaperBox)b).paperWrap();
		}
		else if (b instanceof Box) {
			b.boxWrap();
		}
	}

	public static void main(String[] args) {
			Box box1=new Box();
			PaperBox box2=new PaperBox();
			GoldPaperBox box3=new GoldPaperBox();
			
			wrapBox(box1);
			wrapBox(box2);
			wrapBox(box3);
			
			String str=new String("나눈누구");
			//wrapBox(str);
	}

}
