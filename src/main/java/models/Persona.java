package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Personas")
public class Persona {
  @Id
  private String _id;
  private String nombre;
  private String segundoNombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private int edad;
  private String oficio;
  private String sexo;
  private String telefono;
  private Object[] dispositivos;

  public int getEdad() {
    return edad;
  }

  public Object[] getDispositivos() {
    return dispositivos;
  }

  public String get_id() {
    return _id;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public String getNombre() {
    return nombre;
  }

  public String getOficio() {
    return oficio;
  }

  public String getSegundoNombre() {
    return segundoNombre;
  }

  public String getSexo() {
    return sexo;
  }

  public String getTelefono() {
    return telefono;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public void setDispositivos(Object[] dispositivos) {
    this.dispositivos = dispositivos;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setOficio(String oficio) {
    this.oficio = oficio;
  }

  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}