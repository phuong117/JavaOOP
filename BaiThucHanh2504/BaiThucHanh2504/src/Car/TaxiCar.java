package Car;

class TaxiCar implements Car {
public void move(){ 
    System.out.println("move.");
}

public void stop(){
    System.out.println("stopp.");
}

public void turnLeft(){
    System.out.println("turned left.");
}

public void turnRight(){
    System.out.println("turned right.");
}

public void reverse(){
    System.out.println("reverse.");
}
}
