package org.geekhub.lesson1.coders;

import org.geekhub.lesson1.util.NotImplementedException;

public class EncodersFactory {

    public static Encoder getEncoder(String name) {
        Algorithms algorithm = Algorithms.valueOf(name);

        throw new NotImplementedException(); // Replace this line
    }
}
