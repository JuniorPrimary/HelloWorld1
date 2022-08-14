import javax.xml.namespace.QName;

public class Student {
    private String name;
    private int StudentId ;
    private int[] marks ;

//    public Student(){
//        this();
//    }
    public Student(String name, int StudentId ){
        this.name = name;
        this.StudentId = StudentId;
    }
    public int getAvgMark(){

        return 0;
    }


    public void changeStudentId(){
    }


    public int getStudentId(){
        return StudentId;
    }
    public String getName(){
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}

