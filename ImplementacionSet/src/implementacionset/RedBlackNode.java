
package implementacionset;

 class RedBlackNode<T>
    {
            // Constructors
        RedBlackNode( Comparable theElement )
        {
            this( theElement, null, null );
        }

        RedBlackNode( Comparable theElement, RedBlackNode<T> lt, RedBlackNode<T> rt )
        {
            element  = theElement;
            left     = lt;
            right    = rt;
            color    = RedBlackTree.BLACK;
        }

            // Friendly data; accessible by other package routines
        Comparable   element;    // The data in the node
        RedBlackNode<T> left;       // Left child
        RedBlackNode<T> right;      // Right child
        int          color;      // Color
    }