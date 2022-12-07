package com.linecomperision;

public class LineCompresion {
    public static void main(String[] args) {
        System.out.println("Start with Displaying\n" +
                "Welcome to Line Comparison Computation Program");

        int x1,x2,y1,y2;
        int p1,q1,p2,q2;
        double dis,dis1;
        x1=1;y1=1;x2=4;y2=4;
        p1=1;q1=1;p2=4;q2=4;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        dis1=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
        System.out.println("Length of line of coordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
        System.out.println("Length of line of coordinates"+"("+p1+","+q1+"),"+"("+p2+","+q2+")===>"+dis1);
        if (dis == dis1)
        {
            System.out.println("Both lines are equale");
        }
        else if (dis > dis1)
        {
            System.out.println("Line one is greater than line two");
        }
        {
            System.out.println("Line one is smaller than line two");
        }
}
}
