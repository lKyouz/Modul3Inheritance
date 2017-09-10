/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;


/**
 *
 * @author Gabe Naek Manullang
 */
public class Sample {
public static int static_int;
public static int simple_int;

    public static void main(String[] args) {
        Turunan sample1 = new Turunan();
        Turunan.static_int = 7;
        sample1.simple_int = 9;
        System.out.println(sample1); 
 }
    @Override
    public String toString(){
    return("simple_int + static_int");
    }
}

