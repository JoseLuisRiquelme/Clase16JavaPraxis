import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje {
    public static void main(String[] args) {

        List<Integer> puntuaciones = Arrays.asList(15,23,10,5,30,45,22,18,60,3,25);

        System.out.printf("La sumatoria del puntaje es: %d",totalPuntuaciones(puntuaciones));
        System.out.println();
        System.out.printf("El puntaje mas alto es: %d",puntuacionMasAlta(puntuaciones));
        System.out.println();
        System.out.println("Las puntuaciones multiplos de cinco son: "+multiplosDeCinco(puntuaciones));
        /*System.out.printf("     Las puntuaciones multiplos de cinco son: %d",multiplosDeCinco(puntuaciones));*/
    }

    static int totalPuntuaciones(List<Integer>puntuaciones){
        return puntuaciones
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    static int puntuacionMasAlta(List<Integer>puntuaciones){
        return puntuaciones
                .stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
    }

    static List<Integer> multiplosDeCinco(List<Integer>puntuaciones) {
        return puntuaciones
                .stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());
    }
}
