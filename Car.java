public class Car extends Vehicle {
    private int numberofDoor;
    public Car(){
        this.brand="NULL";

        this.numberofDoor=0;
    }
    public Car (String brand, int year, int wheel, int numberofDoor){
       
        super(brand, year, wheel);
        this.numberofDoor=numberofDoor;
    }
}
