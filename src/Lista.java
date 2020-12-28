import java.util.*;

public class Lista {
	public static void main(String[] args)
	{
		List<String> lista = new ArrayList<>();
		//ArrayList<String> lista2 = new ArrayList<>();
		
		//adaugare
		lista.add("Poo");
		lista.add("DB");
		lista.add(1,"AF");
		System.out.println(lista);//[Poo, AF, DB]
		
		//stergere
		lista.remove(2);
		System.out.println(lista);//[Poo, AF]
		
		//modificare
		lista.set(0, "OOP");
		System.out.println(lista);//[OOP, AF]
		
		//size-ul listei;
		System.out.println("Inainte de clear "+lista.size());//2
		
		lista.clear();
		System.out.println("Dupa clear " + lista.size());//0
		
		//parcurgere
		lista.add("Poo");
		lista.add("DB");
		lista.add(1,"AF");
		
		
		
	}
}
