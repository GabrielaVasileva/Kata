package com.company.disarium_number;
public class Solution
{
    public static String disariumNumber(int number)
    {
        char[] chars = String.valueOf(number).toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }


        int sum = 0;
        for (int i = 0, j = 1; i < ints.length; i++) {
            sum += Math.pow(ints[i],j);
            j++;
        }

        if (sum == number)
            return "Disarium !!";
        else
            return "Not !!";
    }
}