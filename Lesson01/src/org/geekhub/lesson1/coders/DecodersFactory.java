package org.geekhub.lesson1.coders;

import org.geekhub.lesson1.util.NotImplementedException;

public class DecodersFactory {

    public static Decoder getDecoder(String name) {
        Algorithms algorithm = Algorithms.valueOf(name);

        throw new NotImplementedException(); // Replace this line
    }
}