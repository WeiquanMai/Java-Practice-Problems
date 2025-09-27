class Location {
    // Public Variables
    public int row;
    public int column;
    public double maxValue;

    // Overloaded Constructor
    public Location(int row, int column, double maxValue){
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }


    @Override
    public String toString(){
        String output = String.format("The location of the largest element is %.1f at (%d,%d)", maxValue,row,column);
        return output;
    }

}
