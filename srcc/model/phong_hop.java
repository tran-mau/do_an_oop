
package model;

public class phong_hop {
    private String ma_phong;
    private String trang_thai;
    private int kich_thuoc;
    private String mau_sac;

    public phong_hop() {
    }

    public phong_hop(String ma_phong, String trang_thai, int kich_thuoc, String mau_sac) {
        this.ma_phong = ma_phong;
        this.trang_thai = trang_thai;
        this.kich_thuoc = kich_thuoc;
        this.mau_sac = mau_sac;
    }

    public String getMa_phong() {
        return ma_phong;
    }

    public void setMa_phong(String ma_phong) {
        this.ma_phong = ma_phong;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    public int getKich_thuoc() {
        return kich_thuoc;
    }

    public void setKich_thuoc(int kich_thuoc) {
        this.kich_thuoc = kich_thuoc;
    }

    public String getMau_sac() {
        return mau_sac;
    }

    public void setMau_sac(String mau_sac) {
        this.mau_sac = mau_sac;
    }
    
    
}
