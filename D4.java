package demo02;

public class D4 {
     private int xueHao;
     private String xingMing;
     private int nianLing;


    public D4() {
    }

    public D4(int xueHao, String xingMing, int nianLing) {
        this.xueHao = xueHao;
        this.xingMing = xingMing;
        this.nianLing = nianLing;
    }

    /**
     * 获取
     * @return xueHao
     */
    public int getXueHao() {
        return xueHao;
    }

    /**
     * 设置
     * @param xueHao
     */
    public void setXueHao(int xueHao) {
        this.xueHao = xueHao;
    }

    /**
     * 获取
     * @return xingMing
     */
    public String getXingMing() {
        return xingMing;
    }

    /**
     * 设置
     * @param xingMing
     */
    public void setXingMing(String xingMing) {
        this.xingMing = xingMing;
    }

    /**
     * 获取
     * @return nianLing
     */
    public int getNianLing() {
        return nianLing;
    }

    /**
     * 设置
     * @param nianLing
     */
    public void setNianLing(int nianLing) {
        this.nianLing = nianLing;
    }

    public String toString() {
        return "D4{xueHao = " + xueHao + ", xingMing = " + xingMing + ", nianLing = " + nianLing + "}";
    }
}
