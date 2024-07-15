package org.opcode.service.Operators;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class SetOperator implements Operator{
    private Character registerCharacter;
    private Integer value;
    public SetOperator(Character registerCharacter, String value) {
        this.registerCharacter = registerCharacter;
        this.value = Integer.parseInt(value);
    }

    @Override
    public void execute(RegisterState registerState) {
        Register register = new Register(this.registerCharacter);
        register.setValue(this.value);
        registerState.addRegister(register);
    }

}
