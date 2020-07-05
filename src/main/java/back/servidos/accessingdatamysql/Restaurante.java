package back.servidos.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "tabla")
public class Restaurante {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String tipoComida;
    private String[] HorarioAbre;    //[Lun-Dom]: 1=1am 14=2pm 24=12am  abre=cierra->cerrado
    private String[] HorarioCier;    //[Lun-Dom]: 1=1am 14=2pm 24=12am
    private String nombre;
    private String sector;
    private String descripcion;
    private String telefono;
    private String icono;
    private String imagen;
    private String archivo;
    private Short precio;
    private short activo;

    public Restaurante() {
    }

    public Restaurante(Integer id, String tipoComida, Double distancia, String[] horarioAbre, String[] horarioCier, String nombre, String sector, String descripcion, String telefono, String icono, String imagen, String archivo, Short precio, short activo) {
        this.id = id;
        this.tipoComida = tipoComida;
        HorarioAbre = horarioAbre;
        HorarioCier = horarioCier;
        this.nombre = nombre;
        this.sector = sector;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.icono = icono;
        this.imagen = imagen;
        this.archivo = archivo;
        this.precio = precio;
        this.activo = activo;
    }

    //getter y setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String[] getHorarioAbre() {
        return HorarioAbre;
    }

    public void setHorarioAbre(String[] horarioAbre) {
        HorarioAbre = horarioAbre;
    }

    public String[] getHorarioCier() {
        return HorarioCier;
    }

    public void setHorarioCier(String[] horarioCier) {
        HorarioCier = horarioCier;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public Short getPrecio() {
        return precio;
    }

    public void setPrecio(Short precio) {
        this.precio = precio;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }
}