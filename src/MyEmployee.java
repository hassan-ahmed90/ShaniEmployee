import java.util.Scanner;
public class MyEmployee {
    String id="";
    String Id;
    String contact_no;
    String name;
    String choice;
    String email;
    String salary;
    Scanner sc = new Scanner(System.in);
    public void Display(){

        System.out.println("\n     -------SHANI  MANAGEMENT SYSTEM--------\n");
        System.out.println("""
                1) Add Employee data  \s
                2) Search for Employee data by given ID \s
                3)  Edit Employee Details \s
                4)  Delete Employee Details \s
                5)  Display Employee Data \s
                6)  EXIT & Save
                """);

        choice= sc.next();

        switch (choice) {
            case "1" -> AddEmpData();
            case "2" -> searchData();
            case "3"-> editData();
            case "4"->deleteData();
            case "5"->DataDisplay();
            case "6"-> System.exit(0);
            default ->{
                System.out.println("                                *** Please enter correct input!!  ***" +
                        "\n-----------------------------------------------------------------------------------------------------------------------------");
                try{
                    Thread.sleep(2000);
                    Display();
                }catch(InterruptedException ie){
                    System.out.println("An exception occurred");
                }
            }
        }
    }
    public void DataDisplay(){
     System.out.println(name);
     System.out.println(id);
     System.out.println(salary);
     System.out.println(email);
     System.out.println(contact_no);
     try{
         Thread.sleep(2000);
         Display();
     }catch (InterruptedException e){
         System.out.println("sorry");
     }
 }
    public void editData(){
        System.out.println("Enter the id  to edit");
        Id=sc.next();
        if(id.equals(Id)){
            System.out.println("Enter the Unique Employee's ID:  ");
            id=sc.next();

            System.out.println("Enter Name:  ");
            name=sc.next();
            for(int i=0;i<=13;i++){
                System.out.println();}

            System.out.println("Enter the Contact No:  ");
            contact_no=sc.next();
            for(int i=0;i<=13;i++){
                System.out.println();}

            System.out.println("Enter email:  ");
            email=sc.next();
            for(int i=0;i<=13;i++){
                System.out.println();}

            System.out.println("Enter the salary:  ");
            salary=sc.next();
            for(int i=0;i<=13;i++){
                System.out.println();}

           try{
               Thread.sleep(2000);
               Display();
           }catch (InterruptedException e){
               System.out.println("Sorry");
           }
        }else {
            System.out.println("Enter correct input");
            try{
                Thread.sleep(2000);
                Display();
            }catch (InterruptedException e){
                System.out.println("Please Enter correct Input");
            }
        }
    }
    public void deleteData(){
        System.out.println("Enter the id for Deleting the data");
        Id=sc.next();
        if(id.equals(Id)){
            name="";
            salary="";
            email="";
            contact_no="";
        }
        else {
            System.out.println("Sorry ID does not match");
        }
        System.out.println("Employee Data deleted");
        System.out.println("Go Back to Display to press Enter");
        sc.nextLine();
        Display();
    }
    public void searchData(){
        System.out.println("Enter Employee id to search: ");
        Id=sc.next();
        if(id.equals(Id)){
            System.out.println(name);
            System.out.println(id);
            System.out.println(salary);
            System.out.println(email);
            System.out.println(contact_no);
        }
        else {
            System.out.println("Please try again");
        }
        try{
            Thread.sleep(2000);
            Display();
        }catch (InterruptedException e){
            System.out.println("sorry");
        }
    }
     public void AddEmpData(){

    System.out.println("Enter the following details:  \n");
    System.out.println("Enter the Unique Employee's ID:  ");
    id=sc.next();

    for(int i=0;i<=13;i++){
        System.out.println();}

    System.out.println("Enter Name:  ");
    name=sc.next();
    for(int i=0;i<=13;i++){
        System.out.println();}

    System.out.println("Enter the Contact No:  ");
    contact_no=sc.next();
    for(int i=0;i<=13;i++){
        System.out.println();}

    System.out.println("Enter email:  ");
    email=sc.next();
    for(int i=0;i<=13;i++){
        System.out.println();}

    System.out.println("Enter the salary:  ");
    salary=sc.next();
    Display();
}

    public static void main(String[] args) {

        MyEmployee e = new MyEmployee();
        e.Display();
    }
}
