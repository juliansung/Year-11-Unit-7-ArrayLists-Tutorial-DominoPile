import java.util.ArrayList;

public class DominoPile {
    ArrayList<Domino> dominos = new ArrayList();
    public void newStack6() {
        for (int i = 0; i < 6; i++){
            for(int j=0; j <= i; j++){
                Domino domino = new Domino(i,j);
                dominos.add(domino);
            }
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
