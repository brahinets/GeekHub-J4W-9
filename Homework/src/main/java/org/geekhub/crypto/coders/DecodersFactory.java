package org.geekhub.crypto.coders;

import org.geekhub.crypto.util.NotImplementedException;

public class DecodersFactory {

    public static Decoder getDecoder(String name) {
        Algorithm algorithm = Algorithm.valueOf(name);

        throw new NotImplementedException(); // Replace this line
    }
}