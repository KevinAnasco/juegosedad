import java.util.Scanner;

public class Prueba {

    Scanner sc = new Scanner(System.in);

    int Edadingresar;
    String Juegos10 = "Carrusel, Trenecito, Tiovivo, Mini Montaña Rusa, Jugos de agua";

    String Juego11_17 ="Montaña Rusa, Torre caida libre, Bumper cars, Simulador realidad virtual";

    String Juegos18 = "Top spin, Drop tower, Rueda de la fortuna, Paracaidismo en simulador de viento";


    public void Juegos(){

        System.out.println("Los juegos que se encuentran estan clasificados por edad \n\n"+Juegos10+" \n"+Juego11_17+" \n"+Juegos18);

        System.out.println("\n Ingrese su edad");
        Edadingresar = sc.nextInt();

        if (Edadingresar <= 10){

            System.out.println("Tu Edad es "+Edadingresar+"\nPuedes ingresar a los siguientes Juegos \n"+Juegos10);

        }else if (Edadingresar >10 && Edadingresar <18){

            System.out.println("Tu Edad es "+Edadingresar+"\nPuedes ingresar a los siguientes Juegos \n"+Juego11_17);

        }else if (Edadingresar >= 18){

            System.out.println("Tu Edad es "+Edadingresar+"\nPuedes ingresar a los siguientes Juegos \n"+Juegos18);
        }

}}
