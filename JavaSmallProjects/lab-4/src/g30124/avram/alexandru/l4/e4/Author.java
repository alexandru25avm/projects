package g30124.avram.alexandru.l4.e4;
import java.util.*;
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }
    public String getEmail() {

        return email;
    }
    public void setEmail(String email) {

        this.email = email;
    }

    public char getGender() {

        return gender;
    }


    public String toString() {

        return "'" + name +"'"+"(" + gender +") " +"at email:" + email;
    }

    public static void main(String[] args) {

        Author Mihai_Eminescu = new Author("Mihai Eminescu","mishu@junimea.com",'M');
        System.out.println(Mihai_Eminescu.toString());
    }

}
