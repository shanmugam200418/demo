import java.util.scanner;
public class diamond {
    public static void Main(string []args){
        Scanner Scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int row=1; i<=n; i++){
            for(int col=1; col<=n-row;col++)
            System.out.print("");
            for(int col=1; col<=2*row-1; col++)
             System.out.print("*");
              System.out.print();

        }
         for(int row=n-1;i>=n;i--){
            for(int col=1;col<=n-row;col++)
            System.out.print("");
            for(int col=1;col<=2*row-1;col++)
             System.out.print("*");
             System.out.print();
         }
         Scan.close();
    }
}