
package dao;

import database.jdbcConections;
import java.util.ArrayList;
import model.phong_hop;
import java.sql.Connection;
import java.sql.Statement;

public class phongHopDao implements DaoInterface<phong_hop>{
    
        public static phongHopDao getInstance(){
        return new phongHopDao();
        }
    
    @Override
    public int them(phong_hop t) {
        try {
            Connection con = jdbcConections.getConnections();
            
            Statement st=con.createStatement();
            
            String sql="insert into phong_hop(ma_phong, trang_thai, kich_thuoc, mau_sac)"+
                    "value ('"+t.getMa_phong() + "','" +t.getTrang_thai()+ "','" +t.getKich_thuoc()+ "','"+t.getMau_sac()+ "')";
            
            int ket_qua=st.executeUpdate(sql);
            System.out.println("thuc thi thanh cong "+sql);
            System.out.println("so dong thay doi "+ket_qua);
            
            jdbcConections.closeConnection(con);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }
    

    @Override
    public int sua(phong_hop t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int xoa(phong_hop t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<phong_hop> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public phong_hop selectById(phong_hop t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<phong_hop> selectByCondition(String condition) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
