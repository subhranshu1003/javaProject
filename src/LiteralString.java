public class LiteralString {
    public static void main(String[] args){
        String status="In Progress";
        System.out.println(status);
         String replaceString=status.replace("In Progress","\"In Progress\"");
         System.out.println(replaceString);
         System.out.println("\"In Progress\"");
         System.out.println("\"Work Item\"");
         replaceString=replaceString+",\"TO DO\",";
         replaceString=replaceString.substring(0,replaceString.length()-1);
         System.out.println(replaceString);
    }
}
