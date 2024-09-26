package model;
/*
  Tác giả: Bùi Thiên Huy 
*/
public class KhachHang {
    private String maso;
    private String hoten;
    private int loai;
    private double chisocu;
    private double chisomoi;   
    private double tieuthu;
    private double tientra;

    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int loai, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.loai = loai;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }
    
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //sinh viên cài đặt xử lý cho các phương thức sau    
    public double getTieuThu()
    {
        
       tieuthu=chisomoi-chisocu;
       return tieuthu; 
    }
   
    public double getTienTra()
    {     
        String lh="";
        if(loai==1){
            lh="Kinh Doanh";
            tientra=4575*tieuthu*1.08;
        }else if(loai==2){
            lh="Sinh Hoat";
            if(tieuthu<50){
               tientra=1806*tieuthu*1.08;
            }else if(tieuthu>51||tieuthu<100){
                tientra=1866*tieuthu*1.08;
            }else if(tieuthu>101||tieuthu<200){
                tientra=2167*tieuthu*1.08;
            }else if(tieuthu>201||tieuthu<300){
                tientra=2729*tieuthu*1.08;
            }else if(tieuthu>301||tieuthu<400){
                tientra=3050*tieuthu*1.08;
            }else if(tieuthu>401){
                tientra=3151*tieuthu*1.08;
            }            
        }
        return tientra;
    }         
}
