package com.kumar.design.pattern.strattegy;

import java.math.BigDecimal;

public enum ViolationAmount {
    INDIVIDUAL(BigDecimal.valueOf(100)), DEPENDENT(BigDecimal.valueOf(200));

    public BigDecimal getViolationAmount() {
        return violationAmount;
    }

    private BigDecimal violationAmount;

    ViolationAmount(BigDecimal violationAmount) {
        this.violationAmount = violationAmount;
    }
}
