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

}
