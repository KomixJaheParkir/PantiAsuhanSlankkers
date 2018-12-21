/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;

/**
 *
 * @author ASUS 10.1
 */
public class Pegawai {
    private int idpegawai;
    private String nama;
    private String jeniskelamin;
    private String statuskepegawaian;
    private String statusperkawinan;
    private String alamat;
    private String telepon;
    private String jabatan;
    
    public Pegawai()
    {}
    
      public Pegawai(String nama, String jeniskelamin, String statuskepegawaian, String statusperkawinan, String alamat, String telepon, String jabatan)
      {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.statuskepegawaian = statuskepegawaian;
        this.statusperkawinan = statusperkawinan;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
    }

    public int getIdpegawai() {
        return idpegawai;
    }

    public void setIdpegawai(int idpegawai) {
        this.idpegawai = idpegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getStatuskepegawaian() {
        return statuskepegawaian;
    }

    public void setStatuskepegawaian(String statuskepegawaian) {
        this.statuskepegawaian = statuskepegawaian;
    }

    public String getStatusperkawinan() {
        return statusperkawinan;
    }

    public void setStatusperkawinan(String statusperkawinan) {
        this.statusperkawinan = statusperkawinan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public Pegawai getById(int id){
        
    }
}
