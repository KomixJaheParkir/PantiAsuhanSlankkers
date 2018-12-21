/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;
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
    
    
    
}
