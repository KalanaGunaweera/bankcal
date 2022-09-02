public class Com_Bank extends  Rate_Cal {
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = (int) rate;
    }

    private int rate;


    public Com_Bank(int Rate){
        this.rate=rate;
    }

    @Override
    public int calculateInterest() {
        return this.rate*(1000)/(100);


    }
}
