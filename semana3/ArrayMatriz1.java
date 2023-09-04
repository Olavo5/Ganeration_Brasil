package semana3;

public class ArrayMatriz1 {

    public static void main(String[] args) {
        int matrizInteiros[][] = { { 1, 2, 3 }, 
                                   { 4, 5, 6 }, 
                                   { 7, 8, 9 } };

        System.out.println("Diagonal principal:");
        int somaDiagonalPrincipal = 0;
        for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < matrizInteiros[indiceLinha].length; indiceColuna++) {
                if (indiceLinha == indiceColuna) {
                    int elemento = matrizInteiros[indiceLinha][indiceColuna];
                    System.out.print(elemento + " ");
                    somaDiagonalPrincipal += elemento;
                }
            }
        }
        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);

        System.out.println("\nDiagonal secundária:");
        int somaDiagonalSecundaria = 0;
        for (int indiceLinha = 0; indiceLinha < matrizInteiros.length; indiceLinha++) {
            int elemento = matrizInteiros[indiceLinha][matrizInteiros.length - 1 - indiceLinha];
            System.out.print(elemento + " ");
            somaDiagonalSecundaria += elemento;
        }
        System.out.println("\nSoma da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
