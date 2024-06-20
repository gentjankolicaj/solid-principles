package solid.principles.nature.formatter;

public interface Formatter<I, O> {

  O format(I input);

}
