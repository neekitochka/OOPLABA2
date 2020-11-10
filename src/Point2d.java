public class Point2d {
    public double xCoord;
    public double yCoord;

    public Point2d (double x, double y){
        xCoord = x;
        yCoord = y;
    }

    public Point2d (){
        this(0, 0);
    }

    public double getX(){
        return xCoord;
    }

    public double getY(){
        return yCoord;
    }

    public void SetX(double val){
        xCoord = val;
    }

    public void SetY(double val){
        yCoord = val;
    }

    public boolean CompareCoord(Point2d object){
        return this.xCoord == object.xCoord && this.yCoord == object.yCoord;
    }
}
