import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total = 0; // soma das notas
        int gradeCounter = 0; // número das notas inseridas
        int aCount = 0; //contagem de notas A
        int bCound = 0; //contagem de notas B
        int cCount = 0; //contagem de notas C
        int dCount = 0; //contagem de notas D
        int fCount = 0; //contagem de notas F

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n", "Enter the integer grades in the range 0-100.","Type the end-of-file indicator on terminate input:","On UNIX/Linux/Mac OS X type <Ctrl> d the press Enter", "On Windows type <Ctrl> z then press Enter");

        //faz loop até o usuário inserir o indicador de fim de arquivo
        while(input.hasNext()){
            int grade = input.nextInt(); //lê nota
            total += grade; //adiciona a nota a total
            ++gradeCounter; //incrementa o número de notas

            //incrementa o contador de letras de notas adequado
            switch (grade / 10){
                case 9: //a nota estava entre 90
                case 10: //e 100
                    ++aCount;
                    break; //sai do switch

                case 8: //nota estava entre 80 e 89
                    ++bCound;
                    break;

                case 7: //nota estava entre 70 e 79
                    ++cCount;
                    break;

                case 6: //nota estava entre 60 e 69
                    ++dCount;
                    break;

                default: // a nota era menor que 60
                    ++fCount;
                    break;
            }
        }
        //exibe o relátorio da nota
        System.out.printf("%nGrade Report: %n");

        //se usuário inseriu pelomenos uma nota...
        if(gradeCounter != 0){

            //calcular a média de todas as notas inseridas
            double average = (double) total/gradeCounter;

            //gera a saida de resumo de resultados
            System.out.printf("Total of the %d grades entered is %d%n",gradeCounter, total);
            System.out.printf("Class average is %.2f%n",average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n","Number of students who received each grade:","A: ",aCount, "B: ",bCound, "C: ",fCount, "D: ",dCount, "F:", fCount);

        }else{
            System.out.println("No grades where entered");
        }
    }//fim main
}//fim classe
