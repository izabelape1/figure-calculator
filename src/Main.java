import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Options options = new Options();
        Scanner scanner = new Scanner(System.in);
        int figure;
        int choice;
        boolean check = false;


        do {
            options.printOptions();
            figure = scanner.nextInt();
            do {
                if (figure == 0) {
                    break;
                } else if (figure < 1 || figure > 7) {
                    System.out.println("Invalid number, please try again:");
                    figure = scanner.nextInt();
                } else {
                    check = true;
                }
            } while (!check);

            check = false;
            if (figure == 0) {
                break;
            } else {
                options.printCalculateOptions();
                choice = scanner.nextInt();
                do {
                    if (choice < 1 || choice > 2) {
                        System.out.println("Invalid number, please try again:");
                        choice = scanner.nextInt();
                    } else {
                        check = true;
                    }
                } while (!check);

                if (choice == 1) {
                    options.area(figure);
                } else {
                    options.perimeter(figure);
                }
            }
            System.out.println();
        } while (choice != 0);

    }
}




