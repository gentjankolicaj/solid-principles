package solid.principles.math.calculator.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import solid.principles.math.calculator.Operation;
import solid.principles.math.calculator.Output;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicOutput implements Output {

  Operation operation;
  Double result;

}
