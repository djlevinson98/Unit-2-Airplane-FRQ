public class Airplane{
    private String callSign;
    private double towerDistance;
    private int compassDirection;
    private int altitude;

    //Creates an Airplane with call sign "AAA01" located on the landing strip: 1 mile due north (0°) of the tower at an altitude of 0 feet.
    public Airplane(){
        callSign = "AAA01";
        towerDistance = 1.0;
        compassDirection = 0;
        altitude = 0;
    }

    /* Creates an Airplane with call sign cs dist miles from the tower on a bearing of dir degrees, at an altitude of alt feet.
     * Notes: alt and dist will always be read as absolute values (non-negative). If dir is not between 0 and 360, the bearing will be set to dir % 360.
     */
    public Airplane(String cs, double dist, int dir, int alt){
        callSign = cs;
        towerDistance = dist;
        compassDirection = Math.abs(dir) % 360;
        altitude = Math.abs(alt);
    }

    //Changes the Airplane position by dist miles on a heading of dir degrees.
    public void move(double dist, int dir){
        //Initial vector
        double x0 = towerDistance*Math.cos(compassDirection*Math.PI/180);
        double y0 = towerDistance*Math.sin(compassDirection*Math.PI/180);
        //Changing vector
        double xMove = dist*Math.cos(dir*Math.PI/180);
        double yMove = dist*Math.sin(dir*Math.PI/180);
        //New position vector
        double xNew = x0 + xMove;
        double yNew = y0 + yMove;

        //Updated instance variables
        towerDistance = (int)(Math.sqrt(Math.pow(xNew,2)+Math.pow(yNew,2))*100)/100.0;
        compassDirection = (int) (Math.atan(yNew/xNew)*180/Math.PI);
        if (compassDirection <= 90 && compassDirection >=-90){
            compassDirection = 180 + compassDirection;
        }
    
    }

    //Increases the altitude of the Airplane by 1000 feet.
    public void gainAlt(){
        altitude += 1000;
    }

    //Decreases the altitude of the Airplane by 1000 feet, or to 0 if altitude is less than 1000 feet.
    public void loseAlt(){
        altitude -= 1000;
        if (altitude < 0)
            {altitude = 0;}

    }

    //Returns an int representing the altitude of the Airplane.
    public int getAlt(){
        return altitude; 
    }

    //Returns a double representing the distance in miles between this Airplane and the Airplane other
    public double distTo(Airplane other){
        //Distance between points in 2D aerial view
        //(x1,y1) represents "this" object
        //(x2,y2) represents other
        double x1 = this.towerDistance*Math.cos(this.compassDirection*Math.PI/180);
        double x2 = other.towerDistance*Math.cos(other.compassDirection*Math.PI/180);
        double y1 = this.towerDistance*Math.sin(this.compassDirection*Math.PI/180);
        double y2 = other.towerDistance*Math.sin(other.compassDirection*Math.PI/180);

        double dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return dist;
    }

    //Returns a String representation of the Airplane including all fields.
    public String toString(){
        return callSign + " - " + towerDistance + " miles away at bearing " + compassDirection +"°, altitude " + altitude + " feet";
    }
}
