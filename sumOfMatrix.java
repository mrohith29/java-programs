import java.util.Scanner;

class sumOfMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[][] matrix = new int[size][size];
    for (int i = 0; i < size; i++) {
      String[] in = sc.nextLine().split(" ");
      for(int j=0;j<size;j++){
          matrix[i][j] = Integer.parseInt(in[j]);
      }
    }
    

  }
}       
