/**
 *
 * @author Yuri
 * Implementação utilizando ArrayList
 * Sendo ordenado através do algoritmo de ordenação MergeSort
 */

import java.util.*;

public class Vetores_2 
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
        
        mergesort(vet3,0,vet3.size()-1);
       
        return vet3;
    }
    
   public static void mergesort(ArrayList vet, int esq, int dir)  
   {  
        if (esq < dir)  
        {  
            int medio = (esq + dir) / 2;  
            mergesort(vet, esq, medio);  
            mergesort(vet, medio + 1, dir);  
            intercala(vet, esq, medio + 1, dir);  
        }  
   }
   
   public static void intercala(ArrayList vet, int posEsq, int posDir, int posFin)  
   {  
      int[] aux = new int[vet.size()];  
      int fim = posDir - 1;  
      int posAux = posEsq;  
      int numElementos = posFin - posEsq + 1;  
      // Busca principal  
      while (posEsq <= fim && posDir <= posFin)  
         if ((int)vet.get(posEsq) < (int)vet.get(posDir))  
         {  
            aux[posAux++] = (int)vet.get(posEsq++);  
         }  
         else  
         {  
            aux[posAux++] = (int)vet.get(posDir++);  
         }  
      // Copia primeira metade  
      while (posEsq <= fim)  
      {  
         aux[posAux++] = (int)vet.get(posEsq++);  
      }  
      // Copia segunda metade  
      while (posDir <= posFin)  
      {  
         aux[posAux++] = (int)vet.get(posDir++);  
      }  
      // Copia veteor temporário no principal  
      for (int i = 0; i < numElementos; i++, posFin--)  
      {  
         vet.set(posFin, aux[posFin]);  
      }  
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
