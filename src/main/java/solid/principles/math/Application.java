package solid.principles.math;

import lombok.extern.slf4j.Slf4j;
import solid.principles.math.calculator.Calculator;
import solid.principles.math.calculator.basic.BasicCalculator;
import solid.principles.math.calculator.basic.BasicInput;
import solid.principles.math.calculator.basic.BasicOperation;
import solid.principles.math.formatter.Formatter;
import solid.principles.math.formatter.JsonFormatter;
import solid.principles.math.printer.ConsolePrinter;
import solid.principles.math.printer.Printer;
import solid.principles.math.shape.Cube;
import solid.principles.math.shape.Shape;
import solid.principles.math.shape.Shape3D;
import solid.principles.math.shape.Sphere;
import solid.principles.math.shape.Square;


@Slf4j
public class Application {

  public static void main(String[] args) {
    Formatter formatter = new JsonFormatter();
    Printer printer = new ConsolePrinter(formatter);
    Calculator calculator = new BasicCalculator(printer);

    //Get shapes
    Shape[] shapes1 = getShapes1(7);
    Shape[] shapes2 = getShapes2(17);

    //Calculate
    try {
      calculator.calculate(BasicOperation.AREA_ADDITION, new BasicInput(shapes1));
    } catch (RuntimeException re) {
      log.error("Cause '{}' message '{}'", re.getCause(), re.getMessage());
    }
    calculator.calculate(BasicOperation.AREA_ADDITION, new BasicInput(shapes2));
  }


  public static Shape[] getShapes1(int number) {
    Shape[] shapes = new Shape[number];
    Shape3D cube = new Cube();
    Shape3D sphere = new Sphere();
    shapes[0] = cube;
    shapes[1] = sphere;

    for (int i = 2; i < number; i++) {
      shapes[i] = new Square(i + 2);
    }
    return shapes;
  }

  public static Shape[] getShapes2(int number) {
    Shape[] shapes = new Shape[number];
    for (int i = 0; i < number; i++) {
      shapes[i] = new Square(i + 2);
    }
    return shapes;
  }
}
