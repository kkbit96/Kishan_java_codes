public class DecimalToBinary {
    //Convert a decimal string to binary
    public static String decimalToBinary(String decimal){
        int num = Integer.parseInt(decimal);
        StringBuilder binary = new StringBuilder();
        while(num>0){
            binary.append(num%2);
            num = num/2;
        }
        return binary.reverse().toString();
    }
    //Convert a binary string to decimal using brute force
    public static String binaryToDecimal(String binary){
        int num = 0;
        int base = 1;
        for(int i=binary.length()-1; i>=0; i--){
            if(binary.charAt(i)=='1'){
                num += base;
            }
            base = base*2;
        }
        return String.valueOf(num);
    }
}
