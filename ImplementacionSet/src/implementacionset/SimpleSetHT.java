/********************************************
    Universidad del Valle de Guatemala
    Algoritmos y Estructura de Datos
    Autor: Juan Jose Tzun Monterroso
    Fecha: 06/10/2014 Carnet: 13017
********************************************/
package implementacionset;

import java.util.Hashtable;

public class SimpleSetHT implements WordSet{
    private Hashtable<Integer, Word> base;
    private int cant = 0;
	
	public SimpleSetHT()
	{
		base = new Hashtable<Integer, Word>();
	}
	
	public Word get(Word word)
	{
            for(int i = 0; i<cant; i++){
                Word original = base.get(i);
                    if(original.getWord().equals(word.getWord())){
                       word.setType(original.getType());
                       i = cant;
                    }
		}
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