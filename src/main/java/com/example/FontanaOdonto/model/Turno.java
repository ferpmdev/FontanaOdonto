package com.example.FontanaOdonto.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="turnos")
public class Turno {
  @Id
  @GeneratedValue
  private Long id;
  private LocalDate fecha;
  @ManyToOne
  @JoinColumn(name="paciente_id", nullable = false )
  private Paciente paciente;
  @ManyToOne
  @JoinColumn(name="odontologo_id", nullable = false )
  private Odontologo odontologo;
  
  public Turno(LocalDate fecha, Paciente paciente, Odontologo odontologo) {
    this.fecha = fecha;
    this.paciente = paciente;
    this.odontologo = odontologo;
  }
  
  public Turno(Long id, LocalDate fecha, Paciente paciente, Odontologo odontologo) {
    this.id = id;
    this.fecha = fecha;
    this.paciente = paciente;
    this.odontologo = odontologo;
  }
  
  public Turno() {
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public LocalDate getFecha() {
    return fecha;
  }
  
  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
  
  public Paciente getPaciente() {
    return paciente;
  }
  
  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }
  
  public Odontologo getOdontologo() {
    return odontologo;
  }
  
  public void setOdontologo(Odontologo odontologo) {
    this.odontologo = odontologo;
  }
  
  @Override
  public String toString() {
    return "Turno{" +
        "id=" + id +
        ", fecha=" + fecha +
        ", paciente=" + paciente +
        ", odontologo=" + odontologo +
        '}';
  }
}
