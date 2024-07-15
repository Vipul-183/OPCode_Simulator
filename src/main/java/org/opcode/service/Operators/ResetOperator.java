package org.opcode.service.Operators;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class ResetOperator implements Operator{
    @Override
    public void execute(RegisterState registerState) {
        registerState.reset();
    }
}
