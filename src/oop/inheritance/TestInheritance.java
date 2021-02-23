package oop.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Children child1 = new Children();
		child1.atheletic();
		child1.hairColor();
		child1.height();
		child1.education();
		
		GrandParent grandParent = new GrandParent();
		grandParent.education();

	}

}
