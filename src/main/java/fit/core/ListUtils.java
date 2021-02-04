package fit.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {//GENERICO
  //primeiro operador acesso public
  //static acessivel sem instanciar
  //tipo de retorno no caso generico, precisamos informar quais genericos aceitamos
  //+ este é um metodo generico sinalizado com <T>
  //retorno tem que ser Lista<T>
  //parametro 1 lista<t>
  //parametro 2 compartor<t>
  //objetivo ordenar
  public static <T> List<T> sort(List<T> items, Comparator<T> comp) {
    //Transformar lista recebida para lista ordenavel
    //copiar lista items do parametro para sorted
    List<T> sorted = new ArrayList<>(List.copyOf(items));//operador diamante se baseia no do lado copiar
    sorted.sort(comp);//organizar lista com comparator com função sort
    return sorted;//retornamos a lista ordenada
  }

  //Exemplo não generico
  //public static List<String> sortv1(List<String> items, Comparator<String> comp)
}