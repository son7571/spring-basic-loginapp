package com.example.loginapp;

import org.junit.jupiter.api.Test;
import org.mindrot.jbcrypt.BCrypt;

public class HashTest {

    @Test
    public void encode_test() {
        String password = "1234";
        String encPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        System.out.println(encPassword); // 매번 다른 해시 출력
    }

    @Test
    public void decode_test_실패버전() {
        String dbPassword = "$2a$10$vECRahlw0/yU5wkGwhjNzetF0u8BfggE2mc9EgaD5eDfqZomDrGk6";
        String password = "1234";
        String encPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        if (dbPassword.equals(encPassword)) {
            System.out.println("비밀번호 같음");
        } else {
            System.out.println("비밀번호 다름"); // 항상 다름
        }
    }

    @Test
    public void decodeV2_test_정상버전() {
        String dbPassword = "$2a$10$vECRahlw0/yU5wkGwhjNzetF0u8BfggE2mc9EgaD5eDfqZomDrGk6";
        String password = "1234";

        boolean isSame = BCrypt.checkpw(password, dbPassword);
        System.out.println(isSame); // true
    }
}
