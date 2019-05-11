/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author E15Start
 */
public class Principal {

    public static InputStreamReader Leer = new InputStreamReader(System.in);
    public static BufferedReader teclado = new BufferedReader(Leer);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String entradaTeclado;
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo a = new Vehiculo();

        a.marcas = "Lamborghini";
        a.puerta = "4";
        a.chasis = "231";
        a.color = "verde";
        a.kilometraje = "100";
        a.rueda = "4";

       /* Vehiculo b = new Vehiculo();
        b.marca = "Ferrari";
        b.puerta = "4";
        b.chasis = "321";
        b.color = "azul";
        b.kilometraje = "50";
        b.rueda = "4";*/

        /*Path archivo = Paths.get("C:/PRUEBA/archivo.txt");
         Charset charset = StandardCharsets.UTF_8;

         //Lectura de arhivo
         BufferedReader reader = Files.newBufferedReader(archivo, charset);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("\f");
        System.out.print("Entra matrícula: ");
        entradaTeclado = sc.nextLine();
        vehiculo.setMatricula(entradaTeclado);
        System.out.println("Entra alguna de las siguentes marcas de vechículos: Ford, Toyota, Suzuki, Renault, Seat ");
        entradaTeclado = sc.nextLine();
        int op;
        Vehiculo auto = new Vehiculo();
        System.out.println("VEHICULO");
        System.out.println("1. Arrancar");
        System.out.println("2. Acelerar");
        System.out.println("3. Frenar");
        System.out.println("4. Estacionar");
        System.out.println("5. Salir");

        if (entradaTeclado.equalsIgnoreCase("Ford")) {
            System.out.println("Tenemos un auto de marca " + entradaTeclado + " y nro de cahsis de " + a.chasis);
            System.out.println("Elija una accion");
            
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.FORD);
            do {
                op = Integer.parseInt(teclado.readLine());

                switch (op) {
                    case 1:
                        auto.Arranque();
                        break;
                    case 2:
                        auto.Acelerar();
                        break;
                    case 3:
                        auto.Estacionar();
                        break;
                    case 4:
                        auto.Estacionar();
                        break;

                }

            } while (op < 5);

        } else
            if (entradaTeclado.equalsIgnoreCase("Toyota")) {
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.TOYOTA);
                        System.out.println("Tenemos un auto de marca " + entradaTeclado + " y nro de cahsis de " + a.chasis);
            System.out.println("Elija una accion");
            
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.FORD);
            do {
                op = Integer.parseInt(teclado.readLine());

                switch (op) {
                    case 1:
                        auto.Arranque();
                        break;
                    case 2:
                        auto.Acelerar();
                        break;
                    case 3:
                        auto.Estacionar();
                        break;
                    case 4:
                        auto.Estacionar();
                        break;

                }

            } while (op < 5);
        } else 
                if (entradaTeclado.equalsIgnoreCase("Suzuki")) {
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.SUZUKI);
                        System.out.println("Tenemos un auto de marca " + entradaTeclado + " y nro de cahsis de " + a.chasis);
            System.out.println("Elija una accion");
            
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.FORD);
            do {
                op = Integer.parseInt(teclado.readLine());

                switch (op) {
                    case 1:
                        auto.Arranque();
                        break;
                    case 2:
                        auto.Acelerar();
                        break;
                    case 3:
                        auto.Estacionar();
                        break;
                    case 4:
                        auto.Estacionar();
                        break;

                }

            } while (op < 5);
        } else if (entradaTeclado.equalsIgnoreCase("Renault")) {
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.SUZUKI);
                        System.out.println("Tenemos un auto de marca " + entradaTeclado + " y nro de cahsis de " + a.chasis);
            System.out.println("Elija una accion");
            
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.FORD);
            do {
                op = Integer.parseInt(teclado.readLine());

                switch (op) {
                    case 1:
                        auto.Arranque();
                        break;
                    case 2:
                        auto.Acelerar();
                        break;
                    case 3:
                        auto.Estacionar();
                        break;
                    case 4:
                        auto.Estacionar();
                        break;

                }

            } while (op < 5);
        } else if (entradaTeclado.equalsIgnoreCase("Seat")) {
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.SEAT);
                        System.out.println("Tenemos un auto de marca " + entradaTeclado + " y nro de cahsis de " + a.chasis);
            System.out.println("Elija una accion");
            
            vehiculo.setMarca(Vehiculo.MarcaDeVehiculo.FORD);
            do {
                op = Integer.parseInt(teclado.readLine());

                switch (op) {
                    case 1:
                        auto.Arranque();
                        break;
                    case 2:
                        auto.Acelerar();
                        break;
                    case 3:
                        auto.Estacionar();
                        break;
                    case 4:
                        auto.Estacionar();
                        break;

                }

            } while (op < 5);
        } else {
            System.out.println("No has elegido ninguna de las marcas enumaradas.");
        }

        // TODO code application logic here
    }

}
