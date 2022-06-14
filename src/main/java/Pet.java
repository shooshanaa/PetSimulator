public class Pet {
    //Write a pet simulator
    //ability to give pet a name
    //ability to feed pet
    //ability to fast forward days

    //ability to say a greeting to pet and receive different message
    //if pet has not eaten
    //if pet is filled
    //if pet has eaten too much

    private final String name;
    private final String type;

    private int currentDay;
    private int lastFeedDay;
    private float weight;
    private int totalFeedForDay;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String introduce() {
        return "My name is " + name + " i am a " + type;
    }

    public String feed() {
        //ability to change pet weight based on how much food in a day
        //feed once > 0.1 kg per day
        //feed 2 - 3 times > 0.25 kg per day
        //feed 4+ times > 1kg per day

        if (this.isSameDayFeed() && this.totalFeedForDay< 4) {
            this.weight += 0.25f;
        } else if (this.isSameDayFeed() && this.totalFeedForDay>=4) {
            this.weight += 1f;
        }else {
            this.weight +=0.1f;

        }
        return "Yummy!";
    }

    private boolean isSameDayFeed(){
        return currentDay== lastFeedDay;
    }

    public String nextDay(){
        return "It's a new day!";
    }

    public float getWeight () {
        return this.weight;
    }


}
