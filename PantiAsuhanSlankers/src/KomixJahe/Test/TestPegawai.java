/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Test;

import KomixJahe.Pegawai.Pegawai;

/**
 *
 * @author ASUS 10.1
 */
public class TestPegawai {
   public static void main (String args[]){
    Pegawai pg1 = new Pegawai("Indra", "Laki-laki", "Tetap", "Menikah", "Probolinggo", "082234516010", "Kepala Panti");
          Pegawai pg2 = new Pegawai("Krista", "Perempuan", "Tetap", "Menikah", "Probolinggo", "082258285884", "Pengasuh 1");
          
          //test insert
          pg1.save();
          pg2.save();
          
          //test update
          pg1.setNama("Eka");
          pg1.save();
          
          //test delete
          pg2.delete();
          
          //test select ALL
          for(Pegawai p : new Pegawai().getAll())
          {
              System.out.println("Nama : " + p.getNama() + ", Jenis Kelamin : " + p.getJeniskelamin() + ", Status Kepegawaian : " + p.getStatuskepegawaian() + ", Status Pernikahan : "
                            + p.getStatusperkawinan() + ", Alamat : " + p.getAlamat() + ", Telepon : " + p.getTelepon() + ", Jabatan : " + p.getJabatan());
          }
          
          //test search 
          for(Pegawai pg : new Pegawai().search("Eka"))
          {
              System.out.println("Nama : " + pg.getNama() + ", Jenis Kelamin : " + pg.getJeniskelamin() + ", Status Kepegawaian : " + pg.getStatuskepegawaian() + ", Status Pernikahan : "
                            + pg.getStatusperkawinan() + ", Alamat : " + pg.getAlamat() + ", Telepon : " + pg.getTelepon() + ", Jabatan : " + pg.getJabatan());
          }
       }
}
