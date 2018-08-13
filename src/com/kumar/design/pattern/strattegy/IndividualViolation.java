package com.kumar.design.pattern.strattegy;

import java.math.BigDecimal;

public class IndividualViolation implements Violation {
    @Override
    public BigDecimal applyViolation(BigDecimal violation) {
        return ViolationAmount.INDIVIDUAL.getViolationAmount().add(violation);
    }
}
