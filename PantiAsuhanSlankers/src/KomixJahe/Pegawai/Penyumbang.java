/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;
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

    
}
