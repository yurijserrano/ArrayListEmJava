/**
 *
 * @author Yuri
 * Implementação utilizando a classe ArrayList.
 * Foi utilizado neste exemplo o método Collections.sort para ordenar o 
 * ArrayList.
 */

import java.util.*;

public class Vetores2 
{
    public static ArrayList merge(ArrayList vet,ArrayList vet2)
    {
        ArrayList vet3 = new ArrayList (vet.size()+vet2.size());
        
        /*Este for intercala os valores dos dois ArrayLists como pedido pelo 
         * Exercício
        */        
        for (int i = 0; i < vet.size(); i++) 
        {  
            if (vet2.size() > i) 
            {  
                int num1 = (int) vet.get(i);  
                int num2 = (int) vet2.get(i);  
                vet3.add(num1);  
                vet3.add(num2);  
            }
            else
            {  
                int num1 = (int) vet.get(i);  
                vet3.add(num1);  
            }  
        }  
          
        Collections.sort(vet3);
       
        return vet3;
    }
    
    public static void main(String[] args)
    {
        ArrayList vet = new ArrayList();
        ArrayList vet2 = new ArrayList();
        ArrayList vet3 = new ArrayList(vet.size()+vet2.size());
        
        vet.add(2);
        vet.add(1);
        vet.add(4);
        vet.add(3);
        vet.add(6);
        vet.add(5);
        
        vet2.add(22);
        vet2.add(21);
        vet2.add(24);
        vet2.add(23);
        vet2.add(26);
        vet2.add(25);
        
        Collections.sort(vet);
        Collections.sort(vet2);    
        
        vet3=merge(vet,vet2);
        
        for (int i = 0; i < vet3.size(); i++) 
        {  
            int num = (int) vet3.get(i);  
            System.out.print(num+" ");  
        }  
               
    }    
    
}
