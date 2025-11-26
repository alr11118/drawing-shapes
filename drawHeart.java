public class drawHeart {
    public static void main(String[] args) {
        Turtle myTurtle = new Turtle();
        myTurtle.speed(10);
        myTurtle.penColor("red");
        myTurtle.width(15);

        myTurtle.left(40);
        myTurtle.forward(100);
        for (int i = 0; i < 200; i++){
            myTurtle.left(1);
            myTurtle.forward(1);
        }
        myTurtle.right(110);
        for (int i = 0; i < 200; i++){
            myTurtle.left(1);
            myTurtle.forward(1);
        }
        myTurtle.forward(100);

        myTurtle.up();
        myTurtle.setPosition(100, 0);

        myTurtle.show();
    }
}