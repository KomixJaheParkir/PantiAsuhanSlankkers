/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KomixJahe.Test;

import KomixJahe.Other.Penyumbang;

/**
 *
 * @author ASUS 10.1
 */
public class TestPenyumbang {
    public static void main(String[] args) {
        Penyumbang pen1 = new Penyumbang("Mike", "2018/12/13", "5.000.000");
        Penyumbang pen2 = new Penyumbang("Vera", "2018/12/13", "6.000.000");
        Penyumbang pen3 = new Penyumbang("Saragi", "2018/12/13", "7.000.000");
        
        // test insert
        pen1.save();
        pen2.save();
        pen3.save();
        // test update
        pen2.setTanggalsumbangan("2018/12/13");
        pen2.save();
        // test delete
        //pen3.delete();
        
        // test select all
        for(Penyumbang p : new Penyumbang().getAll())
        {
            System.out.println("Nama Penyumbang: " + p.getNama()+ ", Tanggal Sumbangan: " + p.getTanggalsumbangan()+ ", Jumlah Sumbangan: " + "Rp. " + p.getJumlahsumbangan());
        }
    }
}
