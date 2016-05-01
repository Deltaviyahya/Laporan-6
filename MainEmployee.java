/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6_1;
import java.util.*;
/**
 *
 * @author Deltaviyahya
 */
public class MainEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, jabatan, idKerja, option;
        int lamaKerja, gaji, lembur, anak;
        boolean optionIstri;
        do {
            System.out.println("==============================================");
            System.out.println("---------------Selamat Datang-----------------");
            System.out.println("==============================================");
            System.out.print("Masukkan Nama Pegawai : ");
            nama = in.nextLine();
            System.out.print("Masukkan ID Pegawai   : ");
            idKerja = in.nextLine();
            System.out.println("==============================================");
            System.out.println("1. Manager \n2. Pegawai Tetap \n3. Pegawai Tidak tetap ");
            System.out.print("Pilih Jenis Jabatan (Manager) : ");
            jabatan = in.nextLine();
            if (jabatan.equalsIgnoreCase("Manager")) {
                System.out.print("Lama Kerja(dalam tahun)   : ");
                lamaKerja = in.nextInt();
                in.nextLine();
                System.out.print("Masukkan Gaji Pegawai     : ");
                gaji = in.nextInt(); in.nextLine();
                System.out.print("Mempunyai istri           : (y/n) ");
                optionIstri = in.nextLine().equalsIgnoreCase("y");
                System.out.print("Jumlah Anak yang dimiliki : ");
                anak = in.nextInt(); in.nextLine();
                Manager boss = new Manager(nama, idKerja, jabatan, lamaKerja, gaji, optionIstri, anak);
                System.out.println("==============================");
                System.out.println("============ Gaji ============");
                System.out.println("Nama Pegawai        : " + nama);
                System.out.println("ID Pegawai          : " + idKerja);
                System.out.println("Jabatan             : " + jabatan);
                System.out.println("Istri               : " + (boss.isIstri() ? "ya" : "tidak"));
                System.out.println("Anak yang dimiliki  : " + boss.getAnak());
                System.out.println("======== Total gaji ==========");
                System.out.println("Gaji umum           : " + boss.getGaji());
                System.out.println("------------------------------+");
                System.out.println("Total + bonus       : " + boss.Gaji());
            } else if (jabatan.equalsIgnoreCase("Pegawai Tetap")) {
                System.out.print("Lama Kerja : (dalam tahun) ");
                lamaKerja = in.nextInt();
                in.nextLine();
                System.out.print("Masukkan Gaji Pegawai : ");
                gaji = in.nextInt(); in.nextLine();
                System.out.print("Mempunyai istri : (y/n) ");
                optionIstri = in.nextLine().equalsIgnoreCase("y");
                System.out.print("Berapa anak yang dimiliki : ");
                anak = in.nextInt(); in.nextLine();
                PegawaiTetap pt = new PegawaiTetap(nama, idKerja, jabatan, lamaKerja, gaji, optionIstri, anak);
                System.out.println("==============================");
                System.out.println("============ Gaji ============");
                System.out.println("Nama Pegawai        : " + nama);
                System.out.println("ID Pegawai          : " + idKerja);
                System.out.println("Jabatan             : " + jabatan);
                System.out.println("Istri               : " + (pt.isIstri() ? "ya" : "tidak"));
                System.out.println("Anak yang dimiliki  : " + pt.getAnak());
                System.out.println("======== Total gaji ==========");
                System.out.println("Gaji umum           : " + pt.getGaji());
                System.out.println("------------------------------+");
                System.out.println("Total + bonus       : " + (pt.Gaji() + pt.bonus()));
            } else if (jabatan.equalsIgnoreCase("Pegawai Tidak Tetap")) {
                System.out.print("Lama Kerja : (dalam tahun) ");
                lamaKerja = in.nextInt();
                in.nextLine();
                System.out.print("Masukkan Gaji Pegawai : ");
                gaji = in.nextInt(); in.nextLine();
                System.out.print("Lembur : (dalam jam) ");
                lembur = in.nextInt(); in.nextLine();
                PegawaiTidakTetap ptt = new PegawaiTidakTetap(nama, idKerja, jabatan, lamaKerja, gaji, false, 0,lembur);
                System.out.println("==============================");
                System.out.println("============ Gaji ============");
                System.out.println("Nama Pegawai        : " + nama);
                System.out.println("ID Pegawai          : " + idKerja);
                System.out.println("Jabatan             : " + jabatan);
                System.out.println("Lembur              : " + lembur);
                System.out.println("======== Total gaji ==========");
                System.out.println("Gaji umum           : " + ptt.getGaji());
                System.out.println("------------------------------+");
                System.out.println("Total + bonus       : " + ptt.bonusLembur());
            } else{
                break;
            }
        } while (true);
    }
}
