package com.linecomperision;

public class LineCompresion {
    public static void main(String[] args) {
        System.out.println("Start with Displaying\n" +
                "Welcome to Line Comparison Computation Program");

        int x1,x2,y1,y2;
        double dis;
        x1=1;y1=1;x2=4;y2=4;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Length of line of coordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
