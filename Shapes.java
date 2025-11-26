public class Shapes {
    public static void main(String[] args) {
        Turtle myTurtle = new Turtle();
        myTurtle.speed(10);
        myTurtle.up();
        // Task 1: Draw a regular shape
        int numOfSides = 5;
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
        int totalTurns = 0;
        myTurtle.up();
        myTurtle.setPosition(50, -100);
        myTurtle.down();
        
        for(int i = 0; i<10; i++){
         for(int j = 0; j<numOfSides; j++){
               myTurtle.forward(50);
               myTurtle.right(360/numOfSides);
               totalTurns +=1;
         }
         myTurtle.right(36);
        }
        System.out.println("myTurtle has turned " + totalTurns + " times!");
        

        // Extension 1:
        setTurtle(myTurtle, -400, -400);
        
      for(int i = 0; i<=200; i++){
         myTurtle.forward(i);
            myTurtle.right(90);
         }

        // Extension 2:
        int randomY = 0;
        for(int j =0; j<100; j++){
         randomY = (int)(Math.random()*1000)-500;
         setTurtle(myTurtle, 200, randomY);
         for(int i = 0; i<3; i++){
            myTurtle.forward(50);
            myTurtle.right(120);
         }
        }

        
        myTurtle.show();

    }
    public static void setTurtle(Turtle myTurtle, int x, int y){
      myTurtle.up();
      myTurtle.setPosition(x, y);
      myTurtle.down();
    }
}
