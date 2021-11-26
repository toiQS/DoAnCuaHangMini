package DoAnOOP;

public abstract class ThongTin {
    public String Ten;
    public String Ma;
    public ThongTin(String Ten, String Ma){
        this.Ten = Ten;
        this.Ma = Ma;
    }
    public String  getTen(){
        return Ten;
    }
    public void setTen(String Ten){
        this.Ten = Ten;
    }
    public String getMa(){
        return Ma;
    }
    public void setMa(String Ma){
        this.Ma = Ma;
    }
}
