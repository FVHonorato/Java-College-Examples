import java.util.Scanner;

public class MaximumFinder {
    //Obtém três valores de ponto flutuante e localiza o valor máximo
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //solicita e insere três valores de ponto flutuante
        System.out.print("Enter three floating-point values separated by spaces:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //determina o valor máximo
        double result =  maximum(number1,number2,number3);

        //exibe o valor máximo
        System.out.println("Maximum is: "+result);
    }

    //retona o maximo dos seus três parâmetros de double
    public static double maximum(double x, double y, double z){
        double maximumValue = x; //X inicia sendo o maior valor

        //determina se Y é maior que maximumValue
        if(y>maximumValue)
            maximumValue = y;

        //determina se Z é maior que maximumValue
        if(z>maximumValue)
            maximumValue = z;

        return  maximumValue;
    }
}//fim da classe