package solid.principles.math.calculator.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import solid.principles.math.calculator.Input;
import solid.principles.math.shape.Shape;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BasicInput implements Input {

  private Shape[] shapes;


}
