import java.io.*;
import java.util.regex.*;
public class Main {
    static void Writefile(String str){
        try(FileWriter fw = new FileWriter("IpTrue.txt")){
            for(int i=0; i<str.length();i++){
                fw.write(str.charAt(i));
            }
        }
        catch(IOException ex){
            System.out.println(System.out);
        }
    }
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        String sp = in.nextString();
        Pattern p = Pattern.compile("((\\d|1?\\d\\d|2([0-4]\\d|5[0-5]))\\.){3}(\\d|1?\\d\\d|2([0-4]\\d|5[0-5]))");
        Matcher m = p.matcher(sp);
        if(m.find()){
            Writefile(sp);
        }
        else{
            Writefile("IP: "+sp+" не верен");
        }
    }
}
