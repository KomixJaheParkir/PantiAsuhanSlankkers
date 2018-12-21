/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Test;

import KomixJahe.Pegawai.Admin;

/**
 *
 * @author ASUS 10.1
 */
public class TestAdmin {

    public static void main(String[] args) {
        Admin ad1 = new Admin("KB", "Senin-Rabu");
          Admin ad2 = new Admin("MV", "Kamis-Minggu");
          
          //test insert
          ad1.save();
          ad2.save();
          
          //test update
          ad2.setNama("Mike");
          ad2.save();
          
          //test delete
          ad2.delete();
          
          //test select ALL
          for(Admin a : new Admin().getAll())
          {
              System.out.println("Nama : " + a.getNama() + ", Jadwal: " + a.getJadwal());
          }
          
          //test search 
          for(Admin a : new Admin().search("Kamis-Minggu"))
          {
              System.out.println("Nama : " + a.getNama() + "Jadwal : " + a.getJadwal());
          }
    }      
 }

