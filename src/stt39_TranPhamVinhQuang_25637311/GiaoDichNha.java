package stt39_TranPhamVinhQuang_25637311;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDich {
    private String loaiNha;
    private String diaChi;

    public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich,
                       double donGia, double dienTich,
                       String loaiNha, String diaChi) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("cao cap")) {
            return dienTich * donGia;
        }

        return dienTich * donGia * 0.9;
    }

    @Override
    public void hienThi() {
    	System.out.println("==Giao dich nha===");
    	super.hienThi();
    	System.out.println("loai nha :"+ loaiNha);
    	System.out.println("Dia chi :"+ diaChi);    	
    }
}
