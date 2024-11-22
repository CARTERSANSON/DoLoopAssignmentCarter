/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doloopassignment;
import java.util.*;
/**
 *
 * @author csanson2027
 */
public class DoLoopAssignment {

    public static void main(String[] args) {
        System.out.println("Pattern a:");
        patternA();
        System.out.println("Pattern b:");
        patternB();
        System.out.println("Pattern c:");
        patternC();
        System.out.println("Pattern d:");
        patternD();
    }
    
    public static void patternA(){
        for(int i = 10; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternB(){
        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < 10 - i; j++){
                System.out.print("");
            }
        
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternC(){
        for(int i = 10; i > 0; i--){
            for(int j = 0; j < 10 - i; j++){
                System.out.print("");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void patternD(){
        for(int i = 1; i <= 5; i++){
            for(int j = 0; j < 5 - i; j++){
                System.out.print("");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = 5; i > 0; i--){
            for(int j = 0; j < 5 - i; j++){
                System.out.print("");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
