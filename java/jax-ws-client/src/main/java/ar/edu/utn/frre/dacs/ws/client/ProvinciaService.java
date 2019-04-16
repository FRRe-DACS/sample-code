
package ar.edu.utn.frre.dacs.ws.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProvinciaService", targetNamespace = "http://server.ws.dacs.frre.utn.edu.ar/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProvinciaService {


    /**
     * 
     * @return
     *     returns java.util.List<ar.edu.utn.frre.dacs.ws.client.Provincia>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listProvincias", targetNamespace = "http://server.ws.dacs.frre.utn.edu.ar/", className = "ar.edu.utn.frre.dacs.ws.client.ListProvincias")
    @ResponseWrapper(localName = "listProvinciasResponse", targetNamespace = "http://server.ws.dacs.frre.utn.edu.ar/", className = "ar.edu.utn.frre.dacs.ws.client.ListProvinciasResponse")
    public List<Provincia> listProvincias();

}
