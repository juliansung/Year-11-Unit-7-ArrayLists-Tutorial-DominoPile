public class Domino {

    private int top;
    private int bottom;

    public Domino(){
        top=0;
        bottom=0;
    }

    public Domino(int top, int bottom){
        this.top=top;
        this.bottom=bottom;
    }

    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int top){
        this.top=top;
    }
    public void setBottom(int bottom){
        this.bottom=bottom;
    }
    public String toString(){
        return getTop()+"/"+getBottom();
    }
    public void flip(){
        int temp = top;
        top=bottom;
        bottom=temp;
    }
    public void settle(){
        if (top > bottom) flip();
    }
    public int compareTo(Domino other){
        int compare;
        int sub;
        if(getTop()<getBottom()){
            compare = getTop();
            sub = getBottom();
        }
        else{
            compare = getBottom();
            sub = getTop();
        }
        int compare2;
        int sub2;
        if(other.getTop()<other.getBottom()){
            compare2 = other.getTop();
            sub2 = other.getBottom();
        }
        else{
            compare2 = other.getBottom();
            sub2 = other.getTop();
        }
        if(compare<compare2) return -1;
        else if(compare2>compare) return 1;
        else if(compare==compare2){
            if(sub<sub2) return -1;
            if(sub2<sub) return 1;
            return 0;
        }
        return 0;
    }

    public int compareToWeight(Domino other){
        int total = this.getTop() + this.getBottom();
        int total2 = other.getTop() + other.getBottom();
        if(total<total2) return -1;
        else if(total2<total) return 1;
        else return 0;
    }
    public boolean canConnect(Domino other){
        if(this.top==other.top||this.top==other.bottom||this.bottom==other.top||this.bottom==other.bottom) return true;
        else return false;
    }
}
