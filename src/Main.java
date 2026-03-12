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
    //----------Ejercicio 3----------//
        System.out.println("Juego de la ruleta");
    int bala = (int) (Math.random() * 5+1);
    boolean e1= false;
    boolean e2= false;
    boolean e3= false;
    boolean e4= false;
    boolean e5= false;
    switch (bala){
        case 1:
            e1= true;
            break;
        case 2:
            e2= true;
            break;
        case 3:
            e3= true;
            break;
        case 4:
            e4= true;
            break;
        case 5:
            e5= true;
            break;
    }
    for(int i =0; i <=5; i++) {
        if (e1 == true) {
            System.out.println("persona 1 dispara y muere");
            break;
        } else {
            System.out.println("persona 1 dispara y sobrevive");
        }
        if (e2 == true) {
            System.out.println("persona 2 dispara y muere");
            break;
        } else {
            System.out.println("persona 2 dispara y sobrevive");
        }
        if (e3 == true) {
            System.out.println("persona 3 dispara y muere");
            break;
        } else {
            System.out.println("persona 3 dispara y sobrevive");
        }
        if (e4 == true) {
            System.out.println("persona 4 dispara y muere");
            break;
        } else {
            System.out.println("persona 4 dispara y sobrevive");
        }
        if (e5 == true) {
            System.out.println("persona 5 dispara y muere");
            break;
        } else {
            System.out.println("persona 5 dispara y sobrevive");
        }
    }
        System.out.println(" ");
    //----------Ejercicio 3 mejorado----------//

        System.out.print("Escibir cantidad de personas que quieren jugar: ");
    int Pnumero= lector.nextInt();
    int bala2 = (int) (Math.random() * 5+1);
    int disparar= bala2;
    int cartucho=1;

    boolean muerto= false;

    while(muerto!=true) {
        for (int i= 1; i <=Pnumero;i++){
            System.out.println("Turno del cartucho: "+ cartucho);
            System.out.println("Vala en cartucho: " + disparar);
            if (disparar == cartucho) {
                System.out.println("Persona " + i + " dispara y muere");
                muerto = true;
                break;
            } else {
                System.out.println("Persona " + i + " dispara y sobrevive");
                if (cartucho >= 5) {
                    cartucho = 1;
                } else {
                    cartucho += 1;
                }
                bala2 = (int) (Math.random() * 5 + 1);
                disparar = bala2;
            }

            }
    }

    }
}
