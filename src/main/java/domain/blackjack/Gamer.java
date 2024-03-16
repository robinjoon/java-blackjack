package domain.blackjack;

import domain.card.Card;
import domain.card.Deck;
import java.util.List;

abstract class Gamer {
    protected final BlackJackGameMachine blackJackGameMachine;
    private final int bettingMoney;

    Gamer(BlackJackGameMachine blackJackGameMachine, int bettingMoney) {
        this.blackJackGameMachine = blackJackGameMachine;
        if (bettingMoney < 0) {
            throw new IllegalArgumentException("배팅 금액은 음수일 수 없습니다.");
        }
        this.bettingMoney = bettingMoney;
    }

    abstract DrawResult draw(Deck deck);

    public final int calculateSummationCardPointAsInt() {
        return blackJackGameMachine.calculateSummationCardPointAsInt();
    }

    final SummationCardPoint calculateSummationCardPoint() {
        return blackJackGameMachine.calculateSummationCardPoint();
    }

    public final List<Card> getRawHoldingCards() {
        return getRawHoldingCards(AllCardShowStrategy.INSTANCE);
    }

    public final List<Card> getRawHoldingCards(CardShowStrategy cardShowStrategy) {
        return blackJackGameMachine.getRawHoldingCards(cardShowStrategy);
    }

    final boolean isBust() {
        return blackJackGameMachine.isBust();
    }

    final boolean isBlackJack() {
        return blackJackGameMachine.isBlackJack();
    }

    final int getBettingMoney() {
        return bettingMoney;
    }
}
