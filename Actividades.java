package com.Penitenciaria;

import java.util.Objects;

public class Actividades {


    //--------------------------------------------------------------------------------------------------


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RESET = "\u001B[0m";




    //--------------------------------------------------------------------------------------------------

    private String nombreActividad;
    private final int tipoActividad;


    public Actividades(String nombreActividad, int tipoActividad) {
        this.nombreActividad = nombreActividad;
        this.tipoActividad = tipoActividad;
    }


    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public int getTipoActividad() {
        return tipoActividad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actividades that = (Actividades) o;
        return tipoActividad == that.tipoActividad && Objects.equals(nombreActividad, that.nombreActividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreActividad, tipoActividad);
    }



    public String devolverTipo(){


        String tipitoActividad;

        switch(this.tipoActividad){

            case 1:

                tipitoActividad = ANSI_GREEN + " Seguridad Minima" + ANSI_RESET;

                break;

            case 2:

                tipitoActividad = ANSI_YELLOW + " Seguridad Media" + ANSI_RESET;

                break;

            case 3:

                tipitoActividad = ANSI_RED + " Seguridad Maxima" + ANSI_RESET;

                break;

            default:
                tipitoActividad = "";
                break;




        }




return tipitoActividad;
    }

    @Override
    public String toString() {
        return String.format("Actividad: %s ----- Tipo Actividad: %s",this.nombreActividad, this.devolverTipo());
    }
}


