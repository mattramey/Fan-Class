public class fan {

// three constants that that will denote fan speed
   public static final int SLOW = 1;

    public static final int MEDIUM = 2;

    public static int FAST = 3;

// private data fields

    private int speed;

    private boolean on;

    private double radius;

    private String color; 

// set constructor to default parameters

public fan (){
    speed = SLOW;
    on = false;
    radius = 5;
    color = "blue";
}

// accessor methods for the four data fields

public int getSpeed(){
    return speed;
}

public boolean isOn(){
    return on;
}

public double getRadius(){
    return radius;
}

public String getColor(){
    return color;
}

// mutator methods for the four data fields

public void setSpeed(int speed){
    this.speed = speed;
}

public void setOn(boolean on){
    this.on = on;
}

public void setRadius(double radius){
    this.radius = radius;
}

public void setColor(String color){
    this.color = color;
}

// method toString()
public String toString(){
    if (on){
        return "Speed " + speed + "," + " Color " + color + "," + " Radius " + radius;
    } else {
        return " Color " + color + "," + " radius " + radius + "," + " fan is off";
         }
    }
}

