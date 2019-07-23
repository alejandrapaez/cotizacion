/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.*;


/**
 *
 * @author aapaez
 */
@WebService(serviceName = "Cotizacion")
public class Cotizacion {
    List<socio> Lssocios = new ArrayList<>();
    /**
     * This is a sample web service operation
     * @param monto
     * @return 
     */
    @WebMethod(operationName = "cotizacion")
    public credito cotizacion (@WebParam(name = "montoprestar") int monto) {
        Double valor;
        int couta = 36;
        credito cre= new credito();
       
        /*socio s = new socio();
        s.setId(1);
        s.setNombre("juan");
        s.setTasa(1.5);
        s.setMontomaximo(5000000D);
        Lssocios.add(s);
        
        socio ss = new socio();
        ss.setId(2);
        ss.setNombre("maria");
        ss.setTasa(2.0);
        ss.setMontomaximo(3000000D);
        Lssocios.add(ss);*/

        SocioDAO so = new SocioDAO();
        Lssocios = so.listasocio();
        
        if (Objects.nonNull(Lssocios)) {
            if (monto != 0) {
                for (socio soci : Lssocios) {
                    if (monto < soci.getMontomaximo()) {
                        valor = (double) (monto * (1 + (couta * (soci.getTasa() / 100))));
                        
                        cre.setCreditototal(valor);
                        cre.setNombre(soci.getNombre());
                        cre.setTasa(soci.getTasa()+"%");
                        cre.setValorcouta(valor/couta);
                    }
                }
            }
        }
        return cre;
    }
}
