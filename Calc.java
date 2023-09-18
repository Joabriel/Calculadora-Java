import java.util.Scanner();
class Calc{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        int num1, num2, resultado=0;
        char[] opp = {'+', '-'};
        System.out.println("Calculadora: ");
        num1 = reader.nextInt();
        opp = reader.next.charAt(0);
        num2 = reader.nextInt();
        Operaciones llamada = new Operaciones();
        switch(opp){
            case '+':
                resultado = llamada.Suma(num1, num2);
            break;
            case '-':
                resultado = llamada.Resta(num1, num2);
            break;
            default: 
            System.out.println("Error: Operación Inválida.")
            break;     
        }
        
        reader.close();
    }

}