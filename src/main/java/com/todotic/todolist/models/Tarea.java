package com.todotic.todolist.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tareas")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Integer id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private boolean completado;

    public Tarea(Integer id, String nombre, boolean completado) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.completado = completado;
    }

    public Tarea(String nombre, boolean completado) {
        super();
        this.nombre = nombre;
        this.completado = completado;
    }

    public Tarea() {
        super();
    }
}
