import java.util.*;
import java.lang.*;

public class Algorithm{
 
   //declaring record 'Students'
   public class Students{
       String name;
       String IDnum;
       int year;
      
       public Students(String nam, String id, int yr){
           nam = name;
           id = IDnum;
           yr = year;
       }
   }
       Scanner read = new Scanner(System.in);
       static Students data[] = new Students[8]; //declaration of array of 'Students' datatype (ArrayList)
       public static Algorithm call = new Algorithm();

     //populating array
     public void popArr(){
         int i, yr;
         String nam, id;

         for(i=0;i<2;i++){
            System.out.println("Student No :"+i);
            System.out.println("--------------------");
            System.out.println("Enter name :");
            nam = read.next();
            System.out.println("Enter ID number :");
            id = read.next();
            System.out.println("Enter year of study :");
            yr = read.nextInt();

            data[i] = new Students(nam,id,yr);

         }
        Algorithm call = new Algorithm();
        call.viewArr();
     }

     public void viewArr(){
         int i;

         for(i=0;i<2;i++){
             System.out.println(i+" Name : "+data[i].name);
             System.out.println("   ID no : "+data[i].IDnum);
             System.out.println("   Year : "+data[i].year);
         }
            
     }

     public void seqSearch(){

        int i, pos=-1;

        System.out.println("Enter ID you want to search");
        String tempID = read.next();

        for(i=0;i<2;i++){

            if(tempID == data[i].IDnum){
                pos = i;
            }
        }
        
        if(pos>=0){
            System.out.println("Details For ID no. "+tempID);
            System.out.println(data[pos].name);
            System.out.println(data[pos].IDnum);
            System.out.println(data[pos].year);
        }
        else{
            System.out.println("No details found for ID number : "+tempID);
        }

     }

     public void binSearch(){

        System.out.println("Enter ID you want to search");
        String tempID = read.next();

        int pos = -1;
        int l,u,m;

        call.selSort();

        l=0;
        u=7;

        do{
            m=(int)(l+u)/2;

            if(tempID.compareTo(data[m].IDnum)>0)
                 u=m-1;
            else if(tempID.compareTo(data[m].IDnum)<0)
                 l=m+1;
            else 
                 pos = m;
        }
        while(l<u && pos<=-1);
        
        if(pos>=0){
            System.out.println("Details For ID no. "+tempID);
            System.out.println(data[pos].name);
            System.out.println(data[pos].IDnum);
            System.out.println(data[pos].year);
        }
        else{
            System.out.println("No details found for ID number : "+tempID);
        }


     }

     public void selSort()
       {
           int i,j;
           Students tmp;

           for(i=0;i<7;i++){ 

            for(j=1;j<8;j++){

               if(data[i].name.compareTo(data[j].name)>0){
                  tmp = data[i];
                  data[i] = data[j];
                  data[j] = tmp;
               }
           }
           }
       }

       public void bubSort(){

        int i,j;
        Students tmp;

        for(i=0;i<7;i++){
            for(j=7;j<i+1;j--){

                if(data[j].IDnum.compareTo(data[j-1].IDnum)<0){
                    tmp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = tmp;

                }
            }
        }
       }

     public static void main(String[] args){
         
        Scanner scan = new Scanner(System.in);

         System.out.println("Choose What you want to do :");
         System.out.println("1) Populate array");
         System.out.println("2) View data on array");
         System.out.println("3) Sequential search array");
         System.out.println("4) Binary search array");

         int x = scan.nextInt();
          
         
         if(x==1){
             call.popArr();
         }
        else if(x==2){
            call.viewArr();
        }
        else if(x==3){
            call.seqSearch();
        }
        else if(x==3){
            call.binSearch();
        }
        else{
            System.out.println("Enter valid option above");
        }

     }
   


}
