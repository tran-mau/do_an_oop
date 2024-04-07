
package logic;

import dao.phongHopDao;
import model.phong_hop;

public class phongHoplg {
    private phongHopDao phonghopDao;

    public phongHoplg() {
        phonghopDao = new phongHopDao();
    }
    public void addPhong(phong_hop phong){
        phonghopDao.them(phong);
    }
    
}
