package pl.coi.test;

import org.junit.Assert;
import org.junit.Test;


public class MainTest {

    private InputData getInputData(final double val1, final double val2, final Main.Operation op) {
        return new InputData() {
            Boolean first = true;

            public double getDouble(String messgae) {
                if (first) {
                    first = false;
                    return val1;
                }
                return val2;
            }

            public Main.Operation getOperation() {
                return op;
            }
        };
    }

    @Test
    public void TestOperationAdd() {

        Main main = new Main();
        InputData inputData = getInputData(3.0, 3.0, Main.Operation.ADD);
        main.setInputData(inputData);

        double ret = main.run();
        Assert.assertEquals(ret, 6, 0);
    }

    @Test
    public void TestOperationSub() {

        Main main = new Main();
        InputData inputData = getInputData(3.0, 3.0, Main.Operation.SUB);
        main.setInputData(inputData);
        double ret = main.run();
        Assert.assertEquals(ret, 0, 0);
    }

    @Test
    public void TestOperationMux() {

        Main main = new Main();
        InputData inputData = getInputData(3.0, 3.0, Main.Operation.MUX);
        main.setInputData(inputData);
        double ret = main.run();
        Assert.assertEquals(ret, 9, 0);
    }

    @Test
    public void TestOperationDiv() {

        Main main = new Main();
        InputData inputData = getInputData(3.0, 3.0, Main.Operation.DIV);
        main.setInputData(inputData);
        double ret = main.run();
        Assert.assertEquals(ret, 1, 0);
    }


    @Test
    public void testAdd() {
        Main main = new Main();
        double d1 = new Double(3.0);
        double d2 = new Double(4.0);
        double result = main.add(d1, d2);
        Assert.assertEquals(result, 7.0, 0);
    }

    @Test
    public void testSub() {
        Main main = new Main();
        double d1 = new Double(4.0);
        double d2 = new Double(3.0);
        double result = main.sub(d1, d2);
        Assert.assertEquals(result, 1.0, 0);
    }

    @Test
    public void testMux() {
        Main main = new Main();
        double d1 = new Double(4.0);
        double d2 = new Double(3.0);
        double result = main.mux(d1, d2);
        Assert.assertEquals(result, 12.0, 0);
    }

    @Test
    public void testDiv() {
        Main main = new Main();
        double d1 = new Double(6.0);
        double d2 = new Double(3.0);
        double result = main.div(d1, d2);
        Assert.assertEquals(result, 2.0, 0);
    }


}
