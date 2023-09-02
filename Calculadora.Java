import java.util.Scanner();

class Calculadora{
	public static void main(String[]args){
		Scanner reader = new Scanner(system.in);
		int num1, num2, resultado;
		char operador[] = {'+', '-', '*', '/'};

		System.out.println("Ingrese Operción: ");
		num1 = reader.nextInt;
		operador = reader.next();
		num2 = reader.nextInt();

		switch(operador){
		case '+':
			resultado = Suma(num1, num2);
			break;
		case '-':
			resultado = Resta(num1, num2);
			break;
		case '*':
			resultado = Multiplicacion(num1, num2);
			break;
		case '/':
			resultado = Division(num1, num2);
		}	

	}

	public int Suma(int a, int b){
		return a+b;
	}
	public int Resta(int a, int b){
		return a-b;
	}
	public int Multiplicacion(int a, int b){
		return a*b;
	}
	public int Division(int a, int b){
		return a/b;
	}
}