package domein;

import persistentie.IPersistentieController;
import persistentie.PersistentieController;

public class LandService {

    private IPersistentieController pers;
    
    public LandService()
    {
        this(new PersistentieController());
    }
    
    public LandService(IPersistentieController pers){
        this.pers = pers;
    }
    
    public LandStatistiek geefLandStatistiek(String code) {
        if (code == null || code.trim().isEmpty()) {
            throw new IllegalArgumentException("code mag niet leeg zijn");
        }
        //PersistentieController persistentieController = new PersistentieController();
        Land land = pers.findLanden(code);
        if (land == null) {
            return null;
        }
        
        int oppervlakteAlleLanden = pers
                .findOppervlakteLanden();
        double verhouding = (double) (land.getOppervlakte())
                / oppervlakteAlleLanden;
        return new LandStatistiek(code, verhouding);
    }
}
