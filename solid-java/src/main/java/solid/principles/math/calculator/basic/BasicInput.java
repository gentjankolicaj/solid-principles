package solid.principles.math.calculator.basic;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import solid.principles.math.calculator.Input;
import solid.principles.math.shape.Shape;

@RequiredArgsConstructor
public class BasicInput implements Input {
    private Shape[] shapes;

    public BasicInput(Shape[] shapes) {
    }
}
