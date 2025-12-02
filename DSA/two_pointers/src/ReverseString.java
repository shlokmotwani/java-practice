public class ReverseString {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        int N = str.length();
        int left = 0;
        int right = N-1;
        while(right >= 0){
            if(str.charAt(left) == ' '){
                sb.append(' ');
            }

            if(str.charAt(right) != ' ') {
                sb.append(str.charAt(right));
            }

            left++;
            right--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "internship at geeks for geeks";
        System.out.println(reverse(str)); // expected output: "skeegrofsk ee gtapi hsn retni"
    }
}
