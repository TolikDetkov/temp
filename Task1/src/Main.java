import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String inputText = "a1bcd efg!h";
        String [] arrString = inputText.split(" ");
        char [][] chars = new char[arrString.length][];
        for(int i = 0; i< arrString.length; i++){
            chars[i] = arrString[i].toCharArray();
        }

        for (char[] arrChar : chars) {
            int right = arrChar.length - 1; int left = 0;
            while(left < right){
                if(!Character.isAlphabetic(arrChar[left])){
                    left++;}
                if(!Character.isAlphabetic(arrChar[right])){
                    right--;}
                else{
                    char temp = arrChar[left];
                    arrChar[left] = arrChar[right];
                    arrChar[right] = temp;
                    left++;right--;
                }
            }
        }
        for (char[] ch: chars) {
            for (char c : ch){
                System.out.print(c);
            }
            System.out.print(" ");
        }
    }
}

