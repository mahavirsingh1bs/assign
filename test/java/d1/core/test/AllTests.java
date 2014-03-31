package d1.core.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests extends TestSuite {
    public static Test suite() {
	TestSuite suite = new TestSuite();
	suite.addTestSuite(SimpleTest.class);
	//suite.addTestSuite(LessSimpleTest.class);
	return suite;
    }
}
