package ex08class;

class ChildProperty {
	
	int marbles;
	
	
	public ChildProperty (int marbles) {
		
		this.marbles=marbles;
	}
	
	public void showProperty() {
		
		System.out.println(marbles);
		
	}
	
	public int obtainBead (ChildProperty child, int marbles) {
			
		ChildProperty child1=child;
		child1.marbles+=marbles;
		ChildProperty child2=child;
		child2.marbles-=marbles;
		
		
		
		
		return marbles;
		

		
		
		
		
		
		
	}
	
	
	
}

public class QuMarbles {

	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);

		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty(); 

		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);

		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);

		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty(); 
		System.out.print("어린이2 : ");
		child2.showProperty();


	}

}
