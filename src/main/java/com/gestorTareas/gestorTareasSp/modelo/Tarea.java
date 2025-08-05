package com.gestorTareas.gestorTareasSp.modelo;

import lombok.Data;

@Data
public class Tarea {
    private Long id;
    private String titulo;
    private String descripcion;
    private boolean completada;
}
