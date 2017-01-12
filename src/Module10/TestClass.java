package Module10;

/**
 * Created by bulov on 09.01.2017.
 */
public class TestClass {
    public void testMethod(int i){
        if(i==0) throw new FirstException("FirstException");
        if(i<0) throw new SecondException("SecondException");
        if(i>0) throw new ThirdException("ThirdException");
    }
}

