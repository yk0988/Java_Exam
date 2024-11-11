package ShapeTaster;

public class Rectangle extends Shape{

    private int widht;
    private int height;

    public Rectangle(int widht, int height){
        this.widht = widht; this.height = height;
    }

    public String toString(){
    return "Rectangle(width:"+widht+",height:"+height+")";
    }

    public void draw(){
        for(int i=1;i <= height; i++){
            for(int j=1;j <= height; j++)
                System.out.print('*');
            System.out.println();
        }
    }

}
