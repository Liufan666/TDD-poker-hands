package com.example;

import static java.util.Collections.max;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PockerHands {

  public String compare(String[] player_1, String[] player_2) {
    HashSet<Character> player_1_set=transToSet(player_1);
    HashSet<Character> player_2_set=transToSet(player_2);
    if (player_1_set.size()<player_2_set.size()){
      return "Player 1 wins";
    }
    if (player_1_set.size()>player_2_set.size()) {
      return "Player 2 wins";
    }
    if(isPlayer2Win(player_1,player_2)){
      return "Player 2 wins";
    }
    return "Player 1 wins";
  }

  boolean isPlayer2Win(String[] player_1, String[] player_2){
    ArrayList<Integer> player_1_numbers = transToArrayList(player_1);
    ArrayList<Integer> player_2_numbers = transToArrayList(player_2);
    //Integer player_1_maxNum =
    int player_1_maxNum = Collections.max(player_1_numbers);
    int player_2_maxNum = Collections.max(player_2_numbers);
    return player_1_maxNum<player_2_maxNum;
  }

  private ArrayList<Integer> transToArrayList(String[] player) {
    ArrayList<Integer> player_numbers = new ArrayList<>();
    for (String s : player) {
      char num = s.charAt(0);
      switch (num){
        case 'T':player_numbers.add(10); break;
        case 'J':player_numbers.add(11);break;
        case 'Q':player_numbers.add(12);break;
        case 'K':player_numbers.add(13);break;
        case 'A':player_numbers.add(14);break;
        default:player_numbers.add(num-48);
      }
    }
    return player_numbers;
  }

  private HashSet<Character> transToSet(String[] player){
    HashSet<Character> player_set=new HashSet<>();
    for (String s : player) {
      player_set.add(s.charAt(0));
    }
    return player_set;
  }


}
