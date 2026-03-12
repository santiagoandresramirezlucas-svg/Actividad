import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int d1 =0;
        int d2 =1;
        int s1=0;
        int s2=0;
    while (d1!=d2) {
        d1 = (int) (Math.random() * 6+1);
        s1 += d1;
        d2 = (int) (Math.random() * 6+1);
        s2 += d2;
        System.out.println("D1    D2");
        System.out.println(d1+"     "+d2);
    }
        System.out.println("Suma dado número uno:" + s1);
        System.out.println("Suma dado número dos:" + s2 );
        if(s1>s2){
            System.out.println("dado 1 es el ganador\n"  );
        } else if (s2>s1) {
            System.out.println("dado 2 es el ganador\n");
        } else {
            System.out.println("Empate\n");
        }

        //----------Ejercicio 2----------//
    Scanner lector=new Scanner(System.in);
        int intentos;
        int al;
        System.out.println("Adivinar un número aleatorio ente 1 a 10");
        System.out.println("Tiene tres oportunidades para adivinar");
        al= (int) (Math.random() * 10 +1);
    for(int i =1; i <=3; i++ ){

        System.out.println("Intento" + i);
        intentos= lector.nextInt();

        if(intentos==al){
            System.out.println("Adivinó el número");
            break;
        } else if (intentos<al) {
            System.out.println("El número a adivinar es mayor");
        } else{
            System.out.println("El número a adivinar es menor");
        }
        if(i == 3){
            System.out.println("Perdió");
        }
    }


    }
}
