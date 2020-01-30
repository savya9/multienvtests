import config.Enviornments;
import org.testng.annotations.*;

import java.util.Properties;

public class CalculatorTests extends Enviornments {
    Calculator cal=new Calculator();
   // String env;
    Properties prop;
    //public Calculator cal;

    /**
     * Before test.
     *
     * @param env this value environment.
     */
    //@Parameters({"env"})

    public CalculatorTests(){
        super();
    }
    @BeforeClass(alwaysRun = true)
    public void beforeTest() {
        prop=readPropData();
        String enviornment=prop.getProperty("env");
        String url=prop.getProperty("url");
        System.out.println("Enviornment is"+enviornment);
        System.out.println("Url is:"+url);

        }


@Test
public void calAddNumberTests(){
    //cal=new Calculator();
    int sum=cal.addNumbers(10,20);
    System.out.println(sum);
}

    @Test
    public void calSubNumberTests(){

        int sub=cal.subNumbers(20,10);
        System.out.println(sub);
    }
}
