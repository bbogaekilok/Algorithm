import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(bf.readLine());

            for(int i=1; i<=9; i++){

                System.out.println(N+" * "+i+" = "+(N*i));
            }

            bf.close();
            
    }
}    