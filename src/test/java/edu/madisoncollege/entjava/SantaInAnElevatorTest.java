package edu.madisoncollege.entjava;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by David on 9/14/16.
 */
public class SantaInAnElevatorTest {

    String line;
    SantaInAnElevator elevator = new SantaInAnElevator();

    private final Logger logger = Logger.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/David/IdeaProjects/santa-in-an-elevator-week-2-exercise-1-yangyaj/src/main/resources/SantaUpDown.txt"));
            logger.info("Starts reading file");
            while(reader.ready()){
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFile() {
        System.out.println(elevator.findSanta(line));
        assertEquals("Floors are not equal", 138, elevator.findSanta(line));
    }
}