package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

public class PockerHandsTest {

  @Test
  void should_return_Player_1_wins_when_compare_given_palyer1_5D8C9SJSAC_and_player2_2C5C7D8SQH() {
    //given
    String[] player_1 = {"5D","8C","9S","JS","AC"};
    String[] player_2 = {"2C","5C","7D","8S","QH"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 1 wins",result);
  }
}
