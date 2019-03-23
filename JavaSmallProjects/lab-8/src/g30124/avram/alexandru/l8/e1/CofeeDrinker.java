package g30124.avram.alexandru.l8.e1;

class CofeeDrinker{
    void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException,ToManyCofeeException{
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");
        System.out.println("Drink cofee:"+c);


    }
}//.class
