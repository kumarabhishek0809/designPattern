package com.kumar.design.patter.strattegy;

import java.math.BigDecimal;

public class DependentViolation implements Violation {
    @Override
    public BigDecimal applyViolation(BigDecimal violation) {
        return ViolationAmount.DEPENDENT.getViolationAmount().add(violation);
    }
}
