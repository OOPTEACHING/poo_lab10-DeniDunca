package hotel;

import java.util.*;

public class PetHotel {

	public static void main(String[] args) {

	  List<String> caini = new ArrayList<>();
	  
	  caini.add("Husky");
	  caini.add("Golden");
	  caini.add("Chihuahua");
	  caini.add("Pug");

	  System.out.println(caini);
	  
	  caini.remove("Golden");
	  System.out.println(caini);
}
}

