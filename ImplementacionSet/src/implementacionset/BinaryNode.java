/********************************************
    Universidad del Valle de Guatemala
    Algoritmos y Estructura de Datos
    Autor: Juan Jose Tzun Monterroso
    Fecha: 06/10/2014 Carnet: 13017
********************************************/
package implementacionset;

public class BinaryNode<T> {

    public final T key;          // The data in the node
    public BinaryNode left;         // Left child
    public BinaryNode right;        // Right child

    public BinaryNode(T theKey) {
        key = theKey;
        left = right = null;
    }
}