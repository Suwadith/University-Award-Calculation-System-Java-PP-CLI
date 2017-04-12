import java.util.Scanner;

public class InputValidation {

    static int student_ID;
    static int ict01;
    static int ict02;
    static int courseWork;
    static int resitICT01;
    static int resitICT02;
    static int resitCourseWork;
    static int total;
    static int retakeCount;
    static int retakeCounter;
    static int credit;
    static String input;
    static int l5average;
    static int l6average;
    static int l4average;
    static int awardCount;
    static int awardConfirmation = 0;
    static int condoneCount = 0;
    static String input1;

    public static int studentValidation() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Student's ID: ");

        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please input a valid integer value");
            sc.next();
        }

        student_ID = sc.nextInt();
        return student_ID;
    }

    public static int validation1() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter ICT 1 mark: ");

            while (!sc.hasNextInt()) {
                System.err
                        .println("Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                sc.next();
            }
            ict01 = sc.nextInt();

            if (!(ict01 >= 0 && ict01 <= 100)) {
                System.err.println(
                        "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
            }
        } while (!(ict01 >= 0 && ict01 <= 100));
        return ict01;
    }

    public static int validation2() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter ICT 2 mark: ");

            while (!sc.hasNextInt()) {
                System.err
                        .println("Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                sc.next();
            }
            ict02 = sc.nextInt();

            if (!(ict02 >= 0 && ict02 <= 100)) {
                System.err.println(
                        "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
            }
        } while (!(ict02 >= 0 && ict02 <= 100));
        return ict02;
    }

    public static int validation3() {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Coursework mark: ");

            while (!sc.hasNextInt()) {
                System.err
                        .println("Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                sc.next();
            }
            courseWork = sc.nextInt();

            if (!(courseWork >= 0 && courseWork <= 100)) {
                System.err.println(
                        "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
            }
        } while (!(courseWork >= 0 && courseWork <= 100));
        return courseWork;
    }

    public static int validation4() {

        if (ict01 < 40) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Student has failed in ICT 1");
            System.out.println("");
            System.out.println("Enter ICT 01 Referral mark: ");

            do {
                while (!sc.hasNextInt()) {
                    System.err.println(
                            "Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                    sc.next();
                }
                resitICT01 = sc.nextInt();

                if (!(resitICT01 >= 0 && resitICT01 <= 100)) {
                    System.err.println(
                            "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
                }
            } while (!(resitICT01 >= 0 && resitICT01 <= 100));
            if (resitICT01 >= 40) {
                ict01 = 40;
            }

        }
        return ict01;

    }

    public static int validation5() {

        if (ict02 < 40) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Student has failed in ICT 2");
            System.out.println("");
            System.out.println("Enter ICT 02 Referral mark: ");

            do {
                while (!sc.hasNextInt()) {
                    System.err.println(
                            "Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                    sc.next();
                }
                resitICT02 = sc.nextInt();

                if (!(resitICT02 >= 0 && resitICT02 <= 100)) {
                    System.err.println(
                            "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
                }
            } while (!(resitICT02 >= 0 && resitICT02 <= 100));
            if (resitICT02 >= 40) {
                ict02 = 40;
            }
        }
        return ict02;

    }

    public static int validation6() {

        if (courseWork < 40) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Student has failed in Coursework");
            System.out.println("");
            System.out.println("Enter Coursework Referral mark: ");

            do {
                while (!sc.hasNextInt()) {
                    System.err.println(
                            "Invalid marks. Please enter a marks which" + " should be within the range of 0-100");
                    sc.next();
                }
                resitCourseWork = sc.nextInt();

                if (!(resitCourseWork >= 0 && resitCourseWork <= 100)) {
                    System.err.println(
                            "Invalid marks. Please re-enter the marks which" + " should be within the range of 0-100");
                }
            } while (!(resitCourseWork >= 0 && resitCourseWork <= 100));
            if (resitCourseWork >= 40) {
                courseWork = 40;
            }
        }
        return courseWork;

    }

    public static int condone() {
        if (condoneCount < 2) {
            if (l4average >= 40 && (ict01 < 40 || ict02 < 40 || courseWork < 40)) {
                System.out.println("Did the student take condone? (type 'yes' or 'no' in lowercase)");
                Scanner sc = new Scanner(System.in);
                input1 = sc.nextLine();
                if (input1.matches("yes")) {
                    ict01 = 40;
                    ict02 = 40;
                    courseWork = 40;
                    condoneCount++;
                } else if (input1.matches("no")) {
                    validation4();
                    validation5();
                    validation6();
                } else if (!(input1.matches("yes")) || !(input1.matches("no"))) {
                    System.out.println("Please type 'yes' or 'no'");
                    sc.next();
                }
            }

        }

        return condoneCount;
    }

    public static void retakeValidation() {
        if (retakeCounter < 3) {
            if (ict01 < 40 || ict02 < 40 || courseWork < 40) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Retake");
                System.out.println("------");
                System.out.println("");
                validation1();
                validation2();
                validation3();
                validation4();
                validation5();
                validation6();

                retakeCounter++;

            }
            if (ict01 < 40 || ict02 < 40 || courseWork < 40) {
                System.out.println("The student has failed in the retake.");

                retakeLimitReached();
                retakeCounter = 3;
            }
        }

    }

    public static void retakeLimitReached() {
        if (retakeCounter == 3) {
            System.out.println("Maximum Number of Retakes taken.");
            JumpToAwarding();

        }

    }

    public static void JumpToAwarding() {
        if (ict01 < 40 || ict02 < 40 || courseWork < 40) {
            Scanner sc = new Scanner(System.in);
            System.out.println(
                    "Please type 'yes' in lowercase to go and check the award that the student will be getting");
            while (!sc.hasNext("yes")) {
                System.out.println("Invalid input. Please input a valid integer value");
                sc.next();
            }
            input = sc.next();
            Awarding();

        }

    }

    public static int credit() {
        if (ict01 >= 40 && ict02 >= 40 && courseWork >= 40) {
            credit += 20;
            System.out.println(credit);
        }
        return credit;
    }

    public static int level4condoneAverage() {
        return l4average += (ict01 + ict02 + courseWork) / 3;
    }

    public static int level5Average() {
        l5average += (ict01 + ict02 + courseWork) / 54;
        System.out.println(l5average);
        return l5average;
    }

    public static int level6Average() {
        l6average += (ict01 + ict02 + courseWork) * 2 / 45;
        System.out.println(l6average);
        return l6average;
    }

    public static void successfullCompletion() {
        if (credit == 360) {
            System.out.println("You have suceessfully completed the 4 year degree program.");
            Awarding();
        }

    }

    public static void Awarding() {

        if (credit == 360) {

            if (l5average + l6average >= 40) {
                System.out.println("The Student is Eligible to get a 3rd class Honors Degree");
            }

            if (l5average + l6average >= 50) {
                System.out.println("The Student is Eligible to get 2nd a class Honors Lower Division Degree");
            }

            if (l5average + l6average >= 60) {
                System.out.println("The Student is Eligible to get a 2nd class Honors Upper Division Degree");
            }

            if (l5average + l6average >= 70) {
                System.out.println("The Student is Eligible to get a 1st class Honors Degree");
            }
            System.out.println(l5average + l6average);
            awardCount++;
        } else if (credit < 360 && credit >= 300) {
            System.out.println("The Student is Eligible to get a Non-Honors Degree");

        } else if (credit < 300 && credit >= 240) {
            System.out.println("The Student is Eligible to get a Diploma in Higher Education");

        } else if (credit < 240 && credit >= 120) {
            System.out.println("The Student is Eligible to get a Certificate in Higher Education");

        } else {
            System.out.println("Sorry. The number of credits received by the student is very low!");
            awardConfirmation++;

        }

    }

    public static int total() {
        total += ict02;
        System.out.println(total);
        return ict02;
    }

}
