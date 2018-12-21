/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Pegawai;
import KomixJahe.Koneksi.Koneksi;
import java.sql.*;
import java.util.ArrayList;
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
    public ArrayList<Admin> search(String keyword){
        ArrayList<Admin> ListAdmin = new ArrayList();
        
        String sql = "SELECT * FROM admin WHERE "
                    + "     nama LIKE '%" + keyword + "%' "
                    + "     OR jadwal LIKE '%" + keyword + "%' ";
        ResultSet rs = Koneksi.selectQuery(sql);
        
        try
        {
            while(rs.next())
            {
                Admin ad = new Admin();
                ad.setIdAdmin(rs.getInt("idadmin"));
                ad.setNama(rs.getString("nama"));
                ad.setJadwal(rs.getString("jadwal"));
                
                ListAdmin.add(ad);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ListAdmin;
    }
    public ArrayList<Admin>getAll(){
       ArrayList<Admin>ListAdmin= new ArrayList();
       ResultSet rs=Koneksi.selectQuery("Select *from admin");
        try
        {
          while(rs.next())
          {
              Admin ad = new Admin();
              ad.setIdAdmin(rs.getInt("idadmin"));
              ad.setNama(rs.getString("nama"));
              ad.setJadwal(rs.getString("jadwal"));
              
              ListAdmin.add(ad);
          }
        }
        catch (Exception e){
            e.printStackTrace();
        }
            return ListAdmin;
        }
       public void save(){
            if(getByid(idAdmin).getIdAdmin() == 0)
        {
            String SQL = "INSERT INTO admin (nama, jadwal) VALUES("
                    + "      '" + this.nama + "', "
                    + "      '" + this.jadwal + "' "
                    + "      )";
            this.idAdmin = Koneksi.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE admin SET "
                    + "     nama = '" + this.nama + "', "
                    + "     jadwal = '" + this.jadwal + "' "
                    + "     WHERE idadmin = '" + this.idAdmin + "'";
            Koneksi.executeQuery(SQL);
        }
       }
       public void delete(){
           String SQL= "Delete From admin where idadmin='"+this.idAdmin+"'";
           Koneksi.executeQuery(SQL);
       }
 }
    


