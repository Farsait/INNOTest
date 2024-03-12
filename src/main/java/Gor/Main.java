package Gor;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Point one = new Point(1, 3); //создал точку, выделил память
        Point two = new Point(1, 3);
        Point three = new Point(5, 8);

        System.out.println(one==two);
        System.out.println(three==two);


        Line lineOne = new Line(1, 3, 5, 8);
        Line lineTwo = new Line(10, 11, 15, 19);
        Line lineThree = new Line(lineOne.finish, lineTwo.start);
        System.out.println(lineThree);
        lineThree.start.x = 99;
        lineThree.finish.x = 99;
        System.out.println(lineThree);
        System.out.println(lineOne.lenght() + lineTwo.lenght() + lineThree.lenght());


        PolyLine poly = new PolyLine(new Point(1, 5), new Point(2, 8), new Point(5, 3), new Point(8, 9));
        double polyLenght = poly.lenght();
        Line[] lines = poly.lineArray();
        double lineLenght = 0;
        for (int i = 0; i < lineLenght; i++) {
            lineLenght += lines[i].lenght();
        }
        System.out.println(polyLenght == lineLenght);
        poly.points[1].x = 12;
    }
}








