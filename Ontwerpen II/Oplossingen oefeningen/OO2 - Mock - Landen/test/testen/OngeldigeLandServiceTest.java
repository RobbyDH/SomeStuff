/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testen;

import domein.LandService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Robby
 */
public class OngeldigeLandServiceTest {
    private LandService landService;
    
    private static final String CODE_GEEN_LAND = "Geen_land";
    
    @Before
    public void before()
    {
        landService = new LandService(new PersistentieControllerDummy());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void legeCode(String code) {
        landService.geefLandStatistiek("");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void landBestaatNiet() {
        Assert.assertNull(landService.geefLandStatistiek(CODE_GEEN_LAND));
    }
}
