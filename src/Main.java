import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 1;

        System.out.println("University of Gugsi, No where in Particular");
        System.out.println();
        System.out.println("\tAward Calulation System");
        System.out.println("\t-----------------------");
        System.out.println("");

        InputValidation.studentValidation();

        for (x = 1; x <= 6; x++) {
            if (InputValidation.awardConfirmation == 0) {
                System.out.println();
                System.out.println("\tLevel 4 Module " + x);
                System.out.println("\t----------------");
                System.out.println();

                InputValidation.validation1();
                InputValidation.validation2();
                InputValidation.validation3();

                InputValidation.level4condoneAverage();
                InputValidation.condone();

                InputValidation.validation4();
                InputValidation.validation5();
                InputValidation.validation6();

                InputValidation.retakeValidation();
                InputValidation.retakeLimitReached();
                InputValidation.credit();
                InputValidation.l4average=0;
            }
        }


        for (x = 7; x <= 12; x++) {
            if (InputValidation.awardConfirmation == 0) {
                System.out.println();
                System.out.println("\tLevel 5 Module " + y);
                System.out.println("\t----------------");
                System.out.println();

                InputValidation.validation1();
                InputValidation.validation2();
                InputValidation.validation3();
                InputValidation.validation4();
                InputValidation.validation5();
                InputValidation.validation6();

                InputValidation.retakeValidation();
                InputValidation.retakeLimitReached();

                InputValidation.credit();

                InputValidation.level5Average();

                y++;

            }
        }


        for (x = 13; x <= 17; x++) {
            if (InputValidation.awardConfirmation == 0) {
                System.out.println();
                System.out.println("\tLevel 6 Module " + z);
                System.out.println("\t----------------");
                System.out.println();

                InputValidation.validation1();
                InputValidation.validation2();
                InputValidation.validation3();
                InputValidation.validation4();
                InputValidation.validation5();
                InputValidation.validation6();

                InputValidation.retakeValidation();
                InputValidation.retakeLimitReached();

                if (x == 17) {
                    if (InputValidation.ict01 >= 40 && InputValidation.ict02 >= 40
                            && InputValidation.courseWork >= 40) {
                        InputValidation.credit += 20;
                    }
                }

                InputValidation.credit();

                InputValidation.level6Average();

                InputValidation.successfullCompletion();
            }
            z++;
        }
    }
}
