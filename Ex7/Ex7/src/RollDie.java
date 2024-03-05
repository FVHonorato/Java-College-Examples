import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        //Objeto produzirá números aleatorios seguros
        SecureRandom randomNumbers = new SecureRandom();


        int frequency1 =0;
        int frequency2 =0;
        int frequency3 =0;
        int frequency4 =0;
        int frequency5 =0;
        int frequency6 =0;

        //soma 600k lancamentos de um dado
        for(int roll = 1; roll <=600000; roll++){
            int face = 1 + randomNumbers.nextInt(6);//número entre 1 e 6

            //usa o valor 1-6 para as faces a fim de determinar qual contados incrementar
            switch (face){
                case 1:
                    ++frequency1; // incrementar o contador de 1s
                    break;

                case 2:
                    ++frequency2; // incrementar o contador de 2s
                    break;

                case 3:
                    ++frequency3; // incrementar o contador de 3s
                    break;

                case 4:
                    ++frequency4; // incrementar o contador de 4s
                    break;

                case 5:
                    ++frequency5; // incrementar o contador de 5s
                    break;

                case 6:
                    ++frequency6; // incrementar o contador de 6s
                    break;
            }
        }

        System.out.println("Face\tFrequency");
        System.out.printf("%d%n1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6",frequency1,frequency2,frequency3,frequency4,frequency5,frequency6);
    }
}//final da class