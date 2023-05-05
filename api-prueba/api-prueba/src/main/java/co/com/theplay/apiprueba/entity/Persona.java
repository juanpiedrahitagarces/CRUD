package co.com.theplay.apiprueba.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="persona")

public class Persona implements Serializable {


    @GeneratedValue
    @Id
    @Column(name = "Id")
    private long id;
    @Column(name = "nombre")
    private String nombre ;
    @Column(name = "apellidos")
    private String apellidos ;
    @Column(name = "telefono")
    private  String telefono ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
