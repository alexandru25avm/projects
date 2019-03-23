package g30124.avram.alexandru.l8.e1;


class CofeeMaker {

        int counter=0;

        Cofee makeCofee() throws ToManyCofeeException {

        System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);

        int c = (int)(Math.random()*100);

        Cofee cofee = new Cofee(t,c);
        counter++;
        if ( counter > 20 )
            throw new ToManyCofeeException(counter, "To many cofeee");

        return cofee;




    }

}//.class