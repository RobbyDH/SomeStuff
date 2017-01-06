/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robby
 */
public class BowlingGameTest {
    
    private BowlingGame game;
    
    @Before 
    public void before(){
        game = new BowlingGame();
    }
    
    @Test
    public void testAllZeros()
    {
        rollMany(20, 0);
        Assert.assertEquals(0, game.score());
    }
    
    @Test
    public void testAllOnes(){
        rollMany(20, 1);
        Assert.assertEquals(20, game.score());      
    }
    
    @Test
    public void testOneSpare(){
        rollspare();
        game.roll(3);
        rollMany(17, 0);
        Assert.assertEquals(16, game.score());
    }
    
    @Test
    public void testOneStrike(){
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        Assert.assertEquals(24, game.score());
    }
    
    @Test
    public void testAllStrikes(){
        for(int i =0; i<12; i++)
            rollStrike();
        Assert.assertEquals(300, game.score());
    }
    
    @Test
    public void testAllSpares_5_5(){
        for(int i =0; i<10; i++)
            rollspare();
        game.roll(5);
        Assert.assertEquals(150, game.score());
    }
    
    @Test
    public void testScenario(){
        int[] pins = {1,4,4,5,6,4,5,5,10,0,1,7,3,6,4,10,2,8,6};
        for(int i=0; i<pins.length;i++)
            game.roll(pins[i]);
        Assert.assertEquals(133, game.score());
    }
    

    private void rollMany(int n, int pins)
    {
        for(int i =0; i<n; i++)
            game.roll(pins);
    }
    
    private void rollspare(){
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }
}
