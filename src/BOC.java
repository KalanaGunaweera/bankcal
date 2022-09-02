public class BOC extends Rate_Cal{
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = (int) rate;
    }

    private int rate;

    public BOC(int Rate){
        this.rate=rate;
    }

    @Override

    public int calculateInterest() {
        double v = (double) rate * (1000) / (100);
        return (int) (v);
    }
}
