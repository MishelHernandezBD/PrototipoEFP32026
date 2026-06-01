//Britany Mishel Hernandez Davila 9959-24-4178
package Controlador.Carreras;

/**
 *
 * @author Mishel
 */
public class clsCarreras {
    String codigoCarrera;
    String nombreCarrera;
    String codigoFacultad;
    String estatusCarrera;

    public clsCarreras() {
    }

    public clsCarreras(String codigoCarrera, String nombreCarrera) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public clsCarreras(String codigoCarrera, String nombreCarrera, String codigoFacultad, String estatusCarrera) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.codigoFacultad = codigoFacultad;
        this.estatusCarrera = estatusCarrera;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(String codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(String codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getEstatusCarrera() {
        return estatusCarrera;
    }

    public void setEstatusCarrera(String estatusCarrera) {
        this.estatusCarrera = estatusCarrera;
    }

    @Override
    public String toString() {
        return "clsCarreras{" + "codigoCarrera=" + codigoCarrera + ", nombreCarrera=" + nombreCarrera + ", codigoFacultad=" + codigoFacultad + ", estatusCarrera=" + estatusCarrera + '}';
    }
    
    
    
}
