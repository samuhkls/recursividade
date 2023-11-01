import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("digite o numero a ser somaded");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int a = 0;
//        int resultado = recursaosomar(n, a);
//        System.out.println(resultado);

//        System.out.println("digite ate onde voce quer contar");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        funccontadorhorario(n, 1);

        System.out.println("digite o primeiro numero");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("digite o segundo numero");
        int exp = sc.nextInt();
        System.out.println(multiplicador(n, exp));


    }
    public static int recursaosomar(int n, int resultado){
        resultado += n;
        n -= 1;

        if(n == 1){
            return resultado + 1;
        }

        return recursaosomar(n, resultado);
    }
    public static int funcContador(int n){
        System.out.println(n);
        n -= 1;
        if(n ==1){
            System.out.println(n);
            return n;
        }
        return funcContador(n);
    }
    public static int funccontadorhorario(int n, int contador){
        System.out.println(contador);
        contador += 1;
        if(contador == n){
            System.out.println(contador);
            return n;
        }
        return funccontadorhorario(n, contador);

    }
    public static int multiplicador(int n, int exp){
//        int armazena = n;
//        int resultado = n;
//        resultado += resultado;
//        n += n;
//        exp -=1;
//        if(exp == 1){
//            return n;
//        }
        if (n == 0 || exp == 0){
            return 0;
        } else if(exp > 0){
            return n + multiplicador(n, exp - 1);
        } else {
            return -multiplicador(n,-exp);
        }
    }
}
