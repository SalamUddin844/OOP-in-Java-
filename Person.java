public class Person{
    private String name;
    private int age;
    private String occupation;

    public Person() {
        this.name="NULL";
        this.age =0;
        this.occupation="NULL";
    }

    public Person(String name, int age, String occupation){
        this.name=name;
        this.age=age;
        this.occupation=occupation;
    }

    public void introduction(){

        System.err.println("\nhi i am "+name+"\n");
        System.out.println("my age is "+ age+"\n");
        System.out.println("my occupaton is "+occupation+"\n");
    }
    
    public void celebrateBirthday(){
        age++;
        System.out.printl(name + " is now "+age +"years old\n");
    }
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getOccpation(){
        return this.occupation;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    public void setOccupation(String occupation){
        this.occupation=occupation;
    }
}