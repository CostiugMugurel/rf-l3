/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.usv.rf;

/**
 *
 * @author student
 */
public class Calculate {
    static double CalcDisE(double[] p1, double[] p2)
    {
        double dist =0.0;
        dist = Math.sqrt(Math.pow(p1[0]-p2[0],2) + Math.pow(p1[1]-p2[1],2));
        return dist;
    }
    
    static double CalcDistCe(double[] p1, double[] p2)
    {
        double distCe=0.0;
        for(int i=0;i<p1.length;i++){
            double currDist=Math.abs(p1[i]-p2[i]);
            if(distCe<=currDist)
                distCe=currDist;
        }
        return distCe;
    }
    
    static double CalcDistM(double[] a, double[] b, int n)
    {
        double sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum +=Math.pow(a[i]-b[i],n);
        }
        return Math.pow(sum,1.0/n);
    }
    
}
