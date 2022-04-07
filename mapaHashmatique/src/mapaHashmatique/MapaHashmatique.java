package mapaHashmatique;

import java.util.HashMap;
import java.util.Set;

public class MapaHashmatique {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("Despacito", "Pasito a pasito, suave suavecito");
		trackList.put("Gangnam Style", "Sexy lady");
		trackList.put("Camisa Negra", "Tengo la camisa negra");
		trackList.put("Labios compartidos","Amor mio");
		
		String nombre = trackList.get("Despacito");
		System.out.println(nombre);
		
		Set<String> Lyrics = trackList.keySet();

        for(String Track: Lyrics) {

            System.out.println(Track);

            System.out.println(trackList.get(Track));    

        }

	}

}
