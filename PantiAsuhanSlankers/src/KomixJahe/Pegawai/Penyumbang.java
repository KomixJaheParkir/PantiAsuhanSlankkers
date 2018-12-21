/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;
import KomixJahe.Koneksi.Koneksi;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author ASUS 10.1
 */
public class Penyumbang {
    private int idpenyumbang;
    private String nama;
    private String tanggalsumbangan;
    private String jumlahsumbangan;

    public Penyumbang() {
    }

    public Penyumbang(String nama, String tanggalsumbangan, String jumlahsumbangan) {
        this.nama = nama;
        this.tanggalsumbangan = tanggalsumbangan;
        this.jumlahsumbangan = jumlahsumbangan;
    }

    
    public int getIdpenyumbang() {
        return idpenyumbang;
    }

    public void setIdpenyumbang(int idpenyumbang) {
        this.idpenyumbang = idpenyumbang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalsumbangan() {
        return tanggalsumbangan;
    }

    public void setTanggalsumbangan(String tanggalsumbangan) {
        this.tanggalsumbangan = tanggalsumbangan;
    }

    public String getJumlahsumbangan() {
        return jumlahsumbangan;
    }

    public void setJumlahsumbangan(String jumlahsumbangan) {
        this.jumlahsumbangan = jumlahsumbangan;
    }
     public Penyumbang getById(int id)
    {
        Penyumbang pen = new Penyumbang();
        ResultSet rs = Koneksi.selectQuery("SELECT * FROM penyumbang " + "WHERE idpenyumbang = '" + id + "'");
        
        try
        {
            while(rs.next())
            {
                pen = new Penyumbang();
                pen.setIdpenyumbang(rs.getInt("idpenyumbang"));
                pen.setNama(rs.getString("nama"));
                pen.setTanggalsumbangan(rs.getString("tanggalsumbangan"));
                pen.setJumlahsumbangan(rs.getString("jumlahsumbangan"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return pen;
    }
    
}
