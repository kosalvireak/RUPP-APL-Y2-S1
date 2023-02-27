package APL_Assignment_01;

public class Table {
    public int width;
    public int height;
    public Table(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void ShowData(){
        System.out.println("    width: "+width+" cm");
        System.out.println("    height: "+height+" cm");
    }
    public static void main(String[] args){
        Table table[] = new Table[10];
        for (int i=0; i<10;i++){
            int ranWid = (int)(Math.random()*(200-50+1)+50);
            int ranHei = (int)(Math.random()*(200-50+1)+50);
            table[i] = new Table(ranWid,ranHei);

        }
        for(int i = 0; i<10;i++){
            System.out.println("table: "+i);
            table[i].ShowData();
        }
    }
}
