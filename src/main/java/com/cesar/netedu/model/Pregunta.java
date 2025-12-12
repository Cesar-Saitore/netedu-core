package com.cesar.netedu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "preguntas")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String enunciado; // Ej: "¿Qué capa del modelo OSI maneja IPs?"

    @Column(nullable = false)
    private String opcionA;
    
    @Column(nullable = false)
    private String opcionB;
    
    @Column(nullable = false)
    private String opcionC;
    
    @Column(nullable = false)
    private String opcionCorrecta; // Ej: "A", "B" o "C"

    private int puntos; // Cuánto vale esta pregunta (Gamificación)

    // Constructores, Getters y Setters
    public Pregunta() {}

    public Pregunta(String enunciado, String opA, String opB, String opC, String correcta, int puntos) {
        this.enunciado = enunciado;
        this.opcionA = opA;
        this.opcionB = opB;
        this.opcionC = opC;
        this.opcionCorrecta = correcta;
        this.puntos = puntos;
    }

    public Long getId() { return id; }


    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionCorrecta() {
        return opcionCorrecta;
    }

    public void setOpcionCorrecta(String opcionCorrecta) {
        this.opcionCorrecta = opcionCorrecta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}