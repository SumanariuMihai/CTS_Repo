package ro.ase.acs.csie.g1094.dp.command;

public class AsyncTask implements AsyndTaskInterface{

	String taskName;
	int priority;
	GameModuleInterface module;
	
	public AsyncTask(String taskName, int priority, GameModuleInterface module) {
		super();
		this.taskName = taskName;
		this.priority = priority;
		this.module = module;
	}



	@Override
	public void awaitTask() {
		this.module.doTask(taskName);
	}

}
