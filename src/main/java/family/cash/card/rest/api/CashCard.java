package family.cash.card.rest.api;

import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public record CashCard(@Id Long id, Double amount, String owner) {
    @GetMapping("/{requestedId}")//is used in CashCardJsonTest
    public ResponseEntity<CashCard> findById() {
        CashCard cashCard = new CashCard(99L, 0.0, "sarah1");
        return ResponseEntity.ok(cashCard);
    }
}