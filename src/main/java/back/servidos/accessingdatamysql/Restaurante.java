package back.servidos.accessingdatamysql;

import javax.persistence.*;

@Entity
@Table(name = "tabla")
public class Restaurante {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String Nombre;
    private String Sector;
    private String Descripcion;
    private String Telefono;
    private String Icono;
    private String Imagen;
    private String PDF;
    private String TipoComida;
    private String Lat;
    private String Lng;
    private Short Precio;
    private Short Domicilio;
    private String HoraLunesC ;
    private String HoraMartesA ;
    private String HoraMartesC ;
    private String HoraMiercolesA ;
    private String HoraMiercolesC;
    private String HoraJuevesA ;
    private String HoraJuevesC ;
    private String HoraViernesA ;
    private String HoraViernesC ;
    private String HoraSabadoA ;
    private String HoraSabadoC ;
    private String HoraDomingoA ;
    private String HoraDomingoC ;
    private short activo;

    public Restaurante() {
    }

    public Restaurante(Integer id, String nombre, String sector, String descripcion, String telefono, String icono, String imagen, String PDF, String tipoComida, String lat, String lng, Short precio, Short domicilio, String horaLunesC, String horaMartesA, String horaMartesC, String horaMiercolesA, String horaMiercolesC, String horaJuevesA, String horaJuevesC, String horaViernesA, String horaViernesC, String horaSabadoA, String horaSabadoC, String horaDomingoA, String horaDomingoC, short activo) {
        this.id = id;
        Nombre = nombre;
        Sector = sector;
        Descripcion = descripcion;
        Telefono = telefono;
        Icono = icono;
        Imagen = imagen;
        this.PDF = PDF;
        TipoComida = tipoComida;
        Lat = lat;
        Lng = lng;
        Precio = precio;
        Domicilio = domicilio;
        HoraLunesC = horaLunesC;
        HoraMartesA = horaMartesA;
        HoraMartesC = horaMartesC;
        HoraMiercolesA = horaMiercolesA;
        HoraMiercolesC = horaMiercolesC;
        HoraJuevesA = horaJuevesA;
        HoraJuevesC = horaJuevesC;
        HoraViernesA = horaViernesA;
        HoraViernesC = horaViernesC;
        HoraSabadoA = horaSabadoA;
        HoraSabadoC = horaSabadoC;
        HoraDomingoA = horaDomingoA;
        HoraDomingoC = horaDomingoC;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String sector) {
        Sector = sector;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getIcono() {
        return Icono;
    }

    public void setIcono(String icono) {
        Icono = icono;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getPDF() {
        return PDF;
    }

    public void setPDF(String PDF) {
        this.PDF = PDF;
    }

    public String getTipoComida() {
        return TipoComida;
    }

    public void setTipoComida(String tipoComida) {
        TipoComida = tipoComida;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    public Short getPrecio() {
        return Precio;
    }

    public void setPrecio(Short precio) {
        Precio = precio;
    }

    public Short getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(Short domicilio) {
        Domicilio = domicilio;
    }

    public String getHoraLunesC() {
        return HoraLunesC;
    }

    public void setHoraLunesC(String horaLunesC) {
        HoraLunesC = horaLunesC;
    }

    public String getHoraMartesA() {
        return HoraMartesA;
    }

    public void setHoraMartesA(String horaMartesA) {
        HoraMartesA = horaMartesA;
    }

    public String getHoraMartesC() {
        return HoraMartesC;
    }

    public void setHoraMartesC(String horaMartesC) {
        HoraMartesC = horaMartesC;
    }

    public String getHoraMiercolesA() {
        return HoraMiercolesA;
    }

    public void setHoraMiercolesA(String horaMiercolesA) {
        HoraMiercolesA = horaMiercolesA;
    }

    public String getHoraMiercolesC() {
        return HoraMiercolesC;
    }

    public void setHoraMiercolesC(String horaMiercolesC) {
        HoraMiercolesC = horaMiercolesC;
    }

    public String getHoraJuevesA() {
        return HoraJuevesA;
    }

    public void setHoraJuevesA(String horaJuevesA) {
        HoraJuevesA = horaJuevesA;
    }

    public String getHoraJuevesC() {
        return HoraJuevesC;
    }

    public void setHoraJuevesC(String horaJuevesC) {
        HoraJuevesC = horaJuevesC;
    }

    public String getHoraViernesA() {
        return HoraViernesA;
    }

    public void setHoraViernesA(String horaViernesA) {
        HoraViernesA = horaViernesA;
    }

    public String getHoraViernesC() {
        return HoraViernesC;
    }

    public void setHoraViernesC(String horaViernesC) {
        HoraViernesC = horaViernesC;
    }

    public String getHoraSabadoA() {
        return HoraSabadoA;
    }

    public void setHoraSabadoA(String horaSabadoA) {
        HoraSabadoA = horaSabadoA;
    }

    public String getHoraSabadoC() {
        return HoraSabadoC;
    }

    public void setHoraSabadoC(String horaSabadoC) {
        HoraSabadoC = horaSabadoC;
    }

    public String getHoraDomingoA() {
        return HoraDomingoA;
    }

    public void setHoraDomingoA(String horaDomingoA) {
        HoraDomingoA = horaDomingoA;
    }

    public String getHoraDomingoC() {
        return HoraDomingoC;
    }

    public void setHoraDomingoC(String horaDomingoC) {
        HoraDomingoC = horaDomingoC;
    }

    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }
}