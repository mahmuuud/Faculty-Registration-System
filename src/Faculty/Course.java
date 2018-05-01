package Faculty;

import Users.Professor;
import Users.Student;

public class Course {
    private Student[] registeredStudents;
    private String courseCode;
    private int ch;
    private boolean isAvailable;
    private String instructorName; //null by default


    public Course(String courseCode,int ch,String instructorName){
        this.courseCode=courseCode;
        this.ch=ch;
        this.registeredStudents=new Student[160];
        this.instructorName=instructorName;
        for(int i=0;i<160;i++)
            registeredStudents[i]=null;
    }

    @Override
    public boolean equals(Object obj){
        if(((Course)obj).instructorName.equals(this.instructorName)&&((Course)obj).courseCode.equals(this.courseCode))
            return true;
        return false;
    }

    @Override
    public String toString(){
        return "\n"+"Course:"+"\n"+this.courseCode+"\n"+"Instructor name: "+this.instructorName+"\n"+
                "Credit Hours: "+this.ch+"\n"+"Is available: "+this.isAvailable;
    }

    public int getNumberOfRegisteredStudents() {
        int n=0;
        for(int i=0;i<160;i++){
            if(registeredStudents[i]!=null)
                ++n;
        }
        return n;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isRegistered(Student s){
        for(int i=0;i<160;i++)
            if(this.registeredStudents[i]==s)
                return true;
        return false;
    }

    public void register(Student s){
        if(this.isAvailable&&!(isRegistered(s))&&this.isAvailable&&s.getRegisteredCreditHours()+this.ch<=20
                &&s.getGPA()>=2.0||s.getRegisteredCreditHours()+this.ch<=12&&s.getGPA()<2.0)
        {
            for(int i=0;i<160;i++){
                if(this.registeredStudents[i]==null){
                    this.registeredStudents[i]=s;
                    this.registeredStudents[i].addHours(this.ch);
                    break;
                }
            }


        }
    }

    public String getCourseCode(){return this.courseCode;}

    public void drop(Student s){
        if(isRegistered(s)){
            for(int i=0;i<160;i++)
                if(this.registeredStudents[i]==s) {
                    registeredStudents[i].addHours(-this.ch);
                    registeredStudents[i] = null;
                    break;
                }
        }
    }

    public void withdraw(Student s){
        if(isRegistered(s)){
            for(int i=0;i<160;i++){
                if(registeredStudents[i]==s){
                    registeredStudents[i]=null;
                    break; //don't decrement the student credit hours as he pays the CH of the withdrawn courses
                }
            }
        }
    }

    public void offer(){
        this.isAvailable=true;
    }

    public void close(){
        this.isAvailable=false;

    }

    public Student[] getRegisteredStudents() {
        return this.registeredStudents;
    }

    public int getCh() {
        return ch;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }
}
