
package model;

public class tai_khoan {
    private String user_name;
    private String mat_khau;

    public tai_khoan() {
    }

    public tai_khoan(String user_name, String mat_khau) {
        this.user_name = user_name;
        this.mat_khau = mat_khau;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }
    
    
}
