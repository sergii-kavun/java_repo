package com.learning.OOPpractice1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Created by vid4i on 18.06.2017.
 */
public class SergiiAskingToScream {
    public static void main(String[] args) {

        Sergii Sergey = new Sergii();
        Sergey.setName("Sergii");
        Sergey.setAge(29);
        Sergey.setWeight(100);



        String name = Sergey.getName();
        String age = Integer.toString(Sergey.getAge());
        String weight = Long.toString(Sergey.getWeight());

        String[] word = new String[] {name, age, weight};
        //String words = Arrays.toString(word);
        String words = StringUtils.join(word, " ");

        boolean check = Sergey.askKatya(words);
        if (check == true) {
            System.out.println("everything is ok");
        }

    }
}
