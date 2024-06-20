package solid.principles.math.formatter;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonFormatter implements Formatter<Object[], String> {

  static final Gson GSON = new Gson();

  @Override
  public String format(Object[] input) {
    return GSON.toJson(input);
  }
}
