import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = keyboard.nextInt();
        System.out.println("Enter number of columns");
        int column = keyboard.nextInt();
        int[][] table = new int[row][column];
        for(int r = 0; r<row; r++)
            for(int c = 0; c<column; c++)
                table[r][c] =  1 + r*c;


        for(int i = 0; i<row; i++)
        {
            for(int k = 0; k<column; k++)
            {
                System.out.print(table[i][k] + " ");
            }
            System.out.println();
        }

    }

}
