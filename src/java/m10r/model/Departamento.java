package m10r.model;
// Generated Jul 1, 2018 11:19:14 PM by Hibernate Tools 4.3.1



/**
 * Departamento generated by hbm2java
 */
public class Departamento  implements java.io.Serializable {


     private Integer idDepartamento;
     private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(String nombreDepartamento) {
       this.nombreDepartamento = nombreDepartamento;
    }
   
    public Integer getIdDepartamento() {
        return this.idDepartamento;
    }
    
    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }
    
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }




}


