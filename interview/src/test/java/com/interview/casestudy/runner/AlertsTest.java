/**
 * 
 */
package com.interview.casestudy.runner;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * AlertsTest tests load the file 
 * @author Jingyu ZHANG
 *
 */
public class AlertsTest {
	private Alerts alerts;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// load alerts
		alerts = new Alerts("alerts.json");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link com.interview.casestudy.runner.Alerts#readAlert()}.
	 */
	@Test
	public void testGetAlerts() {
		assertNotNull("The alerts file was loaded.",alerts.getAlerts());

	}

}
