package solid.principles.math.calculator.basic;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solid.principles.math.calculator.Calculator;
import solid.principles.math.calculator.scientific.ScientificOperation;
import solid.principles.math.formatter.Formatter;
import solid.principles.math.formatter.JsonFormatter;
import solid.principles.math.printer.ConsolePrinter;
import solid.principles.math.printer.Printer;
import solid.principles.math.shape.Shape;
import solid.principles.math.shape.Square;

class BasicCalculatorTest {

  Formatter formatter;
  Printer printer;
  Calculator calculator;

  public static Shape[] getShapes2(int number) {
    Shape[] shapes = new Shape[number];
    for (int i = 0; i < number; i++) {
      shapes[i] = new Square(i + 2);
    }
    return shapes;
  }

  @BeforeEach
  void setUp() {
    formatter = new JsonFormatter();
    printer = new ConsolePrinter(formatter);
    calculator = new BasicCalculator(printer);

  }

  @AfterEach
  void tearDown() {
  }

  @Test
  void calculate() {
    Shape[] shapes = getShapes2(10);
    assertThrows(IllegalStateException.class,
        () -> calculator.calculate(ScientificOperation.EXPONENTIAL, new BasicInput(shapes)));
    assertDoesNotThrow(
        () -> calculator.calculate(BasicOperation.AREA_ADDITION, new BasicInput(shapes)));


  }


}