package Clase8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsTest {
	public static void main (String [] args) {
/**
 * Almacena en cualquier orden
 */
		Map<String, String> mapa1 = new HashMap<String, String>();
		mapa1.put("Rojo","Red");
		mapa1.put("Verde","Green");
		mapa1.put("Azul","Blue");
		mapa1.put("Negro","Black");
		for(String valor: mapa1.values())
			System.out.print(valor+"-");
		System.out.println("");
		for(String clave: mapa1.keySet())
			System.out.print(clave+"-");
		System.out.println("");
		if(mapa1.containsKey("Negro")) {
			System.out.println("si existe la clave negro:"+mapa1.get("Negro"));			
		}else {
			System.out.println("no existe la clave negro");
		}
		
		
		/**
		 * Almacena en el orden de los elementos
		 */
		Map<String, String> mapa2 = new TreeMap<String, String>();
		mapa2.put("Rojo","Red");
		mapa2.put("Verde","Green");
		mapa2.put("Azul","Blue");
		mapa2.put("Negro","Black");
		for(String valor: mapa2.values())
			System.out.print(valor+"-");
		System.out.println("");
		for(String clave: mapa2.keySet())
			System.out.print(clave+"-");
		System.out.println("");
		if(mapa2.containsKey("Negro")) {
			System.out.println("si existe la clave negro:"+mapa2.get("Negro"));			
		}else {
			System.out.println("no existe la clave negro");
		}
		
		/**
		 * En el orden en que ingresa lo almacena
		 */
		Map<String, String> mapa3 = new LinkedHashMap<String, String>();
		mapa3.put("Rojo","Red");
		mapa3.put("Verde","Green");
		mapa3.put("Azul","Blue");
		mapa3.put("Negro","Black");
		for(String valor: mapa3.values())
			System.out.print(valor+"-");
		System.out.println("");
		for(String clave: mapa3.keySet())
			System.out.print(clave+"-");
		System.out.println("");
		if(mapa3.containsKey("Negro")) {
			System.out.println("si existe la clave negro:"+mapa3.get("Negro")+" obtener otro valor "+mapa3.getOrDefault("Azul",""));			
		}else {
			System.out.println("no existe la clave negro");
		}
	}

}
