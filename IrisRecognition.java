/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iris;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bintari
 */
public class IrisRecognition extends javax.swing.JFrame {

    /**
     * Creates new form IrisRecognition
     */
    public BufferedImage BIM;
    public int height,width;//=192,width=144;
    public int red, blue, green;
    public int barisgray=21600,baris=150, kolom, segmen=12;
    int data1=60, data2=30;
    public double data_input[][]=new double[barisgray][data1];
    public double data_grayscale[][]=new double[barisgray][data1];
    public double data_segmentasi[][]=new double[baris][data1];
    public double data_inputt[][]=new double[baris][data1];
    public String label;
    public String nama;
    public String ls_nama;
    public double [][] greys = new double [180][120];
    public static int ncitra = 0, banyak=0;
    public Object[]out={"1","2","3","4","5","6"};
    public int hidden=baris; 
    public int input=baris; 
    public int output=6;
    public double bobotv_opt[][]=new double[input][hidden];
    public double biasv_opt[][]=new double[1][hidden];
    public double bobotw_opt [][]=new double[hidden][output]; //60, 30
    public double biasw_opt [][]=new double[1][output];
    public double T[][]=new double[output][data1];
    public String [][] Y;
    public double [][]Ye;
    int seg = 0;
    public double[]rs = new double[100000];
    double[][]segm=new double[baris][1];
    int segmentasi;
    double[][] nor11=new double[baris][1];
    
    public IrisRecognition() {
        initComponents();
    }
