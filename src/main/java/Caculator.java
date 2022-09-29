public class Caculator {
    public  static float calculate(float first, float second, String operate) {
        switch (operate){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second!=0){
                    return   first / second;
                }else {
                    throw new RuntimeException(" chia cho  0");
                }
            default:
                throw new RuntimeException("chon sai phep toan");

        }
    }
}
