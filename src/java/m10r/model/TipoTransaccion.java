package m10r.model;
// Generated Jul 1, 2018 11:19:14 PM by Hibernate Tools 4.3.1



/**
 * TipoTransaccion generated by hbm2java
 */
public class TipoTransaccion  implements java.io.Serializable {


     private Integer idTipoTransaccion;
     private String descripcionTransaccion;

    public TipoTransaccion() {
    }

    public TipoTransaccion(String descripcionTransaccion) {
       this.descripcionTransaccion = descripcionTransaccion;
    }
   
    public Integer getIdTipoTransaccion() {
        return this.idTipoTransaccion;
    }
    
    public void setIdTipoTransaccion(Integer idTipoTransaccion) {
        this.idTipoTransaccion = idTipoTransaccion;
    }
    public String getDescripcionTransaccion() {
        return this.descripcionTransaccion;
    }
    
    public void setDescripcionTransaccion(String descripcionTransaccion) {
        this.descripcionTransaccion = descripcionTransaccion;
    }




}


