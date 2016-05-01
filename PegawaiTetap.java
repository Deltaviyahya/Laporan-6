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
public class PegawaiTetap extends Employee {
     private final double tunjanganKerja, tunjanganAnak, tunjanganIstri;
    private double gaji;
    private double totalGaji;
    private int anak;
    private boolean istri;

    public PegawaiTetap(String nama, String idKerja, String jabatan, int lamaKerja, int gaji, boolean istri, int anak) {
        super(nama, idKerja, jabatan, lamaKerja, gaji, istri, anak);
        tunjanganKerja = 0.1;
        tunjanganIstri = 0.1;
        tunjanganAnak = 0.15;
    }

    public int getAnak() {
        return super.getAnak();
    }

    public boolean isIstri() {
        return super.isIstri();
    }
}
