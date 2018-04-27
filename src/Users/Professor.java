package Users;

import Faculty.Course;

public class Professor {
    private String name;
    private int age;
    private String ID;
    private Course[] teachingCourses;
    private int ch;


    public Professor(String name,int age,String ID){
        this.ch=0;
        this.name=name;
        this.age=age;
        this.ID=ID;
        teachingCourses=new Course[3]; //maximum number for prof to teach is three courses
        for(int i=0;i<3;i++)
            teachingCourses[i]=null;

    }

    public boolean isAvailable(){
        if(this.ch<9)
            return true;
        else return false;
    }

    public void addCourse(Course c){
        if(this.isAvailable()){
            for(int i=0;i<3;i++)
                if(this.teachingCourses[i]==null) {
                    this.teachingCourses[i] = c;
                    break;
                }
        }
    }

    public void setCh(int ch) {
        this.ch += ch;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+"\n"+"ID: "+this.ID;
    }

    public int getSalary(){
        return this.ch*500;
    }



}
