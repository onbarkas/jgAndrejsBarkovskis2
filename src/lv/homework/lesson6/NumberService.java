package lv.homework.lesson6;

public class NumberService {
    int sum; //šim ir jābūt lokālajam mainīgajam, jo attiecās tikai uz vienu metodi

    //šai metodei ir jāatgriež rezultāts, nevis jāāprēķina un jāizvada tas
    public void sumInRange(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum = i + sum;
                System.out.format("%5d", i);//nav  nepieciešams
            }
            System.out.println("     Sum is " + sum);//jāatrodas ShoppingListTest metodē
            sum = 0; // šis nav nepieciešams, ienesot mainīgo metodē
        } else {
            for (int i = a; i >= b; i--) {
                sum = i + sum;
                System.out.format("%5d", i);
            }
            System.out.println("     Sum is " + sum);//jāatrodas ShoppingListTest metodē
            sum = 0;// šis nav nepieciešams, ienesot mainīgo metodē
        }
    }

    //šai metodei ir jāatgriež rezultāts, nevis jāāprēķina un jāizvada tas
    public void getEvenNumberCount(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {// var inzest atsevišķā metodē
                    continue;
                }
                System.out.format("%5d", i);//nav  nepieciešams
            }
            System.out.println();//nav  nepieciešams
        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 != 0) {
                    continue;
                }
                System.out.format("%5d", i);//nav  nepieciešams
            }
            System.out.println();//nav  nepieciešams
        }

    }
}
