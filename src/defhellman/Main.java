package defhellman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[]args)throws IOException
    {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Masukkan Bilangan P");
    BigInteger p=new BigInteger(br.readLine());
    System.out.print("Masukkan akar primitive dari "+p+":");
    BigInteger g=new BigInteger(br.readLine());
    System.out.println("Masukkan nilai x yang lebih kecil dari "+p+":");
    BigInteger x=new BigInteger(br.readLine());
    BigInteger R1=g.modPow(x,p);
    //R1 = g^x mod p
    System.out.println("R1="+R1);
    System.out.print("masukkan nilai y yang lebih kecil dari "+p+":");
    BigInteger y=new BigInteger(br.readLine());
    BigInteger R2=g.modPow(y,p);
    //R2 = g^y mod p
    System.out.println("R2="+R2);
    BigInteger k1=R2.modPow(x,p);
    //k1 = R2^x mod p
    System.out.println("Key pada sisi Alice:"+k1);
    BigInteger k2=R1.modPow(y,p);
    //k2 = R1^y mod p
    System.out.println("Key pada sisi Bob:"+k2);
    }
}
