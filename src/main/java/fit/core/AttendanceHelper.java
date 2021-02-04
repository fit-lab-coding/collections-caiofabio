package fit.core;

import java.util.*;

public class AttendanceHelper {
  public static Map<String, Boolean> random(int quantity, int percentagePresent) {
    Map<String, Boolean> mapAux = new LinkedHashMap<>();
    int totalPresent = (quantity * percentagePresent) / 100;
    
    for (int i = 0 ; i < totalPresent; i++) {
      mapAux.put(randomName(6,4), true);
    }
    for (int i = 0 ; i < quantity - totalPresent; i++) {
      mapAux.put(randomName(6,4), false);
    }
    /*{
      mapAux.put("Adriele", false);
      mapAux.put("Caio", true);
    }*/
    return mapAux;
  }
  public static String randomName(int maxNameSize, int minNameSize) {
    int nameSize = (int)(Math.random() * (maxNameSize - minNameSize) + minNameSize);
    String consonants = "bcdfghijklmnpqrstvwxyz";
    String vowels = "aeiou";
    String name ="";
    for (int i = 0; i < nameSize; i++) {
      int random_consonants = (int)(Math.random() * ((consonants.length()-1)+1));
      int random_vowels =  (int)(Math.random() * (vowels.length()-1)+1);

      if ( i == 0 ) {
        name += Character.toUpperCase(consonants.charAt(random_consonants));
      } else {
        name += consonants.charAt(random_consonants);
      }
      name += vowels.charAt(random_vowels);
    }
    return name;
  }
}