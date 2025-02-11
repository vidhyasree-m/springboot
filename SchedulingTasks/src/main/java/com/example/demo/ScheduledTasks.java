package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*@Component registers the class as a Spring-managed bean
 * Logger: Logs messages to the console
 * SimpleDateFormat: Formats dates into readable time strings
 */

@Component
public class ScheduledTasks {
	
	 private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
	    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	    @Scheduled(fixedRate = 5000)
	    public void reportCurrentTime() {
	        log.info("The time is now {}", dateFormat.format(new Date()));
	    }
	    /* @Scheduled(fixedRate = 5000)
	     * Executes reportCurrentTime() every 5000 milliseconds(5 seconds)
	     * fixedRate: Measures the interval from the start of each execution
	     * 
	     */
}
