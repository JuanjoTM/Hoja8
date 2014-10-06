/********************************************
    Universidad del Valle de Guatemala
    Algoritmos y Estructura de Datos
    Autor: Juan Jose Tzun Monterroso
    Fecha: 06/10/2014 Carnet: 13017
********************************************/
package implementacionset;

public class SimpleSetRBT implements WordSet{
    private RedBlackTree<Word> base;
	
	public SimpleSetRBT()
	{
            base = new RedBlackTree<Word>(new Word());
	}
	
	public Word get(Word word)
	{
            boolean index = base.equals(word);
            if(!index) return null;
            return word;
	}
	
	public void add(Word wordObject)
	{
            base.insert(wordObject);
	}
}
