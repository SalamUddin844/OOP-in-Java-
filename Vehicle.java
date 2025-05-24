public class Vehicle {
    private String brand;
    private int year;
    private int  wheel;

    public Vehicle(){
        this.brand="NULL";
        this.year=0;
        this.wheel=0;
    }

    public Vehicle(String brand, int year, int wheel){
        this.brand=brand;
        this.year=year;
        this.wheel=wheel;
    }

    public void About(){
        System.out.println("This is "+brand+" brand and it made at the year of  "+ year+" and have "+wheel+" wheel");
    }
}
