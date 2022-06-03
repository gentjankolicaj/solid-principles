package solid.principles.math;

import solid.principles.math.calculator.Calculator;
import solid.principles.math.calculator.basic.BasicCalculator;
import solid.principles.math.calculator.basic.BasicInput;
import solid.principles.math.calculator.basic.BasicOperation;
import solid.principles.math.calculator.basic.BasicOutput;
import solid.principles.math.formatter.Formatter;
import solid.principles.math.formatter.JsonFormatter;
import solid.principles.math.printer.ConsolePrinter;
import solid.principles.math.printer.Printer;
import solid.principles.math.shape.Shape;


public class Main {

    public static void main(String[] args){
        Formatter formatter=new JsonFormatter();
        Printer printer=new ConsolePrinter(formatter);
        Calculator calculator=new BasicCalculator(printer);

        //Get shapes
        Shape[] shapes=getShapes(7);

        //Calculate
        calculator.calculate(BasicOperation.ADDITION,new BasicInput(shapes));


    }


    public static Shape[] getShapes(int number){
        Shape[] shapes=new Shape[number];

        return shapes;
    }
}
