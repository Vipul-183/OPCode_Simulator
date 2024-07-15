package org.opcode.service.Operators;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;

public class AddRegisterOperator implements Operator {
    private Character firstRegisCharacter;
    private Character secondCharacter;
    public AddRegisterOperator(Character firstRegisCharacter, Character secondCharacter) {
        this.firstRegisCharacter = firstRegisCharacter;
        this.secondCharacter = secondCharacter;
    }

    @Override
    public void execute(RegisterState registerState) {
        Register register1 = registerState.getRegister(firstRegisCharacter);
        Register register2 = registerState.getRegister(secondCharacter);
        register1.setValue(register2.getValue() + register1.getValue());
        registerState.updateValue(register1);
    }
}
