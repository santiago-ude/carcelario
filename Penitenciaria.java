package com.Penitenciaria;


import com.Penitenciaria.*;

import javax.management.BadBinaryOpValueExpException;
import java.awt.*;
import java.util.*;
import java.util.ArrayList;
public class Penitenciaria  {


    //--------------------------------------------------------------------------------------------------


    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static final String ANSI_RESET = "\u001B[0m";




    //--------------------------------------------------------------------------------------------------




    private ArrayList<Recluso> reclusos;
    private ArrayList<PersonalCarcelario> personalPenitenciario;

    private ArrayList<Actividades> actividades;


    public Penitenciaria() {
        this.reclusos = new ArrayList<>();
        this.personalPenitenciario = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }


    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------

    public void cargarDatosPredeterminados(ArrayList<Recluso> reclusos){

        Recluso recluso = new Recluso("Robero Carlos", 1);
        reclusos.add(recluso);

        recluso = new Recluso("Neymar Jr", 2);
        reclusos.add(recluso);

        recluso = new Recluso("Daniel Alves", 1);
        reclusos.add(recluso);

        recluso = new Recluso("Cafu Jr", 3);
        reclusos.add(recluso);

        recluso = new Recluso("Ronal Dinho", 2);
        reclusos.add(recluso);

        recluso = new Recluso("Fernan Dinho", 1);
        reclusos.add(recluso);
        recluso = new Recluso("Ronaldo Nazario", 3);
        reclusos.add(recluso);

        recluso = new Recluso("Marcelo Twence", 2);
        reclusos.add(recluso);

        recluso = new Recluso("Vinicius Jr", 1);
        reclusos.add(recluso);

        recluso = new Recluso("Rodrigo Ninho", 1);
        reclusos.add(recluso);

        PersonalCarcelario personal = new PersonalCarcelario("1234", "Daniel Zabaleta");
        personalPenitenciario.add(personal);

        personal = new PersonalCarcelario("1", "Daniel Zabaleta");
        personalPenitenciario.add(personal);

        personal = new PersonalCarcelario("2", "Martin Demichelis");
        personalPenitenciario.add(personal);

        personal = new PersonalCarcelario("3", "Jonathan Maidana");
        personalPenitenciario.add(personal);

        personal = new PersonalCarcelario("4", "Pablo Solari");
        personalPenitenciario.add(personal);

        personal = new PersonalCarcelario("5", "Facundo Colidio");
        personalPenitenciario.add(personal);


        Actividades actividad = new Actividades("Jugar al futbol", 2);
        actividades.add(actividad);

        actividad = new Actividades("Ir a la biblioteca", 1);
        actividades.add(actividad);

        actividad = new Actividades("Salir al patio", 3);
        actividades.add(actividad);

        actividad = new Actividades("Taller Arcilla", 2);
        actividades.add(actividad);

        actividad = new Actividades("Pintar", 1);
        actividades.add(actividad);



    }

    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------


    public void listarReclusos(ArrayList<Recluso> reclusos){


        System.out.println(ANSI_RED + "\nLISTA DE RECLUSOS" + ANSI_RESET);

        for(int i = 0; i < reclusos.size(); i++){

            System.out.println(reclusos.get(i).toString());

            }
    }


    public void listarPersonal(ArrayList<PersonalCarcelario> personal){


        System.out.println(ANSI_GREEN + "\nLISTA DE PERSONAL CARCELARIO" + ANSI_RESET);

        for(int i = 0; i < personal.size(); i++){

            System.out.println(personal.get(i).toString());

        }
    }

    public void listarActividades(ArrayList<Actividades> actividades){


        System.out.println(ANSI_YELLOW + "\nLISTA DE ACTIVIDADES" + ANSI_RESET);

        for(int i = 0; i < actividades.size(); i++){

            System.out.println(actividades.get(i).toString());

        }
    }


    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------


    public void iniciar(Penitenciaria penitenciaria){

        penitenciaria.cargarDatosPredeterminados(reclusos);
        penitenciaria.listarReclusos(reclusos);
        penitenciaria.listarPersonal(personalPenitenciario);
        penitenciaria.listarActividades(actividades);
        penitenciaria.menuBuscarRecluso();


    }


    //--------------------------------------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------------------------------------


    public int buscarRecluso(){

        String reclusoBuscado;
        Scanner scanner = new Scanner(System.in);
        int posReclusoBuscado = -1;


        System.out.println("Inserte nombre del recluso: ");
        reclusoBuscado = scanner.nextLine();

        for(int i = 0; i < reclusos.size(); i++){

            if(reclusoBuscado == reclusos.get(i).getNombreCompleto()){

                posReclusoBuscado = i;
                break;
            }
        }


        return posReclusoBuscado;
    }

    void menuBuscarRecluso(){


        int posRecluso = buscarRecluso();

        if(posRecluso != -1){

            System.out.println( ANSI_GREEN + "\nRECLUSO ENCONTRADO: \n" + ANSI_RESET);
            String.format("Nombre: %s \n",this.reclusos.get(posRecluso).getNombreCompleto());
            String.format("Categoria: %s", this.reclusos.get(posRecluso).devolverCategoria(reclusos.get(posRecluso).getCategoria()));
            String.format("ID: %d \n", this.reclusos.get(posRecluso).getId());

        }
        else{

            System.out.println( ANSI_RED + "\nRECLUSO NO ENCONTRADO: \n" + ANSI_RESET);
        }
    }





}
