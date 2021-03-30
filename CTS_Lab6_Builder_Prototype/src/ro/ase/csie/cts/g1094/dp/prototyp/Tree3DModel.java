package ro.ase.csie.cts.g1094.dp.prototyp;

import java.util.ArrayList;
import java.util.Random;


public class Tree3DModel {
	
	String color;
	int height;
	
	ArrayList<Integer> points=new ArrayList<>();
	
	public Tree3DModel(String color,int height) {
		this.color=color;
		this.height=height;
		
		System.out.println("Loading the 3D Model...");
		try {
			Thread.sleep(2000);
			Random random=new Random(1000);
			for(int i=0;i<20;i++) {
				this.points.add(random.nextInt(100));
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Model Loaded");
	}
	
	private Tree3DModel() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Tree3DModel copy=new Tree3DModel();
		copy.color=this.color;
		copy.height=this.height;
		copy.points=this.points;
		return copy;
		
	}
	
	
}
