public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("dcba");
        //Reverse the string
        sb.reverse();
        System.out.println(sb);
        //Append a string
        sb.append("efg");
        System.out.println(sb);
        //Change a character at a specific index
        sb.setCharAt(1,'h');
        System.out.println(sb);
        //Delete a substring
        sb.delete(0, 2);
        System.out.println((sb));
        //Insert a string at a specific index
        sb.insert(1, "efg");
        System.out.println(sb);
    }
}
