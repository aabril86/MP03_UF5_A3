package Model;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void show(List<Film> llista){
        int op;
        do{

            System.out.println("1- Pelicules amb prioritat major a 90");
            System.out.println("2- Directors que començen amb T");
            System.out.println("3- Estrenes entre 2017-2019");
            System.out.println("4- Pelicules en anglès");
            System.out.println("5- Pelicula amb la prioritat més alta");
            System.out.println("6- Pelicula més antiga");
            System.out.println("7- Pelicules ordenades per ID");
            System.out.println();
            System.out.println("0- Sortir");

            op = scanner.nextInt();

            switch(op){
                case 1:
                    llista.stream().filter(film -> film.getPRIORITAT() > 90).forEach(System.out::println);
                    System.out.println();
                    break;
                case 2:
                    llista.stream().filter(film -> film.getDIRECCIO().startsWith("T")).forEach(System.out::println);
                    System.out.println();
                    break;
                case 3:
                    llista.stream().filter(film -> film.getANY() >= 2017 && film.getANY() <= 2019).forEach(System.out::println);
                    System.out.println();
                    break;
                case 4:
                    llista.stream().filter(film -> film.getIDIOMA_x0020_ORIGINAL().contains("anglès")).forEach(System.out::println);
                    System.out.println();
                    break;
                case 5:
                    System.out.println(llista.stream().max(Comparator.comparing(Film::getPRIORITAT)).get());
                    System.out.println();
                    break;
                case 6:
                    System.out.println(llista.stream().min(Comparator.comparing(Film::getANY)).get());
                    System.out.println();
                    break;
                case 7:
                    llista.stream().sorted(Comparator.comparing(Film::getIDFILM)).forEach(System.out::println);
                    System.out.println();
                    break;
            }

        }while(op != 0);
    }
}
