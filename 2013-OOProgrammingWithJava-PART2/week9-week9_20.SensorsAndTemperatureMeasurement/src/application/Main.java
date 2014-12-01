/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

/**
 *
 * @author jianrong
 */
public class Main {
    public static void main(String[] args) {
    Sensor kumpula = new Thermometer();
    kumpula.on();
    System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

    Sensor kaisaniemi = new Thermometer();
    Sensor helsinkiVantaa = new Thermometer();

    AverageSensor helsinkiArea = new AverageSensor();
    helsinkiArea.addSensor(kumpula);
    helsinkiArea.addSensor(kaisaniemi);
    helsinkiArea.addSensor(helsinkiVantaa);

    helsinkiArea.on();
    System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
}
    
}
