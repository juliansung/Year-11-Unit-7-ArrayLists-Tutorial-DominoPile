import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino> dominos = new ArrayList();

    public void newStack6(){
        int i = 0;
        int j = 0;
        for(int num = 0; num <= 6; num++) {
            for(i = num; i <= 6; i++) {
                dominos.add(new Domino(num,i));
            }
//            j++;
//            dominos.add(new Domino(i,j));
        }
    }

    public ArrayList<Domino> getPile(){
        return dominos;
    }

    public void shuffleOptionTwo(){
        for(int i=0; i<10000;i++){
            newStack6();
            double random = Math.random() * dominos.size();
            int randomInt = (int) Math.round(random);
            Domino randomDomino = dominos.get(randomInt);
            dominos.remove(dominos.get(randomInt));
            dominos.add(0,randomDomino);


        }

    }
    public void shuffleOptionOne(){
        newStack6();
        ArrayList<Domino> dominoTemp = new ArrayList();
        for(int i=0; i<dominos.size(); i++){
            double random = Math.random() * dominos.size();
            int randomInt = (int) Math.round(random);
            dominoTemp.add(dominos.get(randomInt));
            dominos.remove(dominos.get(randomInt));
        }
        dominos = dominoTemp;
    }
}
