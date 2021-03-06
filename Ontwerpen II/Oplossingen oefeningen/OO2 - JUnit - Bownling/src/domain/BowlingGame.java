/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Robby
 */
public class BowlingGame {
    
    
    private int rolls[] = new int[21];
    private int currentRoll = 0;
    
    public void roll(int pins){
        rolls[currentRoll++] = pins;
    }
    
    public int score(){
        int score = 0; 
        for (int frameIndex=0, frame = 0;  
                frame < 10; frameIndex +=2, frame++)  
            
            if(isStrike(frameIndex)) //Strike
            {
                score += 10 + strikeBonus(frameIndex);
                frameIndex--;
            }
            
            else if (isSpare(frameIndex))  //Spare
                               
                score += 10 + spareBonus(frameIndex);  
            else      
                score += sumOfPinsInFrame(frameIndex);
        return score;
                        
    }
    
    private boolean isSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex +1] == 10;
    }
    
    private boolean isStrike(int frameIndex){
        return rolls[frameIndex] == 10;
    }
    
    private int sumOfPinsInFrame(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
    
    private int spareBonus(int frameIndex){
        return rolls[frameIndex + 2];
    }
    
    private int strikeBonus(int frameIndex){
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }
}
