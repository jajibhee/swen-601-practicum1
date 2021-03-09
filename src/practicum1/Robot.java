package practicum1;

public class Robot {
    private int id;
    private int x;
    private int y;
    private String direction;


    @Override
    public String toString() {
        return "Robot[RobotId=" + id +" , cordinateX="+ x + " , cordinateY= "+ y+ " ,direction= " + direction + " ]";
    }

    public Robot(int id){
        this.id = id;
    }
    public Robot () {
        this.x = 0;
        this.y = 0;
        this.direction="east";
    }

    public int getId (){
        return id;
    }
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }
    public String getDirection (){
        return direction;
    }
    public void setId (int id){
        this.id =  id;
    }
    public void setX (int x){
        this.x = this.x +x;
    }

    public void setY (int y){
        this.y = this.y + y;
    }
    public void setDirection (String direction){
        this.direction = direction;

    }

//    this moves the robot forward one step...
    public void advance(String direction){
if (direction == "east"){
setX(1);
} else if (direction=="west"){
    setX(-1);

}
else if (direction=="north"){
    setY(+1);

}
else{
    setY(-1);
}
    }

    public void display(Robot robot){
        System.out.println(robot);
    }
}
