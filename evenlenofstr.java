public class evenlen{
    public static void main(String[] args) {
        String text="hello world";
        for(int i=0;i<text.length();i++){
            if(i%2==0){
                System.out.println(text.charAt(i)+"");
            }
        }
    }
}