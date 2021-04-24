package ex08class;

class Triangle {
	int min;
	int hight;
	
	void init(int min,int hight) {
		this.hight=hight;
		this.min=min;
	}
	double getArea() {
		double c=min*hight*0.5;
		return c;
	}
	void setBottom(int min) {
		this.min=min;
	}
	void setHeight(int hight) {
		this.hight=hight;
	}
	
}


public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());


	}

}
