package lab.test;

import javax.jws.soap.InitParam;

/**
 *
 * @author yulun deng
 */
public class LabTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Author = {"Daniel", "Cay Horstmann", "Jashua Bloch", "Herbert Schildt", "Kathy Sierra"};
        String[] Title = {"Introuduction java programming", "core java: fundamentals", "effective java", "java: a beg inner's guide","java: head first"};
        String[] ISBN = {"9780136520238", "9780135166307", "9780134685991", "9781260440218", "9780596009206"};
        
        System.out.println("Original Data: ");
        System.out.println("Author \t Title \t ISBN");
        System.out.println("+-------------------------+");
        for ( i=0; i < id.length; i++){
            System.out.println(Author[i]+" \t "+Title[i]+" \t "+ISBN[i]);
        }
        
        String hold1;
        String hold2;
        double hold3;
        
        //sort by Author (reg no)
        for (int pass = 1; pass < id.length; pass++){
            for (int i = 0; i < id.length - 1; i++){
                if (Author[i].compareTo(Author[i+1])>0){
                    //sort Author
                    hold1=Author[i];
                    Author[i]=Author[i+1];
                    Author[i+1]=hold1;
                    
                    //sort Title
                    hold2=Title[i];
                    Title[i]=Title[i+1];
                    Title[i+1]=hold2;
                    
                    //sort ISBN
                    hold3=ISBN[i];
                    ISBN[i]=ISBN[i+1];
                    ISBN[i+1]=hold3;
                    
                }
            }
        }
        
        System.out.println("");
        System.out.println("Data (sorted by Author): ");
        System.out.println("Author \t Title \t ISBN");
        System.out.println("+-------------------------+");
        for (int i=0; i<id.length; i++){
            System.out.println(id[i]+" \t "+name[i]+" \t "+marks[i]);
        }
        
        //sort by ISBN
        for (int pass = 1; pass < id.length; pass++){
            for (int i = 0; i < id.length-1; i++){
                if (ISBN[i] < ISBN[i+1]){
                    
                    //sort ISBN
                    hold3 = ISBN[i];
                    ISBN[i] = ISBN[i+1];
                    ISBN[i+1] = hold3;
                    
                    //sort Author
                    hold1 = Author[i];
                    Author[i] = Author[i+1];
                    Author[i+1] = hold1;
                    
                    //sort Title
                    hold2 = Title[i];
                    Title[i]=Title[i+1];
                    Title[i+1]=hold2;
                    
                }
            }
        }
        
        System.out.println("");
        System.out.println("Data (sorted by Marks): ");
        System.out.println("Author \t Title \t ISBN");
        System.out.println("+-------------------------+");
        for (int i=0; i < id.length; i++){
            System.out.println(Author[i]+" \t "+Title[i]+" \t "+ISBN[i]);
        }
        
        //sort Title
        for (int pass=1; pass < id.length; pass++){
            for (int i=0; i < id.length-1; i++){
                if (Title[i].compareTo(Title[i+1]) > 0){
                    
                    //sort Title
                    hold2 = Title[i];
                    Title[i] = Title[i+1];
                    Title[i+1] = hold2;
                    
                    //sort Author
                    hold1 = Author[i];
                    Author[i] = Author[i+1];
                    Author[i+1] = hold1;
                    
                    //sort ISBN
                    hold3 = ISBN[i];
                    ISBN[i] = ISBN[i+1];
                    ISBN[i+1] = hold3;
                    
                }
            }
        }
        
        System.out.println("");
        System.out.println("Data (sorted by Title): ");
        System.out.println("Author \t Title \t ISBN");
        System.out.println("+-------------------------+");
        for (int i = 0; i < Author.length; i++){
            System.out.println(Author[i]+" \t "+Title[i]+" \t "+ISBN[i]);
        }
    }
    
}
