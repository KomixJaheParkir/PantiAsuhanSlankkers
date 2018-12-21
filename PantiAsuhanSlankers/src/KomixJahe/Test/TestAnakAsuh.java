/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Test;

import KomixJahe.Other.AnakAsuh;
import KomixJahe.Pegawai.Pegawai;

/**
 *
 * @author ASUS 10.1
 */
public class TestAnakAsuh {
    
    public static void main(String[] args) {

        Pegawai Indah = new Pegawai().getById(18);
        Pegawai  Paul = new Pegawai().getById(19);
        
        AnakAsuh an1 = new AnakAsuh(Paul, "Titi", "Malang", "2018/12/12", "2019/12/12");
        AnakAsuh an2 = new AnakAsuh(Indah, "Tutu", "Malang", "2018/12/12", "2019/12/12");
        AnakAsuh an3 = new AnakAsuh(Paul, "Tata", "Malang", "2018/12/12", "2019/12/12");

        //test insert
        an1.save();
        an2.save();
        an3.save();

        //test update
        an2.setTglmasuk("2018/12/10");
        an2.save();

        //test delete
        an2.delete();

        //test select all
        for (AnakAsuh a : new AnakAsuh().getAll()) {
            System.out.println("Nama Pegawai : " + a.getPegawai().getNama() + ",Nama Anak : anak " + a.getNamaanak() + " , Alamat : " + a.getAlamat() + " , Tanggal Masuk : " + a.getTglmasuk() + " , Tanggal Keluar : " + a.getTglkeluar());
        }
        for(AnakAsuh a : new AnakAsuh().search("Tata"))         
            {             
                 System.out.println("Nama Pegawai : " + a.getPegawai().getNama() + ", Nama Anak : anak " + a.getNamaanak() + " , Alamat : " + a.getAlamat() + " , Tanggal Masuk : " + a.getTglmasuk() + " , Tanggal Keluar : " + a.getTglkeluar());
            }    
    }
}
