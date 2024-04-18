package com.Penitenciaria;

import java.util.Objects;

public class PersonalCarcelario {

    private final String legajo;

    private String nombreCompleto;

    public PersonalCarcelario(String legajo, String nombreCompleto) {
        this.legajo = legajo;
        this.nombreCompleto = nombreCompleto;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalCarcelario that = (PersonalCarcelario) o;
        return Objects.equals(legajo, that.legajo) && Objects.equals(nombreCompleto, that.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legajo, nombreCompleto);
    }


    @Override
    public String toString() {
        return String.format("Nombre: %s ---- Legajo: %s", this.nombreCompleto, this.legajo);
    }
}
