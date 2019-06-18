package com.testyantra.java.patterns;
public class Pattern7
{
    public static void main(String[] args)
    {
        int n =3;
        for (int rows = 0; rows <= n; rows++)
        {
            for (int spaces = n; spaces > rows; spaces--)
            {
                System.out.print(" ");
            }
            for (int stars = 0; stars <= rows; stars++)
            {
                if( stars == 0 || stars == rows )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int rows = 0; rows <= n-1; rows++)
        {
            for (int spaces = 0; spaces <= rows; spaces++)
            {
                System.out.print(" ");
            }
            for (int stars = n-1; stars >= rows; stars--)
            {
                if( stars == n-1 || stars == rows )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}