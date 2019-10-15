package org.geekhub.crypto.coders;

import org.geekhub.crypto.util.NotImplementedException;

public class EncodersFactory {

    public static Encoder getEncoder(String name) {
        Algorithms algorithm = Algorithms.valueOf(name);

        throw new NotImplementedException(); // Replace this line
    }
}
