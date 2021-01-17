package frc.robot;

import frc.robot.Robot;

import org.junit.*;
import static org.junit.Assert.*;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class RobotTests {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Robot testRobot;

    @Before
    public void setup() {
        System.setOut(new PrintStream(outputStreamCaptor));
        testRobot = new Robot();
    }

    @Test
    public void testRobotInitPrints() {
        testRobot.robotInit();

        assertEquals("Robot Has Initialized", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotPeriodicPrintsNumberOfCalls() {
        testRobot.robotPeriodic();
        assertEquals("1", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("2", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("3", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("4", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("5", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("6", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("7", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.robotPeriodic();
        assertEquals("8", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testAutonomousInitPrints() {
        testRobot.autonomousInit();
        assertEquals("Starting Autonomous", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testAutonomousPeriodicPrintsNumberOfCalls() {
        testRobot.autonomousInit();
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("1,1", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("1,2", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("1,3", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.autonomousInit();
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("2,1", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("2,2", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.autonomousPeriodic();
        assertEquals("2,3", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @Test
    public void testTeleopInitPrints() {
        testRobot.teleopInit();
        assertEquals("Starting Teleop", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testTeleopPeriodicPrintsNumberOfCalls() {
        testRobot.teleopInit();
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("1,1", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("1,2", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("1,3", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.teleopInit();
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("2,1", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("2,2", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
        testRobot.teleopPeriodic();
        assertEquals("2,3", outputStreamCaptor.toString().trim());
        outputStreamCaptor.reset();
    }

    @After
    public void tearDown() {
        System.setOut(standardOut);
    }

}
