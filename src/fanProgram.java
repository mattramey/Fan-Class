public class fanProgram{

   
    public static void main(String[] args) throws Exception {

// first fan object
fan fan1 = new fan();

        fan1.setSpeed(fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

// second fan object
fan fan2 = new fan();

        fan2.setSpeed(fan.MEDIUM);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

// print objects
System.out.println( "fan 1 " + fan1.toString());

System.out.println("fan 2 " + fan2.toString());
    }

}