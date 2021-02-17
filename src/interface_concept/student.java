package interface_concept;



public class student implements  name{ // if I am inheriting any interface , we will use implements keyword instead extends

	@Override
	public void add() {
		System.out.println("aaaaa");
		
	}
	
	public static void main(String[] args) {
		student g =  new student();
		g.add();
	}

}
