package Model;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "dataroot")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class DataRoot {

    @XmlElement(name = "FILM")
    private List<Film> filmList;

    public List<Film> getFilmList() {
        return filmList;
    }
}
