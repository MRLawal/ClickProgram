package click.controller;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Clock;

public class ClickBot
{
	
	
	
	public void start() throws AWTException {
		boolean started = false;
		
		long startTime = System.currentTimeMillis();
		Robot bot = new Robot();
		
		int mask = InputEvent.BUTTON1_DOWN_MASK;
		/*for(int z = 0; z < 3; z++) {
			for(int x = 0; x < 2000; x ++) {
				for(int y = 0; y < 100; y++) {
					bot.mouseMove(x,y*z);
					//bot.mousePress(mask);
					//bot.mouseRelease(mask);
				}
			}
		}*/ 
		while(this.isRunning()) {
			if(System.currentTimeMillis() > startTime + 5000 || started) {
				
				if(System.currentTimeMillis() > startTime + 50) {
					bot.mousePress(mask);
					bot.mouseRelease(mask);
					started = true;
					startTime = System.currentTimeMillis();
				}
			}
		}
		
		
	}
	
	public boolean isRunning() {
		if(returnX() < 200) {
			return true;
		}
		return false;
		
	}
	
	public int returnX() {
		return 0;
		
	}
	
	public int returnY() {
		return 0;
		
	}
	
}
