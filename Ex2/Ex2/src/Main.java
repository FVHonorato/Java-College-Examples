public class Main {
    public static void main(String[] args) {
        Student acount1 = new Student("john", 80.5);
        Student acount2 = new Student("mary",90.0);

        System.out.printf("%s's lettergrade is: %s%n",acount1.getName(),acount1.getLetterGrade());
        System.out.printf("%s's lettergrade is: %s%n",acount2.getName(),acount2.getLetterGrade());
    }
}