/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handgeometryapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

/**
 *
 * @author Malsha
 */
public class User {

    public User() {
        String[] fingers = {"Thumb", "Index", "Middle", "Ring", "Pinky",};
        
    }
    private String name;
    private float[] lengthArray = new float[5]; 
    private float[] widthArray = new float[5]; 
    private float[] tipToDivisionArray = new float[5];

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lengthArray
     */
    public float[] getLengthArray() {
        return lengthArray;
    }

    /**
     * @param lengthArray the lengthArray to set
     */
    public void setLengthArray(float[] lengthArray) {
        this.lengthArray = lengthArray;
    }

    /**
     * @return the widthArray
     */
    public float[] getWidthArray() {
        return widthArray;
    }

    /**
     * @param widthArray the widthArray to set
     */
    public void setWidthArray(float[] widthArray) {
        this.widthArray = widthArray;
    }

    /**
     * @return the tipToDivisionArray
     */
    public float[] getTipToDivisionArray() {
        return tipToDivisionArray;
    }

    /**
     * @param tipToDivisionArray the tipToDivisionArray to set
     */
    public void setTipToDivisionArray(float[] tipToDivisionArray) {
        this.tipToDivisionArray = tipToDivisionArray;
    }

}
