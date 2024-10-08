public class Piece {
    // Step 1
    String name;
    String color;
    int[] position;

    // Step 2 Piece class
    public Piece (String name, String color, int[] position){
        this.name = name;
        this.color = color;
        this.position = position;
    }
    //Getters
    public String nameGetter(){
        return name;
    }
    public String colorGetter(){
        return color;
    }
    public int[] positionGetter(){
        return position.clone(); // avoid of data lossing
    }
    // Setters
    public void setterName(String name){
        this.name = name;
    }
    public void setterColor(String color){
        this.color = color;
    }
    public void setterPosition(int[] newPosition){
        this.position = newPosition;
    }
    // To string
    @Override
    public String toString(){
        return "Name: " + name + ". \n" + "Color: " + color + ". \n" + "Position:" + position[0] + " . " + position[1];
    }


}
