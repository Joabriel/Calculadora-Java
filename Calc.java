import java.util.Scanner();
class Calc{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int num1, num2, resultado=0;
        System.out.println("Suma: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();

        resultado = num1+num2;
        System.out.println("El Resultado es: "+resultado);

        reader.close();
    }
}