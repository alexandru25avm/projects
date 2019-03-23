package isp.examples.conveyor;



public class MyPoint {
        int x;
        int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x ,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public int Distance(MyPoint another){
        int xDiff = this.x - another.getX();
        int yDiff = this.y - another.getY();
        return (int)Math.sqrt((xDiff * xDiff) +  (yDiff * yDiff));

    }
    public int Distance(int x,int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return (int)Math.sqrt(xDiff*xDiff +  yDiff*yDiff);
    }

}