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
public class Employee {
   private String nama, idKerja, jabatan;
    private int lamaKerja, gaji;
    private boolean istri;
    private int anak;
    private double totalGaji;

    public Employee(String nama, String idKerja, String jabatan, int lamaKerja, int gaji, boolean istri, int anak) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.lamaKerja = lamaKerja;
        this.gaji = gaji;
        this.anak = anak;
        this.istri = istri;
    }

    public String getNama() {
        return nama;
    }

    public String getIdKerja() {
        return idKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public int getAnak() {
        return anak;
    }

    public boolean isIstri() {
        return istri;
    }

    public double getGaji(){
        return gaji;
    }
    public double Gaji() {
        if (getLamaKerja() > 5 && getLamaKerja() <= 10) {
            gaji += ((int) 0.05 * gaji);
            return gaji;
        } else if (getLamaKerja() > 10) {
            gaji += ((int) 0.1 * gaji) + ((int) 0.1 * gaji);
            return gaji;
        } else {
            return gaji;
        }
    }

    public double bonus() {
        if (isIstri() == true) {
            totalGaji = ((int) getGaji() * 0.1) + getGaji();
            if (getAnak() > 0 && getAnak() < 4) {
                for (int i = 0; i < getAnak(); i++) {
                    totalGaji += ((int) 0.15 * getGaji());
                }
            } else if (getAnak() > 3) {
                for (int i = 0; i < 3; i++) {
                    totalGaji += ((int) 0.15 * getGaji());
                }
            }
            return totalGaji;
        } else if (isIstri() == false) {
            totalGaji = getGaji();
            if (getAnak() > 0 && getAnak() < 4) {
                for (int i = 0; i < getAnak(); i++) {
                    totalGaji += ((int) 0.15 * getGaji());
                }
            } else if (getAnak() > 3) {
                for (int i = 0; i < 3; i++) {
                    totalGaji += ((int) 0.15 * getGaji());
                }
            }
            return totalGaji;
        } else {
            totalGaji = getGaji();
            return totalGaji;
        }
    }
}
