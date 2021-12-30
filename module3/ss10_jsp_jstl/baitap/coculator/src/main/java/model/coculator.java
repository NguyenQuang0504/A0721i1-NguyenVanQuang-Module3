package model;

public class coculator {
    public static float caculator(float num1, float num2, char opera){
        switch (opera){
            case '+' :
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1*num2;
            case '/':
                if(!(num2==0)){
                    return num1/num2;
                }
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
