
package test;

import dao.phongHopDao;
import model.phong_hop;

public class testPhongDao {
    public static void main(String[] args) {
        phong_hop ph1=new phong_hop("123","dang mo",100,"xanh");
        phong_hop ph2 = new phong_hop("234", "dang dong", 120, "do");

        phongHopDao.getInstance().them(ph1);
        phongHopDao.getInstance().them(ph2);
    }
}
