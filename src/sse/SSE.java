/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sse;

/**
 *
 * @author Lukas
 */
public class SSE 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        double[] data = {3725, 3785, 3785, 3855, 3880, 3875, 4050, 4095, 4095, 4095, 4000, 4050, 4200, 4200, 4250, 4250, 4250, 4250, 4300, 4300, 4300, 4300, 4300, 4300, 4300, 4300};                              
        
        for(int i = 0; i<data.length; i++)
        {
            System.out.println(data[i]+" ");
        }
        
        //menghitung total
        double total = 0;
        for (int i = 0; i<data.length; i++)
        {
            total += data[i];
        }
        System.out.println("Total X : " + total);
        
        //mencari harga tertinggi
        double max = data[0];
        for(int i = 1; i<data.length; i++)
        {
            if(data[i] > max)
            {
                max = data[i];
            }
        }
        System.out.println("Harga Tertinggi : " + max);
        
        double alpha = 0.3;
        double[][] st = new double[26][26];
        
        double smooth = 0;
        st[0][0] = data[0];
        for(int i = 1; i<2; i++)
        {
            st[0][i] = alpha * data[i] + (1 - alpha) * st[0][i-1];
            smooth = st[0][i];
        }
        System.out.println("Exponential Smoothing Pertama" + smooth);
        
        double smooth1 = 0;
        st[1][0] = st[0][0];
        for(int i = 1; i<2; i++)
        {
            st[1][i] = st[0][i] + alpha * (data[1] - st[1][i-1]);
            smooth1 = st[1][i];
        }
        System.out.println("Exponential Smoothing Kedua " +smooth1);
        
        double smooth2 = 0;
        st[2][0] = st[1][0];
        for(int i = 1; i<2; i++)
        {
            st[2][i] = st[1][i] + alpha * (data[2] - st[2][i-1]);
            smooth2 = st[2][i];
        }
        System.out.println("Exponential Smoothing Ketiga " +smooth2);
        
        double smooth3 = 0;
        double ini = 0;
        double ini1 = 0;
        double ini2 = 0;
        st[3][0] = st[2][0];
        for(int i = 1; i<2; i++)
        {
            st[3][i] = st[2][i] + alpha * (data[3] - st[3][i-1]);
            //ini = st[3][i-1];
            //ini1 = alpha * st[2][i];
            //ini2 = data[2] - st[3][i-1];
            smooth3 = st[3][i];
        }
        System.out.println("Exponential Smoothing Ke Empat " +smooth3);
        //System.out.println(ini);
        //System.out.println(ini1);
        //System.out.println(ini2);
        
        double smooth4 = 0;
        st[4][0] = st[3][0];
        for(int i = 1; i<2; i++)
        {
            st[4][i] = st[3][i] + alpha * (data[4] - st[4][i-1]);
            smooth4 = st[4][i];
        }
        System.out.println("Exponential Smoothing Ke Lima " +smooth4);
        
        double smooth5 = 0;
        st[5][0] = st[4][0];
        for(int i = 1; i<2; i++)
        {
            st[5][i] = st[4][i] + alpha * (data[5] - st[5][i-1]);
            smooth5 = st[5][i];
        }
        System.out.println("Exponential Smoothing Ke Enam " +smooth5);
        
        double smooth6 = 0;
        st[6][0] = st[5][0];
        for(int i = 1; i<2; i++)
        {
            st[6][i] = st[5][i] + alpha * (data[6] - st[6][i-1]);
            smooth6 = st[6][i];
        }
        System.out.println("Exponential Smoothing Ke Tujuh " +smooth6);
        
        double smooth7 = 0;
        st[7][0] = st[6][0];
        for(int i = 1; i<2; i++)
        {
            st[7][i] = st[6][i] + alpha * (data[7] - st[7][i-1]);
            smooth7 = st[7][i];
        }
        System.out.println("Exponential Smoothing Ke Enam " +smooth7);
    }  
}
