public class Student{
    private String name;
    private double average;

    //method construct
    public Student(String name, double average){
        this.name = name;

        if(average > 0.0)
            if(average <= 100.0)
                this.average = average;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //defina e média de Student
    public void setAverage(double studentAverage){
        //valida que a média é >0.0 e <= 100.0
        if(average > 0.0)
            if(average<=100.0)
                this.average = average;
    }

    //recupera a média de student
    public double getAverage(){
        return average;
    }

    //deternima e retorna a letra da note de Student
    public String getLetterGrade(){
        String letterGrade = "";

        if(average >= 90.0)
            letterGrade = "A";
        else if (average >= 80.0)
            letterGrade = "B";
        else if (average >=70)
            letterGrade = "C";
        else
            letterGrade = "F";

        return letterGrade;
    }
} //finaliza a class Student
