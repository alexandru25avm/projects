package g30124.avram.alexandru.l10.e3;

public class TwoCounters extends Thread {
    int startpos;
    Thread t;
    TwoCounters(Thread t,int startpos)
    {
        this.t=t;
        this.startpos=startpos;
    }
    public void run()
    {

        try{
            if(t!=null) t.join();

            for(int i=startpos;i<(startpos+100);i++)
                System.out.println( i);

            Thread.sleep(1000);
            System.out.println( "Firul si-a terminat exec");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String [] args)
    {
        TwoCounters c1=new TwoCounters(null,1);
        TwoCounters c2=new TwoCounters(c1,101);
        c1.start();
        c2.start();
    }
}