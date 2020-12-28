package facebook;

import java.util.*;

public class ListaPrieteni{

	
	public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        FacebookAccount fb = new FacebookAccount("Pop Alina",30,"str.Unirii,nr.2", lista);
     

        lista.add("Marcel");
        lista.add("Georgel");
        lista.add("Popescu");
        System.out.println(lista);
        lista.remove("Georgel");
        System.out.println(lista);
	}
}
