import java.util.Scanner;
/** ... */
public class MainClass {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Crea vector1 leyendo sus elementos
        int[] vector1 = Internal.loadIntArray(input); 
        
        // Crea vector2 leyendo sus elementos
        int[] vector2 = Internal.loadIntArray(input); 
        
        // Se obtiene el número de elementos a tratar
        System.out.print("Elementos a tratar: ");
        int n = input.nextInt();
        
        // Proceso y muestra del array resultado
        int[] vector3 = Excercise.highers(vector1, vector2, n);
        System.out.println("El resultado es: ");
        Internal.showIntArray(vector3);
    }
}