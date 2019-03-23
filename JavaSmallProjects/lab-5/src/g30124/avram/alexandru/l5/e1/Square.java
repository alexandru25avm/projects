package g30124.avram.alexandru.l5.e1;

public abstract class Square extends Rectangle {
    public Square() {
    }

    public Square(double side){
        super.width= side;
        super.lenght= side;
    }

    public Square(String color, boolean filled, double side) {
        super.width= side;
        super.lenght= side;
        super.color=color;
        super.filled=filled;
    }

    public double getSide(double side){
        return super.lenght;
    }

    public void setSide(double side){
        this.lenght=side;
        this.width=side;
    }

    public void setWidth(double side){
        super.lenght= side;
    }
    public void setLenght(double side){
        super.width=side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "+width=lenght="+width+
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}
