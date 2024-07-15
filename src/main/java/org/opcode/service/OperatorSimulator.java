package org.opcode.service;

import java.util.ArrayList;
import java.util.List;

import org.opcode.model.Register;
import org.opcode.model.RegisterState;
import org.opcode.service.Operators.Operator;

public class OperatorSimulator implements OpcodeSimulator {
    
    @Override
    public RegisterState execute(List<String> instructions) {
        List<Register> registers = new ArrayList<>();
        RegisterState registerState = new RegisterState(registers);
        for (String instruction: instructions) {
            Operator operator = OperatorFactory.getOperator(instruction);
            operator.execute(registerState);
        }
        return registerState;
    }
}
