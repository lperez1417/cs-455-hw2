/*

*/


import renderer.scene.*;

/**
   The letter P.
*/
public class P extends Model
{
   /**
      The letter P.
   */
   public P()
   {
      super("P");

      int n = 0; // number of vertices

      Vertex[] v = new Vertex[n];

      // Create vertices.(x, y, z)
      n = 24;
      /* received runtime error when declared new v[i]
       * figured that code would not work from an index of an array 
       */
      Vertex v0 = new Vertex(0, 0, 0); //front
      Vertex v1 = new Vertex(0, 1, 0);
      Vertex v2 = new Vertex(0.8, 1, 0);
      Vertex v3 = new Vertex(1, 0.8, 0);
      Vertex v4 = new Vertex(1, 0.6, 0);
      Vertex v5 = new Vertex(0.8, 0.4, 0);
      Vertex v6 = new Vertex(0.3, 0.4, 0);
      Vertex v7 = new Vertex(0.3, 0, 0);
      Vertex v8 = new Vertex(0.3, 0.8, 0);
      Vertex v9 = new Vertex(0.8, 0.8, 0);
      Vertex v10 = new Vertex(0.8, 0.6, 0);
      Vertex v11 = new Vertex(0.3, 0.6, 0);
      Vertex v12 = new Vertex(0, 0, -0.25); //back 
      Vertex v13 = new Vertex(0, 1, -0.25);
      Vertex v14 = new Vertex(0.8, 1, -0.25);
      Vertex v15 = new Vertex(1, 0.8, -0.25);
      Vertex v16 = new Vertex(1, 0.6, -0.25);
      Vertex v17 = new Vertex(0.8, 0.4, -0.25);
      Vertex v18 = new Vertex(0.3, 0.4, -0.25);
      Vertex v19 = new Vertex(0.3, 0, -0.25);
      Vertex v20 = new Vertex(0.3, 0.8, -0.25);
      Vertex v21 = new Vertex(0.8, 0.8, -0.25);
      Vertex v22 = new Vertex(0.8, 0.6, -0.25);
      Vertex v23 = new Vertex(0.3, 0.6, -0.25);
      addVertex(v0, v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11);
      addVertex(v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23);

      // Create line segments.
      addLineSegment(new LineSegment(0, 1),//front
                     new LineSegment(1, 2),
                     new LineSegment(2, 3),
                     new LineSegment(3, 4),
                     new LineSegment(4, 5),
                     new LineSegment(5, 6),
                     new LineSegment(6, 7),
                     new LineSegment(7, 0),
                     new LineSegment(8, 9),
                     new LineSegment(9, 10),
                     new LineSegment(10, 11),
                     new LineSegment(11, 8),
                     new LineSegment(12, 13),//back
                     new LineSegment(13, 14),
                     new LineSegment(14, 15),
                     new LineSegment(15, 16),
                     new LineSegment(16, 17),
                     new LineSegment(17, 18),
                     new LineSegment(18, 19),
                     new LineSegment(19, 12),
                     new LineSegment(20, 21),
                     new LineSegment(21, 22),
                     new LineSegment(22, 23),
                     new LineSegment(23, 20),
                     new LineSegment(0, 12),//left side
                     new LineSegment(1, 13),
                     new LineSegment(2, 14),//top
                     new LineSegment(3, 15),//right side
                     new LineSegment(4, 16),
                     new LineSegment(5, 17),
                     new LineSegment(6, 18),
                     new LineSegment(7, 19),
                     new LineSegment(8, 20),//bottom
                     new LineSegment(9, 21),//inner 
                     new LineSegment(10, 22),
                     new LineSegment(11, 23));
                     

   }
}

