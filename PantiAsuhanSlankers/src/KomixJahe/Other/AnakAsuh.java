/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Other;

import KomixJahe.Koneksi.Koneksi;
import KomixJahe.Pegawai.Pegawai;
import java.sql.ResultSet;
import java.util.ArrayList;

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
     public AnakAsuh getById(int id)
    {
        AnakAsuh anakasuh = new AnakAsuh();
        ResultSet rs = Koneksi.selectQuery("SELECT " 
                                        + "     a.idanak AS idanak, "
                                        + "     a.nama AS nama, "
                                        + "     a.alamat AS alamat, "
                                        + "     a.tanggalmasuk , "
                                        + "     a.tanggalkeluar , "
                                        + "     p.idpegawai AS idpegawai, "
                                        + "     p.nama AS nama, "
                                        + "     p.JenisKelamin AS JenisKelamin, "
                                        + "     p.statuskepegawaian AS statuskepegawaian, "
                                        + "     p.statusperkawinan AS statusperkawinan, "
                                        + "     p.alamat AS alamat, "
                                        + "     p.telepon AS telepon, "
                                        + "     p.jabatan AS jabatan "
                                        + "     FROM anakasuh a "
                                        + "     LEFT JOIN pegawai p ON a.idpegawai = p.idpegawai "
                                        + "     WHERE a.idanak = '" + id + "'");
        try
        {
            while(rs.next())
            {
                anakasuh = new AnakAsuh();
                anakasuh.setIdanak(rs.getInt("idanak"));
                anakasuh.getPegawai().setIdpegawai(rs.getInt("idpegawai"));
                anakasuh.getPegawai().setNama(rs.getString("nama"));
                anakasuh.getPegawai().setJeniskelamin(rs.getString("JenisKelamin"));
                anakasuh.getPegawai().setStatuskepegawaian(rs.getString("statuskepegawaian"));
                anakasuh.getPegawai().setStatusperkawinan(rs.getString("statusperkawinan"));
                anakasuh.getPegawai().setAlamat(rs.getString("alamat"));
                anakasuh.getPegawai().setTelepon(rs.getString("telepon"));
                anakasuh.getPegawai().setJabatan(rs.getString("jabatan"));
                anakasuh.setNamaanak(rs.getString("nama"));
                anakasuh.setAlamat(rs.getString("alamat"));
                anakasuh.setTglmasuk(rs.getString("tanggalmasuk"));
                anakasuh.setTglkeluar(rs.getString("tanggalkeluar"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return anakasuh;
    }
    public ArrayList<AnakAsuh> getAll(){
        ArrayList<AnakAsuh> ListAnakAsuh = new ArrayList();
        
        ResultSet rs = Koneksi.selectQuery("SELECT "
                                        + "     a.idanak AS idanak, "
                                        + "     a.nama AS nama, "
                                        + "     a.alamat AS alamat, "
                                        + "     a.tanggalmasuk , "
                                        + "     a.tanggalkeluar , "
                                        + "     p.idpegawai AS idpegawai, "
                                        + "     p.nama AS nama, "
                                        + "     p.JenisKelamin AS JenisKelamin, "
                                        + "     p.statuskepegawaian AS statuskepegawaian, "
                                        + "     p.statusperkawinan AS statusperkawinan, "
                                        + "     p.alamat AS alamat, "
                                        + "     p.telepon AS telepon, "
                                        + "     p.jabatan AS jabatan "
                                        + "     FROM anakasuh a "
                                        + "     RIGHT JOIN pegawai p ON a.idpegawai = p.idpegawai ");
        
        try{
            while(rs.next()) {
                AnakAsuh anakasuh = new AnakAsuh();
                anakasuh.setIdanak(rs.getInt("idanak"));
                anakasuh.setNamaanak(rs.getString("nama"));
                anakasuh.getPegawai().setIdpegawai(rs.getInt("idpegawai"));
                anakasuh.getPegawai().setNama(rs.getString("nama"));
                anakasuh.getPegawai().setJeniskelamin(rs.getString("JenisKelamin"));
                anakasuh.getPegawai().setStatuskepegawaian(rs.getString("statuskepegawaian"));
                anakasuh.getPegawai().setStatusperkawinan(rs.getString("statusperkawinan"));
                anakasuh.getPegawai().setAlamat(rs.getString("alamat"));
                anakasuh.getPegawai().setTelepon(rs.getString("telepon"));
                anakasuh.getPegawai().setJabatan(rs.getString("jabatan"));
                anakasuh.setAlamat(rs.getString("alamat"));
                anakasuh.setTglmasuk(rs.getString("tanggalmasuk"));
                anakasuh.setTglkeluar(rs.getString("tanggalkeluar"));
                
                ListAnakAsuh.add(anakasuh);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ListAnakAsuh;
    }
    public void save(){
        if(getById(idanak).getIdanak() == 0){
            String SQL = "INSERT INTO anakasuh (idpegawai, nama, alamat, tanggalmasuk, tanggalkeluar) VALUES("
                        +"  '" + this.getPegawai().getIdpegawai() + "', "
                        +"  '" + this.namaanak + "', "
                        +"  '" + this.alamat + "', "
                        +"  '" + this.tglmasuk + "', "
                        +"  '" + this.tglkeluar + "' "
                        +"  )";
            this.idanak = Koneksi.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE anakasuh SET " 
                        +"  idpegawai = '" + this.getPegawai().getIdpegawai() + "', "
                        +"  nama = '" + this.namaanak + "',"
                        +"  alamat = '" + this.alamat + "',"
                        +"  tanggalmasuk = '" + this.tglmasuk + "',"
                        +"  tanggalkeluar = '" + this.tglkeluar + "' "
                        +"  WHERE idanak = '" + this.idanak + "' ";
            Koneksi.executeQuery(SQL);
        }
    }
    public ArrayList<AnakAsuh> search(String keyword){
        ArrayList<AnakAsuh> ListAnakAsuh = new ArrayList();
        
        ResultSet rs = Koneksi.selectQuery("SELECT "
                                        + "     a.idanak AS idanak, "
                                        + "     a.nama AS nama, "
                                        + "     a.alamat AS alamat, "
                                        + "     a.tanggalmasuk , "
                                        + "     a.tanggalkeluar , "
                                        + "     p.idpegawai AS idpegawai, "
                                        + "     p.nama AS nama, "
                                        + "     p.JenisKelamin AS JenisKelamin, "
                                        + "     p.statuskepegawaian AS statuskepegawaian, "
                                        + "     p.statusperkawinan AS statusperkawinan, "
                                        + "     p.alamat AS alamat, "
                                        + "     p.telepon AS telepon, "
                                        + "     p.jabatan AS jabatan "
                                        + "     FROM anakasuh a "
                                        + "     LEFT JOIN pegawai p ON a.idpegawai = p.idpegawai "
                                        + "     WHERE a.nama LIKE '%" + keyword + "%' "
                                        + "         OR a.alamat LIKE '%" + keyword + "%' "
                                        + "         OR a.tanggalmasuk LIKE '%" + keyword + "%' "
                                        + "         OR a.tanggalkeluar LIKE '%" + keyword + "%' ");
        
        try{
            while(rs.next()){
                AnakAsuh anakasuh = new AnakAsuh();
                anakasuh.setIdanak(rs.getInt("idanak"));
                anakasuh.getPegawai().setIdpegawai(rs.getInt("idpegawai"));
                anakasuh.getPegawai().setNama(rs.getString("nama"));
                anakasuh.getPegawai().setJeniskelamin(rs.getString("JenisKelamin"));
                anakasuh.getPegawai().setStatuskepegawaian(rs.getString("statuskepegawaian"));
                anakasuh.getPegawai().setStatusperkawinan(rs.getString("statusperkawinan"));
                anakasuh.getPegawai().setAlamat(rs.getString("alamat"));
                anakasuh.getPegawai().setTelepon(rs.getString("telepon"));
                anakasuh.getPegawai().setJabatan(rs.getString("jabatan"));
                anakasuh.setNamaanak(rs.getString("nama"));
                anakasuh.setAlamat(rs.getString("alamat"));
                anakasuh.setTglmasuk(rs.getString("tanggalmasuk"));
                anakasuh.setTglkeluar(rs.getString("tanggalkeluar"));
                
                ListAnakAsuh.add(anakasuh);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListAnakAsuh;
    }
        public void delete(){
        String SQL = "DELETE FROM anakasuh WHERE idanak = '" + this.idanak + "'";
        Koneksi.executeQuery(SQL);
    }

}
