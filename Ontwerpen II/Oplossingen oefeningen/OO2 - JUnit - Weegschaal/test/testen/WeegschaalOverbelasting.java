package testen;

import domein.Weegschaal;
import exception.BalansOverflowException;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class WeegschaalOverbelasting {
    
    Weegschaal weegschaal;
    
    private final static Double[] gewichten1 = {0.0, 5.01},
            gewichten2 = {0.5, 2.0, 1.0, 0.9, 0.05, 0.60},
            gewichten3 = {2.12, 1.1, 1.8};
    
    private Double[] gewichten;
    
    public WeegschaalOverbelasting(Double[] gewichten)
    {
        this.gewichten = gewichten;
    }
    
    @Before
    public void before(){
        weegschaal = new Weegschaal();
    }
    
    @Parameters
    public static Collection<Object[]> getTestParameters()
    {
        return Arrays.asList(new Object[][]{ {gewichten1},
            {gewichten2},
            {gewichten3}
        });
    }
    
    @Test (expected = BalansOverflowException.class)
    public void testOverflowLinks()
    {
        Arrays.stream(gewichten).forEach(gewicht -> weegschaal.addLinks(gewicht));
    }
    
    @Test (expected = BalansOverflowException.class)
    public void testOverflowRechts()
    {
        Arrays.stream(gewichten).forEach(gewicht -> weegschaal.addRechts(gewicht));
    }
    
}
