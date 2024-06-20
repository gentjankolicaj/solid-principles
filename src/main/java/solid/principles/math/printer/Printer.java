package solid.principles.math.printer;

import solid.principles.math.shape.Shape;

public interface Printer {

  void print(Shape... args);

  void print(Object... args);
}
