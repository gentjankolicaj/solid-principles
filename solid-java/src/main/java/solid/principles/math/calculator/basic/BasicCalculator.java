package solid.principles.math.calculator.basic;


import lombok.RequiredArgsConstructor;
import solid.principles.math.calculator.Calculator;
import solid.principles.math.calculator.Input;
import solid.principles.math.calculator.Operation;
import solid.principles.math.calculator.Output;
import solid.principles.math.printer.Printer;

@RequiredArgsConstructor
public class BasicCalculator implements Calculator {
    private final Printer printer;


    @Override
    public Output calculate(Operation operation,Input input) {
        return null;
    }
}
