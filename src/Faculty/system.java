package Faculty;

import Users.Professor;
import Users.Student;

import java.util.ArrayList;

public class system {
    private static ArrayList<Course> courses=new ArrayList<>();
    public static ArrayList<Student> students=new ArrayList<>();
    private static ArrayList<Professor> professors=new ArrayList<>();
    protected static ArrayList<Class> classes=new ArrayList<>();

    public static Course getCourse(String code){
        for(int i=0;i<courses.size();i++){
            if(courses.get(i).getCourseCode().equals(code))
                return courses.get(i);
        }
        return null;
    }

    public static void addCourse(Course c){
        courses.add(c);
    }

    public static void addStudent(Student s){
        students.add(s);
    }

    public static void addProf(Professor p){
        professors.add(p);
    }

    public static boolean isCourse(Course c){
        for (int i =0;i<courses.size();i++){
            if(courses.get(i).equals(c))
                return true;
        }
        return false;
    }

    public static boolean isStudent(Student s){
        for (int i =0;i<students.size();i++){
            if(students.get(i).equals(s))
                return true;
        }
        return false;

    }

    public static Student getStudent(String name,String ID){
        for(int i=0;i<students.size();i++){
            if(students.get(i).getName().equals(name)&&students.get(i).getID().equals(ID))
                return students.get(i);
        }
        return null;
    }

    //the whole building consists of 32 classRooms
    public static void initializeRooms(){
        for(int i=0;i<32;i++){
            Class c=new Class(""+(i+1));
            classes.add(c);
        }
    }

    public static Professor getProfessor(String name){
        for(int i=0;i<professors.size();i++){
            if(professors.get(i).getName().equals(name))
                return professors.get(i);
        }
        return null;
    }


}
