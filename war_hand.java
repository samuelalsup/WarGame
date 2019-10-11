{\rtf1\ansi\ansicpg1252\cocoartf2509
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 TimesNewRomanPSMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import java.util.ArrayList;\'a0
\f1\fs24 \

\f0\fs32 /**
\f1\fs24 \

\f0\fs32 \'a0* Creates a hand that holds cards
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ ****** *****
\f1\fs24 \

\f0\fs32 \'a0* @ final version - 3 - 15 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public class Hand
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0static int numCards;
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0static ArrayList <Card> ourCards = new ArrayList<Card>(26);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0static ArrayList<Card> theirCards = new ArrayList<Card>(26);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d1 = new Card(14, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d2 = new Card(2, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d3 = new Card(3, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d4 = new Card(4, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d5 = new Card(5, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d6 = new Card(6, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d7 = new Card(7, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d8 = new Card(8, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d9 = new Card(9, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d10 = new Card(10, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d11 = new Card(11, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d12 = new Card(12, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d13 = new Card(13, "Spades");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d14 = new Card(14, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d15 = new Card(2, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d16 = new Card(3, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d17 = new Card(4, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d18 = new Card(5, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d19 = new Card(6, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d20 = new Card(7, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d21 = new Card(8, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d22 = new Card(9, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d23 = new Card(10, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d24 = new Card(11, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d25 = new Card(12, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d26 = new Card(13, "Clubs");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d27 = new Card(14, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d28 = new Card(2, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d29 = new Card(3, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d30 = new Card(4, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d31 = new Card(5, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d32 = new Card(6, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d33 = new Card(7, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d34 = new Card(8, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d35 = new Card(9, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d36 = new Card(10, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d37 = new Card(11, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d38 = new Card(12, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d39 = new Card(13, "Diamonds");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d40 = new Card(14, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d41 = new Card(2, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d42 = new Card(3, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d43 = new Card(4, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d44 = new Card(5, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d45 = new Card(6, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d46 = new Card(7, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d47 = new Card(8, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d48 = new Card(9, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d49 = new Card(10, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d50 = new Card(11, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d51 = new Card(12, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0Card d52 = new Card(13, "Hearts");
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0
\f1\fs24 \
\pard\pardeftab720\sl280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Constructor for objects of class Hand
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Hand()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0numCards = 26;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \
\pard\pardeftab720\sl280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \'a0\'a0\'a0\'a0public int getNumCards()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return numCards;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void dealCards()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d1);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d7);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d8);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d2);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d9);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d3);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d10);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d4);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d11);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d5);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d12);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d6);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d13);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d15);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d14);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d16);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d17);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d18);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d23);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d19);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d24);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d20);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d25);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d21);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d26);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d22);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d27);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d28);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d29);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d30);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d31);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d32);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d33);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d34);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d35);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d36);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d37);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d38);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d39);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d41);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d40);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d42);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d43);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d44);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d45);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d46);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d47);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d48);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d49);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d50);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.add(d51);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.add(d52);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void shuffleMine()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0for (int i = 0; i < ourCards.size() - 1; i++)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int n = ourCards.size() - 1;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0while(n >= 2)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int x = (int) ((Math.random() * n) - 1);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card temp1 = ourCards.get(n);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card temp2 = ourCards.get(x);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.set(n, temp2);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0ourCards.set(x, temp1);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0n--;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void shuffleTheirs()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0for (int j = 0; j < theirCards.size() - 1; j++)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int n = theirCards.size() - 1;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0while(n >= 2)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int x = (int) ((Math.random() * n) - 1);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card temp1 = theirCards.get(n);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card temp2 = theirCards.get(x);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.set(n, temp2);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0theirCards.set(x, temp1);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0n--;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Card getMine()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card x;
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int i = (int)(Math.random() * 26);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0x = ourCards.get(i);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0i++;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (i == numCards -1)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0i = 0;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return x;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Card getTheirs()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Card y = new Card();\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0int j = (int)(Math.random() * 26);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0y = theirCards.get(j);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0j++;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (j == numCards - 1)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0j = 0;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return y;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}