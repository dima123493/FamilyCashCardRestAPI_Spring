package family.cash.card.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public record CashCard(Long id, Double amount) {
    @GetMapping("/{requestedId}")//is used in CashCardJsonTest
    public ResponseEntity<CashCard> findById() {
        CashCard cashCard = new CashCard(99L, 0.0);
        return ResponseEntity.ok(cashCard);
    }
}