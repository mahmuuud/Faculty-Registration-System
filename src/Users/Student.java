package Users;

public class Student {
    private String name;
    private int age;
    private String ID;
    private int registeredCreditHours;
    private float GPA;

    public Student(String name,int age,String ID){
        this.name=name;
        this.age=age;
        this.ID=ID;
        this.GPA=2.0f;
    }

    @Override
    public String toString(){
        return "name: " +this.name+"\n"+"ID: "+this.ID;
    }

    @Override
    public boolean equals(Object obj) {
        if(((Student)obj).name.equals(this.name)&&((Student)obj).ID.equals(this.ID)&&
                ((Student)obj).registeredCreditHours==this.registeredCreditHours)
            return true;
        else return false;
    }

    public float getGPA() {
        return GPA;
    }

    public String getID() {
        return ID;
    }

    public int getRegisteredCreditHours() {
        return registeredCreditHours;
    }



    public String getName() {
        return name;
    }

    public void addHours(int ch){
        this.registeredCreditHours+=ch;
    }

    public float getPayment(){
        return 700*this.registeredCreditHours;
    }
}
