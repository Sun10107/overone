 package overone.com.lessons.les_4;

public class les5 {

 public static void main(String[]args){
     int c=0;
     int sum1=0;
     int sum2=1;
     while (c<120) {
         if ( c %2 == 0 ){
             sum1 += c;
         }
         else{
             sum2 += c;
         }
         c++;
     }
     System.out.println(" Summa ch"+ sum1);
     System.out.println(" Summa  no ch"+ sum2);
     System.out.println(" Summa all num"+ (sum1+sum2));
 }  }

