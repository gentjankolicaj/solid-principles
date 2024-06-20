package solid.principles.math.printer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import solid.principles.math.formatter.Formatter;
import solid.principles.math.shape.Shape;

@Slf4j
@RequiredArgsConstructor
public class ConsolePrinter implements Printer {

  private final Formatter formatter;

  @Override
  public void print(Shape... args) {
    Object content = formatter.format(args);
    log.info("{}", content);
  }

  @Override
  public void print(Object... args) {
    Object content = formatter.format(args);
    log.info("{}", content);
  }
}
