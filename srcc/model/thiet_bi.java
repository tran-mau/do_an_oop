
package model;

public class thiet_bi {
    private String ten_thiet_bi;
    private int so_luong;
    private String trang_thai;
    private String xuat_xu;
    private int bao_hanh;

    public thiet_bi() {
    }

    public thiet_bi(String ten_thiet_bi, int so_luong, String trang_thai, String xuat_xu, int bao_hanh) {
        this.ten_thiet_bi = ten_thiet_bi;
        this.so_luong = so_luong;
        this.trang_thai = trang_thai;
        this.xuat_xu = xuat_xu;
        this.bao_hanh = bao_hanh;
    }

    public String getTen_thiet_bi() {
        return ten_thiet_bi;
    }

    public void setTen_thiet_bi(String ten_thiet_bi) {
        this.ten_thiet_bi = ten_thiet_bi;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    public String getXuat_xu() {
        return xuat_xu;
    }

    public void setXuat_xu(String xuat_xu) {
        this.xuat_xu = xuat_xu;
    }

    public int getBao_hanh() {
        return bao_hanh;
    }

    public void setBao_hanh(int bao_hanh) {
        this.bao_hanh = bao_hanh;
    }
    
    
}
