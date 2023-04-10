package modelTest1;

public class PasswordTest {
    public static void main(String[] args) {
//        对数组进行加密, 加5 对10取余 将所有数字反转
        int number = 1983;
        int[] array = getArray(number);
        int[] encryptArray = getEncrypt(array);
        int password = 0;
        for (int i = 0; i < encryptArray.length; i++) {
            password = password * 10 + encryptArray[i];
        }
        System.out.println(password);
        int [] decrypt = getDecrypt(encryptArray);
        for (int i = 0; i < decrypt.length; i++) {
            System.out.print(decrypt[i]);
        }

        }



    public static int[] getEncrypt(int[] array) {
        int[] encryptedArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array[i] = (array[i] + 5) % 10;
            encryptedArray[j] = array[i];
        }
        return encryptedArray;
    }

    public static int[] getDecrypt(int [] array){
        int [] decryptArray = new int[array.length];
        for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
            if (array[i]>=0 && array[i]<5){
                array[i]= array[i]+5;
//                System.out.println(array[i]);
                decryptArray[j] = array[i];
            }else {
                decryptArray[j] = array[i] -5;
            }

        }
        return decryptArray;
    }

    public static int[] getArray(int number) {
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int[] array = new int[count];
        int index = count - 1;
        while (number > 0) {
            array[index] = number % 10;
            number = number / 10;
            index --;
        }
        return array;
    }

}
