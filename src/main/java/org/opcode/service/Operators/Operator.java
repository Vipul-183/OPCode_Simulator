package org.opcode.service.Operators;

import org.opcode.model.RegisterState;

public interface Operator {
    void execute(RegisterState registerState);
}
