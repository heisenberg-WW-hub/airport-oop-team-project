package duy.model;

public class ChuyenBay {
    private String maChuyenBay;
    private int soGheTrong;
    public ChuyenBay(String maChuyenBay, int soGheTrong){
        this.maChuyenBay = maChuyenBay;
        this.soGheTrong = soGheTrong;
    }
    public int getSoGheTrong(){
        return soGheTrong;
    }
    public String getMaChuyenBay(){
        return maChuyenBay;
    }
    public void giamSoGhe(int soLuong){
        this.soGheTrong -= soLuong;
    }
}