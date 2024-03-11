package view.gamer;

import domain.card.Card;
import dto.GamerDTO;
import java.util.List;
import java.util.stream.Collectors;

public class GamerOutputView {

    public static void print(GamerDTO gamerDTO) {
        String outputWithoutSummationCardPoint = generateOutputWithoutSummationCardPoint(gamerDTO);
        String summationCardPointOutput = "결과: %d".formatted(gamerDTO.getSummationCardPoint());
        System.out.printf("%s - %s%n", outputWithoutSummationCardPoint, summationCardPointOutput);
    }


    public static void printWithoutSummationCardPoint(GamerDTO gamerDTO) {
        String outputWithoutSummationCardPoint = generateOutputWithoutSummationCardPoint(gamerDTO);
        System.out.println(outputWithoutSummationCardPoint);
    }

    private static String generateOutputWithoutSummationCardPoint(GamerDTO gamerDTO) {
        String name = gamerDTO.getName();
        List<Card> cards = gamerDTO.getHoldingCards();
        String nameOutput = name + "카드";
        String cardsOutput = cards.stream()
                .map(CardOutputGenerator::generate)
                .collect(Collectors.joining(", "));
        return "%s: %s".formatted(nameOutput, cardsOutput);
    }

}
