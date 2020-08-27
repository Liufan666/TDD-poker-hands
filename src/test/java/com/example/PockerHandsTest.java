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

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_2H3D5S9CKD_and_player2_3H3D5S9CKD() {
    //given
    String[] player_1 = {"2D","3D","5S","9C","KD"};
    String[] player_2 = {"3H","3D","5S","9C","KD"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_5H5C6S7SKD_and_player2_2C3S8S8DTD() {
    //given
    String[] player_1 = {"5H","5C","6S","7S","KD"};
    String[] player_2 = {"2C","3S","8S","8D","TD"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_1_wins_when_compare_given_palyer1_3H3D2S2CKD_and_player2_2H3D5S9C5D(){
    //given
    String[] player_1 = {"3H","3D","2S","2C","KD"};
    String[] player_2 = {"2H","3D","5S","9C","5D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 1 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_3H3D5S9C5D_and_player2_3H3D5S9C3D(){
    //given
    String[] player_1 = {"3H","3D","5S","9C","5D"};
    String[] player_2 = {"3H","3D","5S","9C","3D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_3H3D5S9C3D_and_player2_4H4D5S9C4D(){
    //given
    String[] player_1 = {"3H","3D","5S","9C","5D"};
    String[] player_2 = {"4H","4D","5S","9C","4D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_3H3D5S9C3D_and_player2_3H4D5S6C7D(){
    //given
    String[] player_1 = {"3H","3D","5S","9C","3D"};
    String[] player_2 = {"3H","4D","5S","6C","7D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_2H3D4S5C6D_and_player2_3H4D5S6C7D(){
    //given
    String[] player_1 = {"2H","3D","4S","5C","6D"};
    String[] player_2 = {"3H","4D","5S","6C","7D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_3H4D5S6C7D_and_player2_2H3H5H9HKH(){
    //given
    String[] player_1 = {"3H","4D","5S","6C","7D"};
    String[] player_2 = {"2H","3H","5H","9H","KH"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_2H3H5H9HKH_and_player2_3H3D5S5C3D() {
    //given
    String[] player_1 = {"2H","3H","5H","9H","KH"};
    String[] player_2 = {"3H","3D","5S","5C","3D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_1_wins_when_compare_given_palyer1_4H4D4S1C1D_and_player2_3H3D5S5C3D() {
    //given
    String[] player_1 = {"4H","4D","4S","1C","1D"};
    String[] player_2 = {"3H","3D","5S","5C","3D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 1 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_3H3D5S5C3D_and_player2_3H3D3S5C3D() {
    //given
    String[] player_1 = {"3H","3D","5S","5C","3D"};
    String[] player_2 = {"3H","3D","3S","5C","3D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

  @Test
  void should_return_Player_2_wins_when_compare_given_palyer1_2H2D2S5C2D_and_player2_3H3D3S5C3D() {
    //given
    String[] player_1 = {"2H","2D","2S","5C","2D"};
    String[] player_2 = {"3H","3D","3S","5C","3D"};
    PockerHands pockerHands = new PockerHands();
    //when
    String result = pockerHands.compare(player_1,player_2);
    //then
    assertEquals("Player 2 wins",result);
  }

}
