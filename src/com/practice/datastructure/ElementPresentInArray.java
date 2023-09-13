package com.practice.datastructure;

public class ElementPresentInArray {

    private  int linearSearch(int arr[],int b){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                result =1;
                break;
            }else{
                result=0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ElementPresentInArray elementPresentInArray = new ElementPresentInArray();
        int arrayD [] = {145, 158, 68, 171, 99, 132, 148, 91, 115, 46, 71, 123, 175,
                27, 116, 116, 10, 67, 174, 181, 126, 198, 86, 18, 92, 26, 33, 171,
                99, 4, 80, 71, 100, 110, 80, 79, 158, 166, 14, 127, 154, 151, 193,
                151, 109, 24, 179, 8, 37, 99, 165, 193, 178, 137, 118, 105, 155, 24,
                128, 15, 50, 166, 104, 110, 173, 175, 104, 28, 66, 130, 26, 50, 62,
                51, 11, 45, 58, 153, 137, 82, 74, 87, 51, 1, 163, 136, 92, 136, 57,
                67, 83, 81, 66, 47, 2, 174, 99, 183, 56, 104, 28, 174, 173, 46, 162};
        int arr [] = {1, 4, 3, 2};
        int arr1 [] = {1, 4, 3, 2};
        int result11 = elementPresentInArray.linearSearch(arr,2);
       int result12 =  elementPresentInArray.linearSearch(arr1,5);
        int result3 =  elementPresentInArray.linearSearch(arrayD,148);
       // System.out.println("result11 " +result11  );
       // System.out.println("result12 " +result12  );
        System.out.println("result3 ::: " +result3  );
    }
}
