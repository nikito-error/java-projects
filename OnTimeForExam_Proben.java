import java.util.Scanner;

public class OnTimeForExam_Proben {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int chasi = Integer.parseInt(scanner.nextLine());
                int mini = Integer.parseInt(scanner.nextLine());
                int chasp = Integer.parseInt(scanner.nextLine());
                int minp = Integer.parseInt(scanner.nextLine());
                int total;
                if (chasp > chasi || chasp == chasi && minp > mini) {
                    System.out.println("Late");
                } else if ((chasp == chasi && minp==mini) || (chasp < chasi && minp - mini >= 30 && chasp - mini <= 59) || chasp -chasp<=30) {
                    System.out.println("On Time");
                } else {
                    System.out.println("Early");
                }
                if (chasp < chasi && minp - mini > 0 && minp - mini <= 59) {
                    total = (minp - mini) - 60;
                    System.out.printf("%d minutes before the start", -total);
                } else if (chasi - chasp == 1 && minp - mini == 0 || chasp < chasi && chasi - chasp > 1) {
                    total = chasi - chasp;
                    int total1 = (mini - minp);
                    if (total1 < 10) {
                        System.out.printf("%d:0%d hours before the start", total, total1);
                    } else {
                        System.out.printf("%d:%d hours before the start", total, total1);
                    }
                } else if (chasp > chasi && minp - mini < 0 && minp - mini >= -59 || chasp == chasi && minp - mini > 0 && minp - mini <= 59) {
                    total = minp - mini;
                    if (total < 0) {
                        total = total + 60;
                        System.out.printf("%d minutes after the start", total);
                    } else {
                        System.out.printf("%d minutes after the start", total);
                    }
                } else {
                    total = chasp - chasi;
                    int total1 = (minp - mini);
                    if (total1 < 10) {
                        System.out.printf("%d:0%d hours after the start", total, total1);
                    } else {
                        System.out.printf("%d:%d hours after the start", total, total1);
                    }
                }

            }
        }

