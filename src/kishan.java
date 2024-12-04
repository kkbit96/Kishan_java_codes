public class kishan {

    //Why are strings immutable in java
    //1. Security  - String is widely used in java. If it is mutable, it could be a security threat. It often contains sensitive information such as username, password, etc.
    //The immutable nature of string provides a certain level of security because these values can't be changed.
    //2. Synchronization - String is immutable so it is thread-safe. Multiple threads can access the same string object without any issue.
    //3. Caching - String literals are stored in the string pool. The string pool is a storage area in the Java heap memory. If two string literals have the same value, they are stored in the same memory location.
    //4. Class Loading mechanism - String is used in class loading mechanism. If string is mutable, it could be changed by an external source which could lead to a security threat.
    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = s1;
        s1 = s1 + "forGeeks"; //Now s1 is pointing to "GeeksforGeeks"
        if(s1==s2)
            System.out.println("Same");
        else
            System.out.println("Different");
        StringBuilder sb1 = new StringBuilder("Geeks");
        StringBuilder sb2 = sb1;//sb2 refers to the same location as sb1
        sb1.append("forGeeks");//Append operation modifies the same object as it is mutable in nature
        if(sb1==sb2)
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}
