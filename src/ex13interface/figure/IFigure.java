package ex13interface.figure;
/*
인터페이스(클래스)하나당 자바파일 하나를 만드는것을 추천함 왜냐면
pbulic class는 하나만생성가능함 하나의클래스에서
 */
//인자로 전달되는 도형의 넓이를 구하는 추상메소드 
public interface IFigure {
	void area(String figureName);

}
