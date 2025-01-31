package day03;
//
import java.util.Scanner;

public class MagicNumberMain {
    enum Grade {
        SILVER(1000), GOLD(2000), PLATINUM(3000);

        private final int point;

        public static Grade getGradeByMoney(int money) {
            if (0 <= money && money <= 10000) {
                System.out.println(SILVER.name());
                return SILVER;
            } else if (10000 < money && money <= 50000) {
                System.out.println(GOLD.name());
                return GOLD;
            } else {
                System.out.println(PLATINUM.name());
                return PLATINUM;
            }
        }

        Grade(int point) {
            this.point = point;
        }
    }

    private final static int ERROR_MONEY = 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("돈 : ");
        String input = sc.nextLine();
        if (Integer.parseInt(input) > ERROR_MONEY) {
            throw new RuntimeException("올바르지 않은 입력입니다.");
        }

        String grade = null;
        System.out.println("input = " + input);
        Integer money = Integer.parseInt(input);
        Integer point = null;
        System.out.println(Grade.getGradeByMoney(money));

    }

    public static int getPointByGrade(String grade) {
        return switch (grade) {
            case "Silver" -> 1000;
            case "Gold" -> 2000;
            case "Platinum" -> 3000;
            default -> throw new RuntimeException();
        };
    }

    public static int getPointByGrade(Grade grade) {
        return grade.point;
    }
}
