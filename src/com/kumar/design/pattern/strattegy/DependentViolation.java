package com.kumar.design.pattern.strattegy;

import java.math.BigDecimal;

public class DependentViolation implements Violation {
    @Override
    public BigDecimal applyViolation(BigDecimal violation) {
        return com.kumar.design.pattern.strattegy.ViolationAmount.DEPENDENT.getViolationAmount().add(violation);
    }
}
