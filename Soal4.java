/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author LENOVO
 */
public class Soal4 {
 static short methodOne(long l)
 {
 int i = (int) l;
 return (short)i;
 }
 public static void smain(String[] args){
 double d = 10.25;
 float f = (float) d;
 byte b = (byte) methodOne((long) f);
 System.out.println(b);
 }
}