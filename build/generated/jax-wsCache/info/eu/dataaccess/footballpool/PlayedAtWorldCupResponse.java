
package eu.dataaccess.footballpool;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlayedAtWorldCupResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "playedAtWorldCupResult"
})
@XmlRootElement(name = "PlayedAtWorldCupResponse")
public class PlayedAtWorldCupResponse {

    @XmlElement(name = "PlayedAtWorldCupResult")
    protected int playedAtWorldCupResult;

    /**
     * Obtiene el valor de la propiedad playedAtWorldCupResult.
     * 
     */
    public int getPlayedAtWorldCupResult() {
        return playedAtWorldCupResult;
    }

    /**
     * Define el valor de la propiedad playedAtWorldCupResult.
     * 
     */
    public void setPlayedAtWorldCupResult(int value) {
        this.playedAtWorldCupResult = value;
    }

}
