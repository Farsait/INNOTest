package Gor;

import java.util.Arrays;

public class PolyLine {
    Point[]points;
    public PolyLine(Point... points){
        this.points=points;
    }
    public Line[] tolineArray(){
        Line[]arr=new Line[points.length-1];
        for (int i=1; i< points.length; i++){
            arr[i-1]=new Line(points[i-1],points[i]);
        }
        return arr;
    }
      public double lenght(){
        Line[] lines=tolineArray();
        double sum=0;
        for (int i=0; i< lines.length;i++){
            sum+=lines[i].lenght();
        }
        return sum;
    }
    public String toString(){

        return "Line{" + Arrays.toString(points) + '}';
    }

}
