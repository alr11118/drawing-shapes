public class Shapes {
    public static void main(String[] args) {
        Turtle myTurtle = new Turtle();
        myTurtle.up();
        // Task 1: Draw a regular shape
        int numOfSides = 3;
        myTurtle.setPosition(-200, 200);
        
        myTurtle.down();
        for(int i = 0; i<numOfSides; i++){
         myTurtle.forward(50);
         myTurtle.right(360/numOfSides);
        }


        // Task 2: Draw a regular shape many times
        myTurtle.up();
        myTurtle.setPosition(50, 200);
        myTurtle.down();
        
        for(int i = 0; i<10; i++){
         for(int j = 0; j<numOfSides; j++){
               myTurtle.forward(50);
               myTurtle.right(360/numOfSides);
         }
         myTurtle.right(36);
        }


        // Task 3: How many times does Turtle turn!
        


        // Extension 1:


        // Extension 2:
        
        myTurtle.show();

    }
}
