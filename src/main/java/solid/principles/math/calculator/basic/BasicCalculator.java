package solid.principles.math.calculator.basic;


import lombok.RequiredArgsConstructor;
import solid.principles.math.calculator.Calculator;
import solid.principles.math.calculator.Operation;
import solid.principles.math.printer.Printer;
import solid.principles.math.shape.Shape;
import solid.principles.math.shape.Shape2D;

@RequiredArgsConstructor
public class BasicCalculator implements Calculator<BasicInput, BasicOutput> {

  private final Printer printer;


  @Override
  public BasicOutput calculate(Operation operation, BasicInput basicInput) {
    if (!(operation instanceof BasicOperation)) {
      throw new IllegalStateException(String.format("Operation %s unknown", operation));
    }

    BasicOutput basicOutput = null;
    BasicOperation basicOperation = (BasicOperation) operation;
    if (basicOperation.equals(BasicOperation.ADDITION)
        || basicOperation.equals(BasicOperation.DIVISION)
        || basicOperation.equals(BasicOperation.MULTIPLICATION)
        || basicOperation.equals(BasicOperation.SUBTRACTION)) {
      throw new IllegalStateException(String.format("Operation %s unsupported ", operation));
    }

    if (basicOperation.equals(BasicOperation.AREA_ADDITION)) {
      double sum = 0;
      Shape[] shapes = basicInput.getShapes();
      for (Shape shape : shapes) {
        if (shape instanceof Shape2D) {
          sum += ((Shape2D) shape).getArea();
        } else {
          throw new IllegalStateException(
              String.format("Operation %s unsupported for shape %s ", operation, shape));
        }
      }
      basicOutput = new BasicOutput(operation, sum);
    }

    printer.print(basicInput, basicOutput);
    return basicOutput;
  }


}
