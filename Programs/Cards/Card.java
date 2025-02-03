
class Card{

    String suit;
    String rank;

    public Card(String rank, String suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        System.out.println(rank+ " of " + suit);
                return rank;    
    }
}