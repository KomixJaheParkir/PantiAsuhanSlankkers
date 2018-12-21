/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Other;

import KomixJahe.Pegawai.Pegawai;

/**
 *
 * @author ASUS 10.1
 */
public class AnakAsuh {
    private int idanak;
    private Pegawai pegawai = new Pegawai();
    private String namaanak;
    private String alamat;
    private String tglmasuk;
    private String tglkeluar;
    
     public AnakAsuh()
    {
        
    }
     public AnakAsuh(Pegawai pegawai, String nama, String alamat, String tglmasuk, String tglkeluar) {
        this.pegawai = pegawai;
        this.namaanak = nama;
        this.alamat = alamat;
        this.tglmasuk = tglmasuk;
        this.tglkeluar = tglkeluar;
    }
      public int getIdanak() {
        return idanak;
    }

    public void setIdanak(int idanak) {
        this.idanak = idanak;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public String getNamaanak() {
        return namaanak;
    }

    public void setNamaanak(String namaanak) {
        this.namaanak = namaanak;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTglmasuk() {
        return tglmasuk;
    }

    public void setTglmasuk(String tglmasuk) {
        this.tglmasuk = tglmasuk;
    }

    public String getTglkeluar() {
        return tglkeluar;
    }

    public void setTglkeluar(String tglkeluar) {
        this.tglkeluar = tglkeluar;
    }

}
