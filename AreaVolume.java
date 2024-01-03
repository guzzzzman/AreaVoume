// Jose Guzman
// October 29, 2023
/*Wrote a method that returns the floor area of a room.
The method takes as parameters the width and length of the room.
The method returns the floor area.
*/
// File name: AreaVolume.java
// To Compile in terminal type: javac AreaVolume.java
// To Run in terminal type: java AreaVolume
public class AreaVolume {
	public static double area(double width, double length)
	{
		return width * length;
	}
	public static double volume(double width, double length, double height)
	{
		return width * length * height;
	}

	public static void main(String[] args)
	{
		double w = 0, l = 5, h = 10;
		/*width    length    hiehgt     area     volume
           10.0     5.0    10.0      50.0     500.0
           9.0    10.0    20.0      90.0     1800.0
           8.0    15.0    30.0     120.0     3600.0
           7.0    20.0    40.0     140.0     5600.0
           6.0    25.0    50.0     150.0     7500.0
 */

		System.out.println("\nwidth    length    hiehgt     area     volume");
		for (w=10.0; w > 5; w--)
		{
			System.out.printf("%4.1f    %4.1f    %4.1f     %5.1f     %.1f \n"
		                         ,w     ,l       ,h       ,area(w, l) ,volume(w, l, h) );
			l+=5;
			h+=10;
		}
	}
}