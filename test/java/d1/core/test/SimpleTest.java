package d1.core.test;

import junit.framework.TestCase;
import d1.core.Event;

public class SimpleTest extends TestCase {
    public SimpleTest(String s) {
	super(s);
    }

    public void testCreation() {
	Event event = new Event();
	assertNotNull(event);
    }
}
