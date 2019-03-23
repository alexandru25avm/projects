package g30124.avram.alexandru.l8.e1;

public class CoffeTest {
    public static void main(String[] args) throws ToManyCofeeException {
        CofeeMaker mk = new CofeeMaker();
        CofeeDrinker d = new CofeeDrinker();

        for(int i = 0;i<15;i++){
            Cofee c = mk.makeCofee();

            try {
                d.drinkCofee(c);
            } catch (TemperatureException e) {
                System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
            }
             /* catch (ToManyCofeeException e ) {
                  System.out.println("ToManyCofee");
              }*/
            finally{
                System.out.println("Throw the cofee cup.\n");
            }
        }
    }
}//.class