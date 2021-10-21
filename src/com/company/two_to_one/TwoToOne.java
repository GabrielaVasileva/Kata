package com.company.two_to_one;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        char[] chars = new char[s1.length() + s2.length()];
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars1.length; i++) {
            chars[i] = chars1[i];
        }
        for (int i = 0; i < chars2.length; i++) {
            chars[i+chars1.length] = chars2[i];
        }

        bubbleSort(chars,chars.length);

        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            for (int j = i + 1; j < chars.length; j++) {
                if (aChar == chars[j]){
                    chars[j] = ' ';
                }
            }
        }



        String s = String.copyValueOf(chars).replaceAll(" ","");
        return s;
    }

    static void bubbleSort(char arr[], int n)
    {
        int i, j;
        char temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }
}
