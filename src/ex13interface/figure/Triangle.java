package ex13interface.figure;
/*
삼각형을 표현한 클래스(사각형과 동일함)
 */
public class Triangle extends FigureData implements IFigure,IDrawable {
	public Triangle(int width,int height) {
		super(width,height);
	}
	@Override
	public void draw(String figureName) {
		// TODO Auto-generated method stub
		System.out.println(figureName+"을그려봅니다잇");
	}
	@Override
	public void area(String figureName) {
		// TODO Auto-generated method stub
		System.out.println(figureName+"의 면적은 (가로*세로*0.5)"+(width*height*0.5));
	}
}
