package Gor;

public class Point {
    int x; //переменные создал
    int y;

    //конструктор создал
public Point(int x, int y) {
    this.x = x;
    this.y = y;
}
    public String toString() {
        return "{"+x+":"+y+"}";
    }
}
