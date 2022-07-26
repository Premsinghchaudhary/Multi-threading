/*
 * Write a program by using threads where implement a method 
 * which will display the even no from Min max .
 *  second odd No between the min max No.
 */
 
package Thread;
public class multi_threading extends odd_no{

public static void main (String agrs[]) {
	even_no obj=new even_no();
	obj.start();
	odd_no obj1=new odd_no();
	obj1.start();
	}
}


