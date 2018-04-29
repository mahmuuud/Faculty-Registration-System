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
        teachingCourses=new Course[3]; //maximum number of courses for prof to teach is three courses
        for(int i=0;i<3;i++)
            teachingCourses[i]=null;

    }

    public boolean isAvailable(){
        if(this.ch<9)
            return true;
        else return false;
    }

    public void teachCourse(Course c){
        if(this.isAvailable()&&c.getInstructorName()==null){ //course is available with no instructor yet
            for(int i=0;i<3;i++)
                if(this.teachingCourses[i]==null) {
                    this.teachingCourses[i] = c;
                    this.ch+=c.getCh();
                    c.setInstructorName(this.name);
                    break;
                }
        }
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

    public int getCh() {
        return ch;
    }
}
