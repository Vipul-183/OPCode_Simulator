package org.opcode.service;

import org.opcode.service.Operators.AddOperator;
import org.opcode.service.Operators.AddRegisterOperator;
import org.opcode.service.Operators.DecrementOperator;
import org.opcode.service.Operators.IncrementOperator;
import org.opcode.service.Operators.MoveOperator;
import org.opcode.service.Operators.Operator;
import org.opcode.service.Operators.ResetOperator;
import org.opcode.service.Operators.SetOperator;

public class OperatorFactory {
    
    public static Operator getOperator(String instruction) {
        String[] parts = instruction.split(" ");
        switch (parts[0]) {
            case "SET":
                return new SetOperator(parts[1].charAt(0), parts[2]);
            case "ADR":
                return new AddRegisterOperator(parts[1].charAt(0), parts[2].charAt(0));
            case "ADD":
                return new AddOperator(parts[1].charAt(0), parts[2]);
            case "MOV":
                return new MoveOperator(parts[1].charAt(0), parts[2].charAt(0));
            case "INR":
                return new IncrementOperator(parts[1].charAt(0));
            case "DCR":
                return new DecrementOperator(parts[1].charAt(0));
            case "RST":
                return new ResetOperator();
            default:
                return null;
        }
    }
}
