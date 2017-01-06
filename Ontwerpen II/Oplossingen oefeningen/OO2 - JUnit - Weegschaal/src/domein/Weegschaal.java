package domein;

import static domein.WeegschaalInit.*;
import exception.BalansOverflowException;

public class Weegschaal {
    
    private double links;
    private double rechts;

    public double getRechts() {
        return rechts;
    }

    public double getLinks() {
        return links;
    }

    public void addLinks(double gewicht) {
        if (gewicht < 0) {
            throw new IllegalArgumentException("Negatief gewicht : " + gewicht);
        }
        
        if (links + gewicht> MAX + NAUWKEURIGHEID) {
            throw new BalansOverflowException("Links Overbelast : " + (links + gewicht));
        }
        links += gewicht;
    }

    public void addRechts(double gewicht) {
        if (gewicht < 0) {
            throw new IllegalArgumentException("Negatief gewicht : " + gewicht);
        }
        if (rechts + gewicht > MAX + NAUWKEURIGHEID) {
            throw new BalansOverflowException("Rechts Overbelast : " + (rechts + gewicht));
        }
        rechts += gewicht;
    }

    public double getVerschil() {
        return links - rechts;
    }
}