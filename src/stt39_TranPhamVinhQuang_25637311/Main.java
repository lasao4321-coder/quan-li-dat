package stt39_TranPhamVinhQuang_25637311;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<GiaoDich> danhSach = new ArrayList<>();

        // 3 giao dich dat
        danhSach.add(new GiaoDichDat(
                "D001",
                LocalDate.of(2013, 9, 10),
                1000,
                100,
                'A'
        ));

        danhSach.add(new GiaoDichDat(
                "D002",
                LocalDate.of(2013, 9, 15),
                2000,
                150,
                'B'
        ));

        danhSach.add(new GiaoDichDat(
                "D003",
                LocalDate.of(2013, 8, 20),
                1500,
                120,
                'C'
        ));

        // 3 giao dich nha
        danhSach.add(new GiaoDichNha(
                "N001",
                LocalDate.of(2013, 9, 5),
                3000,
                100,
                "cao cap",
                "123 Nguyen Trai"
        ));

        danhSach.add(new GiaoDichNha(
                "N002",
                LocalDate.of(2013, 9, 20),
                2500,
                120,
                "thuong",
                "456 Le Loi"
        ));

        danhSach.add(new GiaoDichNha(
                "N003",
                LocalDate.of(2013, 8, 25),
                2000,
                150,
                "cao cap",
                "789 Hai Ba Trung"
        ));

        // ==========================
        // XUAT DANH SACH
        // ==========================
        System.out.println("===== DANH SACH GIAO DICH =====");

        for (GiaoDich gd : danhSach) {
            gd.hienThi();
            System.out.println();
        }

        int soDat = 0;
        int soNha = 0;

        for (GiaoDich gd : danhSach) {
            if (gd instanceof GiaoDichDat) {
                soDat++;
            } else if (gd instanceof GiaoDichNha) {
                soNha++;
            }
        }

        System.out.println("===== SO LUONG =====");
        System.out.println("So giao dich dat: " + soDat);
        System.out.println("So giao dich nha: " + soNha);

        double tongTienDat = 0;
        int demDat = 0;

        for (GiaoDich gd : danhSach) {
            if (gd instanceof GiaoDichDat) {
                tongTienDat += gd.tinhThanhTien();
                demDat++;
            }
        }

        double trungBinh = tongTienDat / demDat;

        System.out.println("\n===== TRUNG BINH GIAO DICH DAT =====");
        System.out.println("Trung binh thanh tien: " + trungBinh);

        // ==========================
        // GIAO DICH THANG 9/2013
        // ==========================
        System.out.println("\n===== GIAO DICH THANG 9/2013 =====");

        for (GiaoDich gd : danhSach) {
            LocalDate ngay = gd.getNgayGiaoDich();

            if (ngay.getMonthValue() == 9 &&
                ngay.getYear() == 2013) {

                gd.hienThi();
                System.out.println();
            }
        }
    }
}

