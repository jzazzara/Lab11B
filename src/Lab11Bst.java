
// Lab11Bst.java
// The Graphics Array
// This is the student, starting file for Lab 11B.

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.applet.*;

public class Lab11Bst extends Applet {
	int numBars; // number of bars to be displayed
	int barHeight[]; // array of bar heights
	int swapDelay; // The delay between the original display and the second
					// display.
	int bar1, bar2; // Indexes of 2 bars to be swapped.
	int k;
	int x;

	public void init() {
		numBars = enterIntGUI("How many bars will be displayed?  {1-1000}");
		bar1 = enterIntGUI("What is the index of the 1st bar to be swapped?  {0-" + (numBars - 1) + "}");
		bar2 = enterIntGUI("What is the index of the 2nd bar to be swapped?  {0-" + (numBars - 1) + "}");
		swapDelay = 3000;
		barHeight = new int[numBars];
		getBarValues();
	}

	public void getBarValues() {
		for (int k = 0; k < barHeight.length; k++){ 
			 barHeight[k] = Expo.random(10,640);
		 }
		 

	}

	public void paint(Graphics g) {
		
		  displayBars(g);
		  Expo.delay(swapDelay);
		  swapBars(bar1,bar2);
		  Expo.setBackground(g,Expo.white); 
		  displayBars(g);
		 
	}

	public static int enterIntGUI(String prompt)
	// Allows GUI keyboard input of an integer in a graphics program.
	{
		String tempString = JOptionPane.showInputDialog(prompt);
		int temp = Integer.parseInt(tempString);
		return temp;
	}

	public void displayBars(Graphics g) {
		for (int x = 0; x <= 1000; x++){
	
		Expo.setColor(g,Expo.red);
		Expo.drawLine(g, x, barHeight[x], x, 640); }
		
		}

	private void swapBars(int x, int y) {

		
		
	}

}
