package org.geekhub.crypto.analytics;

import org.geekhub.crypto.coders.Algorithm;
import org.geekhub.crypto.history.CodingHistory;
import org.geekhub.crypto.util.NotImplementedException;

import java.time.LocalDate;
import java.util.Map;

public class CodingAudit {
    private final CodingHistory codingHistory;

    public CodingAudit(CodingHistory codingHistory) {
        this.codingHistory = codingHistory;
    }

    /**
     * Find words repetitions across all encoding inputs in descending order.
     *
     * @return Map<Word, OccurrenceCount>
     */
    Map<String, Integer> countEncodingInputs() {
        throw new NotImplementedException();
    }

    /**
     * Count operations done per day.
     *
     * @param usecase - type of coding operation: encoding/decoding
     * @return -  Map<Date, OperationsCount>
     */
    Map<LocalDate, Long> countCodingsByDate(CodecUsecase usecase) {
        throw new NotImplementedException();
    }

    /**
     * Find the algorithm used the most times for usecase.
     *
     * @param usecase - type of coding operation: encoding/decoding
     * @return - top used algorithm
     */
    Algorithm findMostPopularCodec(CodecUsecase usecase) {
        throw new NotImplementedException();
    }
}
