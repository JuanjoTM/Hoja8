
package implementacionset;

 class RedBlackNode<T extends Comparable<T>>
    {
            // Constructors
        RedBlackNode( T theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( T theElement, RedBlackNode lt, RedBlackNode rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        T   element;    // The data in the node
        RedBlackNode left;       // Left child
        RedBlackNode right;      // Right child
        int          color;      // Color
    }