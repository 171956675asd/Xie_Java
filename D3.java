package demo02;
//alt + ins
public class D3 {
    private String pinPai;
    private String yanSe;
    private double jiaGe;


    public D3() {
    }

    public D3(String pinPai, String yanSe, double jiaGe) {
        this.pinPai = pinPai;
        this.yanSe = yanSe;
        this.jiaGe = jiaGe;
    }

    /**
     * 获取
     * @return pinPai
     */
    public String getPinPai() {
        return pinPai;
    }

    /**
     * 设置
     * @param pinPai
     */
    public void setPinPai(String pinPai) {

        this.pinPai = pinPai;
    }

    /**
     * 获取
     * @return yanSe
     */
    public String getYanSe() {
        return yanSe;
    }

    /**
     * 设置
     * @param yanSe
     */
    public void setYanSe(String yanSe) {
        this.yanSe = yanSe;
    }

    /**
     * 获取
     * @return jiaGe
     */
    public double getJiaGe() {
        return jiaGe;
    }

    /**
     * 设置
     * @param jiaGe
     */
    public void setJiaGe(double jiaGe) {
        this.jiaGe = jiaGe;
    }

    public String toString() {
        return "D3{pinPai = " + pinPai + ", yanSe = " + yanSe + ", jiaGe = " + jiaGe + "}";
    }
}
