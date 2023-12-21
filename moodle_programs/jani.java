package moodle_programs;
import java.util.Scanner;
public class jani {
        public static void main(String[] args) {
            Scanner f=new Scanner(System.in);
            int r1=f.nextInt();
            int c1=f.nextInt();
            int arr1[][]=new int[r1][c1];
            int sum=0;
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    arr1[i][j]=f.nextInt();
                }
            }

            for(int i=0;i<r1-1;i++)
            {
                for(int j=0;j<c1-i-1;j++)
                {
                    sum=sum+arr1[j][i+j+1];
                }
                System.out.print(sum+" ");
                sum=0;
            }

            for(int i=r1;i>=0;i--)
            {
                for(int j=0;j<c1-i;j++)
                {
                    sum=sum+arr1[i+j][j];
                }
                System.out.print(sum+" ");
                sum=0;
            }


        }
    }
