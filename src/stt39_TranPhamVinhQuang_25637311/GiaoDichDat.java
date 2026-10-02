package stt39_TranPhamVinhQuang_25637311;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDich {
    private char loaiDat;

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich,
                       double donGia, double dienTich, char loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat == 'A' || loaiDat == 'a') {
            return dienTich * donGia * 1.5;
        }

        return dienTich * donGia;
    }

    @Override
    public void hienThi() {
        System.out.println("===== GIAO DICH DAT =====");
        super.hienThi();
        System.out.println("Loai dat: " + loaiDat);
    }
}
