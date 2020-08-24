import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;


class BackEndSimpleCalcTest{
    @Mock
    BackEndSimpleCalc bean=new BackEndSimpleCalc();
    @Test
    void getSolution() {
        String input = "2×3";
        String expResult = "6.0";
        String result = bean.getSolution(input);
        assertEquals(expResult, result);
    }
}