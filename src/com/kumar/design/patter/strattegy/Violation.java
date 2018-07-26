package com.kumar.design.patter.strattegy;

import java.math.BigDecimal;

public interface Violation {
    BigDecimal applyViolation(BigDecimal violation);
}
