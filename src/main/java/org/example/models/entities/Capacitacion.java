package org.example.models.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "capacitacion")
public class Capacitacion {
    @Column(name = "rut_cliente")
    private Integer rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    @Id
    @NonNull
    @Column(name = "id_capacitacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCapacitacion;
    private String duracion;
    @Column(name = "cantidad_asistentes")
    private Integer cantidadAsistentes;

    public Capacitacion(){
    }

    public Capacitacion(Integer rutCliente, String dia, String hora, String lugar, @NonNull Long idCapacitacion, String duracion, Integer cantidadAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.idCapacitacion = idCapacitacion;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Capacitacion(Integer rutCliente, String dia, String hora, String lugar, String duracion, Integer cantidadAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Integer getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Integer rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Long getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(Long idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }

    public Integer getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(Integer cantidadAsistentes) {
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "idCapacitacion=" + idCapacitacion +
                ", duracion='" + duracion + '\'' +
                ", cantidadAsistentes=" + cantidadAsistentes +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                "} ";
    }

    public void mostrarDetalle(){
        System.out.println("La capacitación será en " + lugar + " a las " + hora + "\n" +
                "del día " + dia + " y durará " + duracion + " minutos.");
    }
}
