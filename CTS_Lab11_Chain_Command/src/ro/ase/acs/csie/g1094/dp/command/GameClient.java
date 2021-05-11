package ro.ase.acs.csie.g1094.dp.command;

import java.util.ArrayList;

public class GameClient {

	ArrayList<AsyndTaskInterface> tasks=new ArrayList<>();
	
	public void addTask(AsyndTaskInterface task) {
		this.tasks.add(task);
	}
	
	public void executeTask() {
		if(tasks.size()>0) {
			AsyndTaskInterface task=this.tasks.get(0);
			if(task!=null) {
				task.awaitTask();
				this.tasks.remove(0);
			}
		}
			
	}
}
