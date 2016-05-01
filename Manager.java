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
public class Manager extends Employee  {
    private final double tunjanganJabatan;
    private double totalGaji;
    private int anak;
    private boolean istri;

    public Manager(String nama, String idKerja, String jabatan, int lamaKerja, int gaji, boolean istri, int anak) {
        super(nama, idKerja, jabatan, lamaKerja, gaji, istri, anak);
        tunjanganJabatan = 0.1;
        totalGaji = 0;
        this.anak = anak;
        this.istri = istri;
    }


    public double Gaji(){
        totalGaji = (super.getGaji() * 0.1) + (super.Gaji() + super.bonus());
        return totalGaji;
    }
}
