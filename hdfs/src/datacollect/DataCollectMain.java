package datacollect;

import java.util.Timer;

public class DataCollectMain {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new CollectTask(), 0L, 60*60*1000L);
		
		
	}

}