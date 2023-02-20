package co.develhope.customqueries1.services;

import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.stream.Collectors;

@Component
public class GenerateStringService {

    private Random random ;

    private final char[] alphabet ;

    public GenerateStringService () {
        this.random = new Random();
        this.alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    }

    public String generate (long stringSize) {
        return  random.ints(stringSize,0,26)
                .mapToObj(n -> alphabet[n])
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
