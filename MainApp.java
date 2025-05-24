public class MainApp {
    public static void main(String[] args) {
        /*Person person1=new Person("alice", 23,"teacher");
        person1.introduction();

        System.out.println("information after setter : ------->");
        person1.setName("rihan");
        person1.setAge(30);
        person1.setOccupation("teacher");

        person1.introduction();*/

        Vehicle trake =new Vehicle("TATA ", 1990, 4);
        trake.About();

        Car car=new Car("Maroty",1989, 3, 2);
        car.About();

        Motorcycle palser=new Motorcycle("palser", 2002,2 ,0, 2);
        palser.About();
    }

}
