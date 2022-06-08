
import java.util.Scanner;


public class main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String first = String.valueOf(str.charAt(0));
            if (first.equals("1") || first.equals("2") || first.equals("3") || first.equals("4") || first.equals("5") || first.equals("6") || first.equals("7") || first.equals("8") || first.equals("9") || first.equals("10")) {
                String[] in = str.split(" ", 3);


                if (Integer.parseInt(in[0]) >= 1 && Integer.parseInt(in[0]) <= 10 && Integer.parseInt(in[2]) >= 1 && Integer.parseInt(in[2]) <= 10) {
                    int a = Integer.parseInt(in[0]);
                    int b = Integer.parseInt(in[2]);
                    int c;
                    switch (in[1]) {
                        case "+":
                            c = a + b;
                            System.out.println(c);
                            break;

                        case "-":
                            c = a - b;
                            System.out.println(c);
                            break;

                        case "*":
                            c = a * b;
                            System.out.println(c);
                            break;

                        case "/":
                            c = a / b;
                            System.out.println(c);
                            break;
                        default:
                            throw new IllegalStateException("Incorrect operand: " + in[1]);
                    }
                } else throw new RuntimeException("numbers should lays between 1 and 10 or between I and X");
            } else if (str.equals("I + I")) {
                System.out.println("II");
            } else if (str.equals("I * I")) {
                System.out.println("I");
            } else if (str.equals("I / I")) {
                System.out.println("I");
            } else if (str.equals("II + I")) {
                System.out.println("III");
            } else if (str.equals("II - I")) {
                System.out.println("I");
            } else if (str.equals("II * I")) {
                System.out.println("II");
            } else if (str.equals("II / I")) {
                System.out.println("II");
            } else if (str.equals("III + I")) {
                System.out.println("IV");
            } else if (str.equals("III - I")) {
                System.out.println("II");
            } else if (str.equals("III * I")) {
                System.out.println("III");
            } else if (str.equals("III / I")) {
                System.out.println("III");
            } else if (str.equals("IV + I")) {
                System.out.println("V");
            } else if (str.equals("IV - I")) {
                System.out.println("III");
            } else if (str.equals("IV * I")) {
                System.out.println("IV");
            } else if (str.equals("IV / I")) {
                System.out.println("IV");
            } else if (str.equals("V + I")) {
                System.out.println("VI");
            } else if (str.equals("V - I")) {
                System.out.println("IV");
            } else if (str.equals("V * I")) {
                System.out.println("V");
            } else if (str.equals("V / I")) {
                System.out.println("V");
            } else if (str.equals("VI + I")) {
                System.out.println("VII");
            } else if (str.equals("VI - I")) {
                System.out.println("V");
            } else if (str.equals("VI * I")) {
                System.out.println("VI");
            } else if (str.equals("VI / I")) {
                System.out.println("VI");
            } else if (str.equals("VII + I")) {
                System.out.println("VIII");
            } else if (str.equals("VII - I")) {
                System.out.println("VI");
            } else if (str.equals("VII * I")) {
                System.out.println("VII");
            } else if (str.equals("VII / I")) {
                System.out.println("VII");
            } else if (str.equals("VIII + I")) {
                System.out.println("IX");
            } else if (str.equals("VIII - I")) {
                System.out.println("VII");
            } else if (str.equals("VIII * I")) {
                System.out.println("VIII");
            } else if (str.equals("VIII / I")) {
                System.out.println("VIII");
            } else if (str.equals("IX + I")) {
                System.out.println("X");
            } else if (str.equals("IX - I")) {
                System.out.println("VIII");
            } else if (str.equals("IX * I")) {
                System.out.println("IX");
            } else if (str.equals("IX / I")) {
                System.out.println("IX");
            } else if (str.equals("X + I")) {
                System.out.println("XI");
            } else if (str.equals("X - I")) {
                System.out.println("IX");
            } else if (str.equals("X * I")) {
                System.out.println("X");
            } else if (str.equals("X / I")) {
                System.out.println("X");
            } else if (str.equals("I + II")) {
                System.out.println("III");
            } else if (str.equals("I * II")) {
                System.out.println("II");
            } else if (str.equals("II + II")) {
                System.out.println("IV");
            } else if (str.equals("II * II")) {
                System.out.println("IV");
            } else if (str.equals("II / II")) {
                System.out.println("I");
            } else if (str.equals("III + II")) {
                System.out.println("V");
            } else if (str.equals("III - II")) {
                System.out.println("I");
            } else if (str.equals("III * II")) {
                System.out.println("VI");
            } else if (str.equals("III / II")) {
                System.out.println("I");
            } else if (str.equals("IV + II")) {
                System.out.println("VI");
            } else if (str.equals("IV - II")) {
                System.out.println("II");
            } else if (str.equals("IV * II")) {
                System.out.println("VIII");
            } else if (str.equals("IV / II")) {
                System.out.println("II");
            } else if (str.equals("V + II")) {
                System.out.println("VII");
            } else if (str.equals("V - II")) {
                System.out.println("III");
            } else if (str.equals("V * II")) {
                System.out.println("X");
            } else if (str.equals("V / II")) {
                System.out.println("II");
            } else if (str.equals("VI + II")) {
                System.out.println("VIII");
            } else if (str.equals("VI - II")) {
                System.out.println("IV");
            } else if (str.equals("VI * II")) {
                System.out.println("XII");
            } else if (str.equals("VI / II")) {
                System.out.println("III");
            } else if (str.equals("VII + II")) {
                System.out.println("IX");
            } else if (str.equals("VII - II")) {
                System.out.println("V");
            } else if (str.equals("VII * II")) {
                System.out.println("XIV");
            } else if (str.equals("VII / II")) {
                System.out.println("III");
            } else if (str.equals("VIII + II")) {
                System.out.println("X");
            } else if (str.equals("VIII - II")) {
                System.out.println("VI");
            } else if (str.equals("VIII * II")) {
                System.out.println("XVI");
            } else if (str.equals("VIII / II")) {
                System.out.println("IV");
            } else if (str.equals("IX + II")) {
                System.out.println("XI");
            } else if (str.equals("IX - II")) {
                System.out.println("VII");
            } else if (str.equals("IX * II")) {
                System.out.println("XVIII");
            } else if (str.equals("IX / II")) {
                System.out.println("IV");
            } else if (str.equals("X + II")) {
                System.out.println("XII");
            } else if (str.equals("X - II")) {
                System.out.println("VIII");
            } else if (str.equals("X * II")) {
                System.out.println("XX");
            } else if (str.equals("X / II")) {
                System.out.println("V");
            } else if (str.equals("I + III")) {
                System.out.println("IV");
            } else if (str.equals("I * III")) {
                System.out.println("III");
            } else if (str.equals("II + III")) {
                System.out.println("V");
            } else if (str.equals("II * III")) {
                System.out.println("VI");
            } else if (str.equals("III + III")) {
                System.out.println("VI");
            } else if (str.equals("III * III")) {
                System.out.println("IX");
            } else if (str.equals("III / III")) {
                System.out.println("I");
            } else if (str.equals("IV + III")) {
                System.out.println("VII");
            } else if (str.equals("IV - III")) {
                System.out.println("I");
            } else if (str.equals("IV * III")) {
                System.out.println("XII");
            } else if (str.equals("IV / III")) {
                System.out.println("I");
            } else if (str.equals("V + III")) {
                System.out.println("VIII");
            } else if (str.equals("V - III")) {
                System.out.println("II");
            } else if (str.equals("V * III")) {
                System.out.println("XV");
            } else if (str.equals("V / III")) {
                System.out.println("I");
            } else if (str.equals("VI + III")) {
                System.out.println("IX");
            } else if (str.equals("VI - III")) {
                System.out.println("III");
            } else if (str.equals("VI * III")) {
                System.out.println("XVIII");
            } else if (str.equals("VI / III")) {
                System.out.println("II");
            } else if (str.equals("VII + III")) {
                System.out.println("X");
            } else if (str.equals("VII - III")) {
                System.out.println("IV");
            } else if (str.equals("VII * III")) {
                System.out.println("XXI");
            } else if (str.equals("VII / III")) {
                System.out.println("II");
            } else if (str.equals("VIII + III")) {
                System.out.println("XI");
            } else if (str.equals("VIII - III")) {
                System.out.println("V");
            } else if (str.equals("VIII * III")) {
                System.out.println("XXV");
            } else if (str.equals("VIII / III")) {
                System.out.println("II");
            } else if (str.equals("IX + III")) {
                System.out.println("XII");
            } else if (str.equals("IX - III")) {
                System.out.println("VI");
            } else if (str.equals("IX * III")) {
                System.out.println("XXVII");
            } else if (str.equals("IX / III")) {
                System.out.println("III");
            } else if (str.equals("X + III")) {
                System.out.println("XIII");
            } else if (str.equals("X - III")) {
                System.out.println("VII");
            } else if (str.equals("X * III")) {
                System.out.println("XXX");
            } else if (str.equals("X / III")) {
                System.out.println("III");
            } else if (str.equals("I + IV")) {
                System.out.println("V");
            } else if (str.equals("I * IV")) {
                System.out.println("IV");
            } else if (str.equals("II + IV")) {
                System.out.println("VI");
            } else if (str.equals("II * IV")) {
                System.out.println("VIII");
            } else if (str.equals("III + IV")) {
                System.out.println("VII");
            } else if (str.equals("III * IV")) {
                System.out.println("XII");
            } else if (str.equals("IV + IV")) {
                System.out.println("VIII");
            } else if (str.equals("IV * IV")) {
                System.out.println("XVI");
            } else if (str.equals("IV / IV")) {
                System.out.println("I");
            } else if (str.equals("V + IV")) {
                System.out.println("IX");
            } else if (str.equals("V - IV")) {
                System.out.println("I");
            } else if (str.equals("V * IV")) {
                System.out.println("XX");
            } else if (str.equals("V / IV")) {
                System.out.println("I");
            } else if (str.equals("VI + IV")) {
                System.out.println("X");
            } else if (str.equals("VI - IV")) {
                System.out.println("II");
            } else if (str.equals("VI * IV")) {
                System.out.println("XXV");
            } else if (str.equals("VI / IV")) {
                System.out.println("I");
            } else if (str.equals("VII + IV")) {
                System.out.println("XI");
            } else if (str.equals("VII - IV")) {
                System.out.println("III");
            } else if (str.equals("VII * IV")) {
                System.out.println("XXVIII");
            } else if (str.equals("VII / IV")) {
                System.out.println("I");
            } else if (str.equals("VIII + IV")) {
                System.out.println("XII");
            } else if (str.equals("VIII - IV")) {
                System.out.println("IV");
            } else if (str.equals("VIII * IV")) {
                System.out.println("XXXII");
            } else if (str.equals("VIII / IV")) {
                System.out.println("II");
            } else if (str.equals("IX + IV")) {
                System.out.println("XIII");
            } else if (str.equals("IX - IV")) {
                System.out.println("V");
            } else if (str.equals("IX * IV")) {
                System.out.println("XXXVI");
            } else if (str.equals("IX / IV")) {
                System.out.println("II");
            } else if (str.equals("X + IV")) {
                System.out.println("XIV");
            } else if (str.equals("X - IV")) {
                System.out.println("VI");
            } else if (str.equals("X * IV")) {
                System.out.println("XL");
            } else if (str.equals("X / IV")) {
                System.out.println("II");
            } else if (str.equals("I + V")) {
                System.out.println("VI");
            } else if (str.equals("I * V")) {
                System.out.println("V");
            } else if (str.equals("II + V")) {
                System.out.println("VII");
            } else if (str.equals("II * V")) {
                System.out.println("X");
            } else if (str.equals("III + V")) {
                System.out.println("VIII");
            } else if (str.equals("III * V")) {
                System.out.println("XV");
            } else if (str.equals("IV + V")) {
                System.out.println("IX");
            } else if (str.equals("IV * V")) {
                System.out.println("XX");
            } else if (str.equals("V + V")) {
                System.out.println("X");
            } else if (str.equals("V * V")) {
                System.out.println("XXV");
            } else if (str.equals("V / V")) {
                System.out.println("I");
            } else if (str.equals("VI + V")) {
                System.out.println("XI");
            } else if (str.equals("VI - V")) {
                System.out.println("I");
            } else if (str.equals("VI * V")) {
                System.out.println("XXX");
            } else if (str.equals("VI / V")) {
                System.out.println("I");
            } else if (str.equals("VII + V")) {
                System.out.println("XII");
            } else if (str.equals("VII - V")) {
                System.out.println("II");
            } else if (str.equals("VII * V")) {
                System.out.println("XXXV");
            } else if (str.equals("VII / V")) {
                System.out.println("I");
            } else if (str.equals("VIII + V")) {
                System.out.println("XIII");
            } else if (str.equals("VIII - V")) {
                System.out.println("III");
            } else if (str.equals("VIII * V")) {
                System.out.println("XL");
            } else if (str.equals("VIII / V")) {
                System.out.println("I");
            } else if (str.equals("IX + V")) {
                System.out.println("XIV");
            } else if (str.equals("IX - V")) {
                System.out.println("IV");
            } else if (str.equals("IX * V")) {
                System.out.println("XLV");
            } else if (str.equals("IX / V")) {
                System.out.println("I");
            } else if (str.equals("X + V")) {
                System.out.println("XV");
            } else if (str.equals("X - V")) {
                System.out.println("V");
            } else if (str.equals("X * V")) {
                System.out.println("L");
            } else if (str.equals("X / V")) {
                System.out.println("II");
            } else if (str.equals("I + VI")) {
                System.out.println("VII");
            } else if (str.equals("I * VI")) {
                System.out.println("VI");
            } else if (str.equals("II + VI")) {
                System.out.println("VIII");
            } else if (str.equals("II * VI")) {
                System.out.println("XII");
            } else if (str.equals("III + VI")) {
                System.out.println("IX");
            } else if (str.equals("III * VI")) {
                System.out.println("XVIII");
            } else if (str.equals("IV + VI")) {
                System.out.println("X");
            } else if (str.equals("IV * VI")) {
                System.out.println("XXV");
            } else if (str.equals("V + VI")) {
                System.out.println("XI");
            } else if (str.equals("V * VI")) {
                System.out.println("XXX");
            } else if (str.equals("VI + VI")) {
                System.out.println("XII");
            } else if (str.equals("VI * VI")) {
                System.out.println("XXXVI");
            } else if (str.equals("VI / VI")) {
                System.out.println("I");
            } else if (str.equals("VII + VI")) {
                System.out.println("XIII");
            } else if (str.equals("VII - VI")) {
                System.out.println("I");
            } else if (str.equals("VII * VI")) {
                System.out.println("XLII");
            } else if (str.equals("VII / VI")) {
                System.out.println("I");
            } else if (str.equals("VIII + VI")) {
                System.out.println("XIV");
            } else if (str.equals("VIII - VI")) {
                System.out.println("II");
            } else if (str.equals("VIII * VI")) {
                System.out.println("XLVIII");
            } else if (str.equals("VIII / VI")) {
                System.out.println("I");
            } else if (str.equals("IX + VI")) {
                System.out.println("XV");
            } else if (str.equals("IX - VI")) {
                System.out.println("III");
            } else if (str.equals("IX * VI")) {
                System.out.println("LIV");
            } else if (str.equals("IX / VI")) {
                System.out.println("I");
            } else if (str.equals("X + VI")) {
                System.out.println("XVI");
            } else if (str.equals("X - VI")) {
                System.out.println("IV");
            } else if (str.equals("X * VI")) {
                System.out.println("LX");
            } else if (str.equals("X / VI")) {
                System.out.println("I");
            } else if (str.equals("I + VII")) {
                System.out.println("VIII");
            } else if (str.equals("I * VII")) {
                System.out.println("VII");
            } else if (str.equals("II + VII")) {
                System.out.println("IX");
            } else if (str.equals("II * VII")) {
                System.out.println("XIV");
            } else if (str.equals("III + VII")) {
                System.out.println("X");
            } else if (str.equals("III * VII")) {
                System.out.println("XXI");
            } else if (str.equals("IV + VII")) {
                System.out.println("XI");
            } else if (str.equals("IV * VII")) {
                System.out.println("XXVIII");
            } else if (str.equals("V + VII")) {
                System.out.println("XII");
            } else if (str.equals("V * VII")) {
                System.out.println("XXXV");
            } else if (str.equals("VI + VII")) {
                System.out.println("XIII");
            } else if (str.equals("VI * VII")) {
                System.out.println("XLII");
            } else if (str.equals("VII + VII")) {
                System.out.println("XIV");
            } else if (str.equals("VII * VII")) {
                System.out.println("XLIX");
            } else if (str.equals("VII / VII")) {
                System.out.println("I");
            } else if (str.equals("VIII + VII")) {
                System.out.println("XV");
            } else if (str.equals("VIII - VII")) {
                System.out.println("I");
            } else if (str.equals("VIII * VII")) {
                System.out.println("LVI");
            } else if (str.equals("VIII / VII")) {
                System.out.println("I");
            } else if (str.equals("IX + VII")) {
                System.out.println("XVI");
            } else if (str.equals("IX - VII")) {
                System.out.println("II");
            } else if (str.equals("IX * VII")) {
                System.out.println("LXIII");
            } else if (str.equals("IX / VII")) {
                System.out.println("I");
            } else if (str.equals("X + VII")) {
                System.out.println("XVII");
            } else if (str.equals("X - VII")) {
                System.out.println("III");
            } else if (str.equals("X * VII")) {
                System.out.println("LXX");
            } else if (str.equals("X / VII")) {
                System.out.println("I");
            } else if (str.equals("I + VIII")) {
                System.out.println("IX");
            } else if (str.equals("I * VIII")) {
                System.out.println("VIII");
            } else if (str.equals("II + VIII")) {
                System.out.println("X");
            } else if (str.equals("II * VIII")) {
                System.out.println("XVI");
            } else if (str.equals("III + VIII")) {
                System.out.println("XI");
            } else if (str.equals("III * VIII")) {
                System.out.println("XXV");
            } else if (str.equals("IV + VIII")) {
                System.out.println("XII");
            } else if (str.equals("IV * VIII")) {
                System.out.println("XXXII");
            } else if (str.equals("V + VIII")) {
                System.out.println("XIII");
            } else if (str.equals("V * VIII")) {
                System.out.println("XL");
            } else if (str.equals("VI + VIII")) {
                System.out.println("XIV");
            } else if (str.equals("VI * VIII")) {
                System.out.println("XLVIII");
            } else if (str.equals("VII + VIII")) {
                System.out.println("XV");
            } else if (str.equals("VII * VIII")) {
                System.out.println("LVI");
            } else if (str.equals("VIII + VIII")) {
                System.out.println("XVI");
            } else if (str.equals("VIII * VIII")) {
                System.out.println("LXIV");
            } else if (str.equals("VIII / VIII")) {
                System.out.println("I");
            } else if (str.equals("IX + VIII")) {
                System.out.println("XVII");
            } else if (str.equals("IX - VIII")) {
                System.out.println("I");
            } else if (str.equals("IX * VIII")) {
                System.out.println("LXXII");
            } else if (str.equals("IX / VIII")) {
                System.out.println("I");
            } else if (str.equals("X + VIII")) {
                System.out.println("XVIII");
            } else if (str.equals("X - VIII")) {
                System.out.println("II");
            } else if (str.equals("X * VIII")) {
                System.out.println("LXXX");
            } else if (str.equals("X / VIII")) {
                System.out.println("I");
            } else if (str.equals("I + IX")) {
                System.out.println("X");
            } else if (str.equals("I * IX")) {
                System.out.println("IX");
            } else if (str.equals("II + IX")) {
                System.out.println("XI");
            } else if (str.equals("II * IX")) {
                System.out.println("XVIII");
            } else if (str.equals("III + IX")) {
                System.out.println("XII");
            } else if (str.equals("III * IX")) {
                System.out.println("XXVII");
            } else if (str.equals("IV + IX")) {
                System.out.println("XIII");
            } else if (str.equals("IV * IX")) {
                System.out.println("XXXVI");
            } else if (str.equals("V + IX")) {
                System.out.println("XIV");
            } else if (str.equals("V * IX")) {
                System.out.println("XLV");
            } else if (str.equals("VI + IX")) {
                System.out.println("XV");
            } else if (str.equals("VI * IX")) {
                System.out.println("LIV");
            } else if (str.equals("VII + IX")) {
                System.out.println("XVI");
            } else if (str.equals("VII * IX")) {
                System.out.println("LXIII");
            } else if (str.equals("VIII + IX")) {
                System.out.println("XVII");
            } else if (str.equals("VIII * IX")) {
                System.out.println("LXXII");
            } else if (str.equals("IX + IX")) {
                System.out.println("XVIII");
            } else if (str.equals("IX * IX")) {
                System.out.println("LXXXI");
            } else if (str.equals("IX / IX")) {
                System.out.println("I");
            } else if (str.equals("X + IX")) {
                System.out.println("XIX");
            } else if (str.equals("X - IX")) {
                System.out.println("I");
            } else if (str.equals("X * IX")) {
                System.out.println("XC");
            } else if (str.equals("X / IX")) {
                System.out.println("I");
            } else if (str.equals("I + X")) {
                System.out.println("XI");
            } else if (str.equals("I * X")) {
                System.out.println("X");
            } else if (str.equals("II + X")) {
                System.out.println("XII");
            } else if (str.equals("II * X")) {
                System.out.println("XX");
            } else if (str.equals("III + X")) {
                System.out.println("XIII");
            } else if (str.equals("III * X")) {
                System.out.println("XXX");
            } else if (str.equals("IV + X")) {
                System.out.println("XIV");
            } else if (str.equals("IV * X")) {
                System.out.println("XL");
            } else if (str.equals("V + X")) {
                System.out.println("XV");
            } else if (str.equals("V * X")) {
                System.out.println("L");
            } else if (str.equals("VI + X")) {
                System.out.println("XVI");
            } else if (str.equals("VI * X")) {
                System.out.println("LX");
            } else if (str.equals("VII + X")) {
                System.out.println("XVII");
            } else if (str.equals("VII * X")) {
                System.out.println("LXX");
            } else if (str.equals("VIII + X")) {
                System.out.println("XVIII");
            } else if (str.equals("VIII * X")) {
                System.out.println("LXXX");
            } else if (str.equals("IX + X")) {
                System.out.println("XIX");
            } else if (str.equals("IX * X")) {
                System.out.println("XC");
            } else if (str.equals("X + X")) {
                System.out.println("XX");
            } else if (str.equals("X * X")) {
                System.out.println("C");
            } else if (str.equals("X / X")) {
                System.out.println("I");
            } else
                throw new RuntimeException("numbers should lays between 1 and 10 or between I and X, Roman result should be positive");

    }
}


