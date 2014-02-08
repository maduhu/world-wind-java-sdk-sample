/*!
 * @file
 * Copyright (c) jdknight. All rights reserved.
 *
 * The MIT License (MIT).
 */

package sample;

import java.awt.BorderLayout;
import java.awt.Panel;

import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.awt.WorldWindowGLCanvas;

import javax.swing.JFrame;

/**
 * Sample application for the World Wind Java SDK.
 */
public class Application
{
	/**
	 * Main line for application sample.
	 * 
	 * @param arguments The application arguments.
	 */
	public static void main(String arguments[])
	{
		// Create frame.
		JFrame frame = new JFrame("Sample WorldWind Java Application");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(800, 600);
		
		// Create panel.
		Panel panel = new Panel(new BorderLayout());
		frame.add(panel);
		
		// Create WorldWind canvas.
		WorldWindowGLCanvas wwd = new WorldWindowGLCanvas();
		wwd.setModel(new BasicModel());
		panel.add(wwd, BorderLayout.CENTER);
		
		// Show frame.
		frame.setVisible(true);
	}
}
