package stt39_TranPhamVinhQuang_25637311;

import java.time.LocalDate;

public abstract class GiaoDich {
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich,
                    double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public abstract double tinhThanhTien();

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void hienThi() {
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ngay giao dich: " + ngayGiaoDich);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
        System.out.println("Thanh tien: " +tinhThanhTien());
    }
}
