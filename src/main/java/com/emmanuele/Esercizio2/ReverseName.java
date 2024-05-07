package com.emmanuele.Esercizio2;

import org.springframework.stereotype.Service;

@Service
public class ReverseName {
    public static String toString(String name) {
        StringBuilder reversedName = new StringBuilder(name);
        return reversedName.reverse().toString();
    }
}
