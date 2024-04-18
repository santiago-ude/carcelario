package com.Penitenciaria;


import java.util.*;

public class Recluso {


    //--------------------------------------------------------------------------------------------------


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RESET = "\u001B[0m";




    //--------------------------------------------------------------------------------------------------


    private String nombreCompleto;
    private final int id;

    private static int autoId = 1;

    private int categoria;



    public Recluso(String nombreCompleto, int categoria) {
        this.nombreCompleto = nombreCompleto;
        this.id = autoId;
        this.categoria = categoria;
        autoId++;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getId() {
        return id;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recluso recluso = (Recluso) o;
        return id == recluso.id && categoria == recluso.categoria && Objects.equals(nombreCompleto, recluso.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreCompleto, id, categoria);
    }

    public String devolverCategoria(int categoria){

        String seguridad ;

        switch(categoria){

            case 1:

                seguridad = ANSI_GREEN + " Seguridad Minima" + ANSI_RESET;
                break;

            case 2:

                seguridad =  ANSI_YELLOW + "Seguridad Media" + ANSI_RESET;
            break;

            case 3:

                seguridad = ANSI_RED + "Seguridad Maxima" + ANSI_RESET;
            break;

            default:

                seguridad = "";
                break;

        }

return seguridad;
    }

    @Override
    public String toString() {
        return String.format(" Nombre: %s ---- ID: %d ---- Categoria: %s", this.nombreCompleto, this.id, this.devolverCategoria(this.categoria));
    }
}
