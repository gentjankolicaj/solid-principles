package solid.principles.math.calculator;

public interface Calculator<I extends Input, O extends Output> {

  O calculate(Operation operation, I i);

}
