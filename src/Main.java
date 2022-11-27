import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5987, 25834, 84956, 187263, 97578, 8349, 495,7896,697,769,689};
        System.out.println(Arrays.toString(ansArr(arr)));
    }
    public static int[] ansArr(int[] arr) {
        int[] sumArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int testNum=0;
            while (arr[i]<10){
                if (arr[i]!=testNum){
                    testNum++;
                }
                if (arr[i]==testNum){
                    sumArr[testNum]+=1;
                    break;
                }
            }
            if (arr[i]>=10){
                while (arr[i]%10!=testNum) {
                    testNum++;
                    if (arr[i] % 10 == testNum) {
                        sumArr[testNum] += 1;
                        arr[i] /= 10;
                        testNum = 0;
                    }
                }
            }
        }
        return sumArr;
    }
}