package g30124.avram.alexandru.l8.e1;


class Cofee{
    private int temp;
    private int conc;
    private int counter;

    public Cofee(int temp, int conc, int counter) {
        this.temp = temp;
        this.conc = conc;
        this.counter = counter;
    }

    Cofee(int t, int c)
    {
        temp = t;
        conc = c;
    }

    int getTemp()
    {
        return temp;
    }
    int getConc(){
        return conc;
    }
    public String toString()
    {
        return "[cofee temperature="+temp+":concentration="+conc+"]";
    }
}//.class
