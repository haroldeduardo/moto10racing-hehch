
package m10r.imp;

import m10r.dao.DetalleVentaDao;
import m10r.model.DetalleVenta;
import m10r.model.DetalleVenta;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author CSR
 */
public class DetalleVentaImp implements DetalleVentaDao{

    @Override
    public boolean ingresarDetalleVenta(Session sessionIngresarDetalleVenta, DetalleVenta detalleVenta) throws Exception {
        sessionIngresarDetalleVenta.save(detalleVenta);
        return true; 
    }
    
}