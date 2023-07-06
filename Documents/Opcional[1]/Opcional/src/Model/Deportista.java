/*
Estudiante :Ana Mezu-2225958
Opcional 1 
Profesor :Luis Romo

*/
package Model;


public class Deportista {
    private int identificacion;
    private String apellidos;
    private String nombres;
    private String tipoDeporte;

    public Deportista(int identificacion, String apellidos, String nombres, String tipoDeporte) {
        this.identificacion = identificacion;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.tipoDeporte = tipoDeporte;
    }


    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }
    
}
