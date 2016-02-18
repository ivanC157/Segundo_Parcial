
package parejasdisparejas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ParejasDisparejas {

    public static int n, m, aux1=0, aux2=0,aux;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       do{ 
        System.out.println("Dame m: ");   //Insertamos el valor de m  
        m= Integer.parseInt(bf.readLine());
      }while(m<1 || m>200000000); 
       
       do{ 
        System.out.println("Dame n: ");   //insertamos el valor de n
        n= Integer.parseInt(bf.readLine());
      }while(n<1 || n>200000000); 
       
    for(int i=1;i<(m-1);i++){          //sacamos la suma de los divisores de l numero m
        if(m%i==0){
            aux=aux2+i;
            aux2=aux;
         
        }
        
    } 
    for(int i=1;i<(n-1);i++){       //sacamos la suma de los divisores de l numero n
        if(n%i==0){
            aux=aux1+i;
            aux1=aux;
         
        }
        
    }   
     
    //System.out.print(aux2 + " ");
      // System.out.print(aux1 + " ");
     
     System.out.print(m + " " + n + " ");  //imprimimos los numeros de m y n
      
      
    
    if(m==aux1 && n==aux2){               //hacemos la primera comaracion de (m,n)
        
        System.out.print("0" + " ");    // 0 = perfecta
        
    }else if(m<=aux1 && n<=aux2){           
        
        System.out.print("1" + " ");   // 1 = defectuosa
    }else if(m>=aux1 && n>=aux2){
        
        System.out.print("2" + " ");  // 2 = afectuosa
    }else{
        System.out.print("3" + " ");  // 3 = dispareja
    }
    
   
       
    
    if(m==aux2 && aux2==m){             //hacemos la segunda comparacion de (m,m)
        
        System.out.print("0" + " ");
        
    }else if(aux2<=m && aux2<=m){
        
        System.out.print("1" + " ");
    }else if(aux2>=m && aux2>=m){
        
        System.out.print("2" + " ");
    }else{
        System.out.print("3" + " ");
    }
    
    
    
       
    
    if(n==aux1 && aux1==n){             //hacemos la tercera comparacion de (n,n)
        
        System.out.print("0" + " ");
        
    }else if(n<=aux1 && aux1<=n){
        
        System.out.print("1" + " ");
    }else if(aux1>=n && aux1>=n){
        
        System.out.print("2" + " ");
    }else{
        System.out.print("3" + " ");
    }
    
    
    }
    
}
