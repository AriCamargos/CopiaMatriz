package testacopiaarrays;
/**
*@author AriCamargos
*@version 8.0 (Sept 15, 2021)
* Estudo de cópia de arrays
**/ 
public class TestaCopiaArrays {
    public static void main(String[] args) {
        int original[] = { 1,2,3,4,5,6 };
        int copia[] = new int[10];
        System.arraycopy(original, 0 , copia, 0 , original.length);  //array de copia
        System.out.print("Original: ");
        for(int i=0; i < original.length; i++){
            System.out.print(original[i] + " ");
        }
        System.out.println();
        System.out.print("Cópia: ");
        for(int i=0; i < copia.length; i++){
            System.out.print(copia[i] + " " );
            
        }
    }
    
}
