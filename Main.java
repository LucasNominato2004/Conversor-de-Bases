import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void baseBin(String num){
 	
 	char[] numConvertido = new char[num.length()];
        for(int i = 0; i < num.length(); i++){
        	numConvertido[i] = num.charAt(num.length() - 1 - i);
        }
        
        int dec = 0, count = 0;
        for(int i = num.length() - 1; i >= 0; i--){
        	count = Character.getNumericValue(numConvertido[i]);
        	dec = dec + count * (int) Math.pow(2, i);
        }
        System.out.println(dec + " dec");
        
        
        int numConvertido2 = dec;
        String[] hex = new String[32];
        for(int i = 31; i >= 0; i--){	
            hex[i] = "" + numConvertido2 / (int) Math.pow(16, i);
            if(hex[i].equals("10")) hex[i] = "a";
            else if(hex[i].equals("11")) hex[i] = "b";
            else if(hex[i].equals("12")) hex[i] = "c";
            else if(hex[i].equals("13")) hex[i] = "d";
            else if(hex[i].equals("14")) hex[i] = "e";
            else if(hex[i].equals("15")) hex[i] = "f";
            
            numConvertido2 = numConvertido2 % (int) Math.pow(16, i);
        }
        
        boolean numAparecido = false;
        for(int i = 31; i >= 0; i--){
        	if(hex[i].equals("0") == false) numAparecido = true;
        	if(numAparecido == true) System.out.printf("%s", hex[i]);
        } 
        System.out.printf(" hex\n");
    }
    
    public static void baseDec(String num){
        int numConvertido = Integer.parseInt(num);
        
        int[] bin = new int[32];
        for(int i = 31; i >= 0; i--){	
            bin[i] = numConvertido / (int) Math.pow(2, i);
            numConvertido = numConvertido % (int) Math.pow(2, i);
        }
        
        boolean numAparecido = false;
        for(int i = 31; i >= 0; i--){
        	if(bin[i] != 0) numAparecido = true;
        	if(numAparecido == true) System.out.printf("%d", bin[i]);
        }
        System.out.printf(" bin\n");
        
        numConvertido = Integer.parseInt(num);
        String[] hex = new String[32];
        for(int i = 31; i >= 0; i--){	
            hex[i] = "" + numConvertido / (int) Math.pow(16, i);
            if(hex[i].equals("10")) hex[i] = "a";
            else if(hex[i].equals("11")) hex[i] = "b";
            else if(hex[i].equals("12")) hex[i] = "c";
            else if(hex[i].equals("13")) hex[i] = "d";
            else if(hex[i].equals("14")) hex[i] = "e";
            else if(hex[i].equals("15")) hex[i] = "f";
            
            numConvertido = numConvertido % (int) Math.pow(16, i);
        }
        
        numAparecido = false;
        for(int i = 31; i >= 0; i--){
        	if(hex[i].equals("0") == false) numAparecido = true;
        	if(numAparecido == true) System.out.printf("%s", hex[i]);
        } 
        System.out.printf(" hex\n");
    }
    
    public static void baseHex(String num){
    	char[] numConvertido = new char[num.length()];
        for(int i = 0; i < num.length(); i++){
        	numConvertido[i] = num.charAt(num.length() - 1 - i);
        }
        
        int dec = 0, count = 0;
        for(int i = num.length() - 1; i >= 0; i--){
        	count = Character.getNumericValue(numConvertido[i]);
        	dec = dec + count * (int) Math.pow(16, i);
        }
        
     
     
        System.out.println(dec + " dec");
        
        int[] bin = new int[32];
        for(int i = 31; i >= 0; i--){	
            bin[i] = dec / (int) Math.pow(2, i);
            dec = dec % (int) Math.pow(2, i);
        }
        
        boolean numAparecido = false;
        for(int i = 31; i >= 0; i--){
        	if(bin[i] != 0) numAparecido = true;
        	if(numAparecido == true) System.out.printf("%d", bin[i]);
        }
        System.out.printf(" bin\n");
    }
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i = 1; i <= N; i++){
            String num = scanner.next();
            String base = scanner.next().trim();
            System.out.printf("Case %d:\n", i);
            if(base.equals("bin")) baseBin(num);
            else if(base.equals("dec")) baseDec(num);
            else if(base.equals("hex")) baseHex(num);
            
        }
        
        scanner.close();
    }
 
}
