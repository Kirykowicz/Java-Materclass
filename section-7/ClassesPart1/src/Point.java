public class Point {
    private int x;
    private  int y;

    public Point(){

    }

    public Point(int x, int y) {
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

    public double distance(){
        double dist = Math.sqrt(((x - 0) * (x - 0)) + ((y - 0) * ( y- 0)));
        return dist;
    }

    public double distance(int x, int y){
        double dist = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * ( this.y- y)));
        return dist;
    }

    public double distance(Point point){
        int pointX = point.getX();
        int pointy = point.getY();

        double dist = Math.sqrt(((this.x - pointX) * (this.x - pointX)) + ((this.y - pointy) * ( this.y- pointy)));
        return dist;
    }
}
