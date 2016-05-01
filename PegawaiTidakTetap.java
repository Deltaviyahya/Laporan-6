/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6_1;

/**
 *
 * @author Deltaviyahya
 */
public class PegawaiTidakTetap extends Employee {
       private int lembur, anak;
    private boolean istri;
    public PegawaiTidakTetap (String nama, String idKerja, String jabatan, int lamaKerja, int gaji, boolean istri, int anak,int lembur){
        super(nama, idKerja, jabatan, lamaKerja, gaji, istri, anak);
        this.lembur = lembur;
    }
    public int getLembur() {
        return lembur;
    }
     public double bonusLembur(){
         double bonus = 0;
         if (lembur > 10){
             bonus = ((int)(lembur * 10000) + super.getGaji());
             return bonus;
         }
         else{
             return ((int) bonus + super.getGaji());
         }
     }
}
