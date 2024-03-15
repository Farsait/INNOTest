package Gor;

class Line {
    Point start;
    Point finish;

    //конструктор точек
    public Line(Point start, Point finish){
        this.start=start;
        this.finish=finish;
    }

    //конструктор линии
    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1,y1),new Point(x2,y2));

    }
    //метод
    public double lenght(){
        int catetOne= start.x-finish.x;
        int catetTwo=start.y-finish.y;
        return Math.sqrt(catetTwo*catetOne+catetTwo*catetOne);
    }
    public String toString(){

        return "Line start" + start +"Line over" + finish;
    }

}
