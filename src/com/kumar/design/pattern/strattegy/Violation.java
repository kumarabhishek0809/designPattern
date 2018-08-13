package com.kumar.design.pattern.strattegy;

import java.math.BigDecimal;

public interface Violation {
    BigDecimal applyViolation(BigDecimal violation);
}
