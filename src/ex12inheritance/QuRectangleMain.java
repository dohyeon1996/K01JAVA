package ex12inheritance;


//직사각형을 표현한 클래스
class Rectangle
{		
     	//블라블라
		static int selo;
		static int galo;
		
	public Rectangle(int selo ,int galo) {
			this.selo=selo;
			this.galo=galo;
		}
	void ShowAreaInfo () {
		int area= selo*galo;
		System.out.println("직사각형 넓이"+area);
	}
} 
//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle
{	
		int myeon1;
	
	
	public Square(int myeon1) {
		super(selo, galo);
		this.myeon1=myeon1;
	}

	void ShowAreaInfo() {
		int area=myeon1*myeon1;
		System.out.println("정사각형넓이"+area);
	}
     	//블라블라
} 
class QuRectangleMain
{
	public static void main(String[] args)
	{
     	Rectangle rec = new Rectangle(4, 3);
     	rec.ShowAreaInfo();

     	Square sqr = new Square(7);
     	sqr.ShowAreaInfo();
 	}
}
