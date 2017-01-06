package testen;

import domein.Weegschaal;
import static domein.WeegschaalInit.MAX;
import static domein.WeegschaalInit.NAUWKEURIGHEID;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class WeegschaalTest {
    
    Weegschaal weegschaal;
    
    @Before
    public void before(){
        weegschaal = new Weegschaal();
    }
    
    @Test
    public void nieuweWeegschaalIsLeeg(){
        Assert.assertEquals(0, weegschaal.getLinks(),0);
        Assert.assertEquals(0, weegschaal.getRechts(),0);
        Assert.assertEquals(0, weegschaal.getVerschil(),0);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void negatiefGewichtLinks(){
        weegschaal.addLinks(-0.01);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void negatiefGewichtRechts(){
        weegschaal.addRechts(-0.01);
    }
    
    @Test
    public void testAddLinksAddRechtsEnMax(){
        weegschaal.addLinks(2.5);
        weegschaal.addRechts(3.0);
        weegschaal.addLinks(2.5);
        weegschaal.addRechts(2.0);
        
        Assert.assertEquals(MAX, weegschaal.getLinks(), NAUWKEURIGHEID);
        Assert.assertEquals(MAX, weegschaal.getRechts(),NAUWKEURIGHEID);
        Assert.assertEquals(0.0, weegschaal.getVerschil(), NAUWKEURIGHEID);
        
    }
}
