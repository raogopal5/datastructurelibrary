package com.practice.datastructure;

public class RotateMatrix {
        public static void main(String args[])
        {
//matrix to rotate
            int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println("Original Matrix: \n");
//loop for rows
            for(int i=0;i<3;i++)
            {
//loop for columns
                for(int j=0;j<3;j++)
                {
//prints the elements of the original matrix
                    System.out.print(" "+a[i][j]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("Rotate Matrix by 90 Degrees Clockwise: \n");
            for(int i=0;i<3;i++)
            {
                for(int j=2;j>=0;j--)
                {
//prints the elements of the rotated matrix
                    System.out.print(""+a[j][i]+"\t");
                }
                System.out.println("\n");
            }
        }
}
