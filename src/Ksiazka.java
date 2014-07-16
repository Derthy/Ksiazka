import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.ListModel;

import java.awt.*;

import javax.swing.*; 

public class Ksiazka {
	
	static Object[] Przepisy;
	
	public static void main (String args[]) throws IOException {
		interfejs();
	}
	
	public static void interfejs(){
		JFrame myFrame = new JFrame("This is my frame");
		JList list = new JList(Przepisy);
		myFrame.setSize(300,400);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}
	
	public static void dodaj_przepis(){
		System.out.println("PODAJ COS");
	}
}
