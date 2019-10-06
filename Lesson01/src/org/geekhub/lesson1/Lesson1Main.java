package org.geekhub.lesson1;

import org.geekhub.lesson1.coders.Decoder;
import org.geekhub.lesson1.coders.DecodersFactory;
import org.geekhub.lesson1.coders.Encoder;
import org.geekhub.lesson1.coders.EncodersFactory;

import java.util.Objects;

public class Lesson1Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Invalid number of parameters. Expected 2, got " + args.length);
        }

        final String algorithm = args[0];
        final String initialString = args[1];

        System.out.println("Initial: " + initialString);
        System.out.println("Algorithm: " + algorithm);

        final Encoder encoder = EncodersFactory.getEncoder(algorithm);
        final String encoded = encoder.encode(initialString);
        System.out.println("Encoded: " + encoded);

        final Decoder decoder = DecodersFactory.getDecoder(algorithm);
        final String decoded = decoder.decode(encoded);
        System.out.println("Decoded: " + decoded);

        if (!Objects.equals(initialString, decoded)) {
            throw new IllegalStateException("Initial and decoded strings mismatch");
        }
    }
}
