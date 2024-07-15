package org.opcode.service.Operators;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class IncrementOperator implements Operator {
    private Character registerCharacter;
    private Integer value = 1;
    public IncrementOperator(Character registerCharacter) {
        this.registerCharacter = registerCharacter;
    }

    @Override
    public void execute(RegisterState registerState) {
        Register register = registerState.getRegister(this.registerCharacter);
        register.setValue(register.getValue() + value);
        registerState.updateValue(register);
    }
}
