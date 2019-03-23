package g30124.avram.alexandru.l8.e4;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

import g30124.avram.alexandru.l8.e4.CarFactory.Car;
public class CarSerializare {
    public static void main(String[] args) throws Exception{
        ArrayList <Car> list1=new ArrayList<>();
        ArrayList <Car> list2=new ArrayList<>();
        CarFactory c = new CarFactory();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int valid=0;
        while(valid!=4) {

            System.out.println("------------------Meniu--------------------");
            System.out.println("1. Creati o masina !");
            System.out.println("2. Adauga-ti masinile in fisier !");
            System.out.println("3. Cititi masinile din fisier !");
            System.out.println("4. Iesire !");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    String nume;
                    int price;
                    System.out.println("Da-ti numele masinii !:");

                    nume=br.readLine();
                    System.out.println("Da-ti pretul masinii !:");
                    price=sc.nextInt();
                    Car a= c.createCar(nume, price);
                    list1.add(a);break;
                case 2:System.out.println("Lista s-a serializat !");
                    c.storeCar(list1,"garaj.dat");break;
                case 3:System.out.println("Lista s-a deserializat !");
                    list2 = c.recoverCar("garaj.dat");
                    System.out.println("In fisier aveti !:");
                    for(int i=0;i<list2.size();i++)
                    {
                        System.out.println("Masina "+i+" din garaj are pretul "+list2.get(i).getPrice()+" si este model "+list2.get(i).getModel());;
                    };break;
                case 4:valid=choice;
                default: break;

            };

        }








    }
}



class CarFactory  {
    Car createCar(String model,int price){
        Car c = new Car(model,price);
        System.out.println(c+" was created");
        return c;
    }

    ArrayList<Car> recoverCar(String string) throws IOException, ClassNotFoundException {
//    	ObjectInputStream in=new ObjectInputStream(new FileInputStream(string));
//        Car a=(Car)in.readObject();
//        System.out.println(a+" is removed");
        ArrayList<Car> list= new ArrayList<>();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(string));
        list = (ArrayList)in.readObject();
        return list;

    }

    public void storeCar(ArrayList c, String string) throws FileNotFoundException, IOException {
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(string));
        o.writeObject(c);
        System.out.println(c+" is in stored");

    }

    static class Car implements Serializable{
        String model;
        int price;
        public String getModel() {
            return model;
        }

        public int getPrice() {
            return price;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public Car(String model, int price) {
            this.model = model;
            this.price = price;
        }


    }

}

