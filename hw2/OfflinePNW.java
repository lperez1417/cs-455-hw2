/*

*/
import renderer.scene.*;
import renderer.models.*;
import renderer.pipeline.*;
import renderer.framebuffer.*;

import java.io.File;
import java.awt.Color;

public class OfflinePNW
{
   public static void main(String[] args)
   {
     Model m1 = new P();
     Model m2 = new N();
     Model m3 = new W();
     
     Scene scene = new Scene();
     
     scene.addModel(m1, m2, m3);
     
     for (int i = 1; i <= 15; i++)
     {
       for (Vertex v : scene.modelList.get(0).vertexList)
         {
            v.x -= 0.1;  
         }
     }
     
     for (int i = 1; i <= 5; i++)
     {
       for (Vertex v : scene.modelList.get(1).vertexList)
         {
            v.x -= 0.1;  
         }
     }
     
     for (int i = 1; i <= 5; i++)
     {
       for (Vertex v : scene.modelList.get(2).vertexList)
         {
            v.x += 0.1;  
         }
     }
     
     for (Model m : scene.modelList)
     {
       for (Vertex v : m.vertexList)
       {
         v.z -= 3;
       }
       
     }
     
     int vp_width  = 1024;
     int vp_height = 1024;
     FrameBuffer fb = new FrameBuffer(vp_width, vp_height);
     fb.clearFB(Color.black);
     
     Pipeline.doClipping = true;
     Pipeline.render(scene, fb.vp);
     
     fb.dumpFB2File( String.format("PPM_Frame%03d.ppm", 0) );
     
     for (int i = 1; i <= 100; i++)
      {
         // update the scene
         if (i <= 40)
         {
           for (Vertex v : scene.modelList.get(0).vertexList)
           {
             v.x -= 0.02;    
           }
         }
         else 
         {
           for (Vertex v : scene.modelList.get(0).vertexList)
           {
             v.x += 0.03;  
             v.y += 0.02;  
             v.z -= 0.01;  
           }
         }
         if (i <= 50)
         {
           for (Vertex v : scene.modelList.get(1).vertexList)
           {
             v.z += 0.01;  
           }
         }
         else
         {
           for (Vertex v : scene.modelList.get(1).vertexList)
           {
             v.z -= 0.01;  
           }
         }
         if (i <= 38)
         {
           for (Vertex v : scene.modelList.get(2).vertexList)
           {
             v.x += 0.02;
             v.y -= 0.02;
             v.z += 0.02; 
           }
         }
         else if(i > 30 && i <= 70)
         {
           for (Vertex v : scene.modelList.get(2).vertexList)
           {
             v.x -= 0.02;  
             v.y -= 0.02;  
             v.z -= 0.01;  
           }
         }
         else
         {
           for (Vertex v : scene.modelList.get(2).vertexList)
           {
             v.x -= 0.035;  
             v.y += 0.01;  
             v.z -= 0.01;  
           }
         }
         
         fb.clearFB(Color.black);
         Pipeline.doClipping = true;
         Pipeline.render(scene, fb.vp);
         fb.dumpFB2File(String.format("PPM_Frame%03d.ppm", i));
     }
   }
}
     
     
     
     
     