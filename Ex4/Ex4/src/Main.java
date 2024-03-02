import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int x =2 , y =3;
        soma(x,y); // faz a soma entre x e y
    }
    public static void soma(int a, int b){
        int resultado = a+b; // resultado recebe a soma dos parametros A e B
        JOptionPane.showMessageDialog(null, resultado); // Method static da class JOption
    }
}