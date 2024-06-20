package solid.principles.math.formatter;

public interface Formatter<I, O> {

  O format(I input);

}
