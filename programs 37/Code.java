//Develope The Program To Demonstrate object And Class

public class Code{
    private int id;
    private String name;
    private double salary;

    public Code(int a , String b , double c){
        id = a ;
        name = b;
        salary = c;

    }

    public void display(){
        System.out.println("ID \t:"+id);
        System.out.println("NAME \t:"+name);
        System.out.println("SALARY \t:"+salary);
        System.out.println("..........................");
    }

    public static void main(String[] args) {
        Code E1 = new Code(101, "sam", 5000);
        Code E2 = new Code(102, "john", 7000);
        Code E3 = new Code(103, "alice", 9000);
        Code E4 = new Code(104, "adam", 8000);
        Code E5 = new Code(105, "bob", 10000);


        E1.display();
        E2.display();
        E3.display();
        E4.display();
        E5.display();
    }
}
