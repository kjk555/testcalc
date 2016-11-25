package pl.coi.test;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InputDataTest {

    InputData inputData = new InputData();

    @Test
    public void testGetDouble() {
        InputStream stdin = System.in;
        byte[] byteArray = "1\t1\t1\t".getBytes();
        System.setIn(new ByteArrayInputStream(byteArray));
        double aDouble = inputData.getDouble("");
        System.setIn(stdin);
        Assert.assertEquals(aDouble,1,0);
    }


}
