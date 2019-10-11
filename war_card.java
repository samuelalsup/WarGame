{\rtf1\ansi\ansicpg1252\cocoartf2509
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\froman\fcharset0 TimesNewRomanPSMT;\f1\froman\fcharset0 Times-Roman;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 /**
\f1\fs24 \

\f0\fs32 \'a0* Constructs a card
\f1\fs24 \

\f0\fs32 \'a0*
\f1\fs24 \

\f0\fs32 \'a0* @ ****** *****
\f1\fs24 \

\f0\fs32 \'a0* @ Final version - 3 - 14 - 19
\f1\fs24 \

\f0\fs32 \'a0*/
\f1\fs24 \

\f0\fs32 public class Card
\f1\fs24 \

\f0\fs32 \{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0private int rank;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0private String suit;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0static String [] suits = \{"Clubs", "Spades", "Hearts", "Diamonds"\};\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0/**
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0* Constructor for objects of class Card
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0*/
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Card()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0rank = (int)(Math.random() * 13 + 2);
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0suit = suits [(int)(Math.random() * suits.length)];\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public Card(int r, String s)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0rank = r;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0suit = s;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \
\pard\pardeftab720\sl280\partightenfactor0
\cf2 \
\pard\pardeftab720\sl440\partightenfactor0

\f0\fs32 \cf2 \'a0\'a0\'a0\'a0public int getRank()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return rank;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public String getSuit()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return suit;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void setRank(int r)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0rank = r;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public void setSuit(String s)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0suit = s;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public String toString()
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (rank == 14)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return("the Ace of " + suit);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0else if (rank == 11)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return("the Jack of " + suit);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0else if (rank == 12)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return("the Queen of " + suit);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0else if (rank == 13)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return("the King of " + suit);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return("the " + rank + " of " + suit);\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0public int win(Card other)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0if (this.rank > other.rank)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return 1;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0else if (this.rank == other.rank)
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\{
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return 2;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0return 3;\'a0
\f1\fs24 \

\f0\fs32 \'a0\'a0\'a0\'a0\}
\f1\fs24 \

\f0\fs32 \}
\f1\fs24 \
}