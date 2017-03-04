package theGame;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//AUDIO THAT PLAYS WHEN YOU PRESS THE MORON TEST BUTTON
class MyTimerTask extends TimerTask {
  
	public void run() {
		{
         try
		{
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("resources/ScoutMisc05.wav"));
	    Clip clip = AudioSystem.getClip();
	    clip.open(audioInputStream);
	    clip.start();				    					    
		}
		catch(Exception ex)
		{
		ex.printStackTrace( );
		}
	}
  }
}



// TIMER
public class MoronTest {
  public static void death() {
    MyTimerTask myTask = new MyTimerTask();
    Timer myTimer = new Timer();

    
    myTimer.schedule(myTask, 50, 5000);
    	try 
        {
   		Thread.sleep(4500);
        } 
    	catch (InterruptedException exc) {
        }

   myTimer.cancel();
   System.exit(0);
  }
}