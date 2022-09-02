public class HSBC extends Rate_Cal{
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = (int) rate;
    }

    private int rate;

    public HSBC(int Rate){
        this.rate=rate;
    }
    @Override
    public int calculateInterest() {
        return this.rate*(1000)/(100);
    }
}
