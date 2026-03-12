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
        System.out.println("Suma dado numero uno:" + s1);
        System.out.println("Suma dado numero dos:" + s2 );
        if(s1>s2){
            System.out.println("dado 1 es el ganador\n"  );
        } else if (s2>s1) {
            System.out.println("dado 2 es el gandor\n");
        } else {
            System.out.println("Empate\n");
        }

        //----------Ejerccio 2----------//
        Scanner lector=new Scanner(System.in);
        System.out.println("Adivinar un número aleatorio ente 1 a 10");
        System.out.println("Tiene tres oportunidades para adivinar");
    int intentos;
    int al= (int)(Math.random() * 10 +1);
    for(int i =1; i <=3; i++ ){
        System.out.println("Intento" + i);
        intentos= lector.nextInt();
        if(intentos==al){
            System.out.println("Adivinó el número");
            break;
        } else if (intentos<al) {
            System.out.println("El numero a adivinar es mayor");
        } else{
            System.out.println("El numero a adivinar es menor");
        }
        if(i == 3){
            System.out.println("Perdió");
        }
    }


    }
}
