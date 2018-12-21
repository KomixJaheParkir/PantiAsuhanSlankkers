/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;
import KomixJahe.Koneksi.Koneksi;
import java.sql.*;
/**
 *
 * @author ASUS 10.1
 */
public class Admin {
    private int idAdmin;
    private String nama;
    private String jadwal;
    
    public Admin(){
        
    }

    public Admin(String nama, String jadwal) {
        this.nama = nama;
        this.jadwal = jadwal;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Admin getByid(int id){
        Admin ad = new Admin();
        ResultSet rs= Koneksi.selectQuery("Select *from admin"
                                                 +"where idadmin='"+id+"'");
    
        try {
            while(rs.next()){
                ad=new Admin();
                ad.setIdAdmin(rs.getInt(idAdmin));
                ad.setNama(rs.getString("nama"));
                ad.setJadwal(rs.getString("jadwal"));
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
        return ad;
    }
    
    
    
}
