package Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "FILM")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Film {
    private String IDFILM;
    private int PRIORITAT;
    private String TITOL;
    private int ANY;
    private String CARTELL;
    private String ORIGINAL;
    private String DIRECCIO;
    private String INTERPRETS;
    private String IDIOMA_x0020_ORIGINAL;
    private String ESTRENA;

    public String getIDFILM() {
        return IDFILM;
    }

    public int getPRIORITAT() {
        return PRIORITAT;
    }

    public String getTITOL() {
        return TITOL;
    }

    public int getANY() {
        return ANY;
    }

    public String getCARTELL() {
        return CARTELL;
    }

    public String getORIGINAL() {
        return ORIGINAL;
    }

    public String getDIRECCIO() {
        return DIRECCIO;
    }

    public String getINTERPRETS() {
        return INTERPRETS;
    }

    public String getIDIOMA_x0020_ORIGINAL() {
        return IDIOMA_x0020_ORIGINAL;
    }

    public String getESTRENA() {
        return ESTRENA;
    }
}
