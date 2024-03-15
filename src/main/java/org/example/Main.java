package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int i = 0;
        int sum = 0;
        for (i = 0; i < password.length(); i++) {

        }
        if (password.length() > 8) {
            sum = sum + 25;
            System.out.println("shifre 8'den boyukdur");

        } else if (password.length() == 8) {
            sum = sum + 25;
            System.out.println("shifre 8'e beraberdir");
        } else {
            System.out.println("shifrenin uzunlugu 8'den kichikdir");
        }
        if (password.matches(".*[A-Z].*")) {
            sum = sum + 25;
            System.out.println("shifrede boyuk herflerden istifade olunub");

        } else {
            System.out.println("shifrede boyuk herflerden istifade olunmayib");
        }
        if (password.matches(".*[!@#$%^&*()-+/>,<].*")) {
            sum = sum + 25;
            System.out.println("shifrede qrafik simvollardan istifade olunub");

        } else {
            System.out.println("shifrede qrafik simvollardan istifade olunmayib");
        }
        if (password.matches(".*\\d.*")) {
            sum = sum + 25;
            System.out.println("shifrede reqemlerden istifade olunub");

        } else {
            System.out.println("shifrede reqemlerden istifade olunmuyub");
        }
        System.out.println(sum);

        int a = sum;
        if(0<=a &&a<=19)

        {
            System.out.println("chox zeif");
        }
        else if(20<=a &&a<=39)

        {
            System.out.println("zeif");
        }
        else if(40<=a &&a<=59)

        {
            System.out.println("yaxshi");
        }
        else if(60<=a &&a<=79)

        {
            System.out.println("guclu");
        }
        else if(80<=a &&a<=100)

        {
            System.out.println("chox guclu");
        }
        else

        {
            System.out.println("daxil edilen eded yanlishdir");
        }
    }

}