public class insertstroanother{
    public static void main(String[] args) {
        String original="Hello World";
        String insert="Java";
        int insertpos=4;
        String result=original.substring(0,insertpos)+insert+original.substring(insertpos);
        System.out.println("string before insertion"+original);
        System.out.println("string after insertion"+result);
    }
}