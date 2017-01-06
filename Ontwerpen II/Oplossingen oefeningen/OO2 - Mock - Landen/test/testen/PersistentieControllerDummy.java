/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testen;

import domein.Land;
import java.util.HashMap;
import java.util.Map;
import persistentie.IPersistentieController;

/**
 *
 * @author Robby
 */
public class PersistentieControllerDummy implements IPersistentieController{

    private final Map<String, Integer> oppervlakten;
    
    private Map<String, Land> landen;

    public PersistentieControllerDummy(Map<String, Integer> oppervlakten) {
        this.oppervlakten = oppervlakten;
        initLanden();
    }
    
    public PersistentieControllerDummy(){
    this(null);
            }
    
    private void initLanden(){
        landen = new HashMap<>();
        landen.put("GEEN_LAND", null);
        if (oppervlakten != null) {
            oppervlakten.forEach((key, value) -> landen.put(key, new Land(key, value)));
        }
    }
    
    
    
    @Override
    public int findOppervlakteLanden() {
        int totaal = oppervlakten.entrySet().stream().mapToInt(ol -> ol.getValue()).sum();
        return totaal;
    }

    @Override
    public Land findLanden(String code) {
        return landen.get(code);
    }
    
}
