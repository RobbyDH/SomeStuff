/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testen;

import domein.LandService;
import domein.LandStatistiek;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Robby
 */

@RunWith(Parameterized.class)
public class GeldigeLandServiceTest {
    
    private String landCode;
    private double verwachteResultaat;
    private LandService landService;

    public GeldigeLandServiceTest(String landCode, double verwachteResultaat) {
        this.landCode = landCode;
        this.verwachteResultaat = verwachteResultaat;
    }
    
        private static final Map<String, Integer> simulatieGegevensDatabank = new HashMap<String, Integer>() {
        {
            put("BE", 10);
            put("NL", 22);
            put("DE", 78);
        }
    };

    @Before
    public void before(){
        landService = new LandService(new PersistentieControllerDummy(simulatieGegevensDatabank));
    }
    
    @Parameters
    public static Collection<Object[]> getTestParameters(){
        return Arrays.asList(new Object[][]{
            {"BE", 0.1}, {"NL", 0.2}, {"DE", 0.7} 
        });
    }
    
    @Test
    public void testSenario(){
        LandStatistiek stat = landService.geefLandStatistiek(landCode);
        
        Assert.assertEquals(landCode, stat.getLandCode());
        Assert.assertEquals(verwachteResultaat, stat.getVerhouding(), 0.01);
    }
}
