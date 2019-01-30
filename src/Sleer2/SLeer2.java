/*
 * SLeer2.java
 *
 * Created on 14 de diciembre de 2012, 20:43
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Sleer2;


import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class SLeer2 {
    
    public static Scanner teclado = new Scanner(System.in);
   
    

    public static void limpiar() {
        
       try {
              teclado.nextLine();
           } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    };
    // ********************** MÉTODOS SIN PARÁMETRO MENSAJE ********************
    
    public static char datoChar() {
    boolean leido = false;
    String cadena = null;
    char c = 0;
    do {
    try
    {
        cadena = null; c = 0;
        cadena = teclado.nextLine();
        c = cadena.charAt(0);
        leido = true;
    }
    catch(InputMismatchException e)
    {
        System.err.println("Error, por favor introduce dato de nuevo...");
        limpiar();
    } 
    catch(StringIndexOutOfBoundsException e)
    {
        System.err.println("Error, por favor introduce un carácter...");
        limpiar();
     } 
    }while (leido == false);
     return c;
    };
    
    public static String datoString()
  {
    boolean leido = false;
    String dato = null;
    do {
    try
    {
        dato = null;
        dato = teclado.nextLine();
        leido = true; 
    }
    catch(InputMismatchException e)
    {
        System.err.println("Error, por favor introduce dato de nuevo...");
        limpiar();
     } 
    }while (leido == false);
     return dato;
  }
  public static short datoShort()
  {
    boolean leido = false;
    short num = 0;
    do {
        num = 0; 
        if (teclado.hasNextShort()) 
            {
                num = teclado.nextShort();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número short...");limpiar();}
        }while (leido == false);
     return num;
  }
  
  public static byte datoByte()
  {
    boolean leido = false;
    byte num = 0;
    do {
        num = 0; 
        if (teclado.hasNextByte()) 
            {
                num = teclado.nextByte();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número byte...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static int datoInt()
  {
    boolean leido = false;
    int num = 0;
    do {
        num = 0; 
        if (teclado.hasNextInt()) 
            {
                num = teclado.nextInt();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número int...");limpiar();}
    }while (leido == false);
     return num;
   };
  
  
  public static long datoLong()
  {
    boolean leido = false;
    long num = 0;
    do {
        num = 0; 
        if (teclado.hasNextLong()) 
            {
                num = teclado.nextLong();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número long...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static float datoFloat()
  {
    boolean leido = false;
    float num = 0;
    do {
        num = 0; 
        if (teclado.hasNextFloat()) 
            {
                num = teclado.nextFloat();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número float...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static double datoDouble()
  {
    boolean leido = false;
    double num = 0;
    do {
        num = 0; 
        if (teclado.hasNextDouble()) 
            {
                num = teclado.nextDouble();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número double...");limpiar();}
        
    }while (leido == false);
     return num;
  }
  
    // ********************** MÉTODOS CON PARÁMETRO MENSAJE ********************
  
  public static char datoChar(String mensaje) {
    boolean leido = false;
    String cadena = null;
    char c = 0;
    do {
    try
    {
        cadena = null; c = 0;
        System.out.print("\n"+mensaje);
        cadena = teclado.nextLine();
        c = cadena.charAt(0);
        leido = true;
    }
    catch(InputMismatchException e)
    {
        System.err.println("Error, por favor introduce dato de nuevo...");
        limpiar();
     } 
    catch(StringIndexOutOfBoundsException e)
    {
        System.err.println("Error, por favor introduce un carácter...");
        limpiar();
     } 
    }while (leido == false);
     return c;
    };
    
    public static String datoString(String mensaje)
  {
    boolean leido = false;
    String dato = null;
    do {
    try
    {
        dato = null;
        System.out.print("\n"+mensaje);
        dato = teclado.nextLine();
        leido = true;
    }
    catch(InputMismatchException e)
    {
        System.err.println("Error, por favor introduce dato de nuevo...");
        limpiar();
     } 
    }while (leido == false);
     return dato;
  }
        
    public static short datoShort(String mensaje)
  {
    boolean leido = false;
    short num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje); 
        if (teclado.hasNextShort()) 
            {
                num = teclado.nextShort();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número short...");limpiar();}
        }while (leido == false);
     return num;
  }
  
  public static byte datoByte(String mensaje)
  {
    boolean leido = false;
    byte num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje);
        if (teclado.hasNextByte()) 
            {
                num = teclado.nextByte();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número byte...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static int datoInt(String mensaje)
  {
    boolean leido = false;
    int num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje);
        if (teclado.hasNextInt()) 
            {
                num = teclado.nextInt();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número int...");limpiar();}
    }while (leido == false);
     return num;
   };
  
  
  public static long datoLong(String mensaje)
  {
    boolean leido = false;
    long num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje);
        if (teclado.hasNextLong()) 
            {
                num = teclado.nextLong();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número long...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static float datoFloat(String mensaje)
  {
    boolean leido = false;
    float num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje);
        if (teclado.hasNextFloat()) 
            {
                num = teclado.nextFloat();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número float...");limpiar();}
    }while (leido == false);
     return num;
  }
  
  public static double datoDouble(String mensaje)
  {
    boolean leido = false;
    double num = 0;
    do {
        num = 0;
        System.out.print("\n"+mensaje);
        if (teclado.hasNextDouble()) 
            {
                num = teclado.nextDouble();
                leido = true;
            }  else {System.out.println("Error, no has introducido un número double...");limpiar();}
        
    }while (leido == false);
     return num;
  }
    
}
