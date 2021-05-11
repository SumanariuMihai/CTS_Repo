package ro.ase.acs.csie.g1094.dp.chain;

public class PrivateChat extends ChatHandler{

	
	
	@Override
	public void processMessage(Message msg) {
		if(!msg.destination.toLowerCase().equals("@everyone")) {
			System.out.println("Private Message For "+msg.destination + ": "+msg.text);
		}
		else
		{
			if(this.next!=null)
				this.next.processMessage(msg);
		}
	}

}
