package com.kumar.design.patter.strattegy;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class StrategyPatternTest {

    @Test
    public void canTestViolation() {
        Violation individual = new IndividualViolation();
        Violation dependent = new DependentViolation();
        Assert.assertEquals(individual.applyViolation(BigDecimal.valueOf(100)),BigDecimal.valueOf(200));
        Assert.assertEquals(dependent.applyViolation(BigDecimal.valueOf(100)),BigDecimal.valueOf(300));

    }
}
