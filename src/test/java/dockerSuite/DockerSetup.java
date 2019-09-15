/**
 * 
 */
package dockerSuite;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Pranob Kalita
 * 15-Sep-2019
 */
public class DockerSetup {
	

	
	@BeforeTest
	public void startDockerGrid() throws IOException, InterruptedException {
		
		StringBuilder command = new StringBuilder("cmd /c start /wait docker-runner.bat");
		Runtime.getRuntime().exec(command.toString());
        Thread.sleep(15000);
		System.out.println("******** Docker environment Ready  ****************" +"\n");
		System.out.println("Execute Test Suites...!!!");
	}
	
	@AfterTest
	public void stopDockerGrid() throws InterruptedException, IOException {
		
		StringBuilder stopProcessCommand = new StringBuilder("cmd /c start /wait docker-stop.bat");
		StringBuilder killProcessCommand = new StringBuilder("taskkill /f /im cmd.exe");
		
		Runtime.getRuntime().exec(stopProcessCommand.toString());
		Thread.sleep(5000);
		System.out.println("\n"+"******** Docker environment Stopped  ****************" +"\n");
        //Runtime.getRuntime().exec(killProcessCommand.toString());
        //System.out.println("All Sessions killed successfully");
        
				
	}
	
	

}
