
import java.util.jar.Attributes;


public abstract class Duck {
    private  QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior; 

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    
    
    
    public String performQuack()
    {
        return quackBehavior.quack();
    }
    
    public String performFly(){
        return flyBehavior.fly();
    }
    
    public String swim(){
        return "Swimming in the pool";
    }
    
    public String display(){
        return "eend";
    }
    
    public void ANDERE_eend_achtige_methoden(){
        
    }
}
