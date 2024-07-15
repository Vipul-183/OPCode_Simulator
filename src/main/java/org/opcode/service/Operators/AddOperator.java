package org.opcode.service.Operators;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class AddOperator implements Operator {
    private Character registerCharacter;
    private Integer value;
    public AddOperator(Character registerCharacter, String value) {
        this.registerCharacter = registerCharacter;
        this.value = Integer.parseInt(value);
    }

    @Override
    public void execute(RegisterState registerState) {
        Register register = registerState.getRegister(this.registerCharacter);
        register.setValue(this.value + register.getValue());
        registerState.updateValue(register);
    }
}
