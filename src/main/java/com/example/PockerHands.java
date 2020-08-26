package com.example;

import static java.util.Collections.max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class PockerHands {

  public String compare(String[] player_1, String[] player_2) {
    HashMap<Integer, Integer> player_1_map=transToMap(player_1);
    HashMap<Integer, Integer> player_2_map=transToMap(player_2);
    Integer[] player_1_number=countMapMaxNum(player_1_map);
    Integer[] player_2_number=countMapMaxNum(player_2_map);
    boolean isPlayer_1_Straight = isStraight(player_1);
    boolean isPlayer_2_Straight = isStraight(player_2);
    if(isPlayer_1_Straight){
      return "Player 1 wins";
    }
    if(isPlayer_2_Straight){
      return "Player 2 wins";
    }
    if (player_1_map.size()<player_2_map.size()){
      return "Player 1 wins";
    }
    if (player_1_map.size()>player_2_map.size()) {
      return "Player 2 wins";
    }
    if(player_1_number[1]>player_2_number[1]){
      return "Player 1 wins";
    }
    if(player_1_number[1]<player_2_number[1]){
      return "Player 2 wins";
    }
    if (player_1_number[0]<player_2_number[0]){
      return "Player 2 wins";
    }
    if(isPlayer2Win(player_1,player_2)){
      return "Player 2 wins";
    }
    return "Player 1 wins";
  }

  private boolean isStraight(String[] player) {
    ArrayList<Integer> player_numbers = transToArrayList(player);
    if(player_numbers.size()<5){
      return false;
    }
    Integer min = Collections.min(player_numbers);
    if(player_numbers.contains(min+1)&&player_numbers.contains(min+2)&&player_numbers.contains(min+3)&&player_numbers.contains(min+4)){
      return true;
    }
    return false;
  }

  boolean isPlayer2Win(String[] player_1, String[] player_2){
    ArrayList<Integer> player_1_numbers = transToArrayList(player_1);
    ArrayList<Integer> player_2_numbers = transToArrayList(player_2);
    //Integer player_1_maxNum =
    int player_1_maxNum = Collections.max(player_1_numbers);
    int player_2_maxNum = Collections.max(player_2_numbers);
    return player_1_maxNum<player_2_maxNum;
  }

//  int getMaxNumber(ArrayList<Integer> player_numbers){
//
//  }

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

  private HashMap<Integer, Integer> transToMap(String[] player){
    ArrayList<Integer> player_numbers = transToArrayList(player);
    Collections.max(player_numbers);
    HashMap<Integer, Integer> player_map=new HashMap<>();
    for (Integer player_number : player_numbers) {
      if (player_map.containsKey(player_number)){
        player_map.put(player_number,player_map.get(player_number)+1);
      }
      else {
        player_map.put(player_number,1);
      }
    }
    return player_map;
  }

  private Integer[] countMapMaxNum(HashMap<Integer, Integer> hashMap){
    Integer max=0;
    Integer maxCount=0;
    for (Entry<Integer, Integer> characterIntegerEntry : hashMap.entrySet()) {
      if (characterIntegerEntry.getValue()>=maxCount){
        maxCount = characterIntegerEntry.getValue();
        max= characterIntegerEntry.getKey();
      }
    }
    return new Integer[]{max, maxCount};
  }

}
