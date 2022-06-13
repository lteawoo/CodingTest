package kr.taeu.codingtest.string.ip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ip {
    public static void main(String[] args) {
        String ip = "172.19.123.255";

        if (ip.chars().filter(v -> v == '.').count() == 3) {
            Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
            System.out.println(pattern.matcher(ip).matches());
        }
    }

    public String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(c -> c == '.').count() == 3) {
            return validIPv4(queryIP);
        } else if(queryIP.chars().filter(c -> c == ':').count() == 7) {
            return validIPv6(queryIP);
        }


        return "Neither";
    }

    private String validIPv4(String queryIP) {
        Pattern pattern = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
        return pattern.matcher(queryIP).matches() ? "IPv4" : "Neither";
    }

    private String validIPv6(String queryIP) {
        Pattern pattern = Pattern.compile("^(([a-fA-F0-9]{1,4})\\:){7}([a-fA-F0-9]{1,4})$");
        return pattern.matcher(queryIP).matches() ? "IPv6" : "Neither";
    }
}
