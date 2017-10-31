/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DIYProjects.Classes;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
/**
 *
 * @author Mindaugas Lioys
 */
public class Controller {  
    /**
     * Initialised GpioController
     */
    public static final GpioController GPIO = GpioFactory.getInstance();
}
