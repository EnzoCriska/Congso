/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congso;

import java.util.Scanner;
import sun.security.util.Length;

/**
 *
 * @author Enzo_Criska
 */
public class Congso {

    public String cong(String a, String b) {
        String kq = "";
        boolean renember=false;
        int as, bs;
        if (a.length()<b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        
        while (b.length()<a.length()){
            b="0"+b;
        }
        
        for (int j = (a.length()-1); j>=0; j--){
            int kqq;
            kqq = Character.getNumericValue(a.charAt(j)) + Character.getNumericValue(b.charAt(j));
            if (renember) kqq++;
            if(kqq >= 10){
                renember = true;
                kq = String.valueOf(kqq - 10) +kq;
            } else {
                renember = false;
                kq = String.valueOf(kqq) + kq;
            }
        }

        return kq;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String soa;
        String sob;
        Congso cs = new Congso();
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập số a:");
        soa = in.next();

        System.out.println("Nhập số b:");
        sob = in.next();
        
        System.out.println(cs.cong(soa, sob));

    }

}
