/********************************************
    Universidad del Valle de Guatemala
    Algoritmos y Estructura de Datos
    Autor: Juan Jose Tzun Monterroso
    Fecha: 06/10/2014 Carnet: 13017
********************************************/
package implementacionset;

import java.util.TreeMap;

public class SimpleSetTM implements WordSet{
    private TreeMap<Integer, Word> base;
    private int cant = 0;
	
	public SimpleSetTM()
	{
            base = new TreeMap<Integer, Word>();
	}
	
	public Word get(Word word)
	{
            //int index = base.indexOf(word);
            boolean index = base.containsValue(word);
            if(!index) return null;
            return word;
	}
	
	public void add(Word wordObject)
	{
            base.put(cant, wordObject);
            cant = cant + 1;
	}
}
