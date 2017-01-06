package persistentie;

import domein.Land;

public class PersistentieController implements IPersistentieController{

    private LandMapper landMapper;



    @Override
    public int findOppervlakteLanden() {
        if (landMapper == null) {
            landMapper = new LandMapper();
        }
        return landMapper.findOppervlakteAlleLanden();
    }

    @Override
    public Land findLanden(String code) {
        if (landMapper == null) {
            landMapper = new LandMapper();
        }
        return landMapper.findLand(code);
    }

}
