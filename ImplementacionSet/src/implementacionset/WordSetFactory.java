/********************************************
    Universidad del Valle de Guatemala
    Algoritmos y Estructura de Datos
    Autor: Juan Jose Tzun Monterroso
    Fecha: 06/10/2014 Carnet: 13017
********************************************/
package implementacionset;

public class WordSetFactory {
    // Metodo que genera un objeto que implementa WordSet
    // parametro tipo: 1 = SimpleSet
    //                         2 = implementado con Red black tree
    //                         3 = implementado con Splay Tree
    //                         4 = implementado con Hash Table
    //                         5 = implementado con TreeMap (de Java Collection Framework)

    public static WordSet generateSet(int tipo)
    {
        if (tipo == 1)
            return new SimpleSet();
        else if (tipo == 2)
            return new SimpleSetRBT();
        else if (tipo == 3)
            return new SimpleSetST();
        else if (tipo == 4)
            return new SimpleSetHT();
        else if (tipo == 5)
            return new SimpleSetTM();
        else
            // aqui se regresara el set empleando sus implementaciones:
            // if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
            // if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
            // if tipo == 4 cree una instancia para un Wordset implementado con Hash table
            // if tipo == 5 cree una instancia para un Wordset implementado con TreeMap

            return null; // modificarlo para que regrese la implementacion seleccionada
    }
}
