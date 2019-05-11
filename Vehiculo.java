/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author E15Start
 */
public class Vehiculo {
        String marcas; 
    String puerta;//por ejemplo, corolla o vitz
    String rueda;//puede ser auto o camioneta
    String kilometraje;
    String chasis;
    String color;
    /**
     * Clase para crear objetos "Vehiculo" de tipo "enum" con atributos
     * "matricula" y "marca".
     *
     */
    private int velocidad;
    
        public Vehiculo() {
        this.velocidad = 0;
    }

    public int Estacionar() {
        this.velocidad = 0;
        System.out.println("El vehiculo esta estacionado");
        return this.velocidad;
    }
    
    
    public int Arranque() {
        this.velocidad = 10;
        System.out.println("Velocidad:" + this.velocidad);
        return this.velocidad;

    }

    public int Acelerar() {
        this.velocidad = this.velocidad + 10;
        System.out.println("Velocidad:" + this.velocidad);
        return this.velocidad;
    }

    public int Frenar() {
        this.velocidad = 0;
        System.out.println("Velocidad:" + this.velocidad);
        return this.velocidad;
    }


    enum MarcaDeVehiculo {

        FORD, TOYOTA, SUZUKI, RENUALT, SEAT
    };

    private String matricula;
    private MarcaDeVehiculo marca;

    /**
     * Constructor del objeto que define los atributos.
     */
  /*  public Vehiculos () {
        matricula = "";
        marca = null;
    }*/

    /**
     * Mediante un parámetro se establece la matrícula del vehículo
     *
     * @param matricula El valor del parámetro que se introduzca será el valor
     * de la matrícula.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Mediante un parámetro se establece la matrícula del vehículo
     *
     * @param marca El valor del parámetro que se introduzca será el valor de la
     * marca.
     */
    public void setMarca(MarcaDeVehiculo marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener la matrícula del Objeto
     *
     * @param Devuelve el valor de la matrícula.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Método para obtener la marca del Objeto.
     *
     * @param Devuelve el valor de la marca.
     */
    public MarcaDeVehiculo getMarca() {
        return marca;
    }

}
