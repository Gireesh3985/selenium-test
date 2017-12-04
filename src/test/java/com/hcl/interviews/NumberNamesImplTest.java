package com.hcl.interviews;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumberNamesImplTest extends TestCase {
	
	private NumberNamesImpl numberNames;
	private long input;
	private String theExpectedOutput;

	protected void setUp() throws Exception {
		super.setUp();
		numberNames = new NumberNamesImpl();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testNameForSmallNumber() {
		input = 43112609;
		theExpectedOutput = "fourty-three million, one hundred twelve thousand, six hundred nine";
        Assert.assertEquals(theExpectedOutput, numberNames.int2Text(input));
	}
	
	public void testNameForNegativeNumber() {
		input = -55;
		theExpectedOutput = "negative fifty-five";
        Assert.assertEquals(theExpectedOutput, numberNames.int2Text(input));
	}
	
	public void testNameForBigNumber() {
		input = 1020000000;
		theExpectedOutput = "one billion, twenty million";
        Assert.assertEquals(theExpectedOutput, numberNames.int2Text(input));
	}

}
