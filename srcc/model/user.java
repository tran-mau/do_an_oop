
package model;

public class user {
    private String user_name;
    private String ma_nhan_vien;
    private String so_dien_thoai;
    private String email;
    private String mat_khau;

    public user() {
    }

    public user(String user_name, String ma_nhan_vien, String so_dien_thoai, String email, String mat_khau) {
        this.user_name = user_name;
        this.ma_nhan_vien = ma_nhan_vien;
        this.so_dien_thoai = so_dien_thoai;
        this.email = email;
        this.mat_khau = mat_khau;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMa_nhan_vien() {
        return ma_nhan_vien;
    }

    public void setMa_nhan_vien(String ma_nhan_vien) {
        this.ma_nhan_vien = ma_nhan_vien;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }
    
    
}
