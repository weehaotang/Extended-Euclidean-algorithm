/**
 * Created by amazing on 2018/4/10.
 */
package eea;
import eea.EEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception
    {
        EEA eea = new EEA();
        BigInteger a,b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a_str = "";
        String b_str = "";
        System.out.println("Enter the first value:");
        a_str = br.readLine();
        System.out.println("Enter the second value:");
        b_str = br.readLine();
        a = new BigInteger(a_str);
        b = new BigInteger(b_str);
        BigInteger[] result = new BigInteger[3];
        BigInteger res;
        res = eea.MinFactor(a,b);
        if(res.compareTo(BigInteger.ONE) == 0){
            System.out.println("a和b互素");
        }
        result = EEA.extend_gcd(a,b);
        System.out.println("最大公约数是："+result[0].toString());
        System.out.println("u和v分别为："+result[1].toString()+"、"+result[2].toString());

    }
}
