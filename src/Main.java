public class Main {
    public static void main(String[] args) {
        Client cliente = new Client();
        cliente.setName("Alejandra Santana ");
        cliente.setAge(28);
        cliente.setPhone("3217484949");
        cliente.setCredit(", Tienes un credito");
        System.out.println(cliente.getName() +","+ cliente.getAge() + "años" + ", Telefono " + cliente.getPhone() + cliente.getCredit());
   }
}

class Persona{
    private String name;
    private int age;
    private String phone;

    public void setName(String yourName){
        this.name=yourName;
    }
    public String getName(){
        return name;
    }

    public void setPhone(String yourPhone){
        this.phone=yourPhone;
    }
    public String getPhone(){return phone;}

    public void setAge(int yourAge){
        this.age=yourAge;
    }
    public int getAge(){
        return age;
    }
}

class Client extends Persona{
    private String credit;
    public void setCredit(String yourCredit){
        this.credit=yourCredit;
    }
    public String getCredit(){
        return credit;
    }
}

final class Employee extends Persona{
    int salary;
}