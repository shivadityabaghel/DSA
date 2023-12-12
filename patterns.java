package patterns;

public class patterns {
    public static void main(String[] args) {
        int n= 4;
        pattern31(n);
    }

    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
     static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
     static void pattern5(int n){
        for(int i=1; i<=2*n; i++){
           int totcols;
           if(i>n){
            totcols= n-(i-n);
           }
           else{
            totcols= i;
           }
            for(int j=1; j<=totcols; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern28(int n){
        for(int i= 0; i<2*n; i++){
            int totcols;
            if(i>n){
                totcols= n - (i-n);
            }
            else{
                totcols= i;
            } 
            int noofspaces= n-totcols;
            for(int s =0; s<noofspaces; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=totcols; j++){
                System.out.print("* "); //imp to add space after.
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int i=0; i<n; i++){
            int totcols= n-i;
            for (int s=0; s<totcols;s++){
                System.out.print("  ");
            }
              for (int col=i; col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2; col<=i;col++){
                System.out.print(col+" ");
            }
            System.out.println();

    }
 } 
 static void pattern17(int n){
        for(int i=0; i<2*n; i++){
            int totcols;
            if(i>n){
                totcols= n-(i-n);
            }
            else{
                totcols= i;
            }

            for (int s=0; s<n-totcols;s++){
                System.out.print("  ");
            }
              for (int col=totcols; col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col=2; col<=totcols;col++){
                System.out.print(col+" ");
            }
            System.out.println();

    }
}
static void pattern31(int n) {
    int ogN = n;
    n = 2 * n;
    for (int row = 0; row <= n; row++) {
        for (int col = 0; col <= n; col++) {
            int Index = ogN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
            System.out.print(Index + " ");
        }
        System.out.println();
    }
}
       
    

}
    
