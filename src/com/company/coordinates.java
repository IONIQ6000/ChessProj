package com.company;

public class coordinates {
    static int coordi(int num1, int num2) {
        int x = num1;
        switch(x){
            case 0:
                return 7;
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                num1 = 4;
                break;
            case 4:
                num1 = 3;
                break;
            case 5:
                num1 = 2;
                break;
            case 6:
                num1 = 1;
                break;
            case 7:
                num1 = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num1);
        }
        int y = num2;
        switch(y){
            case 0:
                num2 = 7;
                break;
            case 1 :
                num2 = 6;
                break;
            case 2:
                num2 = 5;
                break;
            case 3:
                num2 = 4;
                break;
            case 4:
                num2 = 3;
                break;
            case 5:
                num2 = 2;
                break;
            case 6:
                num2 = 1;
                break;
            case 7:
                num2 = 0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + num1);
        }
        return x;
    }

}
