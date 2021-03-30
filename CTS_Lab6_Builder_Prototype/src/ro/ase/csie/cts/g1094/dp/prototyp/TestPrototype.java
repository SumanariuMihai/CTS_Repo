package ro.ase.csie.cts.g1094.dp.prototyp;

public class TestPrototype {
	
	public static void main(String[] args) {

		Tree3DModel tree1=new Tree3DModel("green", 100);
		//Tree3DModel tree2=new Tree3DModel("green", 100);
		
		Tree3DModel anotherTree=tree1; //shallow copy
		
		
		//deep copies
		try {
			Tree3DModel tree2=(Tree3DModel)tree1.clone();
			Tree3DModel tree3=(Tree3DModel)tree1.clone();
			Tree3DModel tree4=(Tree3DModel)tree1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		
		
	}
}
