package solid.principles.math.shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Square implements Shape2D {

  private double a;

  @Override
  public Double getArea() {
    return a * a;
  }

  @Override
  public Double getPerimeter() {
    return 4 * a;
  }
}
