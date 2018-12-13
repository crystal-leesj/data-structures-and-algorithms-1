package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidationTest_True() {
        String str = "{}{Code}[Fellows](())";
        Boolean expected=MultiBracketValidation.multiBracketValidation(str);
        assertTrue("return true", expected);
    }

    @Test
    public void multiBracketValidation_Empty() {
        String str = "";
        Boolean expected=MultiBracketValidation.multiBracketValidation(str);
        assertTrue("return true", expected);
    }
}