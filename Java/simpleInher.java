class room{
    int l,b;
    room(int x , int y){
        l = x;
        b = y;
    }
    int area(){
        return l*b;
    }
}
class classRoom extends room{
    int l,b,h;
    classRoom(int x,int y,int z){
        super(x, y);
        h = z;
    }
    int volume(){
        return (l*b*h);
    }
}

public class simpleInher {
    public static void main(String[] args) {
        classRoom c1 = new classRoom(4, 5, 4);
        int area1= c1.area();
        int volume1 = c1.volume();
        System.out.println(area1);
        System.out.println(volume1);

    }
}
