package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class FindingMaximumTest {

    @Test
    public void maximumNumber_at_firstPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Integer max = findingMaximum.analyzeMaximum( 40,20,30 );
        Assert.assertEquals(40,(int)max);
    }

    @Test
    public void maximumNumber_at_secondPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Integer max = findingMaximum.analyzeMaximum( 10,40,30 );
        Assert.assertEquals(40,(int)max);
    }

    @Test
    public void maximumNumber_at_thirdPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Integer max = findingMaximum.analyzeMaximum( 10,20,30 );
        Assert.assertEquals(30,(int)max);
    }

    @Test
    public void maximumFloat_at_firstPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Double max = findingMaximum.analyzeFloatMax(4.2,2.5,3.8);
        Assert.assertEquals((Double) 4.2,(Double)max);
    }

    @Test
    public void maximumFloat_at_secondPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Double max = findingMaximum.analyzeFloatMax(4.2,5.2,3.8);
        Assert.assertEquals((Double) 5.2,(Double)max);
    }

    @Test
    public void maximumFloat_at_thirdPosition() {
        FindingMaximum findingMaximum = new FindingMaximum();
        Double max = findingMaximum.analyzeFloatMax(4.2,2.5,7.8);
        Assert.assertEquals((Double) 7.8,(Double)max);
    }
}




