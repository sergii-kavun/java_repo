package com.learning.OOPpractice1;

/**
 * Created by vid4i on 18.06.2017.
 */
public class Katya {
    private static String name;
    private static int age;
    private static long weight;

    public String getName() {
        return name;
    }

    public static void setName(String KatyaName) {
        name = KatyaName;
    }

    public int getAge() {
        return age;
    }

    public static void setAge(int KatyaAge) {
        age = KatyaAge;
    }

    public long getWeight() {
        return weight;
    }

    public static void setWeight(long KatyaWeight) {
        weight = KatyaWeight;
    }

    public static boolean scream(String screamWord) {
        if (screamWord != null) {
            System.out.println("Hey, I`m screaming..." + screamWord);
            return true;
        } else
        {
            return false;
        }
    }
}
