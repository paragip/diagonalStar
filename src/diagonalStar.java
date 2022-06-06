public class diagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid value");
        } else {

            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) { //1. és utolsó sor
                        System.out.print("*");
                    }
                    if ((i != 1 && i != number) && (j==1 || j == number)) { //első és utolsó oszlop
                        System.out.print("*");
                    }
                    if ((i != 1 && i != number && j != 1 && j != number) && (j == i || j == number -i +1)){
                        System.out.print("*");
                    }

                    if ((i != 1 && i != number && j != 1 && j != number) && (j != number -i +1) && (j!=i)){
                        System.out.print(" ");
                    }

                }System.out.println();

            }


        }

    }

}
