import Model.DataRoot;
import Model.Film;
import Model.Menu;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.crypto.Data;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final String PATH = "http://gencat.cat/llengua/cinema/provacin.xml";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Film> listaFilm = new ArrayList<>();
        Menu menu = new Menu();

        URL url = null;
        try{
            url = new URL(PATH);
        }catch(MalformedURLException e){
            e.printStackTrace();
        }

        try{

            JAXBContext contextObj = JAXBContext.newInstance(DataRoot.class);
            Unmarshaller unmarshaller = contextObj.createUnmarshaller();
            DataRoot dataRoot = (DataRoot) unmarshaller.unmarshal(url);
            //dataRoot.getFilmList().forEach(System.out::println);
            listaFilm = dataRoot.getFilmList();

            menu.show(listaFilm);


        }catch(JAXBException e){
            e.printStackTrace();
        }
    }
}
