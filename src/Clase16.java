import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Clase16 {
    public static void main(String[] args) {
       /* int [] numeros = {2,3,4,5,6,7};
        List<Integer> lista = Arrays.asList(2,3,4,5,6,7);

//for
        for( int i: lista){
            System.out.println(i);
        }
//forEach
        lista.stream().forEach(System.out::println);
        List<Integer> numerosx3= new ArrayList<>();
//map
        lista.stream().map(n->n*3).forEach(numerosx3::add);
        System.out.println(numerosx3);

        System.out.println(lista);
//collector
        List<Integer> numerosAumentados2 = lista.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(numerosAumentados2);
        List<Integer> numerosAumentados3 = lista.stream().map(n->1).collect(Collectors.toList());
        System.out.println(numerosAumentados3);
//filter
        List<Integer> numerosFiltrados = lista.stream()
                .filter(n->n>=4)
                .collect(Collectors.toList());
        System.out.println(numerosFiltrados);

        List<Integer> numerosFiltrados2 = lista.stream()
                .filter(n->n>=4)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(numerosFiltrados2);

        List<Integer> numerosDuplicados = Arrays.asList(2,2,3,5,6,7,7,8);
//dintict
        numerosDuplicados.stream()
                .distinct()
                .forEach(System.out::println);
//limit
        numerosDuplicados.stream()
                .limit(2)
                .forEach(System.out::println);
//skip
        numerosDuplicados.stream()
                .skip(2)
                .forEach(System.out::println);
//reduce  -suma
        int suma = numerosDuplicados.stream().
                reduce(0,(a,b)->a+b);
        System.out.println(suma);
//reduce   -multiplicacion
        int multiplicacion = numerosDuplicados.stream().reduce(1,(a,b)->a*b);
        System.out.println(multiplicacion);

        int max = numerosDuplicados.stream().reduce(1,Integer::max);
        System.out.println(max);
        int min = numerosDuplicados.stream().reduce(1000,Integer::min);
        System.out.println(min);



        List<Integer> numerillos = Arrays.asList(1,9,2,10,2,4,7,4,7,1,4);
         int sumatoria = numerillos
                 .stream()
                 .reduce(0,(a,b)->a+b);
        System.out.println(sumatoria);

        int sumatoria2 = numerillos
                .stream()
                .distinct()
                .reduce(0,(a,b)->a+b);
        System.out.println(sumatoria2);

        List<Float> numerillosFloat =
                numerillos
                .stream()
                .map(Integer::floatValue).collect(Collectors.toList());
        System.out.println(numerillosFloat);

        List menoresA5 =numerillos
                .stream()
                .distinct()
                .filter(n->n<5).collect(Collectors.toList());
        System.out.println(menoresA5);

        int mapToInt = numerillos.
                stream().
                mapToInt(Integer::intValue)
                .reduce(1,(a,b)->a+b);
        System.out.println(mapToInt);

       long cuentaMenores5 = numerillos
                .stream()
                .filter(n ->n<5)
                .count();
        System.out.println(cuentaMenores5);*/

        List<String> nombres = Arrays.asList("Anastasia","Beatriz","Clara","Carla","Marianela","Paula","Pia");

         nombres
                .stream()
                .filter(n->n.length()>5)
                 .collect(Collectors.toList())
                 .forEach(System.out::println);

        nombres
                .stream()
                .map(n -> n.toLowerCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        nombres
                .stream()
                .filter(n->n.startsWith("P"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        List<String> aBC = new ArrayList<>();

        nombres
                .stream()
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(aBC::add);
        nombres
                .stream()
                .filter(n->n.startsWith("B"))
                .collect(Collectors.toList())
                .forEach(aBC::add);
        nombres
                .stream()
                .filter(n->n.startsWith("C"))
                .collect(Collectors.toList())
                .forEach(aBC::add);

        System.out.println(aBC);
        System.out.println(aBC.stream().count());

        List<Integer> letrasCadaNombre= new ArrayList<>();

        nombres.stream().map(n ->n.length()).forEach(letrasCadaNombre::add);
        System.out.println(letrasCadaNombre);




    }
}