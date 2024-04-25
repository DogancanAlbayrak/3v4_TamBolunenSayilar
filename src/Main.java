import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //We define the value we will obtain from the user, as well as the total and count variables.
        int k;
        int sum = 0;
        int count = 0;
        Scanner inp = new Scanner(System.in);

        //We ask the user to enter a number..
        System.out.print("Sayı Giriniz : ");
        k = inp.nextInt();
        int i;
        for (i = 1; i <= k; i++) {
            if (i % 4 == 0 && i % 3 == 0) { //We check whether the number entered by the user is divisible by 3 and 4.
                sum += i;
                count++;  //We count how many operations are performed.
            }
        }
        double average = 0; //We determine the value for the average.
        if (count != 0) { //We instruct it to perform operations if the average is a different number from zero.
            average = (double) sum / count; // Calculation of the average.
            System.out.print("0 ile " + k + " arasındaki 3'e ve 4'e tam bölünen sayıların ortalaması :" + average);
        } else { //The text to be displayed if there are no numbers divisible by either 3 or 4 up to the number entered by the user.
            System.out.print("Belirttiğiniz aralıkta 3'e ve 4'e bölünebilen sayı bulunmamaktadır.");
        }
    }
}